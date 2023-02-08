public class ShoppingsDoRJ {
    private String nome;
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;

    public ShoppingsDoRJ(String nome, String cidade, String bairro, String rua, int numero) {
        this.nome = nome;
        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

    public void exibirEnderecoCompleto() {
        System.out.println("Endereço do shopping " + nome + ": " + rua + ", " + numero + " - " + bairro + ", " + cidade);
    }


    public static void main(String[] args) {
        ShoppingsDoRJ shoppingsDoCapital = new ShoppingsDoRJ("RIO", "RIO", "RIO", "RIO", 1 );
        shoppingsDoCapital.exibirEnderecoCompleto();

        ShoppingsDoRJ shoppingsDeNiteroi = new ShoppingsDoRJ("NIT", "NIT", "NIT", "NIT", 1 );
        shoppingsDeNiteroi.exibirEnderecoCompleto();

        ShoppingsDoRJ shoppingsDeSaoGonçalo = new ShoppingsDoRJ("SG", "SG", "SG", "SG", 1 );
        shoppingsDeSaoGonçalo.exibirEnderecoCompleto();
}
}


