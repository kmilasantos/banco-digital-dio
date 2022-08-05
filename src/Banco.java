import java.util.List;

public class Banco {

    private String nomeBanco;
    private int CNPJ;
    private List<ContaBancaria> contas;

    //getters e setters
    public String getNomeBanco() { return nomeBanco; }
    public void setNomeBanco(String nomeBanco) { this.nomeBanco = nomeBanco; }
    public int getCNPJ() { return CNPJ; }
    public void setCNPJ(int CNPJ) { this.CNPJ = CNPJ; }
    public List<ContaBancaria> getContas(ContaBancaria conta) { return contas; }
    public void setContas(List<ContaBancaria> contas) { this.contas = contas; }


}
