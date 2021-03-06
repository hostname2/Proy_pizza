/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Model.Detalle;
import ServiciosDB.ServicioDBDetalle;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.Enumeration;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 *
 * @author sebas
 */
@WebServlet(
        name = "ServicioFactura",
        urlPatterns = {"/ServicioFactura"}
)

@MultipartConfig
public class ServicioFactura extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            JSONObject r = new JSONObject();
            JSONArray a = new JSONArray();

            Enumeration<String> p = request.getParameterNames();
            while (p.hasMoreElements()) {
                //JSONObject k = new JSONObject();
                String n = p.nextElement();
                String[] v = request.getParameterValues(n);
                if (v.length == 1) {
                    JSONArray k = new JSONArray(v[0]);
                    a = new JSONArray(v[0]);
                    //a.put(k);
//                    System.out.println(k);
                    r.put("tablaFactura", k);
                }
            }

            for (int i = 0; i < a.length(); i++) {
                System.out.println(i);
                JSONObject lt = a.getJSONObject(i);
                System.out.println(lt.get("codigo"));
                System.out.println(lt.get("nombre"));
                System.out.println(lt.get("precio"));
                System.out.println(lt.get("tamano"));
                //  double d = Double.parseDouble(lt.get("cantidad").toString());
                String c = lt.get("codigo").toString();
                String pre = lt.getString("precio");
                Detalle detalle = new Detalle(pre, null, c);
                sd.agregarDetalle(detalle, i - 1);

            }

            System.out.println(a.toString());
            out.println(r.toString(4));
        }
//        RequestDispatcher dispatcher = request.getRequestDispatcher("tiempo.jsp");
//
//        dispatcher.forward(request, response);
    }

    ServicioDBDetalle sd = new ServicioDBDetalle();

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
