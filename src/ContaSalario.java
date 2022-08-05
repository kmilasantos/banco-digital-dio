import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContaSalario extends ContaBancaria{

    public String tipoConta = "Conta Salário";

    public ContaSalario(Cliente cliente) {
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
