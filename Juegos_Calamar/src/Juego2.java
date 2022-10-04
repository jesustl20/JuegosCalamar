import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Juego2 extends JFrame {

	private JPanel contentPane;
	private JTextField tfPares;
	private int numeroAleatorio=1+(int)(Math.random()*10);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego2 frame = new Juego2();
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
	public Juego2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblParesONones = new JLabel("PARES O NONES");
		lblParesONones.setBounds(166, 11, 262, 25);
		lblParesONones.setFont(new Font("Perpetua", Font.PLAIN, 15));
		contentPane.add(lblParesONones);
		
		JLabel lblInformacion = new JLabel("\u00BFPares o nones?");
		lblInformacion.setBounds(10, 47, 122, 14);
		contentPane.add(lblInformacion);
		
		tfPares = new JTextField();
		tfPares.setBounds(10, 72, 96, 20);
		contentPane.add(tfPares);
		tfPares.setColumns(10);
		
		JButton btnJugar = new JButton("Jugar");
		btnJugar.setBounds(10, 219, 89, 23);
		contentPane.add(btnJugar);
		
		JLabel lblIntroduceUnNmero = new JLabel("Introduce un n\u00FAmero del 1 al 10");
		lblIntroduceUnNmero.setBounds(10, 103, 193, 14);
		contentPane.add(lblIntroduceUnNmero);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Juego3 juego3=new Juego3();
				juego3.setVisible(true);
			}
		});
		btnSiguiente.setEnabled(false);
		btnSiguiente.setBounds(339, 219, 89, 23);
		contentPane.add(btnSiguiente);
		
		JLabel lblVictoria = new JLabel("");
		lblVictoria.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.PLAIN, 18));
		lblVictoria.setBounds(10, 159, 418, 14);
		contentPane.add(lblVictoria);
		
		JSpinner spinnerNumero = new JSpinner();
		spinnerNumero.setModel(new SpinnerNumberModel(1, null, 10, 1));
		spinnerNumero.setBounds(10, 128, 96, 20);
		contentPane.add(spinnerNumero);
		
		JLabel lblRequisito = new JLabel("");
		lblRequisito.setBounds(136, 75, 193, 14);
		contentPane.add(lblRequisito);
		
		
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String paresnones=tfPares.getText();
				int numero=spinnerNumero.getComponentCount();
				int suma=numero+numeroAleatorio;
				System.out.println(suma);
				if(!tfPares.getText().equalsIgnoreCase("")) {
					lblRequisito.setText("");
					if(tfPares.getText().equalsIgnoreCase("pares")||tfPares.getText().equalsIgnoreCase("nones")){
						if(paresnones.equalsIgnoreCase("pares")) {
							if(suma%2!=0) {
								JOptionPane.showMessageDialog(null,"Has sido ejecutado");
								btnJugar.setEnabled(false);
							}else {
								lblVictoria.setText("HAS GANADO PUEDES PASAR AL SIGUIENTE NIVEL");
								btnSiguiente.setEnabled(true);
							}
						}else if(paresnones.equalsIgnoreCase("nones")) {
							if(suma%2==0) {
								JOptionPane.showMessageDialog(null,"Has sido ejecutado");
								btnJugar.setEnabled(false);
							}else {
								lblVictoria.setText("HAS GANADO PUEDES PASAR AL SIGUIENTE NIVEL");
								btnSiguiente.setEnabled(true);
							}
					}
						
					}
					
					
				
					
						
					
				}else {
					lblRequisito.setText("Rellena el campo");
				}
					
				
				
			}
		});
		
	}
}
