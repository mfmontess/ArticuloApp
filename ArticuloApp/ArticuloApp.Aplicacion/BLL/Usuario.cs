namespace ArticuloApp.Aplicacion.BLL
{
    public class Usuario
    {
        private readonly DAL.Usuario usuarioDAL;

        public Usuario()
        {
            usuarioDAL = new DAL.Usuario();
        }

        public Entidades.Usuario ConsultarLogin(string prmstrUsuario, string prmstrClave)
        {
            Entidades.Usuario usuario = usuarioDAL.Consultar(prmstrUsuario, prmstrClave);

            if (usuario != null)
                usuario.cliente = new Cliente().ConsultarPorId(usuario.cliente.id);
            return usuario;
        }

        public int Registrar(Entidades.Usuario prmobjUsuario)
        {
            prmobjUsuario.cliente.id = new Cliente().Registrar(prmobjUsuario.cliente);
            prmobjUsuario.id = usuarioDAL.Registrar(prmobjUsuario);
            return prmobjUsuario.id;
        }
    }
}
