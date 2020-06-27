/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosDB;

import Datos.BaseDatos;
import Model.Cliente;
import Model.Factura;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

/**
 *
 * @author sebas
 */
public class ServicioDBFactura {
    
    public void insertaFactura(Factura f){
                try (Connection cnx = obtenerConexion();
                PreparedStatement stm = cnx.prepareStatement(CMD_INSERTA)) {
            stm.clearParameters();
            stm.setDate(1, (java.sql.Date) f.getFecha());
            stm.setString(2, f.getDetalleid());
            if (stm.executeUpdate() != 1) {
                throw new Exception("Error no determinado");
            }
        } catch (Exception ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        }
    }

    public List<Factura> obtenerListaFacturas(Date fec) {
        List<Factura> r = new ArrayList<>();
        try (Connection cnx = obtenerConexion();
                Statement stm = cnx.createStatement();
                ResultSet rs = stm.executeQuery(CMD_LISTAR)) {
            while (rs.next()) {
                Factura c = new Factura(
                        rs.getInt("idFactura"),
                        rs.getDate("fecha"),
                        rs.getString("Detalle_idDetalle")
                );
                if (fec.after(c.getFecha())) {
                    r.add(c);
                }
            }
        } catch (IOException
                | ClassNotFoundException
                | IllegalAccessException
                | InstantiationException
                | SQLException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        }
        return r;
    }

    public Connection obtenerConexion() throws
            ClassNotFoundException,
            IllegalAccessException,
            InstantiationException,
            IOException,
            SQLException {
        BaseDatos bd = BaseDatos.obtenerInstancia();
        Properties cfg = bd.obtenerConfiguracion();
        Connection cnx = bd.obtenerConexion(
                cfg.getProperty("database"),
                cfg.getProperty("user"),
                cfg.getProperty("password")
        );
        return cnx;
    }

    private static final String CMD_LISTAR
            = "SELECT idFactura, fecha, Detalle_idDetalle  FROM Factura; ";
    
    private static final String CMD_INSERTA
            ="insert into Factura (fecha,Detalle_idDetalle) values (?,?); ";
}
