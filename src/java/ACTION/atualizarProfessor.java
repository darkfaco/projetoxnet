/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ACTION;

import DAO.FabricaConexao;
import DAO.JDBCProfessor;
import MODEL.Professor;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author darkfaco
 */
@WebServlet(name = "atualizarProfessor", urlPatterns = {"/atualizarProfessor"})
public class atualizarProfessor extends HttpServlet {

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
                 professor.setCPFNOVO(request.getParameter("cpfa"));
		
		FabricaConexao fabrica = new FabricaConexao();
		Connection con = fabrica.abrirConexao();
		
		JDBCProfessor dao = new JDBCProfessor(con);
		dao.alterarProfessor(professor);
		
		fabrica.fecharConexao();
                
                RequestDispatcher rd = null;  
               String urlRetorno = "sucesso_professor.jsp?nome="+professor.getNome()+"&sobrenome="+professor.getSobrenome()+"&email="+professor.getEmail()+"&data="+professor.getDataNasci()+"&rg="+professor.getRG()+"&cpfa="+professor.getCPF()+"&usuario="+professor.getLogin()+"&senha="+professor.getSenha()+"&cpf="+professor.getCPFNOVO()+"";  
               rd = request.getRequestDispatcher(urlRetorno);  
               rd.forward(request, response);  
    }
}
