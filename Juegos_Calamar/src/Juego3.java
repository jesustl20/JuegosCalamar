import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Juego3 extends JFrame {

	private JPanel contentPane;
	private JTextField tf5;
	private JTextField tf4;
	private JTextField tf3;
	private JTextField tf2;
	private JTextField tf1;
	private int numeroAleatorio = 1 + (int) (Math.random() * 3);
	private int numeroAleatorio1 = 1 + (int) (Math.random() * 3);
	private int numeroAleatorio2 = 1 + (int) (Math.random() * 3);
	private int numeroAleatorio3 = 1 + (int) (Math.random() * 3);
	private int numeroAleatorio4 = 1 + (int) (Math.random() * 3);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego3 frame = new Juego3();
					frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Juego3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 502, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lbl1 = new JLabel("GAME");
		lbl1.setBounds(132, 223, 48, 14);
		contentPane.add(lbl1);

		JLabel lbl2 = new JLabel("GAME");
		lbl2.setBounds(190, 223, 48, 14);
		contentPane.add(lbl2);

		JLabel lbl3 = new JLabel("GAME");
		lbl3.setBounds(248, 223, 48, 14);
		contentPane.add(lbl3);

		JLabel lbl4 = new JLabel("GAME");
		lbl4.setBounds(132, 198, 48, 14);
		contentPane.add(lbl4);

		JLabel lbl5 = new JLabel("GAME");
		lbl5.setBounds(190, 198, 48, 14);
		contentPane.add(lbl5);

		JLabel lbl6 = new JLabel("GAME");
		lbl6.setBounds(248, 198, 48, 14);
		contentPane.add(lbl6);

		JLabel lbl7 = new JLabel("GAME");
		lbl7.setBounds(132, 173, 48, 14);
		contentPane.add(lbl7);

		JLabel lbl8 = new JLabel("GAME");
		lbl8.setBounds(190, 173, 48, 14);
		contentPane.add(lbl8);

		JLabel lbl9 = new JLabel("GAME");
		lbl9.setBounds(248, 173, 48, 14);
		contentPane.add(lbl9);

		JLabel lbl10 = new JLabel("GAME");
		lbl10.setBounds(132, 148, 48, 14);
		contentPane.add(lbl10);

		JLabel lbl11 = new JLabel("GAME");
		lbl11.setBounds(190, 148, 48, 14);
		contentPane.add(lbl11);

		JLabel lbl12 = new JLabel("GAME");
		lbl12.setBounds(248, 148, 48, 14);
		contentPane.add(lbl12);

		JLabel lbl13 = new JLabel("GAME");
		lbl13.setBounds(132, 123, 48, 14);
		contentPane.add(lbl13);

		JLabel lbl14 = new JLabel("GAME");
		lbl14.setBounds(190, 123, 48, 14);
		contentPane.add(lbl14);

		JLabel lbl15 = new JLabel("GAME");
		lbl15.setBounds(248, 123, 48, 14);
		contentPane.add(lbl15);

		JLabel lblNumeroVidas = new JLabel("5");
		lblNumeroVidas.setBounds(314, 268, 48, 14);
		contentPane.add(lblNumeroVidas);
		
		JButton btnPruebaFinal = new JButton("Siguiente");
		btnPruebaFinal.setEnabled(false);
		btnPruebaFinal.setBounds(391, 303, 89, 23);
		contentPane.add(btnPruebaFinal);
		
		JLabel lblFinal = new JLabel("");
		lblFinal.setFont(new Font("Tw Cen MT", Font.PLAIN, 11));
		lblFinal.setBounds(155, 307, 221, 14);
		contentPane.add(lblFinal);
		
		JButton btn5 = new JButton("Siguiente");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int vidas = Integer.parseInt(lblNumeroVidas.getText());
				if(vidas>=1) {
					if (!tf5.getText().equalsIgnoreCase("")) {
						int numero = Integer.parseInt(tf5.getText());
						if (numero >= 1 && numero <= 3) {
							if (numero == 1 && numeroAleatorio4 == 1) {
								lbl14.setText("");
								lbl15.setText("");
								btn5.setEnabled(true);
								tf5.setEnabled(false);
								btnPruebaFinal.setEnabled(true);
								lblFinal.setText("PUEDES PASAR A LA FINAL");
							} else if(numero == 2 && numeroAleatorio4 == 2) {
								lbl13.setText("");
								lbl15.setText("");
								btn5.setEnabled(true);
								tf5.setEnabled(false);
								btnPruebaFinal.setEnabled(true);
								lblFinal.setText("PUEDES PASAR A LA FINAL");
							} else if(numero == 3 && numeroAleatorio4 == 3) {
								lbl13.setText("");
								lbl14.setText("");
								btn5.setEnabled(false);
								tf5.setEnabled(false);
								btnPruebaFinal.setEnabled(true);
								lblFinal.setText("PUEDES PASAR A LA FINAL");
							} else {
								tf5.setText("");
								lblNumeroVidas.setText(String.valueOf(vidas - 1));
							}
						} else {
							JOptionPane.showMessageDialog(null, "Introduce un número del 1 al 3");
						}

					} else {
						JOptionPane.showMessageDialog(null, "Rellena el campo");
					}
				}else {
					JOptionPane.showMessageDialog(null, "No te quedan vidas has perdido");
					tf5.setEnabled(false);
					btn5.setEnabled(false);
				}
			}
		});
		btn5.setEnabled(false);
		btn5.setBounds(391, 119, 89, 23);
		contentPane.add(btn5);
		
		JButton btn4 = new JButton("Siguiente");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int vidas = Integer.parseInt(lblNumeroVidas.getText());
				if(vidas>=1) {
					if (!tf4.getText().equalsIgnoreCase("")) {
						int numero = Integer.parseInt(tf4.getText());
						if (numero >= 1 && numero <= 3) {
							if (numero == 1 && numeroAleatorio3 == 1) {
								lbl11.setText("");
								lbl12.setText("");
								btn5.setEnabled(true);
								tf4.setEnabled(true);
								btn4.setEnabled(false);
								tf4.setEnabled(false);
							} else if(numero == 2 && numeroAleatorio3 == 2) {
								lbl10.setText("");
								lbl12.setText("");
								btn5.setEnabled(true);
								tf4.setEnabled(true);
								btn4.setEnabled(false);
								tf4.setEnabled(false);
							} else if(numero == 3 && numeroAleatorio3 == 3) {
								lbl10.setText("");
								lbl11.setText("");
								btn5.setEnabled(true);
								tf4.setEnabled(true);
								btn4.setEnabled(false);
								tf4.setEnabled(false);
							} else {
								tf4.setText("");
								lblNumeroVidas.setText(String.valueOf(vidas - 1));
							}
						} else {
							JOptionPane.showMessageDialog(null, "Introduce un número del 1 al 3");
						}

					} else {
						JOptionPane.showMessageDialog(null, "Rellena el campo");
					}
				}else {
					JOptionPane.showMessageDialog(null, "No te quedan vidas has perdido");
					tf4.setEnabled(false);
					btn4.setEnabled(false);
				}
			}
		});
		btn4.setEnabled(false);
		btn4.setBounds(391, 144, 89, 23);
		contentPane.add(btn4);

		JButton btn3 = new JButton("Siguiente");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int vidas = Integer.parseInt(lblNumeroVidas.getText());
				if(vidas>=1) {
					if (!tf3.getText().equalsIgnoreCase("")) {
						int numero = Integer.parseInt(tf3.getText());
						if (numero >= 1 && numero <= 3) {
							if (numero == 1 && numeroAleatorio2 == 1) {
								lbl8.setText("");
								lbl9.setText("");
								btn4.setEnabled(true);
								tf4.setEnabled(true);
								btn3.setEnabled(false);
								tf3.setEnabled(false);
							} else if(numero == 2 && numeroAleatorio2 == 2) {
								lbl7.setText("");
								lbl9.setText("");
								btn4.setEnabled(true);
								tf4.setEnabled(true);
								btn3.setEnabled(false);
								tf3.setEnabled(false);
							} else if(numero == 3 && numeroAleatorio2 == 3) {
								lbl7.setText("");
								lbl8.setText("");
								btn4.setEnabled(true);
								tf4.setEnabled(true);
								btn3.setEnabled(false);
								tf3.setEnabled(false);
							} else {
								tf3.setText("");
								lblNumeroVidas.setText(String.valueOf(vidas - 1));
							}
						} else {
							JOptionPane.showMessageDialog(null, "Introduce un número del 1 al 3");
						}

					} else {
						JOptionPane.showMessageDialog(null, "Rellena el campo");
					}
				}else {
					JOptionPane.showMessageDialog(null, "No te quedan vidas has perdido");
					tf3.setEnabled(false);
					btn3.setEnabled(false);
				}
				
			}
		});
		btn3.setEnabled(false);
		btn3.setBounds(391, 169, 89, 23);
		contentPane.add(btn3);

		JButton btn2 = new JButton("Siguiente");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int vidas = Integer.parseInt(lblNumeroVidas.getText());
				if(vidas>=1) {
					if (!tf2.getText().equalsIgnoreCase("")) {
						int numero = Integer.parseInt(tf2.getText());
						if (numero >= 1 && numero <= 3) {
							if (numero == 1 && numeroAleatorio1 == 1) {
								lbl5.setText("");
								lbl6.setText("");
								btn3.setEnabled(true);
								tf3.setEnabled(true);
								btn2.setEnabled(false);
								tf2.setEnabled(false);
							} else if(numero == 2 && numeroAleatorio1 == 2) {
								lbl4.setText("");
								lbl6.setText("");
								btn3.setEnabled(true);
								tf3.setEnabled(true);
								btn2.setEnabled(false);
								tf2.setEnabled(false);
							}else if(numero == 3 && numeroAleatorio1 == 3) {
								lbl4.setText("");
								lbl5.setText("");
								btn3.setEnabled(true);
								tf3.setEnabled(true);
								btn2.setEnabled(false);
								tf2.setEnabled(false);
							}else {
								tf2.setText("");
								lblNumeroVidas.setText(String.valueOf(vidas - 1));
							}
							
								
						
							
						} else {
							JOptionPane.showMessageDialog(null, "Introduce un número del 1 al 3");
						}

					} else {
						JOptionPane.showMessageDialog(null, "Rellena el campo");
					}
				}else {
					JOptionPane.showMessageDialog(null, "No te quedan vidas has perdido");
					tf2.setEnabled(false);
					btn2.setEnabled(false);
				}
				

			}
		});
		btn2.setEnabled(false);
		btn2.setBounds(391, 194, 89, 23);
		contentPane.add(btn2);

		

		

		tf5 = new JTextField();
		tf5.setEnabled(false);
		tf5.setBounds(314, 120, 48, 20);
		contentPane.add(tf5);
		tf5.setColumns(10);

		tf4 = new JTextField();
		tf4.setEnabled(false);
		tf4.setColumns(10);
		tf4.setBounds(314, 145, 48, 20);
		contentPane.add(tf4);

		tf3 = new JTextField();
		tf3.setEnabled(false);
		tf3.setColumns(10);
		tf3.setBounds(314, 170, 48, 20);
		contentPane.add(tf3);

		tf2 = new JTextField();
		tf2.setEnabled(false);
		tf2.setColumns(10);
		tf2.setBounds(314, 195, 48, 20);
		contentPane.add(tf2);

		tf1 = new JTextField();
		tf1.setColumns(10);
		tf1.setBounds(314, 220, 48, 20);
		contentPane.add(tf1);

		JLabel lblVidas = new JLabel("VIDAS:");
		lblVidas.setBounds(248, 268, 48, 14);
		contentPane.add(lblVidas);

		JButton btn1 = new JButton("Siguiente");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int vidas = Integer.parseInt(lblNumeroVidas.getText());
				if(vidas>=1) {
					if (!tf1.getText().equalsIgnoreCase("")) {
						int numero = Integer.parseInt(tf1.getText());
						if (numero >= 1 && numero <= 3) {
							if (numero == 1 && numeroAleatorio == 1) {
								lbl2.setText("");
								lbl3.setText("");
								btn2.setEnabled(true);
								tf2.setEnabled(true);
								btn1.setEnabled(false);
								tf1.setEnabled(false);
							} else if(numero == 2 && numeroAleatorio == 2){
								lbl1.setText("");
								lbl3.setText("");
								btn2.setEnabled(true);
								tf2.setEnabled(true);
								btn1.setEnabled(false);
								tf1.setEnabled(false);
								
							}else if(numero == 3 && numeroAleatorio == 3){
								lbl1.setText("");
								lbl2.setText("");
								btn2.setEnabled(true);
								tf2.setEnabled(true);
								btn1.setEnabled(false);
								tf1.setEnabled(false);
							}else {
								tf1.setText("");
								lblNumeroVidas.setText(String.valueOf(vidas - 1));
							}
						} else {
							JOptionPane.showMessageDialog(null, "Introduce un número del 1 al 3");
						}

					} else {
						JOptionPane.showMessageDialog(null, "Rellena el campo");
					}
				}else {
					JOptionPane.showMessageDialog(null, "No te quedan vidas has perdido");
					tf1.setEnabled(false);
					btn1.setEnabled(false);
				}
				

			}
		});
		btn1.setBounds(391, 219, 89, 23);
		contentPane.add(btn1);
		
		JLabel lblTitulo = new JLabel("BALDOSAS ENCANTADAS");
		lblTitulo.setFont(new Font("Perpetua", Font.PLAIN, 15));
		lblTitulo.setBounds(178, 11, 184, 14);
		contentPane.add(lblTitulo);
		
		
		
		

	}
}
