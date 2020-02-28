import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class productConsult {

    public int estoqueDeProduto(int estoque) {
        if (estoque >= 1) {
            return estoque;
        }
        System.out.println("Produto sem estoque");
        return estoque;
    }
    public String prazoValidade(String Date1, String Date2 ) throws ParseException {
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
    public boolean produtoPromocao(boolean promocao) {
        if (promocao == true) {
            System.out.println("Produto com promoção atrelada");
        }else {
            System.out.println("Produto sem promoção atrelada");
        }
        return promocao;
    }
    public boolean produtocomOpcaoRetiraEmLoja(boolean retiraLoja) {
        if (retiraLoja == true) {
            System.out.println("Produto disponível para retirar em lojar");
        }else {
            System.out.println("Produto disponível somente para compra online");
        }
        return retiraLoja;
    }
}