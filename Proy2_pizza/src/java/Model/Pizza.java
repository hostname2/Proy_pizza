/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import org.json.JSONObject;

/**
 *
 * @author sebas
 */
public class Pizza {


    private String nombre;

    private String tamaño;
    
    private String codigo;

    private double precio;


    //private Collection<Detalle> detalleCollection;

    public Pizza() {
    }

    public Pizza(String nombre, String tamaño, String codigo, double precio) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.codigo = codigo;
        this.precio = precio;
    }
    
        public JSONObject toJSON() {
        JSONObject r = new JSONObject();
        r.put("nombre", getNombre());
        r.put("tamaño", getTamaño());
        r.put("codigo", getCodigo());
        r.put("precio", getPrecio());
        return r;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
