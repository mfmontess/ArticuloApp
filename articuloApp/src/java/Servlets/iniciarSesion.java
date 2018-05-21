package Servlets;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.ws.WebServiceRef;
import webservices.*;

/**
 *
 * @author MICHAEL
 */
@WebServlet(name = "iniciarSesion", urlPatterns = {"/iniciarSesion"})
public class iniciarSesion extends HttpServlet {
    
    //@WebServiceRef(wsdlLocation = "WEB-INF/wsdl/localhost_8080/WSArticuloAPP/ArticulosWS.wsdl")
    //private ArticulosWS_Service serviceArticulos;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String nombre = request.getParameter("nombreUsuario");
        String contraseña = request.getParameter("contrasena");
        
        RespuestaWS respuesta = obtenerUsuario(nombre,contraseña);
        
        if (respuesta.getTipo() == TiposRespuestaWS.EXITOSA && respuesta.getObjetoRespuesta() != null){
                HttpSession sesion= request.getSession();
                Usuario usuario = new ObjectMapper().readValue(respuesta.getObjetoRespuesta(), Usuario.class);
                sesion.setAttribute("ValidUsuario", usuario);
                
                request.getRequestDispatcher("indexIniciada.jsp").forward(request, response);
        }else{
            response.sendRedirect("iniciarSesion.jsp");
        }
    }

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

    private static RespuestaWS obtenerUsuario(java.lang.String nombre, java.lang.String contraseña) {
        webservices.UsuariosWS_Service service = new webservices.UsuariosWS_Service();
        webservices.UsuariosWS port = service.getUsuariosWSPort();
        return port.obtenerUsuario(nombre, contraseña);
    }
}
