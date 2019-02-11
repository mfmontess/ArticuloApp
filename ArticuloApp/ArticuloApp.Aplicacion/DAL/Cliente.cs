using MySql.Data.MySqlClient;
using System;
using System.Configuration;

namespace ArticuloApp.Aplicacion.DAL
{
    internal class Cliente
    {
        internal int Registrar(Entidades.Cliente prmobjCliente)
        {
            int id = 0;
            string query = $@"INSERT INTO articuloapp_bd.clientes (nombre,telefono,direccion)
                                VALUES ('{prmobjCliente.nombre}','{prmobjCliente.telefono}','{prmobjCliente.direccion}')";

            using (MySqlConnection connection = new MySqlConnection(ConfigurationManager.ConnectionStrings["ConnectionDBString"].ConnectionString))
            {
                try
                {
                    MySqlCommand command = new MySqlCommand(query, connection);
                    connection.Open();
                    id = Convert.ToInt32(command.ExecuteScalar());
                } catch (Exception ex)
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

        internal Entidades.Cliente ConsultarPorUsuario(int prmintUsuarioId)
        {
            throw new NotImplementedException();
        }

        internal void Actualizar(Entidades.Cliente prmobjCliente)
        {
            string query = $@"UPDATE articuloapp_bd.clientes
                                SET nombre={prmobjCliente.nombre}, telefono={prmobjCliente.telefono}, direccion={prmobjCliente.direccion}
                                WHERE cliente_id={prmobjCliente.id}";
            throw new NotImplementedException();
        }
    }
}
