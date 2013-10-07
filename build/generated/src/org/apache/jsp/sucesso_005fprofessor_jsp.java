package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.File;

public final class sucesso_005fprofessor_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Gravação executada com sucesso!</title>\r\n");
      out.write("<link href=\"screen.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body >\r\n");
      out.write("    ");
 session.invalidate();
      out.write("\r\n");
      out.write("\t     ");

                    boolean isExcel = true;
                    if ("1".equals(request.getParameter("excel"))) {
                        isExcel = false;
                    }
                    boolean isWord = true;
                    if ("1".equals(request.getParameter("word"))) {
                        isWord = false;
                    }
        
      out.write("\r\n");
      out.write("        ");

                    if (!isExcel) {
                        String formName = "";
                        formName = "test.xls";
                        File filepath = new File(formName);
                        response.setContentType("application/vnd.ms-excel");
                        response.setHeader("Content-Disposition", "inline; filename=" + filepath);
                    }
                    if (!isWord) {
                        String formName = "";
                        formName = "test.doc";
                        File filepath = new File(formName);
                        response.setContentType("application/vnd.ms-word");
                        response.setHeader("Content-Disposition", "inline; filename=" + filepath);
                    }
        
      out.write("\r\n");
      out.write("<div id=\"page\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"header\">\r\n");
      out.write("\t\t\t<h1>Gravação executada com sucesso!</h1>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<div id=\"content\">\r\n");
      out.write("\t\t\t<p id=\"status\"></p>\r\n");
      out.write("\t\t\t<form action=\"\" method=\"get\" id=\"sucesso_professor\">\r\n");
      out.write("\t\t\t<fieldset>\r\n");
      out.write("\t\t\t\t\t<legend>Concluido.</legend>\r\n");
      out.write("\t\t\t\t\t<ul>\r\n");
      out.write("\t\t\t<legend>Gravação executada com sucesso!</legend>\r\n");
      out.write("                        <div align=\"center\">\r\n");
      out.write("        ");
if (isExcel || !isWord) {
      out.write("\r\n");
      out.write("        <a href=\"sucesso_professor.jsp?excel=1\">Gera Excel</a>\r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("        ");
if (isWord || !isExcel) {
      out.write("\r\n");
      out.write("        <a href=\"sucesso_professor.jsp?word=1\">Gera Word</a>\r\n");
      out.write("        ");
}
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("                            <li>\r\n");
      out.write("\t<label for=\"nome\"><span class=\"required\">Nome:</span></label>\r\n");
      out.write("\t<input name=\"nome\" type=\"text\" disabled=\"disabled\" id=\"nome\" value=\"");
      out.print( request.getParameter("nome") );
      out.write("\" readonly/>\r\n");
      out.write("\t</li>\r\n");
      out.write("\t\r\n");
      out.write("        <li>\r\n");
      out.write("\t<label for=\"sobrenome\"><span class=\"required\">Sobrenome</span></label>\r\n");
      out.write("\t<input name=\"sobrenome\" type=\"text\" disabled=\"disabled\"  id=\"sobrenome\" value=\"");
      out.print( request.getParameter("sobrenome") );
      out.write("\" readonly />\r\n");
      out.write("\t</li>\r\n");
      out.write("            \r\n");
      out.write("         <li>\r\n");
      out.write("\t<label for=\"email\"><span class=\"required\">E-mail</span></label>\r\n");
      out.write("\t<input name=\"email\" type=\"email\" disabled=\"disabled\" id=\"email\" value=\"");
      out.print( request.getParameter("email") );
      out.write("\" readonly/>\r\n");
      out.write("\t</li>\r\n");
      out.write("        \r\n");
      out.write("         <li>\r\n");
      out.write("\t<label for=\"data\"><span class=\"required\">Data de Nascimento</span></label>\r\n");
      out.write("\t<input name=\"data\" type=\"date\" disabled=\"disabled\"  id=\"data\" value=\"");
      out.print( request.getParameter("data") );
      out.write("\" readonly/>\r\n");
      out.write("\t</li>\r\n");
      out.write("        \r\n");
      out.write("        <li>\r\n");
      out.write("\t<label for=\"rg\"><span class=\"required\">RG</span></label>\r\n");
      out.write("\t<input name=\"rg\" type=\"text\" disabled=\"disabled\" id=\"rg\" value=\"");
      out.print( request.getParameter("rg") );
      out.write("\" readonly/>\r\n");
      out.write("\t</li>\r\n");
      out.write("         \r\n");
      out.write("        <li>\r\n");
      out.write("\t<label for=\"cpf\"><span class=\"required\">CPF</span></label>\r\n");
      out.write("\t<input name=\"cpf\" type=\"text\" disabled=\"disabled\" id=\"cpf\" value=\"");
      out.print( request.getParameter("cpf") );
      out.write("\" readonly/>\r\n");
      out.write("\t</li>\r\n");
      out.write("        \r\n");
      out.write("        <li>\r\n");
      out.write("        <label for=\"usuario\"><span class=\"required\">Usuario:</span></label>\r\n");
      out.write("        <input id=\"usuario\" name=\"usuario\" disabled=\"disabled\" class=\"text required email\" type=\"text\" value=\"");
      out.print( request.getParameter("usuario") );
      out.write("\" readonly/>\r\n");
      out.write("\t</li>\r\n");
      out.write("\t\r\n");
      out.write("\t<li>\r\n");
      out.write("\t<label for=\"password\"><span class=\"required\">senha</span></label>\r\n");
      out.write("        <input name=\"senha\" type=\"password\" disabled=\"disabled\" class=\"text required\" id=\"senha\" minlength=\"4\" maxlength=\"20\" value=\"");
      out.print( request.getParameter("senha") );
      out.write("\" readonly/>\r\n");
      out.write("\t</ul>\r\n");
      out.write("\t</fieldset>\r\n");
      out.write("\t<fieldset class=\"submit\">\r\n");
      out.write("            <input  type=\"submit\" class=\"button\" name=\"btEnviar\"  value=\"Pagina Inicial\" onclick=\"location.href='index.jsp'\">\r\n");
      out.write("            <input type=\"button\" class=\"button\" name=\"btDeslogar \"  value=\"Deslogar\" onclick=\"location.href='login.jsp'\">\r\n");
      out.write("\t</fieldset>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\t <label class=\"centered info\"><a  id=\"lembrasenha\"  >Todos os Direitos Reservados X-NET</a></label>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
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
}
