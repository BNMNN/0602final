public class ShoppingsDeNiteroi extends ShoppingsDoRJ {
    public ShoppingsDeNiteroi(String nome, String bairro, String rua, int numero) {
        super(nome, "Niterói", bairro, rua, numero);
    }

    public static void main(String[] args) {
        ShoppingsDoRJ shoppingsDeNiteroi = new ShoppingsDoRJ("NIT", "NIT", "NIT", "NIT", 1 );
    shoppingsDeNiteroi.exibirEnderecoCompleto();
}
}
