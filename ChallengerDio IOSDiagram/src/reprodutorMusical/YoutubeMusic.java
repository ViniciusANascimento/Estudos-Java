package reprodutorMusical;

public class YoutubeMusic implements IReprodutorMusical {
    public void selecionarMusica(){
        System.out.println("Selecionado musica via YoutubeMusic");
    }
    public void pausarMusica(){
       System.out.println("Pausando musica via YoutubeMusic"); 
    }
    public void reproduzirMusica(){
        System.out.println("Reproduzindo musica via YoutubeMusic");
    }
}
