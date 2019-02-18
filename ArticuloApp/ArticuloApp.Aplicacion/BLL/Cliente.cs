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
            prmobjCliente.id = clienteDAL.Registrar(prmobjCliente);
            return prmobjCliente.id;
        }

        public void Actualizar(Entidades.Cliente prmobjCliente)
        {
            clienteDAL.Actualizar(prmobjCliente);
        }

        internal Entidades.Cliente ConsultarPorId(int prmintClienteId)
        {
            return clienteDAL.ConsultarPorId(prmintClienteId);
        }
    }
}
