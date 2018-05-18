package exercicio_04;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Janela {

	
	// VARIAVEIS
	String exibirdado;
	boolean valida = false;
	double valor = -9, desconto;
	
	
	public void janela_1() {
		
		// JFRAME
		JFrame formulario = new JFrame();
		formulario.setSize(350, 550);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setTitle("Pagador de Coisas");
		
		
		// JLABEL
		JLabel lcampo_1 = new JLabel();
		lcampo_1.setText("Informe nome ");
		lcampo_1.setBounds(50, 30, 200, 30);
		
		JLabel lcampo_2 = new JLabel();
		lcampo_2.setText("Qual o valor");
		lcampo_2.setBounds(50, 130, 200, 30);
		
		JLabel lcampo_3 = new JLabel();
		lcampo_3.setText("Qual a forma de pagamento");
		lcampo_3.setBounds(50, 230, 200, 30);
		
		
		
		// JTEXTFIELD
		JTextField campo_1 = new JTextField();
		campo_1.setBounds(30, 80, 180, 35);
		
		JTextField campo_2 = new JTextField();
		campo_2.setBounds(30, 180, 180, 35);
		
		
		// JCOMBOBOX
		JComboBox<String> campo_3 = new JComboBox();
		campo_3.setBounds(30, 280, 220, 35);
		campo_3.addItem("Selecione uma Opção");
		campo_3.addItem("     À vista ");
		campo_3.addItem("       CSF ");
		campo_3.addItem("      Débito ");
		
		
		// JBUTTON
		JButton botao = new JButton();
		botao.setBounds(70, 380, 100, 35);
		botao.setText("Enviar");
		
		
		// AÇÃO
		botao.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

				// VALIDANDO VALOR
					
					try{
						
						valor = Double.parseDouble(campo_2.getText());
						
					}catch (Exception erro) {
						valida = false;
					}
					
					if(valor < 0){
						
						valida = true;
						
					}

				
				// VALIDANDO COMBO 
				if(campo_3.getSelectedItem().equals("Selecione uma Opção")){
					
					valida = false;
					
				}else{
					
					valida = true;
					
				}
				
				
				// CALCULAR VALOR COM DESCONTO
				if((valor > 500) && (campo_3.getSelectedItem().equals("     À vista "))){
					
					desconto = valor*0.9;
					
				}else{
					
					desconto = valor;
					
				}
				
				if(campo_3.getSelectedItem().equals("       CSF ")){
					
					desconto = valor * 1.30;
					
				}
				

				exibirdado = "O produto "+campo_1.getText()+"\n e ficou por "+desconto;
				
				// MUDAR IMAGEM
				if(valida == true){
					

					JLabel ltexto = new JLabel();
					botao.setBounds(50, 400, 220, 35);
					ltexto.setBounds(60, 320, 320, 100);;
					ltexto.setText(exibirdado);
					formulario.add(ltexto);
					formulario.setVisible(false);
					formulario.setVisible(true);
					
				}
				
			}
			
		});
		
		
		// ADICIONAR COMPONENTES
		formulario.add(botao);
		formulario.add(lcampo_1);
		formulario.add(lcampo_2);
		formulario.add(lcampo_3);
		formulario.add(campo_1);
		formulario.add(campo_2);
		formulario.add(campo_3);
		
		
		// EXIBIR DADOS
		formulario.setVisible(true);
		
		
	}
	
	
}
