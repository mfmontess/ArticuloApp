namespace ArticuloApp.Aplicacion.BLL
{
    public class Cliente
    {
        private readonly DAL.Cliente clienteDAL;

        public Cliente()
        {
            clienteDAL = new DAL.Cliente();
        }

        public int Registrar(Entidades.Cliente prmobjCliente)
        {
            return clienteDAL.Registrar(prmobjCliente);
        }

        public void Actualizar(Entidades.Cliente prmobjCliente)
        {
            clienteDAL.Actualizar(prmobjCliente);
        }

        public Entidades.Cliente ConsultarPorUsuario(int prmintUsuarioId)
        {
            return clienteDAL.ConsultarPorUsuario(prmintUsuarioId);
        }
    }
}
