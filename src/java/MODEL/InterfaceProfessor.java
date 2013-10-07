/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.util.List;

/**
 *
 * @author darkfaco
 */
public interface InterfaceProfessor {
    	public void cadastrarProfessor (Professor professor);
	public void deletarProfessor (Professor professor);
	public void alterarProfessor (Professor professor);
	public List<Professor> listarProfessor ();
    
}
