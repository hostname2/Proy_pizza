/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Model.Cliente;

/**
 *
 * @author sebas
 */
public class BeanCliente {

    private Cliente cliente;

    public BeanCliente() {
        cliente = new Cliente();
    }

    public BeanCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Cliente getUsuario() {
        return cliente;
    }

    public void setUsuario(Cliente usuario) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "cliente=" + cliente;
    }
}
