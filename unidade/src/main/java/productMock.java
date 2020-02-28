public class productMock {

    public int pesoProduct(int altura, int largura, int comprimento) {
        int peso = (altura * largura * comprimento) / 100;

        if (peso <= 250) {
            System.out.println("Carga isenta de frete");
        }{
            System.out.println("Carga sem isenção de frete");
        }
        return peso;
    }
}
