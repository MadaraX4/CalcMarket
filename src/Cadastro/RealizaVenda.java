
package Cadastro;



public class RealizaVenda extends Produto {
    private int RV;
    
    public void vender (){
        RV= this.getQuantidade();
        
        if (RV>=1) {
          RV -- ;  
        } else {
            System.out.println("");
        }
        
    }
    
    
}
