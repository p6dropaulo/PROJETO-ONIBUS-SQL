package testee;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TelaPrincipal extends JFrame {
    private SistemaControleOnibus sistema;

    public TelaPrincipal(SistemaControleOnibus sistema) {
        this.sistema = sistema;

        // Configurações da janela
        setTitle("Sistema de Controle de Ônibus");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Exemplo de botão e painel
        JPanel panel = new JPanel();
        JButton button = new JButton("Verificar Passageiros");
        panel.add(button);
        
        // Adiciona o painel ao frame
        add(panel, BorderLayout.CENTER);
        
        // Ação do botão (exemplo)
        button.addActionListener(e -> {
            sistema.listarPassageiros();  // Ação que lista os passageiros no console
        });
    }
}
