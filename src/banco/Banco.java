package banco;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas;

    public Banco() {
        contas = new ArrayList<>();
    }

    public void criarContaFisica(String numero, String cpf, String nome) {
        ContaFisica conta = new ContaFisica(numero, cpf, nome);
        contas.add(conta);
        System.out.println("Conta Física criada com sucesso.");
    }

    public void criarContaJuridica(String numero, String cnpj, String razaoSocial) {
        ContaJuridica conta = new ContaJuridica(numero, cnpj, razaoSocial);
        contas.add(conta);
        System.out.println("Conta Jurídica criada com sucesso.");
    }

    public Conta buscarConta(String numero) {
        for (Conta conta : contas) {
            if (conta.getNumero().equals(numero)) {
                return conta;
            }
        }
        return null;
    }
}

