package aparelhoTelefonico;

public class TelefoneApp {
    public void ligar(){
        System.out.println(String.format("Ligando via %d", this.getClass()));
    };
    public void atender(){
        System.out.println(String.format("Atendendo via %d", this.getClass()));
    };
    public void iniciarCorreioVoz(){
        System.out.println(String.format("Iniciando Correio de Voz via %d", this.getClass()));
    };
}
