package Cadastro;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dao.ProdutoDAO;

public class NotificaçãoDeData extends Produto {

    public void notificação() throws ParseException {
        ResultSet datab = new ProdutoDAO().pegardata();
        Date dt2;
        Date data = new Date();
        String dt3 = data.getYear()+ "-" + data.getMonth()+"-"+ data.getDay();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try {
            while (datab.next()) {
                dt2 = datab.getDate("data_Validade");
                long diffEmMil = Math.abs(dt2.getTime() - data.getTime());
                long days = TimeUnit.DAYS.convert(diffEmMil, TimeUnit.MILLISECONDS);

                System.out.println(days);
               // if (days < 90 && days != 0) {
                System.out.println(dt3);
                System.out.println(dt2);
               if(dt2.toString() == dt3){     
               Alerta.notificar("Validade chegando a estado critico!");

                } else if (days == 0 && days < 0) {
                    Alerta.notificar("A validade expirou!");
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(NotificaçãoDeData.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
