<%@ Page Title="Iniciar Sesión" Language="C#" MasterPageFile="~/Site.Master" AutoEventWireup="true" CodeBehind="Sesion.aspx.cs" Inherits="ArticuloApp.Web.Sesion" %>

<asp:Content ID="BodyContent" ContentPlaceHolderID="MainContent" runat="server">
    
    <div class="jumbotron">
        <h2><%: Title %></h2>
        <p>
            <input type="text" runat="server" placeholder="Usuario" id="txtUsuario" required />
        </p>
        <p>
            <input type="password" runat="server" placeholder="Contraseña" id="txtPassword" required />
        </p>
        <p>
            <asp:Button runat="server" class="btn btn-primary btn-lg" ID="btnAutenticar" Text="Iniciar Sesión" OnClick="btnAutenticar_Click" />
        </p>
        <p>
            <a href="Registro.aspx">Registrarse</a>
            &nbsp;
            <a>Olvide contraseña</a>
        </p>
    </div>
</asp:Content>
