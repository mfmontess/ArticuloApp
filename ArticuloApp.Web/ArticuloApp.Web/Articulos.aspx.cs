using System;

namespace ArticuloApp.Web
{
    public partial class Articulos : System.Web.UI.Page
    {
        protected void Page_Load(object sender, EventArgs e)
        {
            if (Request.QueryString["acc"] != null && Request.QueryString["acc"] == "Intercambiar")
                this.Title = "Artículos Disponibles";
            else
                this.Title = "Mis Artículos";
        }
    }
}