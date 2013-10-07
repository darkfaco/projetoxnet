/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import MODEL.Professor;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author darkfaco
 */
public class JDBCProfessor {
    Connection conexao;
	
	public JDBCProfessor (Connection con){
		this.conexao = con;
	}

	public void cadastrarProfessor(Professor professor) {
		
		try {
			String sql = "INSERT INTO Professor (Nome,Sobrenome,Email,DataNasci,RG,CPF,login,senha) values (?,?,?,?,?,?,?,?)";
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1, professor.getNome());
                        stmt.setString(2, professor.getSobrenome());
                        stmt.setString(3, professor.getEmail());                        
			stmt.setString(4, professor.getDataNasci());
                        stmt.setString(5, professor.getRG());
                        stmt.setString(6, professor.getCPF());
                        stmt.setString(7, professor.getLogin());
                        stmt.setString(8, professor.getSenha());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
                    System.out.println("erro"+e);
		}
	}

	public void deletarProfessor(Professor professor) {
			try {
			String sql = "delete from Professor where cpf = ? and rg = ?";
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
                        stmt.setString(1, professor.getCPF());
			stmt.setString(2, professor.getRG());
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public void alterarProfessor(Professor professor) {
          try {
	      String sql = "update Professor set ";
            sql += " Nome = ?";
            sql += ", Sobrenome = ?";
            sql += ", Email = ?";
            sql += ", DataNasci = ?";
            sql += ", RG = ?";
            sql += ", CPF = ?";
            sql += ", login = ?";
            sql += ", senha = ?";
            sql += " where CPF = ?";
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1, professor.getNome());
                        stmt.setString(2, professor.getSobrenome());
                        stmt.setString(3, professor.getEmail());                        
			stmt.setString(4, professor.getDataNasci());
                        stmt.setString(5, professor.getRG());
                        stmt.setString(6, professor.getCPFNOVO());
                        stmt.setString(7, professor.getLogin());
                        stmt.setString(8, professor.getSenha());
                        stmt.setString(9, professor.getCPF());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public List<Professor> listarProfessor()
        {
        List<Professor> retorno = new ArrayList<Professor>();
        try {
        Statement conex = conexao.createStatement();
        String sql = "SELECT Nome,Sobrenome,Email,DataNasci,RG,CPF,login,senha  FROM Professor;";
        
            ResultSet rs = conex.executeQuery(sql);
            while (rs.next()) {
                Professor p = new Professor();
                p.setNome(rs.getString("Nome"));
                p.setSobrenome(rs.getString("Sobrenome"));
                p.setEmail(rs.getString("Email"));
                p.setDataNasci(rs.getString("DataNasci"));
                p.setRG(rs.getString("RG"));
                p.setCPF(rs.getString("CPF"));
                p.setLogin(rs.getString("login"));
                p.setSenha(rs.getString("senha"));
                retorno.add(p);
            }
            conex.close();
        } catch (SQLException e) {
           e.getMessage();
        }
          return retorno; 
        }
      }




