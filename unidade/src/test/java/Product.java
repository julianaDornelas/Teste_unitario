import org.junit.Assert;
import org.junit.Test;
import java.text.ParseException;


public class Product {

    @Test
    public void testestoqueDeProduto (){
        productConsult  Product  = new productConsult ();
        int actual;
        int expect = 1;

        actual = Product.estoqueDeProduto(1);

        Assert.assertEquals(expect,actual);
    }
    @Test
    public void testestoqueDeProdutoFaltante () {
        productConsult Product = new productConsult();
        int actual;
        int expect = 0;

        actual = Product.estoqueDeProduto(0);

        Assert.assertEquals(expect, actual);
    }
    @Test
    public void testestoqueDeProdutoSuperior1 () {
        productConsult Product = new productConsult();
        int actual;
        int expect = 10;

        actual = Product.estoqueDeProduto(10);

        Assert.assertEquals(expect, actual);
    }
    @Test
    public void testeprazoValidadeOK() throws ParseException {
        productConsult Product = new productConsult ();
        String actual;
        String expect = ("26/02/2020");

        actual = Product.prazoValidade("26/02/2020", "27/02/2020");

        Assert.assertEquals(expect, actual);
    }
    @Test
    public void testeprazoValidadeNOK() throws ParseException {
        productConsult Product = new productConsult();
        String actual;
        String expect = ("27/02/2020");

        actual = Product.prazoValidade ("27/02/2020","26/02/2020" );

        Assert.assertEquals(expect, actual);
    }
    @Test
    public void testeprodutoPromocao(){
        productConsult Product = new productConsult();
         boolean actual = true;
         boolean expect = true;

        actual = Product.produtoPromocao(actual);
        Assert.assertEquals(expect, actual);
    }
    @Test
    public void testeprodutoSemPromocao() {
        productConsult Product = new productConsult();
        boolean actual = false;
        boolean expect = false;

        actual = Product.produtoPromocao(actual);
        Assert.assertEquals(expect, actual);
    }
    @Test
    public void testeprodutocomOpcaoRetiraEmLoja() {
        productConsult Product = new productConsult();
        boolean actual = false;
        boolean expect = false;

        actual = Product.produtocomOpcaoRetiraEmLoja(actual);
        Assert.assertEquals(expect, actual);
    }
    @Test
    public void testeprodutosemOpcaoRetiraEmLoja() {
        productConsult Product = new productConsult();
        boolean actual = true;
        boolean expect = true;

        actual = Product.produtocomOpcaoRetiraEmLoja(actual);
        Assert.assertEquals(expect, actual);
    }
}

