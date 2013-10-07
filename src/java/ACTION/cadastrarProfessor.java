/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ACTION;

import DAO.FabricaConexao;
import DAO.JDBCProfessor;
import java.io.IOException;
import java.sql.Connection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import MODEL.Professor;

/**
 *
 * @author darkfaco
 */
@WebServlet(name = "cadastrarProfessor", urlPatterns = {"/cadastrarProfessor"})
public class cadastrarProfessor extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
           Professor professor = new Professor();
		
		professor.setNome(request.getParameter("nome"));
                professor.setSobrenome(request.getParameter("sobrenome"));
                professor.setEmail(request.getParameter("email"));
                professor.setDataNasci(request.getParameter("data"));
                 professor.setRG(request.getParameter("rg"));
                 professor.setCPF(request.getParameter("cpf"));
                 professor.setLogin(request.getParameter("usuario"));
                 professor.setSenha(request.getParameter("senha"));
		
		FabricaConexao fabrica = new FabricaConexao();
		Connection con = fabrica.abrirConexao();
		
		JDBCProfessor dao = new JDBCProfessor(con);
		dao.cadastrarProfessor(professor);
		
		fabrica.fecharConexao();
                
                RequestDispatcher rd = null;  
               String urlRetorno = "sucesso_professor.jsp?nome="+professor.getNome()+"&sobrenome="+professor.getSobrenome()+"&email="+professor.getEmail()+"&data="+professor.getDataNasci()+"&rg="+professor.getRG()+"&cpf="+professor.getCPF()+"&usuario="+professor.getLogin()+"&senha="+professor.getSenha()+"";  
               rd = request.getRequestDispatcher(urlRetorno);  
               rd.forward(request, response);  
    }
}
