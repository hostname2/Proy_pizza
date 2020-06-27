/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;

/**
 *
 * @author sebas
 */
public class Detalle {

    private Integer idDetalle;
    private Integer d_idDetalle;

    private String detallecol;

    private Integer idFactura; 
    
    private String idComplemento;
    
    private String idPizza;
    
//    private Factura facturaCollection;
//
//    private Complemento complementoidComplemento;
//
//    private Pizza pizzaidPizza;

    public Detalle() {
    }
    
    

    public Detalle(Integer idDetalle, String detallecol, Integer idFactura) {
        this.idDetalle = idDetalle;
        this.detallecol = detallecol;
        this.idFactura = idFactura;
    }

    public Detalle(String detallecol, String idComplemento, String idPizza) {
        this.detallecol = detallecol;
        this.idComplemento = idComplemento;
        this.idPizza = idPizza;
    }
    
    

    public Detalle(Integer idDetalle, String detallecol, String idComplemento, String idPizza) {
        this.idDetalle = idDetalle;
        this.d_idDetalle = null;
        this.detallecol = detallecol;
        this.idFactura = null;
        this.idComplemento = idComplemento;
        this.idPizza = idPizza;
    }

        public Detalle(Integer idDetalle, Integer d_idDetalle, String detallecol, Integer idFactura, String idComplemento, String idPizza) {
        this.idDetalle = idDetalle;
        this.d_idDetalle = d_idDetalle;
        this.detallecol = detallecol;
        this.idFactura = idFactura;
        this.idComplemento = idComplemento;
        this.idPizza = idPizza;
    }

    public Integer getD_idDetalle() {
        return d_idDetalle;
    }

    public void setD_idDetalle(Integer d_idDetalle) {
        this.d_idDetalle = d_idDetalle;
    }

    public String getIdComplemento() {
        return idComplemento;
    }

    public void setIdComplemento(String idComplemento) {
        this.idComplemento = idComplemento;
    }

    public String getIdPizza() {
        return idPizza;
    }

    public void setIdPizza(String idPizza) {
        this.idPizza = idPizza;
    }   
        
    public Integer getIdDetalle() {
        return idDetalle;
    }

    public void setIdDetalle(Integer idDetalle) {
        this.idDetalle = idDetalle;
    }

    public String getDetallecol() {
        return detallecol;
    }

    public void setDetallecol(String detallecol) {
        this.detallecol = detallecol;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

//    public Factura getFacturaCollection() {
//        return facturaCollection;
//    }
//
//    public void setFacturaCollection(Factura facturaCollection) {
//        this.facturaCollection = facturaCollection;
//    }

//    public Complemento getComplementoidComplemento() {
//        return complementoidComplemento;
//    }
//
//    public void setComplementoidComplemento(Complemento complementoidComplemento) {
//        this.complementoidComplemento = complementoidComplemento;
//    }

//    public Pizza getPizzaidPizza() {
//        return pizzaidPizza;
//    }
//
//    public void setPizzaidPizza(Pizza pizzaidPizza) {
//        this.pizzaidPizza = pizzaidPizza;
//    }
//    
    

}
