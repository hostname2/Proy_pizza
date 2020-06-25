/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiciosWeb;

import Model.ListaComplementos;
import Model.ListaPizzas;
import Model.Pizza;
import ServiciosDB.ServicioDBComplemento;
import ServiciosDB.ServicioDBPizza;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sebas
 */
@WebServlet(name = "ServicioMenu", urlPatterns = {"/ServicioMenu"})
public class ServicioMenu extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    public String listaPizzasJSON() {
        ListaPizzas productos = new ListaPizzas(sp.obtenerListaPizza());
        return productos.toString();
    }

    public String listaComplementosJSON() {
        ListaComplementos productos = new ListaComplementos(sc.obtenerListaComplementos());
        return productos.toString();
    }

    public void eliminarPizza(String pizza) {
        sp.eliminarPizza(pizza);
    }
    
    public void agregarPizza(Pizza p){
        sp.agregarPizza(p);
    }

    ServicioDBComplemento sc = new ServicioDBComplemento();
    ServicioDBPizza sp = new ServicioDBPizza();

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

    public static void main(String[] args) {
        System.out.println(new ServicioMenu().listaPizzasJSON());
        System.out.println(new ServicioMenu().listaComplementosJSON());
    }
}
