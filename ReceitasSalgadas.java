public class ReceitasSalgadas extends Receitas {
    public ReceitasSalgadas(String nome, String tipo, int duracao, String nacionalidade) {
      super(nome, tipo, duracao, nacionalidade);
    }
    
    public static void main(String[] args) {
    Receitas receitasSalgadas = new ReceitasSalgadas("arroz", "salgada", 30, "brasil" );
        receitasSalgadas.exibirReceita();
    }
  }