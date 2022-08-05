public abstract class ContaBancaria implements IcontaBancaria{

    //Atributos
    protected int agencia;
    protected int conta;
    protected double saldo;
    protected Cliente cliente;

    protected static int AGENCIA_PADRAO = 12345;
    protected static int SEQUENCIAL = 000001;

    //construtor
    public ContaBancaria(Cliente cliente){

        this.agencia = AGENCIA_PADRAO;
        this.conta = SEQUENCIAL++;
        this.cliente = cliente;
    }

    //getters
    public int getAgencia() { return agencia; }
    public int getConta() { return conta; }
    public double getSaldo() { return saldo; }

    //métodos
    @Override
    public void sacar(double valor) {

        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {

        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, ContaBancaria contaDestino) {

        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void sendInfoConta() {
        System.out.println(String.format("CLIENTE: %s", this.cliente.getNomeCliente()));
        System.out.println(String.format("AGENCIA: %d  CONTA: %06d", this.agencia, this.conta));
        System.out.println(String.format("SALDO: R$ %.2f", this.saldo));
    }
}
