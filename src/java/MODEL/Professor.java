/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author darkfaco
 */
public class Professor {
        private String Nome;
        private String Sobrenome;
        private String Email;
        private String DataNasci;
	private String RG;
        private String CPF;
        private String login;
        private String senha;
        private String CPFNOVO;

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
     * @return the Sobrenome
     */
    public String getSobrenome() {
        return Sobrenome;
    }

    /**
     * @param Sobrenome the Sobrenome to set
     */
    public void setSobrenome(String Sobrenome) {
        this.Sobrenome = Sobrenome;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @param Email the Email to set
     */
    public void setEmail(String Email) {
        this.Email = Email;
    }

    /**
     * @return the DataNasci
     */
    public String getDataNasci() {
        return DataNasci;
    }

    /**
     * @param DataNasci the DataNasci to set
     */
    public void setDataNasci(String DataNasci) {
        this.DataNasci = DataNasci;
    }

    /**
     * @return the RG
     */
    public String getRG() {
        return RG;
    }

    /**
     * @param RG the RG to set
     */
    public void setRG(String RG) {
        this.RG = RG;
    }

    /**
     * @return the CPF
     */
    public String getCPF() {
        return CPF;
    }

    /**
     * @param CPF the CPF to set
     */
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    /**
     * @return the login
     */
    public String getLogin() {
        return login;
    }

    /**
     * @param login the login to set
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the cpfn
     */
    public String getCPFNOVO() {
        return CPFNOVO;
    }

    /**
     * @param cpfn the cpfn to set
     */
    public void setCPFNOVO(String cpfn) {
        this.CPFNOVO = cpfn;
    }
    
}
