/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author darkfaco
 */
public class Disciplina {
    private int ID;
    private String Nome;
    private String Professor;
    private String Descricao;

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the Nome
     */
    public String getNome() {
        return Nome;
    }

    /**
     * @param Nome the Nome to set
     */
    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    /**
     * @return the Professor
     */
    public String getProfessor() {
        return Professor;
    }

    /**
     * @param Professor the Professor to set
     */
    public void setProfessor(String Professor) {
        this.Professor = Professor;
    }

    /**
     * @return the Descricao
     */
    public String getDescricao() {
        return Descricao;
    }

    /**
     * @param Descricao the Descricao to set
     */
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    
}
