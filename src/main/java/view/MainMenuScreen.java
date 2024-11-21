package view;

import javax.swing.*;
import java.awt.*;

public class MainMenuScreen extends JFrame {

    public MainMenuScreen(boolean isFuncionario) {
        setTitle("Banco Malvader - Menu Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(3, 1, 10, 10));

        JButton btnFuncionario = new JButton("Funcionário");
        JButton btnCliente = new JButton("Cliente");
        JButton btnSair = new JButton("Sair");

        add(btnFuncionario);
        add(btnCliente);
        add(btnSair);

        btnFuncionario.setEnabled(isFuncionario);

        btnFuncionario.addActionListener(e -> abrirMenuFuncionario());
        btnCliente.addActionListener(e -> abrirMenuCliente());
        btnSair.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

    private void abrirMenuFuncionario() {
        dispose();
        new FuncionarioMenuScreen();
    }

    private void abrirMenuCliente() {
        dispose();
        new ClienteMenuScreen();
    }
}
