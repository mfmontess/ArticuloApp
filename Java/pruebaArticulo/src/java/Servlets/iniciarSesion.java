/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import webservices.Cliente;
import webservices.RespuestaWS;
import webservices.TiposRespuestaWS;
import webservices.Usuario;

/**
 *
 * @author MICHAEL
 */
@WebServlet(name = "iniciarSesion", urlPatterns = {"/iniciarSesion"})
public class iniciarSesion extends HttpServlet {

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
        HttpSession sesion= request.getSession();
        
        if (respuesta.getTipo() == TiposRespuestaWS.EXITOSA && respuesta.getObjetoRespuesta() != null){
                Usuario usuario = new Usuario();
                usuario = (Usuario) respuesta.getObjetoRespuesta();
                sesion.setAttribute("ValidUsuario", usuario);
                RespuestaWS respuestac = obtenerClientePorUsuarioId(usuario.getId());
                
                if (respuestac.getTipo() == TiposRespuestaWS.EXITOSA && respuestac.getObjetoRespuesta() != null){
                    Cliente cliente = (Cliente) respuestac.getObjetoRespuesta();
                    sesion.setAttribute("ValidCliente", cliente);
                    request.getRequestDispatcher("indexIniciada.jsp").forward(request, response);
                }else{
                    sesion.setAttribute("error", respuesta.getMensaje());
                    request.getRequestDispatcher("iniciarSesion.jsp").forward(request, response);
                }
        }else{
            sesion.setAttribute("error", respuesta.getMensaje());
            request.getRequestDispatcher("iniciarSesion.jsp").forward(request, response);
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

    private static RespuestaWS obtenerClientePorUsuarioId(int usuarioId) {
        webservices.ClientesWS_Service service = new webservices.ClientesWS_Service();
        webservices.ClientesWS port = service.getClientesWSPort();
        return port.obtenerClientePorUsuarioId(usuarioId);
    }

    private static RespuestaWS obtenerUsuario(java.lang.String nombre, java.lang.String contraseña) {
        webservices.UsuariosWS_Service service = new webservices.UsuariosWS_Service();
        webservices.UsuariosWS port = service.getUsuariosWSPort();
        return port.obtenerUsuario(nombre, contraseña);
    }

}
