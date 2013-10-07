/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ACTION;

import DAO.FabricaConexao;
import DAO.JDBCDisciplina;
import java.io.IOException;
import java.sql.Connection;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import MODEL.Disciplina;

/**
 *
 * @author darkfaco
 */
@WebServlet(name = "cadastrarDisciplina", urlPatterns = {"/cadastrarDisciplina"})
public class cadastrarDisciplina extends HttpServlet {
   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
                Disciplina disciplina = new Disciplina();
		disciplina.setNome(request.getParameter("nome"));
                disciplina.setProfessor(request.getParameter("listProfessor"));
		disciplina.setDescricao(request.getParameter("descricao"));
		
		FabricaConexao fabrica = new FabricaConexao();
		Connection con = fabrica.abrirConexao();
		
		JDBCDisciplina dao = new JDBCDisciplina(con);
		dao.cadastrarDisciplina(disciplina);
		
		fabrica.fecharConexao();
		
		 RequestDispatcher rd = null;  
               String urlRetorno = "sucesso_disciplina.jsp?nome="+disciplina.getNome()+"&descricao="+disciplina.getDescricao()+"&professor="+disciplina.getProfessor()+"";  
               rd = request.getRequestDispatcher(urlRetorno);  
               rd.forward(request, response); 
    }
}
