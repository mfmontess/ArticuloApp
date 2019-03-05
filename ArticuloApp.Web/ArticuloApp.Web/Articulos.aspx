<%@ Page Language="C#" Title="Mis Artículos" MasterPageFile="~/Dashboard.Master" AutoEventWireup="true" CodeBehind="Articulos.aspx.cs" Inherits="ArticuloApp.Web.Articulos" %>

<asp:Content ID="BodyContent" ContentPlaceHolderID="MainContent" runat="server">
    <h2><%: Title %></h2>
    <asp:UpdatePanel runat="server" ID="upArticulos" UpdateMode="Conditional">
        <ContentTemplate>
            <asp:Repeater runat="server" ID="rptArticulos">
                <ItemTemplate>
                    <div class="jumbotron">
                        <div class="row">
                            <div class="col-md-2">
                                <span class='<%# this.DefinirEstadoArticulo(Eval("estado"))%>'>
                                    <%# Eval("estado")%>
                                </span>
                                <asp:LinkButton runat="server" ID="btnImagen" CssClass="menu-page-option nolink">
                                    <div class="menu-page-option__icon">
                                        <img src="https://img.icons8.com/android/64/000000/picture.png">
                                        <!--encontrado en https://iconos8.es/icon/3177/picture-->
                                    </div>
                                    <span class="menu-page-option__label"><%# Eval("nombre")%></span>
                                </asp:LinkButton>
                            </div>
                            <div class="col-md-5">
                                <p>
                                    <span>Descripción del artículo</span>
                                    <div>
                                        <span>
                                            <%# Eval("descripcion")%>
                                        </span>
                                    </div>
                                </p>
                                <p>
                                    <asp:Button runat="server" class="btn btn-primary btn-lg" ID="btnDonar" Text="Donar" Visible='<%# !this.Intercambiar() %>'/>
                                    <asp:Button runat="server" class="btn btn-primary btn-lg" ID="btnIntercambiar" Text="Intercambiar" Visible='<%# this.Intercambiar() %>'/>
                                    <asp:Button runat="server" class="btn btn-primary btn-lg" ID="btnEditar" Text="Editar" Visible='<%# !this.Intercambiar() %>'/>
                                    <asp:Button runat="server" class="btn btn-primary btn-lg" ID="btnEliminar" Text="Eliminar" Visible='<%# !this.Intercambiar() %>'/>
                                </p>
                            </div>
                        </div>
                    </div>
                </ItemTemplate>
            </asp:Repeater>
        </ContentTemplate>
    </asp:UpdatePanel>    
</asp:Content>