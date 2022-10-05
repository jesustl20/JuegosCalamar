import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;

public class Juego1 extends JFrame {

	private JPanel contentPane;
	private JTextField tfNumero;
	private int numeroAleatorio=1+(int)(Math.random()*50);


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 Juego1 frame1 = new Juego1();
					frame1.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Juego1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 468, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setEnabled(false);
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Juego2 juego2=new Juego2();
				juego2.setVisible(true);
				
				
			}
		});
		btnSiguiente.setBounds(339, 198, 89, 23);
		contentPane.add(btnSiguiente);
		
		JLabel lblEnunciado = new JLabel("Introduce un n\u00FAmero del 1 al 50:");
		lblEnunciado.setBounds(10, 108, 207, 14);
		contentPane.add(lblEnunciado);
		
		tfNumero = new JTextField();
		tfNumero.setBounds(210, 105, 96, 20);
		contentPane.add(tfNumero);
		tfNumero.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ADIVINA EL N\u00DAMERO CORRECTO");
		lblNewLabel.setFont(new Font("Perpetua", Font.PLAIN, 15));
		lblNewLabel.setBounds(112, 11, 228, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblVidas = new JLabel("VIDAS:");
		lblVidas.setBounds(10, 202, 48, 14);
		contentPane.add(lblVidas);
		
		JLabel lblNumeroVidas = new JLabel("5");
		lblNumeroVidas.setBounds(68, 202, 26, 14);
		contentPane.add(lblNumeroVidas);
		
		JLabel lblMensaje = new JLabel("");
		lblMensaje.setBounds(10, 133, 380, 14);
		contentPane.add(lblMensaje);
		
		JButton btnComprobar = new JButton("Comprobar");
		btnComprobar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numero=Integer.parseInt(tfNumero.getText());
				int vidas=Integer.parseInt(lblNumeroVidas.getText());
				if(numero<numeroAleatorio&&vidas>0) {
					lblMensaje.setText("El numero que hay que adivinar es mayor");
					lblNumeroVidas.setText(String.valueOf(vidas-1));
					
				}else if(numero>numeroAleatorio && vidas>0) {
					lblMensaje.setText("El numero que hay que adivinar es menor");
					lblNumeroVidas.setText(String.valueOf(vidas-1));
				}else if(numero==numeroAleatorio){
					lblMensaje.setText("HAS GANADO PUEDES PASAR A LA SIGUIENTE RONDA");
					btnSiguiente.setEnabled(true);
				}else if(numero<1||numero>50) {
					lblMensaje.setText("Introduce un número entre 1 y 50");
				}else {
					JOptionPane.showMessageDialog(null,"Te has quedado sin vidas,has perdido");
				}
				
			}
		});
		btnComprobar.setBounds(316, 104, 112, 23);
		contentPane.add(btnComprobar);
		
	
	}
}
