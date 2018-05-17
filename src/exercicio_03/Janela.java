package exercicio_03;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Janela {

	// VARIAVEIS
	boolean valida = false;
	double nota_1 = -1, nota_2 = -1, nota_3 = -1, nota_4 = -1, media;
	String mediaS, situacao = "";


	public void janela_1() {

		// JFRAME
		JFrame formulario = new JFrame();
		formulario.setSize(290, 600);
		formulario.setLocationRelativeTo(null);
		formulario.setLayout(null);
		formulario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		formulario.setTitle("Média.com.br");


		// JLABEL
		JLabel lcampo_1 = new JLabel();
		lcampo_1.setText("Informe a sua primeira nota");
		lcampo_1.setBounds( 55, 20 , 200, 30);


		JLabel lcampo_2 = new JLabel();
		lcampo_2.setText("Informe a sua segunda nota");
		lcampo_2.setBounds( 55, 120 , 200, 30);

		JLabel lcampo_3 = new JLabel();
		lcampo_3.setText("Informe a sua terceira nota");
		lcampo_3.setBounds( 55, 220 , 200, 30);

		JLabel lcampo_4 = new JLabel();
		lcampo_4.setText("Informe a sua quarta nota");
		lcampo_4.setBounds( 55, 320 , 200, 30);

		JLabel mediaJ = new JLabel();
		mediaJ.setBounds(55, 460, 200, 30);

		JLabel situacaoJ = new JLabel();
		situacaoJ.setBounds(55, 430, 200, 30);

		// JTEXTFIELD
		JTextField campo_1 = new JTextField();
		campo_1.setBounds(100, 70, 60, 30);

		JTextField campo_2 = new JTextField();
		campo_2.setBounds(100, 170, 60, 30);

		JTextField campo_3 = new JTextField();
		campo_3.setBounds(100, 270, 60, 30);

		JTextField campo_4 = new JTextField();
		campo_4.setBounds(100, 370, 60, 30);


		// JBUTTON
		JButton botao = new JButton();
		botao.setBounds(60, 430, 120, 35);
		botao.setText("Enviar");


		// AÇÃO
		botao.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// VALIDAR DADOS
				for(int i1 = 0; i1 < 4; i1++){
					try{

						nota_1 = Double.parseDouble(campo_1.getText());
						nota_2 = Double.parseDouble(campo_2.getText());
						nota_3 = Double.parseDouble(campo_3.getText());
						nota_4 = Double.parseDouble(campo_4.getText());

						if((nota_1 <= 10) && (nota_1 >= 0) && (i1 == 0)){

							valida = true;

						}else if((nota_2 <= 10) && (nota_2 >= 0) && (i1 == 1)){

							valida = true;

						}else if((nota_3 <= 10) && (nota_3 >= 0) && (i1 == 2)){

							valida = true;

						}else if((nota_4 <= 10) && (nota_4 >= 0) && (i1 == 3)){

							valida = true;

						}else{

							valida = false;

						}


					}catch (Exception erro) {
						valida = false;
					}
				}

				// CALCULO MEDIA
				media = (nota_1+nota_2+nota_3+nota_4)/4;

				if(media >= 7){

					situacao = "Você está aprovado";

				}else if(media >= 5){

					situacao = "Você está em Exame";

				}else if(media >= 0){

					situacao = "Você está Reprovado";

				}

				mediaS = String.valueOf(media);

				if(valida == true){
					
					situacaoJ.setText(situacao);
					mediaJ.setText(mediaS);
					formulario.add(situacaoJ);
					formulario.add(mediaJ);
					botao.setBounds(60, 500, 120, 35);
					formulario.setVisible(false);
					formulario.setVisible(true);

				}

			}

		});


		// ADICIONAR COMPONENTES
		formulario.add(campo_4);
		formulario.add(campo_1);
		formulario.add(campo_2);
		formulario.add(campo_3);
		formulario.add(lcampo_1);
		formulario.add(lcampo_2);
		formulario.add(lcampo_3);
		formulario.add(lcampo_4);
		formulario.add(botao);

		// EXIBIR JANELA
		formulario.setVisible(true);

	}


}
