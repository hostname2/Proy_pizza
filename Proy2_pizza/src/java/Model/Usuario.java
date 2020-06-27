/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author sebas
 */
public class Usuario {
    private String idUsuario;

    private String clave;

    private int tipo;

    private Cliente cliente;

    public Usuario() {
    }

    public Usuario(String idUsuario, String clave, int tipo) {
        this.idUsuario = idUsuario;
        this.clave = clave;
        this.tipo = tipo;
    }

    
    
    public Usuario(String idUsuario, String clave, int tipo, Cliente cliente) {
        this.idUsuario = idUsuario;
        this.clave = clave;
        this.tipo = tipo;
        this.cliente = cliente;
    }

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
            
}
