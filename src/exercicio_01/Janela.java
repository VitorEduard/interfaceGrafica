package exercicio_01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Janela {
	
	public void janela_1(){
		
		// JFRAME
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(350, 500);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("Me dê dados");
		
		
		// JLABEL
		JLabel campo_1 = new JLabel();
		campo_1.setText("Informe seu nome");
		campo_1.setBounds(60, 10, 200, 20);
		
		JLabel campo_2 = new JLabel();
		campo_2.setText("Informe sua Idade");
		campo_2.setBounds(60, 110, 200, 20);
		
		JLabel campo_3 = new JLabel();
		campo_3.setText("Informe em qual cidade Mora");
		campo_3.setBounds(60, 210, 200, 20);
		
		
		// JTEXTFIELD
		JTextField caixa_1 = new JTextField();
		caixa_1.setBounds(60, 60, 200, 30);

		JTextField caixa_2 = new JTextField();
		caixa_2.setBounds(60, 160, 200, 30);

		JTextField caixa_3 = new JTextField();
		caixa_3.setBounds(60, 260, 200, 30);
		
		
		// JBUTTON
		JButton botao = new JButton();
		botao.setText("Enviar");
		botao.setBounds(100, 350, 80, 40);
		
		
		// AÇÃO
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				// EXIBIR NOME
				JOptionPane.showMessageDialog(null, "Olá "+caixa_1.getText()+", você tem "+caixa_2.getText()+" anos de idade e mora em "+caixa_3.getText());
				
				// LIMPAR CAIXAS
				caixa_1.setText("");
				caixa_2.setText("");
				caixa_3.setText("");
				
			}
			
		});
		
		
		// ADICIONAR COMPONENTES
		formulario.add(caixa_3);
		formulario.add(caixa_2);
		formulario.add(caixa_1);
		formulario.add(campo_1);
		formulario.add(campo_2);
		formulario.add(campo_3);
		formulario.add(botao);
		
		
		//EXIBIR O FORMULARIO
		formulario.setVisible(true);
		
		
	}
	
	
}
