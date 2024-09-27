public class Main {
    public static void main(String[] args) {
        Album meuAlbum;
        Musica musica;

        meuAlbum = new Album("Sei lá", 26, 9, 2024, 2);

        musica = new Musica("Música 1", "Artista 1", "Compositor 1", 6, 10, 5, 2001);
        meuAlbum.adicionarMusica(musica);
        musica = new Musica("Música 2", "Artista 2", "Compositor 2", 6, 10, 5, 2002);
        meuAlbum.adicionarMusica(musica);
        meuAlbum.removerMusica();
        musica = new Musica("Música 3", "Artista 3", "Compositor 3", 6, 10, 5, 2003);
        meuAlbum.adicionarMusica(musica);

        meuAlbum.tocarMusica(2);
        meuAlbum.tocarMusica("Música 2");

    }
}