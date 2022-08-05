import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContaCorrente extends ContaBancaria{

    public String tipoConta = "Conta Corrente";

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    public String getTipoConta() { return tipoConta; }
    public void setTipoConta(String tipoConta) { this.tipoConta = tipoConta; }

    @Override
    public void imprimirExtrato() {
        String dataAtual  = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println(String.format("==EXTRATO BANCÁRIO " + dataAtual + "=="));
        super.sendInfoConta();
        System.out.println("TIPO DE CONTA: " + this.tipoConta + "\n");
    }

}
