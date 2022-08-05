import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContaPoupanca extends ContaBancaria{

    public String tipoConta = "Conta Poupança";

    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        String dataAtual  = LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println(String.format("==EXTRATO BANCÁRIO " + dataAtual + "=="));
        super.sendInfoConta();
        System.out.println("TIPO DE CONTA: " + this.tipoConta + "\n");
    }
}
