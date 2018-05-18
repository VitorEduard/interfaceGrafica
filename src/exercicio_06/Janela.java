package exercicio_06;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Janela {

	
	// VARIAVEIS
	boolean valida = false;
	int valor_1, valor_2, resultado;
	
	public void janela_1(){
		
		
		// JFRAME
		JFrame formulario = new JFrame();
		formulario.setTitle("Software");
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);
		formulario.setSize(500, 600);
		formulario.setResizable(false);
		
		
		// JLABEL
		JLabel lcampo_1 = new JLabel();
		lcampo_1.setBounds(150, 30, 200, 30);
		lcampo_1.setText("Informe o 1º número");
		
		
		JLabel lcampo_2 = new JLabel();
		lcampo_2.setBounds(150, 130, 200, 30);
		lcampo_2.setText("Informe o 2º número");
		
		JLabel exibirdado = new JLabel();
		
		
		// JTEXTFIELD
		JTextField campo_1 = new JTextField();
		campo_1.setBounds(160, 80, 100, 35);
		
		JTextField campo_2 = new JTextField();
		campo_2.setBounds(160, 180, 100, 35);
		
		
		// JBUTTON
		JButton botao = new JButton();
		botao.setText("Enviar");
		botao.setBounds(150, 240, 120, 35);
		
		
		// AÇÃO
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				
				// VALIDAÇÃO
				if(campo_1.getText().equals("")){
					
					valida = false;
					
				}else{
					
					valida = true;
					
				}
				
				try{
					
					// CAPTURAR DADOS
					valor_1 = Integer.parseInt(campo_1.getText());	
					valor_2 = Integer.parseInt(campo_2.getText());
					
					valida = true;
					
				}catch (Exception erro) {
					valida = false;
				}
				
				
				// VALIDAR AÇÃO
				if((valor_1 == valor_2) && (valida == true)){
					
					resultado = valor_1*valor_2;
					
				}else if(valida == true){
					
					resultado = valor_1+valor_2;
					
				}
				
				
				// EXIBIR
				if(valida == true){
					
					exibirdado.setText("O resultado é "+resultado);
					exibirdado.setBounds(160, 220, 200, 35);
					botao.setBounds(150, 260, 120, 35);
					formulario.add(exibirdado);
					formulario.setVisible(false);
					formulario.setVisible(true);
					
				}
				
				
			}
			
		});
		
		
		// ADICIONAR COMPONENTES
		formulario.add(botao);
		formulario.add(campo_2);
		formulario.add(campo_1);
		formulario.add(lcampo_2);
		formulario.add(lcampo_1);
		
		
		// EIXIBIR JFRAME
		formulario.setVisible(true);
		
		
		
	}
	
	
}
