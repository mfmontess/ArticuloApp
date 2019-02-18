using MySql.Data.MySqlClient;
using System;
using System.Configuration;

namespace ArticuloApp.Aplicacion.DAL
{
    internal class Usuario
    {
        internal Entidades.Usuario Consultar(string prmstrUsuario, string prmstrClave)
        {
            Entidades.Usuario usuario = null;
            string query = $@"SELECT usuario_id, nombre, contrasena, correo, estado, cliente_id FROM articuloapp_bd.usuarios
                                WHERE nombre='{prmstrUsuario}' AND contrasena='{prmstrClave}'";

            using (MySqlConnection connection = new MySqlConnection(ConfigurationManager.ConnectionStrings["ConnectionDBString"].ConnectionString))
            {
                try
                {
                    MySqlCommand command = new MySqlCommand(query, connection);
                    connection.Open();

                    using (MySqlDataReader reader = command.ExecuteReader())
                    {
                        reader.Read();

                        try
                        {
                            usuario = new Entidades.Usuario();
                            usuario.id = reader.GetInt32("usuario_id");
                            usuario.nombre = reader.GetString("nombre");
                            usuario.contraseña = reader.GetString("contrasena");
                            usuario.correo = reader.GetString("correo");
                            usuario.estado = (Entidades.Enumeraciones.EstadosUsuario)reader.GetInt32("estado");
                            usuario.cliente.id = reader.GetInt32("cliente_id");
                        }
                        catch (Exception ex)
                        {
                            throw new Exception($"Imposible realizar la lectura del usuario consultado. Detalles del error: {ex.Message}. Source: {ex.Source}. StackTrace: {ex.StackTrace}");
                        }
                        finally
                        {
                            reader.Close();
                        }
                    }
                }
                catch (Exception ex)
                {
                    throw new Exception($"Imposible realizar la consulta del usuario. Detalles del error: {ex.Message}. Source: {ex.Source}. StackTrace: {ex.StackTrace}");
                }
                finally
                {
                    connection.Close();
                }
            }
            return usuario;
        }

        internal int Registrar(Entidades.Usuario prmobjUsuario)
        {
            int id = 0;
            string query = $@"INSERT INTO articuloapp_bd.usuarios (nombre,contrasena,correo, cliente_id)
                                VALUES ('{prmobjUsuario.nombre}','{prmobjUsuario.contraseña}','{prmobjUsuario.correo}',{prmobjUsuario.cliente.id});
                                SELECT LAST_INSERT_ID();";

            using (MySqlConnection connection = new MySqlConnection(ConfigurationManager.ConnectionStrings["ConnectionDBString"].ConnectionString))
            {
                try
                {
                    MySqlCommand command = new MySqlCommand(query, connection);
                    connection.Open();
                    id = Convert.ToInt32(command.ExecuteScalar());
                }
                catch (Exception ex)
                {
                    throw new Exception($"Imposible realizar el registro de un cliente. Detalles del error: {ex.Message}. Source: {ex.Source}. StackTrace: {ex.StackTrace}");
                }
                finally
                {
                    connection.Close();
                }
            }
            return id;
        }
    }
}
