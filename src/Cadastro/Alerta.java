
package Cadastro;


public class Alerta {
  private static String aviso = "";
  
  public static void notificar(String av){
      Alerta.aviso += av + "\n";
     
  }
  
  public static String avisar(){
  return Alerta.aviso;
  }
}
