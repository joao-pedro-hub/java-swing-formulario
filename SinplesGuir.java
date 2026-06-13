import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SinplesGuir {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Minha Janela");

        JLabel label0 = new JLabel("Nome:");
        JTextField input0 = new JTextField(20);

        JLabel label1 = new JLabel("Idade:");
        JTextField input1 = new JTextField(20);

        JLabel label2 = new JLabel("cpf:");
        JTextField input2 = new JTextField(20);

        JButton botaoEnviar = new JButton("Enviar");
        JButton botaoClear = new JButton("clear");

        frame.setLayout(new FlowLayout());

        frame.add(label0);
        frame.add(input0);

        frame.add(label1);
        frame.add(input1);

        frame.add(label2);
        frame.add(input2);

        frame.add(botaoEnviar);
        frame.add(botaoClear);
        frame.setVisible(true);
        // Ação do botão
        botaoEnviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String nome = input0.getText();
                String idade = input1.getText();
                String cpf = input2.getText();
                String texto = "Nome: " + nome + "\nIdade: " + idade + " \nCPF: " + cpf;
                JTextArea resposta = new JTextArea(texto);
                resposta.setEditable(false);
                frame.add(resposta);
                frame.revalidate();
                frame.repaint();
            }
        });
        botaoClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input0.setText("");
                input1.setText("");
                input2.setText("");
                input0.requestFocus();
            }
        });
        frame.setSize(300, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}