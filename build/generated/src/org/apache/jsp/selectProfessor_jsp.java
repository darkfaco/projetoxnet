package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;
import MODEL.Professor;

public final class selectProfessor_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Lista Professores X-NET</title>\n");
      out.write("<link href=\"screen.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("<script src=\"js/validarlogin.js\"></script>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body >\n");
      out.write("            ");
/*
String usuario = (String)session.getAttribute("usuario_autenticado");
if (session.getAttribute("usuario_autenticado") == null) {
response.sendRedirect("login.jsp");
}*/
List<Professor> listaprofessores = (ArrayList<Professor>)request.getAttribute("professores");

      out.write("\n");
      out.write("<div id=\"page\">\n");
      out.write("\n");
      out.write("\t\t<div id=\"header\">\n");
      out.write("\t\t\t<h1>Lista Professores X-NET</h1>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div id=\"content\">\n");
      out.write("\t\t\t<p id=\"status\"></p>\n");
      out.write("                        <fieldset>\n");
      out.write("\t\t\t\t\t<legend>Lista de Professores</legend>\n");
      out.write("\t\t\t            <table border=\"1\" id=\"contactform\">  \n");
      out.write("            <tr>  \n");
      out.write("                <td>Nome</td>  \n");
      out.write("                <td>SobreNome</td>  \n");
      out.write("                <td>Data de Nascimento</td>\n");
      out.write("                <td>Email</td>\n");
      out.write("                <td>RG</td>\n");
      out.write("                <td>CPF</td>\n");
      out.write("                <td>Usuario</td>\n");
      out.write("                <td>Senha</td>\n");
      out.write("                   </tr>  \n");
      out.write("                    ");
  
                for (int i = 0; i < listaprofessores.size(); i++ ) {  
            
      out.write("  \n");
      out.write("                    <tr>   \n");
      out.write("                <td> ");
      out.print(((Professor)listaprofessores.get(i)).getNome() );
      out.write(" </td>\n");
      out.write("                <td> ");
      out.print(((Professor)listaprofessores.get(i)).getSobrenome());
      out.write(" </td>  \n");
      out.write("                <td> ");
      out.print(((Professor)listaprofessores.get(i)).getDataNasci());
      out.write(" </td> \n");
      out.write("                <td>");
      out.print(((Professor)listaprofessores.get(i)).getEmail());
      out.write(" </td> \n");
      out.write("                <td> ");
      out.print(((Professor)listaprofessores.get(i)).getRG());
      out.write(" </td>  \n");
      out.write("                 <td> ");
      out.print(((Professor)listaprofessores.get(i)).getCPF());
      out.write(" </td>  \n");
      out.write("                  <td> ");
      out.print(((Professor)listaprofessores.get(i)).getLogin());
      out.write(" </td> \n");
      out.write("                   <td> ");
      out.print(((Professor)listaprofessores.get(i)).getSenha());
      out.write(" </td>  \n");
      out.write("            </tr>    \n");
      out.write("                    ");
  
                    }  
                    
      out.write("  \n");
      out.write("        </table>   \n");
      out.write("        \t</fieldset>\n");
      out.write("\n");
      out.write("        <label class=\"centered info\"><a  id=\"lembrasenha\"  >Todos os Direitos Reservados X-NET</a></label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
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
