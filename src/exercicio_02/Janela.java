package exercicio_02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Janela {

	// VARIAVEIS
	String valor_descontoS;
	double numero, valor_desconto;
	
	
	public void janela_1(){
		
		// JFRAME
		JFrame formulario = new JFrame();
		formulario.setSize(400, 500);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setTitle("ADQUIRA SEU DESCONTO DE 10% MEU");
		
		
		// JLABEL
		JLabel lcaixa_1 = new JLabel();
		lcaixa_1.setText("Informe o valor do Produto");
		lcaixa_1.setBounds(75, 50, 160, 30);
		JLabel desconto = new JLabel();

		// JTEXTFIELD
		JTextField caixa_1 = new JTextField();
		caixa_1.setBounds(60, 110, 200, 30);
		
		
		
		// JBUTTON
		JButton botao = new JButton();
		botao.setText("Enviar");
		botao.setBounds(90, 200, 100, 35);
		
		
		// AÇÃO
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				numero = Double.parseDouble(caixa_1.getText());
				
				// CALCULO
				valor_desconto = numero*0.9;

				formulario.setVisible(false);
				valor_descontoS = String.valueOf(valor_desconto);
				desconto.setText("O valor com desconto ficou por R$"+valor_descontoS);
				desconto.setBounds(60, 150, 220, 30);
				formulario.setVisible(true);
				
					// ESVAZIAR CAMPO
					caixa_1.setText("");
					
			}
		});
		
		
		// ADICIONAR COMPONENTES
		formulario.add(lcaixa_1);
		formulario.add(caixa_1);
		formulario.add(botao);
		formulario.add(desconto);
		
		// DEIXAR VISIVEL
		formulario.setVisible(true);
		
		
	}
	
	
}
