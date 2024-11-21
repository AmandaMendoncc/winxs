package view;

import javax.swing.*;
import java.awt.*;

public class LoginScreen extends JFrame {

    private JTextField txtUsuario;
    private JPasswordField txtSenha;
    private JButton btnFuncionario;
    private JButton btnCliente;

    public LoginScreen() {
        setTitle("Banco Malvader - Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Carregar o logotipo
        JLabel logoLabel = new JLabel();
        ImageIcon logo = new ImageIcon("C:\\Users\\Amanda_Alves\\Documents\\NetBeansProjects\\BancoWinx\\src\\main\\java\\view\\image\\Logo\\logo.png");
        logoLabel.setIcon(new ImageIcon(logo.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
        logoLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(logoLabel, BorderLayout.NORTH);

        // Painel principal
        JPanel painelPrincipal = new JPanel(new GridLayout(3, 2, 10, 10));
        painelPrincipal.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        painelPrincipal.add(new JLabel("Usuário:"));
        txtUsuario = new JTextField();
        painelPrincipal.add(txtUsuario);

        painelPrincipal.add(new JLabel("Senha:"));
        txtSenha = new JPasswordField();
        painelPrincipal.add(txtSenha);

        btnFuncionario = new JButton("Entrar como Funcionário");
        btnCliente = new JButton("Entrar como Cliente");
        painelPrincipal.add(btnFuncionario);
        painelPrincipal.add(btnCliente);

        add(painelPrincipal, BorderLayout.CENTER);

        configurarEventos();
        setVisible(true);
    }

    private void configurarEventos() {
        btnFuncionario.addActionListener(e -> abrirMenuPrincipal(true));
        btnCliente.addActionListener(e -> abrirMenuPrincipal(false));
    }

    private void abrirMenuPrincipal(boolean isFuncionario) {
        dispose(); // Fecha a tela de login
        new MainMenuScreen(isFuncionario);
    }

}
