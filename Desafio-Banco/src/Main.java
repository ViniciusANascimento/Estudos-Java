public class Main {
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente();

        cliente1 .setNome("Vinicius");

        ContaBancaria contaCorrente = new ContaCorrente(cliente1);
        contaCorrente.depositar(100);
        ContaBancaria contaPoupanca = new ContaPoupanca(cliente1);
        
        contaCorrente.transferir(contaCorrente.saldo,contaPoupanca);
        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();

    }
}
