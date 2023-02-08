public class Receitas {
    public String nome;
    public String tipo;
    public int duracao;
    public String nacionalidade;
    
    public Receitas(String nome, String tipo, int duracao, String nacionalidade) {
      this.nome = nome;
      this.tipo = tipo;
      this.duracao = duracao;
      this.nacionalidade = nacionalidade;
    }


    public void exibirReceita() {
    System.out.println("Nome da Receita: " + nome);
    System.out.println("Tipo da Receita: " + tipo);
    System.out.println("Duração da Receita: " + duracao + " minutos");
    System.out.println("Nacionalidade da Receita: " + nacionalidade);
    }



    public static void main(String[] args) {
        Receitas receitasDoces = new ReceitasDoces("bolo", "doce", 30, "brasil" );
        receitasDoces.exibirReceita();

        Receitas receitasSalgadas = new ReceitasSalgadas("arroz", "salgada", 30, "brasil" );
        receitasSalgadas.exibirReceita();
    }

}
