public class Musica {
    public String nome;
    public String artista;
    public String compositor;
    public int duracao;
    public Data dataLancamento;

    public Musica(String nome, String artista, String compositor, int duracao, int dia, int mes, int ano){
        dataLancamento = new Data(dia, mes, ano);
        setNome(nome);
        setCompositor(compositor);
        setArtista(artista);
        setDuracao(duracao);
    }

    public Data getDataLancamento() {
        return dataLancamento;
    }

    public String getArtista() {
        return artista;
    }

    public String getCompositor() {
        return compositor;
    }

    public int getDuracao() {
        return duracao;
    }

    public String getNome() {
        return nome;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setData(int dia, int mes, int ano){
        dataLancamento.setAno(ano);
        dataLancamento.setMes(mes);
        dataLancamento.setDia(dia);
    }
}
