/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import MODEL.Disciplina;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author darkfaco
 */
public class JDBCDisciplina {
 Connection conexao;
	
	public JDBCDisciplina (Connection con){
		this.conexao = con;
	}

	public void cadastrarDisciplina(Disciplina disciplina) {
		
		try {
			String sql = "INSERT INTO Disciplina (Nome, Professor, Descricao) VALUES (?,?,?)";
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1, disciplina.getNome());
                        stmt.setString(2, disciplina.getProfessor());
			stmt.setString(3, disciplina.getDescricao());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void deletarDisciplina(Disciplina disciplina) {
				try {
			String sql = "delete from Disciplina where ID = ?";
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
                        stmt.setInt(1, disciplina.getID());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

		public void alterarDisciplina(Disciplina disciplina) {
	/*try {
	      String sql = "update Disciplina set ";
            sql += " Codigo = ?";
            sql += ", Nome = ?";
            sql += ", Sala = ?";
            sql += ", Horario = ?";
            sql += ", Diadasemana = ?";
            sql += ", CPFprof = ?";
            sql += " where Codigo = ?";
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setInt(1, disciplina.getCodigoa());
                        stmt.setString(2, disciplina.getNome());
			stmt.setString(3, disciplina.getSala());
			stmt.setString(4, disciplina.getHorario());
                        stmt.setString(5, disciplina.getDiadasemana());
                        stmt.setString(6,disciplina.getCpfprof());
                        stmt.setInt(6,disciplina.getCodigo());
			
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
	}

public List<Disciplina> listarDisciplina() {
        List<Disciplina> retorno = new ArrayList<Disciplina>();
        try {
        Statement conex = conexao.createStatement();
        String sql = "SELECT ID, Nome ,Professor ,Descricao  FROM Disciplina;";
        
            ResultSet rs = conex.executeQuery(sql);
            while (rs.next()) {
                Disciplina d = new Disciplina();
                d.setID(rs.getInt("ID"));
                d.setNome(rs.getString("Nome"));
                d.setProfessor(rs.getString("Professor"));
                d.setDescricao(rs.getString("Descricao"));                
                retorno.add(d);
            }
            conex.close();
        } catch (SQLException e) {
           e.getMessage();
        }
          return retorno; 
        }
      }





