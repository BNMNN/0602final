public class ShoppingsDeSaoGoncalo extends ShoppingsDoRJ {
    public ShoppingsDeSaoGoncalo(String nome, String bairro, String rua, int numero) {
        super(nome, "São Gonçalo", bairro, rua, numero);
    }

    public static void main(String[] args) {
    ShoppingsDoRJ shoppingsDeSaoGonçalo = new ShoppingsDoRJ("SG", "SG", "SG", "SG", 1 );
    shoppingsDeSaoGonçalo.exibirEnderecoCompleto();
}
}
