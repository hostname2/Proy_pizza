/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Model.Cliente;
import Model.Usuario;
import ServiciosDB.ServicioDBCliente;
import ServiciosDB.ServicioDBUsuario;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author sebas
 */
@WebServlet(name = "ServicioRegistro", urlPatterns = {"/ServicioRegistro"}, initParams = {
    @WebInitParam(name = "index", value = "index.jsp")})
public class ServicioRegistro extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String identificacion = request.getParameter("identificacion");
        String direccion = request.getParameter("direccion");
        String telefono = request.getParameter("telefono");
        String usuario = request.getParameter("usuario");
        String contraseña = request.getParameter("clave");

        int tel = Integer.parseInt(telefono);
        System.out.println(nombre);
        System.out.println(apellido);
        System.out.println(identificacion);
        System.out.println(direccion);
        System.out.println(tel);
        System.out.println(usuario);
        System.out.println(contraseña);
        su.agregarUser(new Usuario(usuario, contraseña, 1));
        sc.agregarCliente(new Cliente(identificacion, nombre, apellido, direccion, tel, usuario));
        //String id, String nombre, String apellidos, String direccion, int telefono, String idUsuario
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
        dispatcher.forward(request, response);
    }
    
    ServicioDBUsuario su = new ServicioDBUsuario();
    ServicioDBCliente sc = new ServicioDBCliente();

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

}
