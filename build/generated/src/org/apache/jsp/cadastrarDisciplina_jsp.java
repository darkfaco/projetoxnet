package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import MODEL.Professor;
import java.util.List;

public final class cadastrarDisciplina_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Cadastrar Disciplina</title>\n");
      out.write("             <link href=\"screen.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("                     <script src=\"js/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"js/jquery.maskedinput.js\" type=\"text/javascript\"></script>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
/*
String usuario = (String)session.getAttribute("usuario_autenticado");
if (session.getAttribute("usuario_autenticado") == null) {
response.sendRedirect("login.jsp");
}*/


      out.write('\n');
  List<Professor> professoresdi = (ArrayList<Professor>)request.getAttribute("professoresdi");  
      out.write("\n");
      out.write("<div id=\"page\">\n");
      out.write("\n");
      out.write("\t\t<div id=\"header\">\n");
      out.write("\t\t\t<h1>Cadastro Disciplina Sistema X-NET</h1>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div id=\"content\">\n");
      out.write("\t\t\t<p id=\"status\"></p>\n");
      out.write("\t\t\t<form action=\"cadastrarDisciplina\" method=\"post\" id=\"cadastrarDisciplina\">\n");
      out.write("\t\t\t\t<fieldset>\n");
      out.write("\t\t\t\t\t<legend>Detalhes do Usuário</legend>\n");
      out.write("\t\t\t\t\t<ul>\n");
      out.write("\t<li>\n");
      out.write("\t<label for=\"nome\"><span class=\"required\">Nome:</span></label>\n");
      out.write("\t<input id=\"nome\" name=\"nome\" type=\"text\" />\n");
      out.write("\t</li>\n");
      out.write("\t\n");
      out.write("        <li>\n");
      out.write("\t<label for=\"sobrenome\"><span class=\"required\">Professor</span></label>\n");
      out.write("\t<select name=\"listProfessor\">\n");

List lista2 = (List)request.getAttribute("professoresdi");
for (int i = 0; i < lista2.size(); i++ ) { 

      out.write("\n");
      out.write("        <option value=\"");
      out.print(((Professor)lista2.get(i)).getCPF());
      out.write("\"> ");
      out.print(((Professor)lista2.get(i)).getNome());
      out.write("  </option>\n");
      out.write("        \n");

}

      out.write("\n");
      out.write("</select>\n");
      out.write("\t</li>\n");
      out.write("            \n");
      out.write("         <li>\n");
      out.write("\t<label for=\"email\"><span class=\"required\">Descrição</span></label>\n");
      out.write("\t<input name=\"email\" type=\"email\"  id=\"email\" />\n");
      out.write("\t</li>\n");
      out.write("\t<label class=\"centered info\"><a id=\"lembrasenha\" href=\"#\">Esqueceu sua senha ?</a></label>\n");
      out.write("\t</li>\n");
      out.write("\t</ul>\n");
      out.write("\t</fieldset>\n");
      out.write("\t<fieldset class=\"submit\">\n");
      out.write("            <input type=\"submit\" class=\"button\" name=\"btEnviar\" value=\"Cadastrar Disciplina\" onclick=\"return validarprofessor()\">\n");
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
