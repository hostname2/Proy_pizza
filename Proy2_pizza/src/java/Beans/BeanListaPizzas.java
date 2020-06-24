/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Model.Pizza;
import java.util.ArrayList;

/**
 *
 * @author sebas
 */
public class BeanListaPizzas {

    public BeanListaPizzas() {
    }

    public BeanListaPizzas(ArrayList<Pizza> listaPizzas) {
        this.listaPizzas = listaPizzas;
    }

    public ArrayList<Pizza> getListaPizzas() {
        return listaPizzas;
    }

    public void setListaPizzas(ArrayList<Pizza> listaPizzas) {
        this.listaPizzas = listaPizzas;
    }
    
   private ArrayList<Pizza> listaPizzas;

}
