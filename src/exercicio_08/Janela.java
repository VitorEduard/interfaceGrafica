package exercicio_08;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela {
	
	
	public void janela_1(){
		
		
		// JFRAME
		JFrame formulario = new JFrame();
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setSize(500, 600);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("CALCULADEIRA MANJADA");
		
		
		// JLABEL
		JLabel lcampo_1 = new JLabel();
		lcampo_1.setText("Valor 1");
		lcampo_1.setBounds(90, 30, 100, 30);
		
		JLabel lcampo_2 = new JLabel();
		lcampo_2.setText("Valor 2");
		lcampo_2.setBounds(90, 130, 100, 30);
		
		
		// JTEXTFIELD
		JTextField campo_1 = new JTextField();
		campo_1.setBounds(60, 70, 60, 35);
		
		JTextField campo_2 = new JTextField();
		campo_2.setBounds(60, 170, 60, 35);
		
		
		// JBUTTON
		JButton botao = new JButton();
		botao.setText("Enviar");
		botao.setBounds(60, 250, 60, 35);
		
		
	}
	

}
