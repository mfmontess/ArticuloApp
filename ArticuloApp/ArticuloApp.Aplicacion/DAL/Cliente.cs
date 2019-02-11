using MySql.Data.MySqlClient;
using System;
using System.Configuration;
using ArticuloApp.Entidades;

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

        internal Entidades.Cliente ConsultarPorId(int prmintClienteId)
        {
            Entidades.Cliente cliente = null;
            string query = $@"SELECT cliente_id , nombre, direccion , telefono FROM articuloapp_bd.clientes
                                WHERE cliente_id={prmintClienteId}";

            using (MySqlConnection connection = new MySqlConnection(ConfigurationManager.ConnectionStrings["ConnectionDBString"].ConnectionString))
            {
                try
                {
                    MySqlCommand command = new MySqlCommand(query, connection);
                    connection.Open();

                    using (MySqlDataReader reader = command.ExecuteReader())
                    {
                        cliente = new Entidades.Cliente();
                        cliente.id = reader.GetInt32(0);
                        cliente.nombre = reader.GetString(1);
                        cliente.direccion = reader.GetString(2);
                        cliente.ciudad = reader.GetString(3);
                        cliente.telefono = reader.GetString(4);
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
            return cliente;
        }

        internal void Actualizar(Entidades.Cliente prmobjCliente)
        {
            string query = $@"UPDATE articuloapp_bd.clientes
                                SET nombre={prmobjCliente.nombre}, telefono={prmobjCliente.telefono}, direccion={prmobjCliente.direccion}
                                WHERE cliente_id={prmobjCliente.id}";

            using (MySqlConnection connection = new MySqlConnection(ConfigurationManager.ConnectionStrings["ConnectionDBString"].ConnectionString))
            {
                try
                {
                    MySqlCommand command = new MySqlCommand(query, connection);
                    connection.Open();
                    command.ExecuteNonQuery();
                }
                catch (Exception ex)
                {
                    throw new Exception($"Imposible realizar la actualización de un cliente. Detalles del error: {ex.Message}. Source: {ex.Source}. StackTrace: {ex.StackTrace}");
                }
                finally
                {
                    connection.Close();
                }
            }
        }
    }
}
