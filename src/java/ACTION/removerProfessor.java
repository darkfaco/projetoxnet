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
@WebServlet(name = "removerProfessor", urlPatterns = {"/removerProfessor"})
public class removerProfessor extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Professor professor = new Professor();
                 professor.setRG(request.getParameter("rg"));
                 professor.setCPF(request.getParameter("cpf"));
		
		FabricaConexao fabrica = new FabricaConexao();
		Connection con = fabrica.abrirConexao();
		
		JDBCProfessor dao = new JDBCProfessor(con);
		dao.deletarProfessor(professor);
		
		fabrica.fecharConexao();
                
                RequestDispatcher rd = null;  
               String urlRetorno = "sucesso_removprofessor.jsp?&rg="+professor.getRG()+"&cpf="+professor.getCPF()+"";  
               rd = request.getRequestDispatcher(urlRetorno);  
               rd.forward(request, response);  
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
