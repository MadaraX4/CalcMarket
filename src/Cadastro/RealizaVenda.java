
package Cadastro;


public class RealizaVenda extends Produto {
    private int RV;
    
    public void vender (){
        if (quantidade>=1) {
          RV= quantidade --;  
        } else {
            System.out.println("");
        }
        
    }
    
    
}
