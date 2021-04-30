package Cadastro;



public class Produto {

    public String nome;
    private double preçoDeCompra;
    private double taxaDeCusto;
    public double preçoDeVenda;
    public static int códProduto=0;
    public String destribuidor;
    public String tipo;
    public int quantidade;
   
    public Produto(){
        taxaDeCusto=0.5;
        Produto.códProduto++;
    }
    public double preçoVenda() {
        preçoDeVenda = preçoDeCompra + (preçoDeCompra * taxaDeCusto);
        return preçoDeVenda;
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

    public int getCódProduto() {
        return códProduto;
    }

    public void setCódProduto(int códProduto) {
        this.códProduto = códProduto;
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
    
    public void status(){
        System.out.println("-----------------------------");
        System.out.println("Nome:"+this.nome);
        System.out.println("Código do Produto:"+códProduto);
        System.out.println("Tipo:"+this.tipo);
        System.out.println("preço:"+preçoDeVenda);
        System.out.println("Quantidade:"+this.quantidade);
        System.out.println("Destribuidor:"+this.destribuidor);
    }
}
