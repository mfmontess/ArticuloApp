using System;
using System.Collections.Generic;
using ArticuloApp.Entidades;
using MySql.Data.MySqlClient;
using System.Configuration;

namespace ArticuloApp.Aplicacion.DAL
{
    internal class Articulo
    {
        internal int Registrar(Entidades.Articulo prmobjArticulo)
        {
            int id = 0;
            string query = $@"INSERT INTO articuloapp_bd.articulos (nombre,estado,tipo,fecha_publicacion,foto,cliente_id)
                                VALUES ('{prmobjArticulo.nombre}',{(int)prmobjArticulo.estado},{(int)prmobjArticulo.tipo}, '{prmobjArticulo.fechaPublicacion.ToString("yyyy-MM-dd HH:mm:ss")}', '{prmobjArticulo.foto}', {prmobjArticulo.propietario.id});
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
                    throw new Exception($"Imposible realizar el registro de un articulo. Detalles del error: {ex.Message}. Source: {ex.Source}. StackTrace: {ex.StackTrace}");
                }
                finally
                {
                    connection.Close();
                }
            }
            return id;
        }

        internal void Actualizar(Entidades.Articulo prmobjArticulo)
        {
            string query = $@"UPDATE articuloapp_bd.articulos
                                SET nombre='{prmobjArticulo.nombre}', estado={(int)prmobjArticulo.estado}, tipo={(int)prmobjArticulo.tipo}, foto='{prmobjArticulo.foto}', cliente_id={prmobjArticulo.propietario.id});
                                WHERE articulo_id={prmobjArticulo.id}";

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
                    throw new Exception($"Imposible realizar la actualización de un articulo. Detalles del error: {ex.Message}. Source: {ex.Source}. StackTrace: {ex.StackTrace}");
                }
                finally
                {
                    connection.Close();
                }
            }
        }

        internal List<Entidades.Articulo> ConsultarPorClienteId(int prmintClienteId)
        {
            List<Entidades.Articulo> lstArticulos = null;
            string query = $@"select articulo_id, nombre, tipo, fecha_publicacion, estado, foto
                    from articulos where cliente_id={prmintClienteId}";

            using (MySqlConnection connection = new MySqlConnection(ConfigurationManager.ConnectionStrings["ConnectionDBString"].ConnectionString))
            {
                try
                {
                    MySqlCommand command = new MySqlCommand(query, connection);
                    connection.Open();

                    using (MySqlDataReader reader = command.ExecuteReader())
                    {
                        try
                        {
                            while (reader.Read())
                            {
                                Entidades.Articulo articulo = new Entidades.Articulo();
                                articulo.id = reader.GetInt32("articulo_id");
                                articulo.nombre = reader.GetString("nombre");
                                articulo.estado = (Enumeraciones.EstadosArticulo) reader.GetInt32("estado");
                                articulo.tipo = (Enumeraciones.TiposArticulo) reader.GetInt32("tipo");
                                articulo.foto = reader.GetString("foto");
                                articulo.fechaPublicacion = reader.GetDateTime("fecha_publicacion");

                                articulo.propietario = new Entidades.Cliente();
                                articulo.propietario.id = reader.GetInt32("cliente_id");
                                lstArticulos.Add(articulo);
                            }
                        }
                        catch (Exception ex)
                        {
                            throw new Exception($"Imposible realizar lectura del cliente consultado. Detalles del error: {ex.Message}. Source: {ex.Source}. StackTrace: {ex.StackTrace}");
                        }
                        finally
                        {
                            reader.Close();
                        }
                    }
                }
                catch (Exception ex)
                {
                    throw new Exception($"Imposible realizar la consulta de un cliente. Detalles del error: {ex.Message}. Source: {ex.Source}. StackTrace: {ex.StackTrace}");
                }
                finally
                {
                    connection.Close();
                }
            }
            return lstArticulos;
        }

        internal List<Entidades.Articulo> ConsultarPorEstado(Enumeraciones.EstadosArticulo prmenumEstado)
        {
            List<Entidades.Articulo> lstArticulos = null;
            string query = $@"select articulo_id, nombre, tipo, fecha_publicacion, estado, foto
                    from articulos where estado={(int)prmenumEstado}";

            using (MySqlConnection connection = new MySqlConnection(ConfigurationManager.ConnectionStrings["ConnectionDBString"].ConnectionString))
            {
                try
                {
                    MySqlCommand command = new MySqlCommand(query, connection);
                    connection.Open();

                    using (MySqlDataReader reader = command.ExecuteReader())
                    {
                        try
                        {
                            while (reader.Read())
                            {
                                Entidades.Articulo articulo = new Entidades.Articulo();
                                articulo.id = reader.GetInt32("articulo_id");
                                articulo.nombre = reader.GetString("nombre");
                                articulo.estado = (Enumeraciones.EstadosArticulo)reader.GetInt32("estado");
                                articulo.tipo = (Enumeraciones.TiposArticulo)reader.GetInt32("tipo");
                                articulo.foto = reader.GetString("foto");
                                articulo.fechaPublicacion = reader.GetDateTime("fecha_publicacion");

                                articulo.propietario = new Entidades.Cliente();
                                articulo.propietario.id = reader.GetInt32("cliente_id");
                                lstArticulos.Add(articulo);
                            }
                        }
                        catch (Exception ex)
                        {
                            throw new Exception($"Imposible realizar lectura del cliente consultado. Detalles del error: {ex.Message}. Source: {ex.Source}. StackTrace: {ex.StackTrace}");
                        }
                        finally
                        {
                            reader.Close();
                        }
                    }
                }
                catch (Exception ex)
                {
                    throw new Exception($"Imposible realizar la consulta de un cliente. Detalles del error: {ex.Message}. Source: {ex.Source}. StackTrace: {ex.StackTrace}");
                }
                finally
                {
                    connection.Close();
                }
            }
            return lstArticulos;
        }
    }
}
