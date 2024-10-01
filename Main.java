package testee;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        // Inicializa o sistema de controle de ônibus
        SistemaControleOnibus sistema = new SistemaControleOnibus();

        // Garante que a interface gráfica seja executada na thread correta
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Cria e exibe a tela principal
                TelaPrincipal tela = new TelaPrincipal(sistema);
                tela.setVisible(true);
            }
        });
    }
}
