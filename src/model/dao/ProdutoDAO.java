package model.dao;

import java.sql.Date;
import Conexao.ConexaoBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import Cadastro.Produto;
import java.sql.SQLException;

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
}
