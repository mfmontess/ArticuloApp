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
        try{
            PreparedStatement ps = accessBD.prepareCall("select * from usuarios where nombre=? and contraseña=?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                //usuario = new Usuario(rs.getInt(1),rs.getString(2),rs.getString(3));
                cliente = new Cliente();
            }
        } catch(Exception e){
            e.printStackTrace();
        }
        return cliente;
    }
}
