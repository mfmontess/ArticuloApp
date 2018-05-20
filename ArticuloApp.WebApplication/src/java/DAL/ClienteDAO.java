/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import STL.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author MICHAEL
 */
public class ClienteDAO {
    public Cliente ObtenerCliente(int id){
        Cliente cliente = null;
        Connection accessBD = Conexion.getConexion();
        UsuarioDAO objDAO = new UsuarioDAO();
        try{
            PreparedStatement ps = accessBD.prepareCall("select nombre, direccion, telefono, ciudad, usuario_id from clientes where cliente_id=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                cliente = new Cliente(id,rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4), objDAO.ObtenerUsuario(rs.getInt(5)));
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return cliente;
    }
}