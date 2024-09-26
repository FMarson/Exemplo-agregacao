public class Album {
    private String nome;
    private Data dataLancamento;
    private int qtdMaximaFaixas;
    private int qtdAtualFaixas;
    private Musica[] musicas;

    public Album(String nome, Data dataLancamento, int qtdMaximaFaixas){
        // inicializar os parametros

        qtdAtualFaixas = 0;
        musicas = new Musica[qtdMaximaFaixas];
    }

    public void adicionarMusica(Musica musica){
        /*
         * 
         * implementar
         * 
         * 
         */
    }

    public void removerMusica(){ //a última música adicionada
        /*
         * 
         * implementar
         * 
         * 
         */
    }

    public void tocarMusica(int numMusica){ // passa o número de 1 até 10 por exemplo, mas busca de 0 até 9 por causa do vetor
        //se não achar exibir a mensagem: Não foi possivel encontrar a música número X
        //Erros: menor do que 0 e não pode ser maior ou igual à quantidade de músicas depois da conversão
        //Exibir:
        //Tocando a música NOMEDAMUSICA composta por COMPOSITOR e interpretada por ARTISTA. Lançada em DATA e que possui XXX de duração.
    }

    public void tocarMusica(String nomeMusica){
        //se não achar exibir a mensagem: Não foi possivel encontrar a música "Nome da Música"
    }


}
