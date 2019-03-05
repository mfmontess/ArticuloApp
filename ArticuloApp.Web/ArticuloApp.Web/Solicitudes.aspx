<%@ Page Language="C#" Title="Mis Solicitudes" MasterPageFile="~/Dashboard.Master" AutoEventWireup="true" CodeBehind="Solicitudes.aspx.cs" Inherits="ArticuloApp.Web.Solicitudes" %>

<asp:Content ID="BodyContent" ContentPlaceHolderID="MainContent" runat="server">    
    <h2><%: Title %></h2>
    <asp:UpdatePanel runat="server" ID="upSolicitudes" UpdateMode="Conditional">
        <ContentTemplate>
            <asp:Repeater runat="server" ID="rptSolicitudes">
                <ItemTemplate>
                    <div class="jumbotron">
                        <div class="row">
                            <div class="col-md-2">
                                <asp:LinkButton runat="server" ID="btnImagen" CssClass="menu-page-option nolink">
                    <div class="menu-page-option__icon">
                        <img src="https://img.icons8.com/android/64/000000/picture.png">
                        <!--encontrado en https://iconos8.es/icon/3177/picture-->
                    </div>
                    <span class="menu-page-option__label">Foto del artículo</span>
                                </asp:LinkButton>
                            </div>
                            <div class="col-md-5">
                                <p>
                                    <asp:Label runat="server" ID="txtDescripcionArticulo">Descripción del artículo</asp:Label>
                                    <span>
                                        <%# Eval("descripcion")%>
                                    </span>
                                </p>
                                <p>
                                    <asp:Label runat="server" ID="txtNotificacion">Detalle de notificación</asp:Label>
                                    <span>
                                        <%# Eval("detalle")%>
                                    </span>
                                </p>
                                <p>
                                    <asp:Button runat="server" class="btn btn-primary btn-lg" ID="btnAutenticar" Text="Aceptar" />
                                    <asp:Button runat="server" class="btn btn-primary btn-lg" ID="Button1" Text="Rechazar" />
                                    <asp:Button runat="server" class="btn btn-primary btn-lg" ID="Button2" Text="Cancelar" />
                                </p>
                            </div>
                        </div>
                    </div>
                </ItemTemplate>
            </asp:Repeater>
        </ContentTemplate>
    </asp:UpdatePanel>    
</asp:Content>