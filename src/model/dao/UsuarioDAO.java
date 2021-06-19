package model.dao;

import Conexao.ConexaoBanco;
import Cadastro.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuarioDAO {

    private Connection connection;

    public UsuarioDAO() {
        this.connection = new ConexaoBanco().getConnection();
    }

    public void create(Funcionario f) {

        String sql = "INSERT INTO cadastrofuncionario (CPF,nome,Id,Cod_Funcionário,Telefone,Senha)VALUES(?,?,?,?,?,?)";
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, f.getCpf());
            stmt.setString(2, f.getNome());
            stmt.setInt(3, f.getId());
            stmt.setInt(4, f.getCodFuncionario());
            stmt.setString(5, f.getTelefone());
            stmt.setString(6, f.getSenha());
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);

        }
    }

    public ResultSet autenticaçao(Funcionario flogin) {
        
        try {
            String sql="Select * from cadastrofuncionario where Id = ? and Senha = ?";
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, flogin.getId());
            stmt.setString(2, flogin.getSenha());
            
            ResultSet rs = stmt.executeQuery();
            return rs;
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Usuario: "+ e);
            return null;
        }
    }

}
