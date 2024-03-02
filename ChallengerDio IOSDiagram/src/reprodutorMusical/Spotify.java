package reprodutorMusical;

public class Spotify implements IReprodutorMusical{
    public void selecionarMusica(){
        System.out.println("Selecionando Musica via Spotify");
    }
    public void pausarMusica(){
       System.out.println("Musica Pausada via Spotify"); 
    }
    public void reproduzirMusica(){
        System.out.println("Reproduzir Musica via Spotify");
    }
}
