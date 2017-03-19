package Visão;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.SwingConstants;

import RegraNegocio.CalculadoraRN;

import java.awt.Color;

public class CalculadoraVisão extends JFrame {

	private JPanel contentPane;
	private JTextField TFResultado;
	private int concatenar=0;
	private int calculando=1;
	CalculadoraRN controle = new CalculadoraRN();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraVisão frame = new CalculadoraVisão();
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
	public CalculadoraVisão() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 343, 353);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		TFResultado = new JTextField();
		TFResultado.setText("0");
		TFResultado.setBackground(Color.WHITE);
		TFResultado.setHorizontalAlignment(SwingConstants.TRAILING);
		TFResultado.setEditable(false);
		TFResultado.setBounds(32, 25, 219, 36);
		contentPane.add(TFResultado);
		TFResultado.setColumns(10);
		
		JButton bt7 = new JButton("7");
		bt7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (concatenar == 0){
					if (TFResultado.getText().equals("0")){
						TFResultado.setText("7");

					}else{
					TFResultado.setText(TFResultado.getText()+"7");
					}
				}else{
					TFResultado.setText("7");
					concatenar=0;
				}
				
			}
		});
		bt7.setFont(new Font("Arial", Font.PLAIN, 9));
		bt7.setBounds(32, 72, 39, 39);
		contentPane.add(bt7);
		
		JButton bt8 = new JButton("8");
		bt8.setFont(new Font("Arial", Font.PLAIN, 9));
		bt8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (concatenar == 0){
					if (TFResultado.getText().equals("0")){
						TFResultado.setText("8");

					}else{
					TFResultado.setText(TFResultado.getText()+"8");
					}
				}else{
					TFResultado.setText("8");
					concatenar=0;
				}
			}
		});
		bt8.setBounds(81, 72, 39, 39);
		contentPane.add(bt8);
		
		JButton bt9 = new JButton("9");
		bt9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (concatenar == 0){
					if (TFResultado.getText().equals("0")){
						TFResultado.setText("9");

					}else{
					TFResultado.setText(TFResultado.getText()+"9");
					}
				}else{
					TFResultado.setText("9");
					concatenar=0;
				}
			}

		});
		bt9.setFont(new Font("Arial", Font.PLAIN, 9));
		bt9.setBounds(130, 72, 39, 39);
		contentPane.add(bt9);
		
		JButton btdividi = new JButton("/");
		btdividi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				concatenar=1;
				controle.setValor(Double.parseDouble(TFResultado.getText()));
				
				if (calculando==0){
					controle.Calcular();
				}
				controle.Dividir();
				calculando=0;
				
			}
		});
		btdividi.setFont(new Font("Arial", Font.PLAIN, 9));
		btdividi.setBounds(212, 72, 39, 39);
		contentPane.add(btdividi);
		
		JButton bt4 = new JButton("4");
		bt4.setFont(new Font("Arial", Font.PLAIN, 9));
		bt4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (concatenar == 0){
					if (TFResultado.getText().equals("0")){
						TFResultado.setText("4");

					}else{
					TFResultado.setText(TFResultado.getText()+"4");
					}
				}else{
					TFResultado.setText("4");
					concatenar=0;
				}
			}
		});
		bt4.setBounds(32, 129, 39, 35);
		contentPane.add(bt4);
		
		JButton bt5 = new JButton("5");
		bt5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (concatenar == 0){
					if (TFResultado.getText().equals("0")){
						TFResultado.setText("5");

					}else{
					TFResultado.setText(TFResultado.getText()+"5");
					}
				}else{
					TFResultado.setText("5");
					concatenar=0;
				}
			}
		});
		bt5.setFont(new Font("Arial", Font.PLAIN, 9));
		bt5.setBounds(81, 129, 39, 35);
		contentPane.add(bt5);
		
		JButton bt6 = new JButton("6");
		bt6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (concatenar == 0){
					if (TFResultado.getText().equals("0")){
						TFResultado.setText("6");

					}else{
					TFResultado.setText(TFResultado.getText()+"6");
					}
				}else{
					TFResultado.setText("6");
					concatenar=0;
				}
			}
		});
		bt6.setFont(new Font("Arial", Font.PLAIN, 9));
		bt6.setBounds(130, 129, 39, 35);
		contentPane.add(bt6);
		
		JButton btmultiplica = new JButton("*");
		btmultiplica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				concatenar=1;
				controle.setValor(Double.parseDouble(TFResultado.getText()));
				
				if (calculando==0){
					controle.Calcular();
				}
				controle.Multiplicar();
				calculando=0;
			}
		});
		btmultiplica.setFont(new Font("Arial", Font.PLAIN, 9));
		btmultiplica.setBounds(212, 129, 39, 35);
		contentPane.add(btmultiplica);
		
		JButton bt3 = new JButton("3");
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (concatenar == 0){
					if (TFResultado.getText().equals("0")){
						TFResultado.setText("3");

					}else{
					TFResultado.setText(TFResultado.getText()+"3");
					}
				}else{
					TFResultado.setText("3");
					concatenar=0;
				}
			}
		});
		bt3.setFont(new Font("Arial", Font.PLAIN, 9));
		bt3.setBounds(130, 175, 39, 36);
		contentPane.add(bt3);
		
		JButton bt2 = new JButton("2");
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (concatenar == 0){
					if (TFResultado.getText().equals("0")){
						TFResultado.setText("2");

					}else{
					TFResultado.setText(TFResultado.getText()+"2");
					}
				}else{
					TFResultado.setText("2");
					concatenar=0;
				}
			}
		});
		bt2.setFont(new Font("Arial", Font.PLAIN, 9));
		bt2.setBounds(81, 175, 39, 36);
		contentPane.add(bt2);
		
		JButton bt1 = new JButton("1");
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (concatenar == 0){
					if (TFResultado.getText().equals("0")){
						TFResultado.setText("1");

					}else{
					TFResultado.setText(TFResultado.getText()+"1");
					}
				}else{
					TFResultado.setText("1");
					concatenar=0;
				}
			}
		});
		bt1.setFont(new Font("Arial", Font.PLAIN, 9));
		bt1.setBounds(32, 175, 39, 36);
		contentPane.add(bt1);
		
		JButton btdiminui = new JButton("-");
		btdiminui.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				concatenar=1;
				controle.setValor(Double.parseDouble(TFResultado.getText()));
				
				if (calculando==0){
					controle.Calcular();
				}
				controle.Subtrair();
				calculando=0;
			}
		});
		btdiminui.setFont(new Font("Arial", Font.PLAIN, 9));
		btdiminui.setBounds(212, 175, 39, 36);
		contentPane.add(btdiminui);
		
		JButton bt0 = new JButton("0");
		bt0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (concatenar == 0){
					if (TFResultado.getText().equals("0")){
						TFResultado.setText("0");

					}else{
					TFResultado.setText(TFResultado.getText()+"0");
					}
				}else{
					TFResultado.setText("0");
					concatenar=0;
				}
			}
		});
		bt0.setFont(new Font("Arial", Font.PLAIN, 9));
		bt0.setBounds(32, 269, 88, 36);
		contentPane.add(bt0);
		
		JButton btC = new JButton("C");
		btC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TFResultado.setText("0");
				controle.Reiniciar();
				
			}
		});
		btC.setFont(new Font("Arial", Font.PLAIN, 6));
		btC.setBounds(32, 222, 39, 36);
		contentPane.add(btC);
		
		JButton btigual = new JButton("=");
		btigual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				concatenar=1;
				controle.setValor(Double.parseDouble(TFResultado.getText()));
				
				controle.Calcular();
				
				if (controle.getResultado()==-9999){
					TFResultado.setText("Impossivel dividir");
				}else{
					calculando=1;
					TFResultado.setText(String.valueOf(controle.getResultado()));
					
					
				}
				
			}
		});
		btigual.setFont(new Font("Arial", Font.PLAIN, 9));
		btigual.setBounds(81, 222, 88, 36);
		contentPane.add(btigual);
		
		JButton btsoma = new JButton("+");
		btsoma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				concatenar=1;
				controle.setValor(Double.parseDouble(TFResultado.getText()));
				
				if (calculando==0){
					controle.Calcular();
				}
				controle.Somar();
				calculando=0;
				
			}
		});
		btsoma.setFont(new Font("Arial", Font.PLAIN, 9));
		btsoma.setBounds(212, 222, 39, 36);
		contentPane.add(btsoma);
		
		JButton button = new JButton(",");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TFResultado.setText(TFResultado.getText()+".");
				
			}
		});
		button.setFont(new Font("Arial", Font.PLAIN, 9));
		button.setBounds(130, 269, 39, 36);
		contentPane.add(button);
		
		JButton btnRaiz = new JButton("R");
		btnRaiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				controle.setValor(Double.parseDouble(TFResultado.getText()));
				controle.RaizQuadrada();
				controle.Calcular();
				TFResultado.setText(String.valueOf(controle.getResultado()));
				
			}
		});
		btnRaiz.setFont(new Font("Arial", Font.PLAIN, 9));
		btnRaiz.setBounds(212, 275, 39, 36);
		contentPane.add(btnRaiz);
		
		JButton button_1 = new JButton("<<<<");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(TFResultado.getText().toString().length()!=0 && !(TFResultado.getText().equals("0"))){
					TFResultado.setText((TFResultado.getText().toString().substring(0,TFResultado.getText().toString().length()-1)));
					if(TFResultado.getText().toString().length()<=0){
						TFResultado.setText("0");
					}
				}
				
			}
		});
		button_1.setBounds(261, 32, 65, 23);
		contentPane.add(button_1);
	}
}
