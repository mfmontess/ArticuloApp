namespace ArticuloApp.Aplicacion.BLL
{
    public class Usuario
    {
        private readonly DAL.Usuario usuarioDAL;

        public Usuario()
        {
            usuarioDAL = new DAL.Usuario();
        }

        public Entidades.Usuario Consultar(string prmstrUsuario, string prmstrClave)
        {
            return usuarioDAL.Consultar(prmstrUsuario, prmstrClave);
        }

        public int Registrar(Entidades.Usuario prmobjUsuario)
        {
            prmobjUsuario.cliente.id = new Cliente().Registrar(prmobjUsuario.cliente);
            return usuarioDAL.Registrar(prmobjUsuario);
        }
    }
}
