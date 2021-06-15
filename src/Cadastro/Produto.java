package Cadastro;

import java.sql.Date;

public class Produto {

   public int codProduto;
    public String nome;
    private double preçoDeCompra;
    private double taxaDeCusto;
    public double preçoDeVenda;
    public String destribuidor;
    public String tipo;
    public int quantidade;
    public String dataFabricaçao;
    public Date dataValidade;

    public int getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreçoDeCompra() {
        return preçoDeCompra;
    }

    public void setPreçoDeCompra(double preçoDeCompra) {
        this.preçoDeCompra = preçoDeCompra;
    }

    public double getTaxaDeCusto() {
        return taxaDeCusto;
    }

    public void setTaxaDeCusto(double taxaDeCusto) {
        this.taxaDeCusto = taxaDeCusto;
    }

    public double getPreçoDeVenda() {
        return preçoDeVenda;
    }

    public void setPreçoDeVenda(double preçoDeVenda) {
        this.preçoDeVenda = preçoDeVenda;
    }

    public String getDestribuidor() {
        return destribuidor;
    }

    public void setDestribuidor(String destribuidor) {
        this.destribuidor = destribuidor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDataFabricação() {
        return dataFabricaçao;
    }

    public void setDataFabricação(String dataFabricação) {
        this.dataFabricaçao = dataFabricação;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

}
