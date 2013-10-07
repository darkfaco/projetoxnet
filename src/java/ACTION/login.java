/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ACTION;


import MODEL.Professor;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author aluno
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet { 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
             PrintWriter out = response.getWriter();
		Connection con;
		ResultSet rs;
    String usuario = request.getParameter("login");
    String senha = request.getParameter("senha");
                                         boolean verificausuario = false;
		try {
			 // Load the database driver
                    String nomeConexao = "xnet"; //conectao //xnet
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver"); 
			// Get a Connection to the database
			 con = DriverManager.getConnection("jdbc:odbc:" + nomeConexao);
			//Add the data into the database
			String sql = "select login, senha FROM Professor where login = '" + usuario + "' and senha = '" + senha + "';";
			Statement s = con.createStatement();
			s.executeQuery (sql);
			rs = s.getResultSet();
			while (rs.next ()){
                          verificausuario = true;
                          break;
			}
			rs.close ();
			s.close ();
			}catch(Exception e){
			System.out.println("Exception is ;"+e);
			}
			if(verificausuario == true)
                        {
			 HttpSession session = request.getSession();
                         session.setAttribute("usuario_autenticado",usuario);
                         this.getServletContext().getRequestDispatcher("/Sucesso.jsp").forward(request, response);
			}
			else{
				out.println("Please enter correct username and password");
				out.println("<a href='AuthenticLogin.jsp'><br>Login again</a>");
			}
	}

}
