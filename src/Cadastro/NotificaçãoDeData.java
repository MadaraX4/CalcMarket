package Cadastro;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class NotificaçãoDeData extends Produto {
 
  
    public void notificação () {

        LocalDate dt1 = LocalDate.now();
        LocalDate dt2 = this.dataValidade;
        long days = ChronoUnit.DAYS.between(dt1, dt2);
        System.out.println(days);
        if (days < 90 && days != 0) {
            System.out.println("Validade chegando a estado critico!");

        } else if (days < 0 ^ days == 0) {
            System.out.println("A validade expirou!");
        } else {
            System.out.println("");
        }

    }
}
