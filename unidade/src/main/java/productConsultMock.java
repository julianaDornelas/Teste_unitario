import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class productConsultMock {

    public static String prazoValidade(String Date1, String Date2) throws ParseException {
        SimpleDateFormat spd = new SimpleDateFormat("dd/MM/yyyy");

        Date date1 = spd.parse(Date1);
        Date date2 = spd.parse(Date2);

        if (date1.after(date2)) {
            System.out.println("Produto no prazo de validade: " + spd.format(date1));
        } else if (date1.before(date2)) {
            System.out.println("Produto vencido: " + spd.format(date2));
        }
        return spd.format(date1);
    }
}
