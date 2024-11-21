package view;

import javax.swing.*;
import java.awt.*;

public class FuncionarioMenuScreen extends JFrame {

    public FuncionarioMenuScreen() {
        setTitle("Banco Malvader - Menu Funcionário");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(8, 1, 10, 10));

        String[] operacoes = {
            "Abertura de Conta",
            "Encerramento de Conta",
            "Consulta de Dados",
            "Alteração de Dados",
            "Cadastro de Funcionário",
            "Geração de Relatórios",
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
            new MainMenuScreen(true);
        } else {
            JOptionPane.showMessageDialog(this, operacao + " ainda não implementado!");
        }
    }
}
