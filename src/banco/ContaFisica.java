package banco;

public class ContaFisica extends Conta {
    private String cpf;
    private String nome;

    public ContaFisica(String numero, String cpf, String nome) {
        super(numero);
        this.cpf = cpf;
        this.nome = nome;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Conta Física: ");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Número da Conta: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
    }
}

