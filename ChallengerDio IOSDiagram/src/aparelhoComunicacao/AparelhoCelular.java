package aparelhoComunicacao;
import aparelhoTelefonico.*;
import navegadorInternet.*;
import reprodutorMusical.*;

public class AparelhoCelular implements IAparelhorTelefonico,IReprodutorMusical,INavegadorInternet{
    public void ligar(){
        System.out.println("Realizando ligação via Aparelho Celular");
    };
    public void atender(){
        System.out.println("Atentendo ligação via Aparelho Celular");
    };
    public void iniciarCorreioVoz(){
        System.out.println("Abrindo Correio de Voz via Aparelho Celular");
    };    

    public void pausarMusica(){
        System.out.println("Pausando musica do Aparelho Celular");
    };
    public void reproduzirMusica(){
        System.out.println("Reproduzindo musica do Aparelho Celular");
    };
    public void selecionarMusica(){
        System.out.println("Selecionado musica do aparelho celular");
    };

    public void exibirPagina(){

    };
    public void abrirPagina(){

    };
    public void atualizarPagina(){

    };
}
