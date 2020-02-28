import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

//@RunWith(PowerMockRunner.class)

public class ProductConsultMockTest {

    private int altura;
    private int largura;
    private int comprimento;

    @Before
    public void prepareTests() {
        altura = 30 ;
        largura = 10;
        comprimento = 10;

        }

    @Test
    public int testepesoProduct() throws Exception {

        //arrange
        ProductConsultMockTest productConsult =  new ProductConsultMockTest();

        int expect = 300;
        int actual;

        actual = productMock.pesoProduct(30,10,10);

        Assert.assertEquals(  expect, actual, 0);

    }
 }
