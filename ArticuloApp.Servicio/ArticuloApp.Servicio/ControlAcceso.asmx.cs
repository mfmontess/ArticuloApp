﻿using ArticuloApp.Entidades;
using System.Configuration;
using System.Web.Services;

namespace ArticuloApp.Servicio
{
    /// <summary>
    /// Descripción breve de ControlAcceso
    /// </summary>
    [WebService(Namespace = "http://articuloApp.com/ControlAcceso/")]
    [WebServiceBinding(ConformsTo = WsiProfiles.BasicProfile1_1)]
    [System.ComponentModel.ToolboxItem(false)]
    // Para permitir que se llame a este servicio web desde un script, usando ASP.NET AJAX, quite la marca de comentario de la línea siguiente. 
    // [System.Web.Script.Services.ScriptService]
    public class ControlAcceso : System.Web.Services.WebService
    {

        [WebMethod]
        public string HelloWorld()
        {
            return "Hola a todos";
        }

        [WebMethod]
        public Usuario Registrar(string prmstrUsuario, string prmstrClave, string prmstrCorreo, string prmstrNombre, string prmstrDireccion, string prmstrTelefono)
        {
            Usuario usuario = new Usuario(prmstrUsuario, prmstrClave, prmstrCorreo, new Cliente(prmstrNombre, prmstrDireccion, prmstrTelefono));
            string cadena = ConfigurationManager.ConnectionStrings["ConnectionDBString"].ConnectionString;
            new Aplicacion.BLL.Usuario().Registrar(usuario);
            return usuario;
        }

        [WebMethod]
        public Usuario Autenticar(string prmstrUsuario, string prmstrClave)
        {
            return new Aplicacion.BLL.Usuario().ConsultarLogin(prmstrUsuario, prmstrClave);
        }
    }
}