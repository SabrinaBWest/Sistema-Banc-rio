package banco;

public class ContaJuridica extends Conta {
    private String cnpj;
    private String razaoSocial;

    public ContaJuridica(String numero, String cnpj, String razaoSocial) {
        super(numero);
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Conta Jurídica: ");
        System.out.println("Razão Social: " + razaoSocial);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Número da Conta: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
    }
}
