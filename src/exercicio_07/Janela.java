package exercicio_07;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Janela {


	// VARIAVEIS
	int valor;
	boolean valida = false;


	public void janela_1(){


		// JFRAME
		JFrame formulario = new JFrame();
		formulario.setSize(450, 600);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setLayout(null);
		formulario.setLocationRelativeTo(null);
		formulario.setTitle("C@lcul@dor@ (3@)");


		// JLABEL
		JLabel lcampo_1 = new JLabel();
		lcampo_1.setBounds(140, 30, 200, 30);
		lcampo_1.setText("Informe um número");

		JLabel exibir = new JLabel();
		JLabel exibir1 = new JLabel();
		JLabel exibir2= new JLabel();
		JLabel exibir3 = new JLabel();
		JLabel exibir4 = new JLabel();
		JLabel exibir5 = new JLabel();
		JLabel exibir6 = new JLabel();
		JLabel exibir7 = new JLabel();
		JLabel exibir8 = new JLabel();
		JLabel exibir9 = new JLabel();
		JLabel exibir10 = new JLabel();
		JLabel exibir0 = new JLabel();


		// JTEXTFIELD
		JTextField campo_1 = new JTextField();
		campo_1.setBounds(140, 100, 100, 35);


		// JBUTTON
		JButton botao = new JButton();
		botao.setText("Enviar");
		botao.setBounds(150, 200, 80, 35);


		// AÇÃO
		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				
				// VALIDAR VALOR NULO

				if(campo_1.getText().equals("")){

					valida = false;

				}else{

					valida = true;

				}

				
				// VALIDAR SE É NÚMERO
				try{
					
					valor = Integer.parseInt(campo_1.getText());
					
				}catch (Exception erro) {
					valida = false;
				}
				
				
				// EXIBIR INFORMAÇÕES
				if(valida == true){
					
					// CALCULOS
					exibir.setText("TABUADA DE "+valor);
					exibir0.setText(valor+"  x 0 = "+(valor*0));
					exibir1.setText(valor+"  x 1 = "+(valor*1));
					exibir2.setText(valor+"  x 2 = "+(valor*2));
					exibir3.setText(valor+"  x 3 = "+(valor*3));
					exibir4.setText(valor+"  x 4 = "+(valor*4));
					exibir5.setText(valor+"  x 5 = "+(valor*5));
					exibir6.setText(valor+"  x 6 = "+(valor*6));
					exibir7.setText(valor+"  x 7 = "+(valor*7));
					exibir8.setText(valor+"  x 8 = "+(valor*8));
					exibir9.setText(valor+"  x 9 = "+(valor*9));
					exibir10.setText(valor+" x 10 = "+(valor*10));
					
					
					// POSICIONAR
					exibir.setBounds(150, 130, 150, 30);
					exibir1.setBounds(150, 160, 150, 30);
					exibir2.setBounds(150, 190, 150, 30);
					exibir3.setBounds(150, 220, 150, 30);
					exibir4.setBounds(150, 250, 150, 30);
					exibir5.setBounds(150, 280, 150, 30);
					exibir6.setBounds(150, 310, 150, 30);
					exibir7.setBounds(150, 340, 150, 30);
					exibir8.setBounds(150, 370, 150, 30);
					exibir9.setBounds(150, 400, 150, 30);
					exibir10.setBounds(150, 430, 150, 30);
					botao.setBounds(150, 460, 80, 35);
					
					
					// ADICIONAR COMPONENTES
					formulario.add(exibir);
					formulario.add(exibir0);
					formulario.add(exibir1);
					formulario.add(exibir2);
					formulario.add(exibir3);
					formulario.add(exibir4);
					formulario.add(exibir5);
					formulario.add(exibir6);
					formulario.add(exibir7);
					formulario.add(exibir8);
					formulario.add(exibir9);
					formulario.add(exibir10);
					
					formulario.setVisible(false);
					formulario.setVisible(true);
					
				}


			}

		});


		// ADICIONAR COMPONENTES
		formulario.add(botao);
		formulario.add(campo_1);
		formulario.add(lcampo_1);


		// EXIBIR JFRAME
		formulario.setVisible(true);


	}


}
