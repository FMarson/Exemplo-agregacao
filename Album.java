public class Album {
    private String nome;
    private Data dataLancamento;
    private int qtdMaximaFaixas;
    private int qtdAtualFaixas;
    private Musica[] musicas;

    public Album(String nome, int dia, int mes, int ano, int qtdMaximaFaixas){
        // inicializar os parametros

        qtdAtualFaixas = 0;
        musicas = new Musica[qtdMaximaFaixas];
        this.qtdMaximaFaixas = qtdMaximaFaixas;
        dataLancamento = new Data(dia, mes, ano);
    }

    public void adicionarMusica(Musica musica){
        //if(qtdAtualFaixas < musicas.length)
        if(qtdAtualFaixas < qtdMaximaFaixas){
            musicas[qtdAtualFaixas] = musica;
            qtdAtualFaixas++;
        }
    }

    public void removerMusica(){ //a última música adicionada
        //musicas[--qtdAtualFaixas] = null;
        if(qtdAtualFaixas >= 1){
            --qtdAtualFaixas;
            musicas[qtdAtualFaixas] = null;
        }
    }

    public void tocarMusica(int numMusica){ 
        if(numMusica >= 1 && numMusica <= qtdAtualFaixas){
            System.out.println("Tocando a música " + musicas[numMusica-1].getNome() + " composta por " + musicas[numMusica-1].getCompositor() +
            " e interpretada por " + musicas[numMusica-1].getArtista() + ".\nLançada em " + musicas[numMusica-1].getDataLancamento() + " e que possui " 
            + musicas[numMusica-1].getDuracao() + " minutos de duração.");
        }
        else
        System.out.println("A música número " + numMusica + " não está disponível.");
    }

    public void tocarMusica(String nomeMusica){
        //se não achar exibir a mensagem: Não foi possivel encontrar a música "Nome da Música"
        boolean encontrou = false;
        for(Musica musica : musicas){
            if(musica.getNome().equalsIgnoreCase(nomeMusica)){
                System.out.println("Tocando a música " + musica.getNome() + " composta por " + musica.getCompositor() +
                " e interpretada por " + musica.getArtista() + ".\nLançada em " + musica.getDataLancamento() + " e que possui " 
                + musica.getDuracao() + " minutos de duração.");
                encontrou = true;
                break;
            }
        }
        if(!encontrou)
            System.out.println("Não foi possível encontrar a música " + nomeMusica);
    }


}
