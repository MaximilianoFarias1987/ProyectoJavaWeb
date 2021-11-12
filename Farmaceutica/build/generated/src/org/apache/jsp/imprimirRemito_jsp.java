package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class imprimirRemito_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Easy</title>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Poppins:300,400,500,600,700,800,900\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"cssLogin/style.css\">\n");
      out.write("        <link rel=\"shortcut icon\" href=\"images/EasyLog.png\"/>\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <style type=\"text/css\">\n");
      out.write("        body{\n");
      out.write("        margin-top:20px;\n");
      out.write("        color: #484b51;\n");
      out.write("        }\n");
      out.write("        .text-secondary-d1 {\n");
      out.write("            color: #728299!important;\n");
      out.write("        }\n");
      out.write("        .page-header {\n");
      out.write("            margin: 0 0 1rem;\n");
      out.write("            padding-bottom: 1rem;\n");
      out.write("            padding-top: .5rem;\n");
      out.write("            border-bottom: 1px dotted #e2e2e2;\n");
      out.write("            display: -ms-flexbox;\n");
      out.write("            display: flex;\n");
      out.write("            -ms-flex-pack: justify;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            -ms-flex-align: center;\n");
      out.write("            align-items: center;\n");
      out.write("        }\n");
      out.write("        .page-title {\n");
      out.write("            padding: 0;\n");
      out.write("            margin: 0;\n");
      out.write("            font-size: 1.75rem;\n");
      out.write("            font-weight: 300;\n");
      out.write("        }\n");
      out.write("        .brc-default-l1 {\n");
      out.write("            border-color: #dce9f0!important;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .ml-n1, .mx-n1 {\n");
      out.write("            margin-left: -.25rem!important;\n");
      out.write("        }\n");
      out.write("        .mr-n1, .mx-n1 {\n");
      out.write("            margin-right: -.25rem!important;\n");
      out.write("        }\n");
      out.write("        .mb-4, .my-4 {\n");
      out.write("            margin-bottom: 1.5rem!important;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        hr {\n");
      out.write("            margin-top: 1rem;\n");
      out.write("            margin-bottom: 1rem;\n");
      out.write("            border: 0;\n");
      out.write("            border-top: 1px solid rgba(0,0,0,.1);\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .text-grey-m2 {\n");
      out.write("            color: #888a8d!important;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .text-success-m2 {\n");
      out.write("            color: #86bd68!important;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .font-bolder, .text-600 {\n");
      out.write("            font-weight: 600!important;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .text-110 {\n");
      out.write("            font-size: 110%!important;\n");
      out.write("        }\n");
      out.write("        .text-blue {\n");
      out.write("            color: #478fcc!important;\n");
      out.write("        }\n");
      out.write("        .pb-25, .py-25 {\n");
      out.write("            padding-bottom: .75rem!important;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .pt-25, .py-25 {\n");
      out.write("            padding-top: .75rem!important;\n");
      out.write("        }\n");
      out.write("        .bgc-default-tp1 {\n");
      out.write("            background-color: rgba(121,169,197,.92)!important;\n");
      out.write("        }\n");
      out.write("        .bgc-default-l4, .bgc-h-default-l4:hover {\n");
      out.write("            background-color: #f3f8fa!important;\n");
      out.write("        }\n");
      out.write("        .page-header .page-tools {\n");
      out.write("            -ms-flex-item-align: end;\n");
      out.write("            align-self: flex-end;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .btn-light {\n");
      out.write("            color: #757984;\n");
      out.write("            background-color: #f5f6f9;\n");
      out.write("            border-color: #dddfe4;\n");
      out.write("        }\n");
      out.write("        .w-2 {\n");
      out.write("            width: 1rem;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .text-120 {\n");
      out.write("            font-size: 120%!important;\n");
      out.write("        }\n");
      out.write("        .text-primary-m1 {\n");
      out.write("            color: #4087d4!important;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        .text-danger-m1 {\n");
      out.write("            color: #dd4949!important;\n");
      out.write("        }\n");
      out.write("        .text-blue-m2 {\n");
      out.write("            color: #68a3d5!important;\n");
      out.write("        }\n");
      out.write("        .text-150 {\n");
      out.write("            font-size: 150%!important;\n");
      out.write("        }\n");
      out.write("        .text-60 {\n");
      out.write("            font-size: 60%!important;\n");
      out.write("        }\n");
      out.write("        .text-grey-m1 {\n");
      out.write("            color: #7b7d81!important;\n");
      out.write("        }\n");
      out.write("        .align-bottom {\n");
      out.write("            vertical-align: bottom!important;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div class=\"wrapper d-flex align-items-stretch\">\n");
      out.write("            <nav id=\"sidebar\" class=\"\" style=\"background-color: #0d1650;\">\n");
      out.write("                <h1><a href=\"index.html\" class=\"logo\"><img src=\"img/encode.png\" style=\"height: 80px; width: 200px;\" alt=\"\"></a></h1>\n");
      out.write("                <ul class=\"list-unstyled components mb-5\">\n");
      out.write("                    <div class=\"accordion\"  id=\"accordionExample\">\n");
      out.write("<!--                        <div class=\"card\" style=\"background-color: #0d1650;\">\n");
      out.write("                            <div class=\"card-header\" id=\"headingCero\" >\n");
      out.write("                                <h2 class=\"mb-0\">\n");
      out.write("                                    <a href=\"home.jsp\" class=\"collapsed\" style=\"font-size: large; color: white;\"><span class=\"fa fa-home pl-0\"></span> Home</a>\n");
      out.write("                                </h2>\n");
      out.write("                            </div>\n");
      out.write("                        </div>-->\n");
      out.write("                        <div class=\"card\" style=\"background-color: #0d1650;\" id=\"divUsuario\">\n");
      out.write("                            <div class=\"card-header\" id=\"headingOne\" >\n");
      out.write("                                <h2 class=\"mb-0\">\n");
      out.write("                                    <a href=\"#\" class=\"collapsed\" style=\"font-size: large; color: white;\" data-toggle=\"collapse\" data-target=\"#collapseOne\" aria-expanded=\"false\" aria-controls=\"collapseOne\"><span class=\"fa fa-user\"></span> Sucursales</a>\n");
      out.write("                                </h2>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div id=\"collapseOne\" class=\"collapse\" aria-labelledby=\"headingOne\" data-parent=\"#accordionExample\">\n");
      out.write("                                <div class=\"card-body\" style=\"background-color: #1b1f96;\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    <div>\n");
      out.write("                                        <a href=\"ListadoSucursal\" style=\"color: white;font-size: 16px;\"><span class=\"fa fa-list-ul\"></span> Listado Sucursales</a>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        ");
      if (_jspx_meth_c_if_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        <div class=\"card\" style=\"background-color: #0d1650;\">\n");
      out.write("                            <div class=\"card-header\" id=\"headingThree\">\n");
      out.write("                                <h2 class=\"mb-0\">\n");
      out.write("                                    <a href=\"#\" class=\"collapsed\" style=\"font-size: large; color: white;\" data-toggle=\"collapse\" data-target=\"#collapseThree\"><span class=\"fa fa-shopping-cart\"></span> Suministros</a>\n");
      out.write("                                </h2>\n");
      out.write("                            </div>\n");
      out.write("                            <div id=\"collapseThree\" class=\"collapse\" aria-labelledby=\"headingThree\" data-parent=\"#accordionExample\">\n");
      out.write("                                <div class=\"card-body\" style=\"background-color: #1b1f96;\">\n");
      out.write("                                    ");
      if (_jspx_meth_c_if_2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                    <div class=\"mb-3\" id=\"divListadoProducto\">\n");
      out.write("                                        <a href=\"listadoSuministro.jsp\" style=\"color: white;font-size: 16px;\"><span class=\"fa fa-list-ul\"></span> Listado Suministros</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        ");
      if (_jspx_meth_c_if_3(_jspx_page_context))
        return;
      out.write("\n");
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
      out.write("                        \n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                            <ul class=\"nav navbar-nav ml-auto\">\n");
      out.write("                                ");
      if (_jspx_meth_c_if_4(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                ");
      if (_jspx_meth_c_if_5(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("\n");
      out.write("                <!-- Agregar contenido de la pagina  -->\n");
      out.write("                <h1>Bienvenido</h1>\n");
      out.write("\n");
      out.write("                <div class=\"page-content container\">\n");
      out.write("                    <div class=\"page-header text-blue-d2\">\n");
      out.write("                        <h1 class=\"page-title text-secondary-d1\">\n");
      out.write("                            Invoice\n");
      out.write("                            <small class=\"page-info\">\n");
      out.write("                                <i class=\"fa fa-angle-double-right text-80\"></i>\n");
      out.write("                                ID: #111-222\n");
      out.write("                            </small>\n");
      out.write("                        </h1>\n");
      out.write("\n");
      out.write("                        <div class=\"page-tools\">\n");
      out.write("                            <div class=\"action-buttons\">\n");
      out.write("                                <a class=\"btn bg-white btn-light mx-1px text-95\" href=\"#\" data-title=\"Print\">\n");
      out.write("                                    <i class=\"mr-1 fa fa-print text-primary-m1 text-120 w-2\"></i>\n");
      out.write("                                    Print\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"btn bg-white btn-light mx-1px text-95\" href=\"#\" data-title=\"PDF\">\n");
      out.write("                                    <i class=\"mr-1 fa fa-file-pdf-o text-danger-m1 text-120 w-2\"></i>\n");
      out.write("                                    Export\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"container px-0\">\n");
      out.write("                        <div class=\"row mt-4\">\n");
      out.write("                            <div class=\"col-12 col-lg-10 offset-lg-1\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-12\">\n");
      out.write("                                        <div class=\"text-center text-150\">\n");
      out.write("                                            <i class=\"fa fa-book fa-2x text-success-m2 mr-1\"></i>\n");
      out.write("                                            <span class=\"text-default-d3\">Bootdey.com</span>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- .row -->\n");
      out.write("\n");
      out.write("                                <hr class=\"row brc-default-l1 mx-n1 mb-4\" />\n");
      out.write("\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-6\">\n");
      out.write("                                        <div>\n");
      out.write("                                            <span class=\"text-sm text-grey-m2 align-middle\">To:</span>\n");
      out.write("                                            <span class=\"text-600 text-110 text-blue align-middle\">Alex Doe</span>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"text-grey-m2\">\n");
      out.write("                                            <div class=\"my-1\">\n");
      out.write("                                                Street, City\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"my-1\">\n");
      out.write("                                                State, Country\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"my-1\"><i class=\"fa fa-phone fa-flip-horizontal text-secondary\"></i> <b class=\"text-600\">111-111-111</b></div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- /.col -->\n");
      out.write("\n");
      out.write("                                    <div class=\"text-95 col-sm-6 align-self-start d-sm-flex justify-content-end\">\n");
      out.write("                                        <hr class=\"d-sm-none\" />\n");
      out.write("                                        <div class=\"text-grey-m2\">\n");
      out.write("                                            <div class=\"mt-1 mb-2 text-secondary-m1 text-600 text-125\">\n");
      out.write("                                                Invoice\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"my-2\"><i class=\"fa fa-circle text-blue-m2 text-xs mr-1\"></i> <span class=\"text-600 text-90\">ID:</span> #111-222</div>\n");
      out.write("\n");
      out.write("                                            <div class=\"my-2\"><i class=\"fa fa-circle text-blue-m2 text-xs mr-1\"></i> <span class=\"text-600 text-90\">Issue Date:</span> Oct 12, 2019</div>\n");
      out.write("\n");
      out.write("                                            <div class=\"my-2\"><i class=\"fa fa-circle text-blue-m2 text-xs mr-1\"></i> <span class=\"text-600 text-90\">Status:</span> <span class=\"badge badge-warning badge-pill px-25\">Unpaid</span></div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- /.col -->\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("                                <div class=\"mt-4\">\n");
      out.write("                                    <div class=\"row text-600 text-white bgc-default-tp1 py-25\">\n");
      out.write("                                        <div class=\"d-none d-sm-block col-1\">#</div>\n");
      out.write("                                        <div class=\"col-9 col-sm-5\">Description</div>\n");
      out.write("                                        <div class=\"d-none d-sm-block col-4 col-sm-2\">Qty</div>\n");
      out.write("                                        <div class=\"d-none d-sm-block col-sm-2\">Unit Price</div>\n");
      out.write("                                        <div class=\"col-2\">Amount</div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"text-95 text-secondary-d3\">\n");
      out.write("                                        <div class=\"row mb-2 mb-sm-0 py-25\">\n");
      out.write("                                            <div class=\"d-none d-sm-block col-1\">1</div>\n");
      out.write("                                            <div class=\"col-9 col-sm-5\">Domain registration</div>\n");
      out.write("                                            <div class=\"d-none d-sm-block col-2\">2</div>\n");
      out.write("                                            <div class=\"d-none d-sm-block col-2 text-95\">$10</div>\n");
      out.write("                                            <div class=\"col-2 text-secondary-d2\">$20</div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"row mb-2 mb-sm-0 py-25 bgc-default-l4\">\n");
      out.write("                                            <div class=\"d-none d-sm-block col-1\">2</div>\n");
      out.write("                                            <div class=\"col-9 col-sm-5\">Web hosting</div>\n");
      out.write("                                            <div class=\"d-none d-sm-block col-2\">1</div>\n");
      out.write("                                            <div class=\"d-none d-sm-block col-2 text-95\">$15</div>\n");
      out.write("                                            <div class=\"col-2 text-secondary-d2\">$15</div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"row mb-2 mb-sm-0 py-25\">\n");
      out.write("                                            <div class=\"d-none d-sm-block col-1\">3</div>\n");
      out.write("                                            <div class=\"col-9 col-sm-5\">Software development</div>\n");
      out.write("                                            <div class=\"d-none d-sm-block col-2\">--</div>\n");
      out.write("                                            <div class=\"d-none d-sm-block col-2 text-95\">$1,000</div>\n");
      out.write("                                            <div class=\"col-2 text-secondary-d2\">$1,000</div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"row mb-2 mb-sm-0 py-25 bgc-default-l4\">\n");
      out.write("                                            <div class=\"d-none d-sm-block col-1\">4</div>\n");
      out.write("                                            <div class=\"col-9 col-sm-5\">Consulting</div>\n");
      out.write("                                            <div class=\"d-none d-sm-block col-2\">1 Year</div>\n");
      out.write("                                            <div class=\"d-none d-sm-block col-2 text-95\">$500</div>\n");
      out.write("                                            <div class=\"col-2 text-secondary-d2\">$500</div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <div class=\"row border-b-2 brc-default-l2\"></div>\n");
      out.write("\n");
      out.write("                                    <!-- or use a table instead -->\n");
      out.write("                                    <!--\n");
      out.write("                            <div class=\"table-responsive\">\n");
      out.write("                                <table class=\"table table-striped table-borderless border-0 border-b-2 brc-default-l1\">\n");
      out.write("                                    <thead class=\"bg-none bgc-default-tp1\">\n");
      out.write("                                        <tr class=\"text-white\">\n");
      out.write("                                            <th class=\"opacity-2\">#</th>\n");
      out.write("                                            <th>Description</th>\n");
      out.write("                                            <th>Qty</th>\n");
      out.write("                                            <th>Unit Price</th>\n");
      out.write("                                            <th width=\"140\">Amount</th>\n");
      out.write("                                        </tr>\n");
      out.write("                                    </thead>\n");
      out.write("                \n");
      out.write("                                    <tbody class=\"text-95 text-secondary-d3\">\n");
      out.write("                                        <tr></tr>\n");
      out.write("                                        <tr>\n");
      out.write("                                            <td>1</td>\n");
      out.write("                                            <td>Domain registration</td>\n");
      out.write("                                            <td>2</td>\n");
      out.write("                                            <td class=\"text-95\">$10</td>\n");
      out.write("                                            <td class=\"text-secondary-d2\">$20</td>\n");
      out.write("                                        </tr> \n");
      out.write("                                    </tbody>\n");
      out.write("                                </table>\n");
      out.write("                            </div>\n");
      out.write("                                    -->\n");
      out.write("\n");
      out.write("                                    <div class=\"row mt-3\">\n");
      out.write("                                        <div class=\"col-12 col-sm-7 text-grey-d2 text-95 mt-2 mt-lg-0\">\n");
      out.write("                                            Extra note such as company or payment information...\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <div class=\"col-12 col-sm-5 text-grey text-90 order-first order-sm-last\">\n");
      out.write("                                            <div class=\"row my-2\">\n");
      out.write("                                                <div class=\"col-7 text-right\">\n");
      out.write("                                                    SubTotal\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-5\">\n");
      out.write("                                                    <span class=\"text-120 text-secondary-d1\">$2,250</span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"row my-2\">\n");
      out.write("                                                <div class=\"col-7 text-right\">\n");
      out.write("                                                    Tax (10%)\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-5\">\n");
      out.write("                                                    <span class=\"text-110 text-secondary-d1\">$225</span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <div class=\"row my-2 align-items-center bgc-primary-l3 p-2\">\n");
      out.write("                                                <div class=\"col-7 text-right\">\n");
      out.write("                                                    Total Amount\n");
      out.write("                                                </div>\n");
      out.write("                                                <div class=\"col-5\">\n");
      out.write("                                                    <span class=\"text-150 text-success-d3 opacity-2\">$2,475</span>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                    <hr />\n");
      out.write("\n");
      out.write("                                    <div>\n");
      out.write("                                        <span class=\"text-secondary-d1 text-105\">Thank you for your business</span>\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-info btn-bold px-4 float-right mt-3 mt-lg-0\">Pay Now</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Fin contenido de la pagina  -->\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/popper.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("        <script src=\"js/index.js\"></script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
        out.write("                                    <div class=\"mb-3\">\n");
        out.write("                                        <a href=\"registroSucursal.jsp\" style=\"color: white;font-size: 16px;\"><span class=\"fa fa-user\"></span> Registro Sucursal</a>\n");
        out.write("                                    </div>\n");
        out.write("                                    ");
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

  private boolean _jspx_meth_c_if_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent(null);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.autenticado}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <div class=\"card\" style=\"background-color: #0d1650;\">\n");
        out.write("                            <div class=\"card-header\" id=\"headingTwo\">\n");
        out.write("                                <h2 class=\"mb-0\">\n");
        out.write("                                    <a href=\"#\" class=\"collapsed\" style=\"font-size: large; color: white;\" data-toggle=\"collapse\" data-target=\"#collapseTwo\"><span class=\"fa fa-cc-amex\"></span> Empleados</a>\n");
        out.write("                                </h2>\n");
        out.write("                            </div>\n");
        out.write("                            <div id=\"collapseTwo\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionExample\">\n");
        out.write("                                <div class=\"card-body\" style=\"background-color: #1b1f96;\">\n");
        out.write("                                    <div class=\"mb-3\" id=\"divRegistroCliente\">\n");
        out.write("                                        <a href=\"registroEmpleado.jsp\" style=\"color: white;font-size: 16px;\"><span class=\"fa fa-user\"></span> Registro Empleado</a>\n");
        out.write("                                    </div>\n");
        out.write("                                    <div id=\"divListadoCliente\">\n");
        out.write("                                        <a href=\"ListadoEmpleados\" style=\"color: white;font-size: 16px;\"><span class=\"fa fa-list-ul\"></span> Listado Empleados</a>\n");
        out.write("                                    </div>\n");
        out.write("                                </div>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_if_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent(null);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.autenticado}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <div class=\"mb-3\" id=\"divRegistroProducto\">\n");
        out.write("                                        <a href=\"registroSuministro.jsp\" style=\"color: white;font-size: 16px;\"><span class=\"fa fa-tags\"></span> Registro Suministro</a>\n");
        out.write("                                    </div>\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent(null);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.autenticado}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                        <div class=\"card\" style=\"background-color: #0d1650;\">\n");
        out.write("                            <div class=\"card-header\" id=\"headingThree\">\n");
        out.write("                                <h2 class=\"mb-0\">\n");
        out.write("                                    <a href=\"#\" class=\"collapsed\" style=\"font-size: large; color: white;\" data-toggle=\"collapse\" data-target=\"#collapseFive\"><span class=\"fa fa-truck\"></span> Distribución</a>\n");
        out.write("                                </h2>\n");
        out.write("                            </div>\n");
        out.write("                            <div id=\"collapseFive\" class=\"collapse\" aria-labelledby=\"headingThree\" data-parent=\"#accordionExample\">\n");
        out.write("                                <div class=\"card-body\" style=\"background-color: #1b1f96;\">\n");
        out.write("                                    <div class=\"mb-3\" id=\"divRegistroProducto\">\n");
        out.write("                                        <a href=\"generarRemito.jsp\" style=\"color: white;font-size: 16px;\"><span class=\"fa fa-file-text-o\"></span> Generar Remito</a>\n");
        out.write("                                    </div>\n");
        out.write("                                    \n");
        out.write("                                    <div class=\"mb-3\" id=\"divListadoProducto\">\n");
        out.write("                                        <a href=\"listadoRemito.jsp\" style=\"color: white;font-size: 16px;\"><span class=\"fa fa-list-ul\"></span> Listado Remitos</a>\n");
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
        out.write("                                <div class=\"card-body\" style=\"background-color: #1b1f96;\">\n");
        out.write("                                    <div class=\"mb-3\">\n");
        out.write("                                        <a href=\"reporte1.jsp\" style=\"color: white;font-size: 16px;\"><span class=\"fa fa-line-chart\"></span> Reporte 1</a>\n");
        out.write("                                    </div>\n");
        out.write("                                    <div>\n");
        out.write("                                        <a href=\"reporte2.jsp\" style=\"color: white;font-size: 16px;\"><span class=\"fa fa-pie-chart\"></span> Reporte 2</a>\n");
        out.write("                                    </div>\n");
        out.write("                                </div>\n");
        out.write("                            </div>\n");
        out.write("                        </div>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent(null);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${!sessionScope.autenticado}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li class=\"nav-item active mt-1\" style=\"color: #0d1650;\">\n");
        out.write("                                    <i class=\"fa fa-user fa-2x\" aria-hidden=\"true\"></i>\n");
        out.write("                                </li>\n");
        out.write("                                <li class=\"nav-item\" id=\"ingreso\" >\n");
        out.write("                                    <a href=\"index.html\" class=\"nav-link\">Ingresar</a>\n");
        out.write("                                </li>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent(null);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.autenticado}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                <li class=\"nav-item active mt-1\" style=\"color: #0d1650;\">\n");
        out.write("                                    <i class=\"fa fa-user fa-2x\" aria-hidden=\"true\"></i>\n");
        out.write("                                </li>\n");
        out.write("                                <li class=\"nav-item\" id=\"ingreso\" >\n");
        out.write("                                    <a href=\"index.html\" class=\"nav-link\"> Bienvenido ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.usuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</a>\n");
        out.write("                                </li>\n");
        out.write("                                <li class=\"nav-item\" id=\"divBienvenido\" >\n");
        out.write("                                    <p id=\"bienvenido\" class=\"mt-2 ml-2\"></p>\n");
        out.write("                                </li>\n");
        out.write("                                \n");
        out.write("                                    <li id=\"divSalir\" class=\"nav-link active mt-1 ml-2\" style=\"color: #0d1650;\">\n");
        out.write("                                        <i class=\"fa fa-sign-out fa-2x\" aria-hidden=\"true\"></i>\n");
        out.write("                                    </li>\n");
        out.write("                                    <li class=\"nav-item\" id=\"divSalirText\" >\n");
        out.write("\n");
        out.write("                                        <a type=\"submit\" class=\"nav-link\" value=\"\" name=\"CerrarSesion\" href=\"Logout\">Cerrar Sesion</a>\n");
        out.write("\n");
        out.write("                                    </li>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }
}
