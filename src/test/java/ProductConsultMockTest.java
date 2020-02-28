import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest(ProductConsultMockTest.class)
class ProductConsultMockTest {

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
        final int METHOD= altura,largura,comprimento;

        ProductConsultMockTest spy = PowerMockito.spy(productConsult);
        PowerMockito.when(spy, METHOD)
                .thenReturn( (int) 300);

        int expect = 300;
        int actual;

        actual = productMock.pesoProduct(30,10,10);

        Assert.assertEquals(  expect, actual, 0);
        PowerMockito.verifyPrivate(spy, Mockito
                .times(1))
                .invoke(altura,largura,comprimento);
    }
}
