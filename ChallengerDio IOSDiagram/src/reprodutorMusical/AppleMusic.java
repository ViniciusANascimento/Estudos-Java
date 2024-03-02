package reprodutorMusical;

public class AppleMusic implements IReprodutorMusical {
    public void selecionarMusica(){
        System.out.println("Selecionando Musica via AppleMusic");
    }
    public void pausarMusica(){
       System.out.println("Musica Pausada via AppleMusic"); 
    }
    public void reproduzirMusica(){
        System.out.println("Reproduzir Musica via AppleMusic");
    }

}
