public class ReceitasDoces extends Receitas {
    public ReceitasDoces(String nome, String tipo, int duracao, String nacionalidade) {
      super(nome, tipo, duracao, nacionalidade);
    }

  public static void main(String[] args) {
    Receitas receitasDoces = new ReceitasDoces("bolo", "doce", 30, "brasil" );
    receitasDoces.exibirReceita();
  }
}