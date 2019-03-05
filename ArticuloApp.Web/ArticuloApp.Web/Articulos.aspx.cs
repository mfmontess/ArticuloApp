using System;
using System.Collections;

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

            ArrayList objects = new ArrayList();
            objects.Add(new { id = 1, foto = "", descripcion = "Linda patineta", nombre = "Patineta", estado= "Activo" });
            objects.Add(new { id = 2, foto = "", descripcion = "Linda moto", nombre = "Bicicleta", estado = "EnIntercambio" });
            rptArticulos.DataSource = objects;
            rptArticulos.DataBind();
        }

        protected bool Intercambiar()
        {
            if (Request.QueryString["acc"] != null && Request.QueryString["acc"] == "Intercambiar")
                return true;
            else
                return false;
        }

        protected string DefinirEstadoArticulo(object estado)
        {
            switch (estado.ToString())
            {
                case "Activo":
                    return "label label-primary";
                case "Solicitado":
                case "EnIntercambio":
                    return "label label-warning";
                case "Donado":
                    return "label label-info";
                case "Intercambiado":
                    return "label label-success";
                default:
                    return "label label-default";
            }
        }
    }
}