public interface IContaBancaria {
    void sacar(double valor);
    void depositar(double valor);
    void transferir(double valor, ContaBancaria contaDestino);
    void imprimirExtrato();
}
