package model.dao;

import java.sql.Date;
import Conexao.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Cadastro.Produto;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTextField;

public class ProdutoDAO {

    private Connection connection;

    public ProdutoDAO() {
        this.connection = new ConexaoBanco().getConnection();
    }

    public void create(Produto p) {

        String sql = "INSERT INTO cadastroproduto (Cod_Produto,nome,tipo,distribuidor,data_Fabricacao,data_Validade,Preco_Compra,quantidade,preco_Venda)VALUES(?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setInt(1, p.getCodProduto());
            stmt.setString(2, p.getNome());
            stmt.setString(3, p.getTipo());
            stmt.setString(4, p.getDestribuidor());
            stmt.setString(5, p.getDataFabricação());
            stmt.setDate(6, (Date) p.getDataValidade());
            stmt.setDouble(7, p.getPreçoDeCompra());
            stmt.setInt(8, p.getQuantidade());
            stmt.setDouble(9, p.getPreçoDeVenda());
            stmt.execute();
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void consulta(JTextField Preco, JTextField quantidade, String nome) {
        String sql = "Select Preco_Venda,quantidade from cadastroproduto where nome like ?";

        try {

            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, nome);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Double tPreco = rs.getDouble("Preco_Venda");
                Preco.setText(tPreco.toString());

                Integer tQuantidade = rs.getInt("quantidade");
                quantidade.setText(tQuantidade.toString());

            }
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void Pesquisar(JTextField Preco, String nome) {
        String sql = "Select Preco_Venda from cadastroproduto where nome like ?";

        try {

            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, nome);

            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Double tPreco = rs.getDouble("Preco_Venda");
                Preco.setText(tPreco.toString());

            }
            stmt.close();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public void vender(JTextField preco, JTextField total) {
        Double precoT = Double.parseDouble(total.getText());
        precoT += Double.parseDouble(preco.getText());
        total.setText(precoT.toString());
    }

    public ResultSet pegardata() {
        String sql = "Select * from cadastroproduto";

        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            return stmt.executeQuery();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
