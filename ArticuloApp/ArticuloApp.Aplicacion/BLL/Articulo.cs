using System.Collections.Generic;

namespace ArticuloApp.Aplicacion.BLL
{
    public class Articulo
    {
        private readonly DAL.Articulo articuloDAL;

        public Articulo()
        {
            articuloDAL = new DAL.Articulo();
        }

        public int Registrar(Entidades.Articulo prmobjArticulo)
        {
            prmobjArticulo.id = articuloDAL.Registrar(prmobjArticulo);
            return prmobjArticulo.id;
        }

        public void Actualizar(Entidades.Articulo prmobjArticulo)
        {
            articuloDAL.Actualizar(prmobjArticulo);
        }

        internal List<Entidades.Articulo> ConsultarPorClienteId(int prmintClienteId)
        {
            return articuloDAL.ConsultarPorClienteId(prmintClienteId);
        }

        internal List<Entidades.Articulo> ConsultarPorEstado(Entidades.Enumeraciones.EstadosArticulo prmenumEstado)
        {
            return articuloDAL.ConsultarPorEstado(prmenumEstado);
        }
    }
}