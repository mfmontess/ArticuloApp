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
            string query = $@"SELECT usuario_id, nombre, contrasena, estado, cliente_id FROM articuloapp_bd.usuarios
                                WHERE nombre='{prmstrUsuario}' AND contrasena='{prmstrClave}'";

            using (MySqlConnection connection = new MySqlConnection(ConfigurationManager.ConnectionStrings["ConnectionDBString"].ConnectionString))
            {
                try
                {
                    MySqlCommand command = new MySqlCommand(query, connection);
                    connection.Open();

                    using (MySqlDataReader reader = command.ExecuteReader())
                    {
                        usuario = new Entidades.Usuario();
                        usuario.id = reader.GetInt32(0);
                        usuario.nombre = reader.GetString(1);
                        usuario.contraseña = reader.GetString(2);
                        usuario.estado = (Entidades.Enumeraciones.EstadosUsuario) reader.GetInt32(3);
                        usuario.cliente.id = reader.GetInt32(4);
                    }
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
            return usuario;
        }

        internal int Registrar(Entidades.Usuario prmobjUsuario)
        {
            int id = 0;
            string query = $@"INSERT INTO articuloapp_bd.usuarios (nombre,contrasena,correo)
                                VALUES ('{prmobjUsuario.nombre}','{prmobjUsuario.contraseña}','{prmobjUsuario.correo}')";

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
