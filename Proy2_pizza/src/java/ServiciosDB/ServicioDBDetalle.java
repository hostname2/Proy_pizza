/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosDB;

import Datos.BaseDatos;
import Model.Cliente;
import Model.Detalle;
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
public class ServicioDBDetalle {

    public int maxConsecutivo() {
        int x = 0;
        try (Connection cnx = obtenerConexion();
                Statement stm = cnx.createStatement();
                ResultSet rs = stm.executeQuery(CMD_RECUPERAR_CONSECUTIVO)) {
            while (rs.next()) {
                x = rs.getInt("MAX(idDetalle)");
            }
        } catch (IOException
                | ClassNotFoundException
                | IllegalAccessException
                | InstantiationException
                | SQLException ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        }
        return x;
    }

    public int agregarDetalle(Detalle u, int pos) {
        int x = 0;
        if (pos < 0) {
            x = this.maxConsecutivo() + 1;
        }else{
             x = this.maxConsecutivo() - pos;
        }
        // x = x - pos;}
        try (Connection cnx = obtenerConexion();
                PreparedStatement stm = cnx.prepareStatement(CMD_INSERT_DETALLE)) {
            stm.clearParameters();
            stm.setString(1, u.getDetallecol());
            stm.setString(2, u.getIdComplemento());
            stm.setString(3, u.getIdPizza());
            stm.setInt(4, x);

            if (stm.executeUpdate() != 1) {
                throw new Exception("Error no determinado");
            }
        } catch (Exception ex) {
            System.err.printf("Excepción: '%s'%n", ex.getMessage());
        }
        return x;
    }

    public List<Detalle> obtenerListaFacturas(Date fec) {
        List<Detalle> r = new ArrayList<>();
        try (Connection cnx = obtenerConexion();
                Statement stm = cnx.createStatement();
                ResultSet rs = stm.executeQuery(CMD_LISTAR)) {
            while (rs.next()) {
                Detalle c = new Detalle(
                        rs.getInt("Detalle_idDetalle"),
                        rs.getString("detallecol"),
                        rs.getString("Complemento_idComplemento"),
                        rs.getString("Pizza_codigo")
                );
                r.add(c);
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

    private static final String CMD_INSERT_FIRST_DETALLE
            = "insert into detalle (detallecol,Complemento_idComplemento,Pizza_codigo)values (?,?,?,?);";

    private static final String CMD_INSERT_DETALLE
            = "insert into detalle (detallecol,Complemento_idComplemento,Pizza_codigo,Detalle_idDetalle)values (?,?,?,?);";

    private static final String CMD_RECUPERAR_CONSECUTIVO
            = "SELECT MAX(idDetalle) FROM detalle;";

    private static final String CMD_LISTAR
            = "SELECT detallecol,Complemento_idComplemento,Pizza_codigo,Detalle_idDetalle FROM detalle; ";

}
