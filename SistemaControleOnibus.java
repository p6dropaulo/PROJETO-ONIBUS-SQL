package testee;

import java.util.ArrayList;
import java.util.List;

public class SistemaControleOnibus {
    private List<Passageiro> passageiros;

    public SistemaControleOnibus() {
        passageiros = new ArrayList<>();
        inicializarPassageiros();  // Preenche com alguns passageiros de exemplo
    }

    private void inicializarPassageiros() {
        // Adiciona passageiros fictícios ao sistema
        passageiros.add(new Passageiro("João", "12345678901"));
        passageiros.add(new Passageiro("Maria", "09876543210"));
    }

    public void listarPassageiros() {
        System.out.println("Lista de Passageiros:");
        for (Passageiro p : passageiros) {
            System.out.println("Nome: " + p.getNome() + ", CPF: " + p.getCpf());
        }
    }

    // Aqui você pode adicionar outros métodos, como para reserva de passagens, vendas, etc.
}
