public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNomeCliente("Camila Silva dos Santos");

        ContaBancaria corrente =  new ContaCorrente(cliente);
        corrente.depositar(785.53);

        ContaBancaria poupanca =  new ContaPoupanca(cliente);
        poupanca.depositar(6223);

        ContaBancaria salario =  new ContaSalario(cliente);
        salario.depositar(1982.20);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
        salario.imprimirExtrato();

        System.out.println("-----------------------------------------\n");

        corrente.transferir(200, poupanca);
        salario.sacar(982.20);

        corrente.imprimirExtrato();
        poupanca.imprimirExtrato();
        salario.imprimirExtrato();
    }
}