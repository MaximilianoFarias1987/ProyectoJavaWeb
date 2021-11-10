package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Easy</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800,900\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"cssLogin/style.css\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/EasyLog.png\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"wrapper d-flex align-items-stretch\">\n");
      out.write("            <nav id=\"sidebar\" class=\"\">\n");
      out.write("                <h1><a href=\"index.html\" class=\"logo\"><img src=\"images/logoEasyGanador.jpeg\" style=\"height: 80px; width: 80px;\" alt=\"\"></a></h1>\n");
      out.write("                <ul class=\"list-unstyled components mb-5\">\n");
      out.write("                    <div class=\"accordion\"  id=\"accordionExample\">\n");
      out.write("                        <div class=\"card\" style=\"background-color: #0d1650;\">\n");
      out.write("                            <div class=\"card-header\" id=\"headingCero\" >\n");
      out.write("                                <h2 class=\"mb-0\">\n");
      out.write("                                    <a href=\"index.html\" class=\"collapsed\" style=\"font-size: large; color: white;\"><span class=\"fa fa-home pl-0\"></span> Home</a>\n");
      out.write("                                </h2>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card\" style=\"background-color: #0d1650;\" id=\"divUsuario\">\n");
      out.write("                            <div class=\"card-header\" id=\"headingOne\" >\n");
      out.write("                                <h2 class=\"mb-0\">\n");
      out.write("                                    <a href=\"#\" class=\"collapsed\" style=\"font-size: large; color: white;\" data-toggle=\"collapse\" data-target=\"#collapseOne\" aria-expanded=\"false\" aria-controls=\"collapseOne\"><span class=\"fa fa-user\"></span> Usuarios</a>\n");
      out.write("                                </h2>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div id=\"collapseOne\" class=\"collapse\" aria-labelledby=\"headingOne\" data-parent=\"#accordionExample\">\n");
      out.write("                                <div class=\"card-body\" style=\"background-color: #af271d;\">\n");
      out.write("                                    <div class=\"mb-3\">\n");
      out.write("                                        <a href=\"registroUsuario.html\" style=\"color: white;font-size: 16px;\"><span class=\"fa fa-user\"></span> Registro Usuario</a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>\n");
      out.write("                                        <a href=\"listadoUsuarios.html\" style=\"color: white;font-size: 16px;\"><span class=\"fa fa-list-ul\"></span> Listado Usuarios</a>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card\" style=\"background-color: #0d1650;\">\n");
      out.write("                            <div class=\"card-header\" id=\"headingTwo\">\n");
      out.write("                                <h2 class=\"mb-0\">\n");
      out.write("                                    <a href=\"#\" class=\"collapsed\" style=\"font-size: large; color: white;\" data-toggle=\"collapse\" data-target=\"#collapseTwo\"><span class=\"fa fa-cc-amex\"></span> Clientes</a>\n");
      out.write("                                </h2>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"collapseTwo\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionExample\">\n");
      out.write("                                <div class=\"card-body\" style=\"background-color: #af271d;\">\n");
      out.write("                                    <div class=\"mb-3\" id=\"divRegistroCliente\">\n");
      out.write("                                        <a href=\"registoClientes.html\" style=\"color: white;font-size: 16px;\"><span class=\"fa fa-user\"></span> Registro Cliente</a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"mb-3\" id=\"divModificarCliente\">\n");
      out.write("                                        <a href=\"modificarCliente.html\" style=\"color: white;font-size: 16px;\"><span class=\"fa fa-pencil\"></span> Modificar Datos</a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div id=\"divListadoCliente\">\n");
      out.write("                                        <a href=\"listadoClientes.html\" style=\"color: white;font-size: 16px;\"><span class=\"fa fa-list-ul\"></span> Listado Clientes</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card\" style=\"background-color: #0d1650;\">\n");
      out.write("                            <div class=\"card-header\" id=\"headingThree\">\n");
      out.write("                                <h2 class=\"mb-0\">\n");
      out.write("                                    <a href=\"#\" class=\"collapsed\" style=\"font-size: large; color: white;\" data-toggle=\"collapse\" data-target=\"#collapseThree\"><span class=\"fa fa-shopping-cart\"></span> Productos</a>\n");
      out.write("                                </h2>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"collapseThree\" class=\"collapse\" aria-labelledby=\"headingThree\" data-parent=\"#accordionExample\">\n");
      out.write("                                <div class=\"card-body\" style=\"background-color: #af271d;\">\n");
      out.write("                                    <div class=\"mb-3\" id=\"divRegistroProducto\">\n");
      out.write("                                        <a href=\"registroProducto.html\" style=\"color: white;font-size: 16px;\"><span class=\"fa fa-tags\"></span> Registro Producto</a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"mb-3\" id=\"divListadoProducto\">\n");
      out.write("                                        <a href=\"listadoProductos.html\" style=\"color: white;font-size: 16px;\"><span class=\"fa fa-list-ul\"></span> Listado Productos</a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>\n");
      out.write("                                        <a href=\"CatalogoProductos.html\" style=\"color: white;font-size: 16px;\"><span class=\"fa fa-th-large\"></span> Ver Catálogo</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card\" style=\"background-color: #0d1650;\" id=\"divReporte\">\n");
      out.write("                            <div class=\"card-header\" id=\"headingFour\">\n");
      out.write("                                <h2 class=\"mb-0\">\n");
      out.write("                                    <a href=\"#\" class=\"collapsed\" style=\"font-size: large; color: white;\" data-toggle=\"collapse\" data-target=\"#collapseFour\"><span class=\"fa fa-bar-chart\"></span> Reportes</a>\n");
      out.write("                                </h2>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"collapseFour\" class=\"collapse\"  aria-labelledby=\"headingThree\" data-parent=\"#accordionExample\">\n");
      out.write("                                <div class=\"card-body\" style=\"background-color: #af271d;\">\n");
      out.write("                                    <div class=\"mb-3\">\n");
      out.write("                                        <a href=\"reportes.html\" style=\"color: white;font-size: 16px;\"><span class=\"fa fa-line-chart\"></span> Reporte 1</a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>\n");
      out.write("                                        <a href=\"#\" style=\"color: white;font-size: 16px;\"><span class=\"fa fa-pie-chart\"></span> Reporte 2</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("            <!-- Page Content  -->\n");
      out.write("            <div id=\"content\"class=\"p-md-2\">\n");
      out.write("\n");
      out.write("                <nav class=\"navbar navbar-expand-lg navbar-light bg-light\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                        <button class=\"btn btn-dark d-inline-block d-lg-none ml-auto\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                            <i class=\"fa fa-bars\"></i>\n");
      out.write("                        </button>\n");
      out.write("\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                            <ul class=\"nav navbar-nav ml-auto\">\n");
      out.write("                                <li class=\"nav-item active mt-1\" style=\"color: #0d1650;\">\n");
      out.write("                                    <i class=\"fa fa-shopping-cart fa-2x\" aria-hidden=\"true\"></i>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a href=\"carritoCompras.html\" class=\"nav-link\"> Carrito de compras</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item active mt-1\" style=\"color: #0d1650;\">\n");
      out.write("                                    <i class=\"fa fa-user fa-2x\" aria-hidden=\"true\"></i>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item\" id=\"ingreso\" >\n");
      out.write("                                    <a href=\"index.html\" class=\"nav-link\"> Ingresar</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item\" id=\"divBienvenido\" >\n");
      out.write("                                    <p id=\"bienvenido\" class=\"mt-2 ml-2\"></p>\n");
      out.write("                                </li>\n");
      out.write("                                ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("                <a href=\"Listado\">Listado Personas</a>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/popper.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("        <script src=\"js/index.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_if_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent(null);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.autenticado}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <li id=\"divSalir\" class=\"nav-link active mt-1 ml-2\" style=\"color: #0d1650;\">\n");
        out.write("                                        <i class=\"fa fa-sign-out fa-2x\" aria-hidden=\"true\"></i>\n");
        out.write("                                    </li>\n");
        out.write("                                    <li class=\"nav-item\" id=\"divSalirText\" >\n");
        out.write("\n");
        out.write("                                        <a type=\"submit\" class=\"nav-link\" value=\"\" name=\"CerrarSesion\" href=\"Logout\">Cerrar Sesion</a>\n");
        out.write("\n");
        out.write("                                    </li>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }
}
