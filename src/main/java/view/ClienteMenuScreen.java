package view;

import javax.swing.*;
import java.awt.*;

public class ClienteMenuScreen extends JFrame {

    public ClienteMenuScreen() {
        setTitle("Banco Malvader - Menu Cliente");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(7, 1, 10, 10));

        String[] operacoes = {
            "Saldo",
            "Depósito",
            "Saque",
            "Extrato",
            "Consultar Limite",
            "Sair"
        };

        for (String operacao : operacoes) {
            JButton btnOperacao = new JButton(operacao);
            btnOperacao.addActionListener(e -> executarOperacao(operacao));
            add(btnOperacao);
        }

        setVisible(true);
    }

    private void executarOperacao(String operacao) {
        if (operacao.equals("Sair")) {
            dispose();
            new MainMenuScreen(false);
        } else {
            JOptionPane.showMessageDialog(this, operacao + " ainda não implementado!");
        }
    }
}
