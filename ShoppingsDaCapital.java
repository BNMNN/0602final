public class ShoppingsDaCapital extends ShoppingsDoRJ {
    public ShoppingsDaCapital(String nome, String cidade,String bairro, String rua, int numero) {
        super(nome, cidade, bairro, rua, numero);
    }

    public static void main(String[] args) {
        ShoppingsDoRJ shoppingsDoCapital = new ShoppingsDoRJ("RIO", "RIO", "RIO", "RIO", 1 );
        shoppingsDoCapital.exibirEnderecoCompleto();
}
}
