package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class atualizarProfessor_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Atualizar Professor</title>\n");
      out.write("             <link href=\"screen.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("                     <script src=\"js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery.maskedinput.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/validarprofessor.js\"></script>\n");
      out.write("        \n");
      out.write("                     <script>\n");
      out.write("        \tjQuery(function(){\n");
      out.write("        \t    jQuery(\"#cpf\").mask(\"999.999.999-99\");\n");
      out.write("                    jQuery(\"#cpfa\").mask(\"999.999.999-99\");\n");
      out.write("                    jQuery(\"#rg\").mask(\"999.999.99\");\n");
      out.write("        \t});\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
/*
String usuario = (String)session.getAttribute("usuario_autenticado");
if (session.getAttribute("usuario_autenticado") == null) {
response.sendRedirect("login.jsp");
}*/


      out.write("\n");
      out.write("\n");
      out.write("<div id=\"page\">\n");
      out.write("\n");
      out.write("\t\t<div id=\"header\">\n");
      out.write("\t\t\t<h1>Atualizar Professor Sistema X-NET</h1>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div id=\"content\">\n");
      out.write("\t\t\t<p id=\"status\"></p>\n");
      out.write("\t\t\t<form action=\"atualizarProfessor\" method=\"post\" id=\"atualizarProfessor\"><fieldset>\n");
      out.write("            <legend>Informa dados do Usuário a ser alterado.</legend>\n");
      out.write("                    <li>\n");
      out.write("\t<label for=\"cpfa\"><span class=\"required\">CPF</span></label>\n");
      out.write("\t<input name=\"cpfa\" type=\"text\" id=\"cpfa\"/>\n");
      out.write("\t</li>\n");
      out.write("            </fieldset>\n");
      out.write("\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t<legend>Detalhes do Usuário</legend>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t<li>\n");
      out.write("\t<label for=\"nome\"><span class=\"required\">Nome:</span></label>\n");
      out.write("\t<input id=\"nome\" name=\"nome\" type=\"text\" />\n");
      out.write("\t</li>\n");
      out.write("\t\n");
      out.write("        <li>\n");
      out.write("\t<label for=\"sobrenome\"><span class=\"required\">Sobrenome</span></label>\n");
      out.write("\t<input name=\"sobrenome\" type=\"text\"  id=\"sobrenome\" />\n");
      out.write("\t</li>\n");
      out.write("            \n");
      out.write("         <li>\n");
      out.write("\t<label for=\"email\"><span class=\"required\">E-mail</span></label>\n");
      out.write("\t<input name=\"email\" type=\"email\"  id=\"email\" />\n");
      out.write("\t</li>\n");
      out.write("        \n");
      out.write("         <li>\n");
      out.write("\t<label for=\"data\"><span class=\"required\">Data de Nascimento</span></label>\n");
      out.write("\t<input name=\"data\" type=\"date\"  id=\"data\" />\n");
      out.write("\t</li>\n");
      out.write("        \n");
      out.write("        <li>\n");
      out.write("\t<label for=\"rg\"><span class=\"required\">RG</span></label>\n");
      out.write("\t<input name=\"rg\" type=\"text\" id=\"rg\"/>\n");
      out.write("\t</li>\n");
      out.write("         \n");
      out.write("        <li>\n");
      out.write("\t<label for=\"cpf\"><span class=\"required\">CPF</span></label>\n");
      out.write("\t<input name=\"cpf\" type=\"text\" id=\"cpf\"/>\n");
      out.write("\t</li>\n");
      out.write("        \n");
      out.write("        <li>\n");
      out.write("        <label for=\"usuario\"><span class=\"required\">Usuario:</span></label>\n");
      out.write("\t<input id=\"usuario\" name=\"usuario\" class=\"text required email\" type=\"text\" />\n");
      out.write("\t</li>\n");
      out.write("\t\n");
      out.write("\t<li>\n");
      out.write("\t<label for=\"password\"><span class=\"required\">senha</span></label>\n");
      out.write("\t<input name=\"senha\" type=\"password\" class=\"text required\" id=\"senha\" minlength=\"4\" maxlength=\"20\" />\n");
      out.write("\t</li>\n");
      out.write("\t<label class=\"centered info\"><a id=\"lembrasenha\" href=\"#\">Esqueceu sua senha ?</a></label>\n");
      out.write("\t</li>\n");
      out.write("\t</ul>\n");
      out.write("\t</fieldset>\n");
      out.write("\t<fieldset class=\"submit\">\n");
      out.write("            <input type=\"submit\" class=\"button\" name=\"btEnviar\" value=\"Atualizar Professor\" onclick=\"return validarprofessor()\">\n");
      out.write("\t</fieldset>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t</form>\n");
      out.write("\t\t\t <label class=\"centered info\"><a  id=\"lembrasenha\"  >Todos os Direitos Reservados X-NET</a></label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t</div>\n");
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
}
