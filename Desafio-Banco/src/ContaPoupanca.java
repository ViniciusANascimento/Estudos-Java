public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

    public void imprimirExtrato(){
        System.out.println("Extrato Conta Corrente  ========= ");
        super.imprimirInfoComum();
    }
}
