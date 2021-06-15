package Cadastro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class NotificaçãoDeData extends Produto {

    public void notificação() throws ParseException {
        Date data = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date dt2 = sdf.parse(this.getDataFabricação());
        long diffEmMil = Math.abs(dt2.getTime() - data.getTime());
        long days = TimeUnit.DAYS.convert(diffEmMil, TimeUnit.MILLISECONDS);

        System.out.println(days);
        if (days < 90 && days != 0) {
            System.out.println("Validade chegando a estado critico!");

        } else if (days == 0 && days < 0) {
            System.out.println("A validade expirou!");
        } else {
            System.out.println("");
        }

    }
}
