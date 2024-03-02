package navegadorInternet;

public class Opera {
    public void exibirPagina(){
        System.out.println(String.format("Exibindo pagina via %d", this.getClass()));
    };
    public void abrirPagina(){
        System.out.println(String.format("Abrindo pagina via %d", this.getClass()));
    };
    public void atualizarPagina(){
        System.out.println(String.format("Atualizando pagina via %d", this.getClass()));
    };
}
