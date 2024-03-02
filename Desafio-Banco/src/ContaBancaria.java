public abstract class ContaBancaria implements IContaBancaria{

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENIAL = 2;    

    public ContaBancaria(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.digito = SEQUENIAL++;
        this.cliente = cliente;
    }

    protected int agencia;
    protected int digito;
    protected double saldo;
    protected Cliente cliente;
    
    public void sacar(double valor){
        this.saldo -= valor;
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
    public void transferir(double valor, ContaBancaria contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }
    public int getAgencia() {
        return agencia;
    }
    public int getDigito() {
        return digito;
    }
    public double getSaldo() {
        return saldo;
    }
    protected void imprimirInfoComum() {
        System.out.println(String.format("Agencia: %d ", this.agencia));
        System.out.println(String.format("Digito: %d ", this.digito));
        System.out.println(String.format("Saldo: %.2f ", this.saldo));
        System.out.println(String.format("Titular da conta: %s", this.cliente));
    }
}
