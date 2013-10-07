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
public interface InterfaceDisciplina {
        public void cadastrarDisciplina (Disciplina disciplina);
	public void deletarDisciplina (Disciplina disciplina);
	public void alterarDisciplina (Disciplina disciplina);
	public List<Disciplina> listarDisciplina ();
}
