package Cadastro;

import java.util.Scanner;

public class CadastroDeProduto {

    public static void main(String[] args) {

        Produto p = new Produto();
        p.setNome("cerveja");
        p.setPreçoDeCompra(3.5);
        p.preçoVenda();
        p.setDestribuidor("Skol");
        p.setTipo("bebida");
        p.setQuantidade(20);
        p.status();
       
        Produto p2 = new Produto();
        p.setNome("Coca Cola");
        p.setPreçoDeCompra(2.7);
        p.preçoVenda();
        p.setDestribuidor("Costa Brasil");
        p.setTipo("bebida");
        p.setQuantidade(100);
        p.status();
    }

}
