package exercicio_05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela {

	
	// VARIAVEIS
	String situacao;
	int dia = -9;
	boolean valida = false;
	
	public void janela_1(){
		
		// JFRAME
		JFrame formulario = new JFrame();
		formulario.setSize(450, 400);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLayout(null);
		formulario.setTitle("Calendário");
		formulario.setLocationRelativeTo(null);
		
		
		// JLABEL
		JLabel lcampo_1 = new JLabel();
		lcampo_1.setBounds(150, 30, 150, 30);
		lcampo_1.setText("Informe um dia");

		JLabel exibir = new JLabel();
		
		
		//  JTEXTFIELD
		JTextField campo_1 = new JTextField();
		campo_1.setBounds(165, 80, 40, 35);
		
		
		// JBUTTON
		JButton botao = new JButton();
		botao.setBounds(130, 150, 120, 35);
		botao.setText("Enviar");
			
		
		// AÇÃO
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				// VALIDAR DIA
				try{

					dia = Integer.parseInt(campo_1.getText());
					
					if((dia < 0) || (dia > 28)){
						
						valida = false;
						
					}else{
						
						valida = true;
						
					}
					
					
				}catch (Exception erro) {
					valida = false;
				}
			
				if(valida == true){
					
					if((dia == 4) || (dia == 11) || (dia == 18) || (dia == 25) || (dia == 5) || (dia == 12) || (dia == 19) || (dia == 26)){
						
						situacao = "Final de Semana";
						
					}else{
						
						situacao = "Dia de Semana";
						
					}
					
					exibir.setText(situacao);
					exibir.setBounds(150, 150, 120, 30);
					botao.setBounds(130, 200, 120, 35);
					formulario.add(exibir);
					formulario.setVisible(false);
					formulario.setVisible(true);
					
				}
				
			}
			
		});
		
		// ADCIONAR COMPONENTES
		formulario.add(botao);
		formulario.add(campo_1);
		formulario.add(lcampo_1);
		
		
		// EXIBIR JFRAME
		formulario.setVisible(true);
		
		
	}
	
}
