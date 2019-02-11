using System;

namespace ArticuloApp.Web
{
    public partial class Sesion : System.Web.UI.Page
    {
        Integrador.BLL.Usuario usuario = new Integrador.BLL.Usuario();

        protected void Page_Load(object sender, EventArgs e)
        {

        }

        protected void btnAutenticar_Click(object sender, EventArgs e)
        {
            usuario.Autenticar(txtUsuario.Value, txtPassword.Value);
            this.Response.Redirect("~/Solicitudes.aspx", false);
        }
    }
}