/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Beans.BeanCliente;
import Beans.BeanUsuario;
import Model.Cliente;
import Model.Usuario;
import ServiciosDB.ServicioDBCliente;
import ServiciosDB.ServicioDBUsuario;
import ServiciosWEB.ServicioWeb;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author sebas
 */
@WebServlet(name = "ServicoLogin", urlPatterns = {"/ServicoLogin"})
public class ServicoLogin extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        Usuario u = null;
        Cliente c = null;
        String id_usuario = request.getParameter("usuario");
        String usuario_password = request.getParameter("password");

            u = sw.loginUsuario(id_usuario, usuario_password);
            c = sw.retornaCliente(u);
            HttpSession sesion = request.getSession(true);
            String destino;
            HttpSession sesionActual = request.getSession(true);
        if (sw.esadmin(u.getTipo())) {
                sesionActual.setAttribute("Administrador", new BeanCliente(c));
                sesionActual.setAttribute("usuario", new BeanUsuario(u));
                destino = "Aqui_iria_la_pag_de_admin_si_hubiera_alguna.jsp";
                request.setAttribute("registroUsuario", u);
                request.setAttribute("registroCliente", c);
        }
        else{
                sesionActual.setAttribute("clientelog", new BeanCliente(c));
                sesionActual.setAttribute("usuario", new BeanUsuario(u));
                destino = "index.jsp";
                request.setAttribute("registroUsuario", u);
                request.setAttribute("registroCliente", c);
        }
                    RequestDispatcher dispatcher = request.getRequestDispatcher(destino);
                    dispatcher.forward(request, response);
        }

    
    ServicioWeb sw = new ServicioWeb();

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
