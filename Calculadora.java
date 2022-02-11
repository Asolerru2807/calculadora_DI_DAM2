package PruebasSwing;

import java.awt.BorderLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Calculadora {
	
	private JFrame frame = new JFrame("Calculadora");
	
	JPanel panelSuperior = new JPanel();
	JLabel labelDinamico = new JLabel("");
	
	public void actualizarTexto(String text) {
		String anterior = labelDinamico.getText().toString();
		labelDinamico.setText(anterior + text);
	}
	
	public void eliminarTexto() {
		labelDinamico.setText("");
	}
	
	public void eliminarAnterior() {
		String borrarAnterior = labelDinamico.getText().toString();
		borrarAnterior = borrarAnterior.substring(0,borrarAnterior.length()-1);
		labelDinamico.setText(borrarAnterior);
	}
	
	public Calculadora() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton jb0 = new JButton("0");
		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jb4 = new JButton("4");
		JButton jb5 = new JButton("5");
		JButton jb6 = new JButton("6");
		JButton jb7 = new JButton("7");
		JButton jb8 = new JButton("8");
		JButton jb9 = new JButton("9");
		JButton jbC = new JButton("C");
		JButton jbPunto = new JButton(".");
		JButton jbSumaResta = new JButton("+/-");
		JButton jbSuma = new JButton("+");
		JButton jbResta = new JButton("-");
		JButton jbMultiplica = new JButton("X");
		JButton jbDivide = new JButton("/");
		JButton jbIgual = new JButton("=");
		JButton jbFlecha = new JButton("-->");
		
		JPanel panelCentral = new JPanel();
		panelCentral.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 0;
		panelCentral.add(jb7,c);
		jb7.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				actualizarTexto("7");
				
			}});
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 0;
		panelCentral.add(jb8,c);
		jb8.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				actualizarTexto("8");
				
			}});
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 0;
		panelCentral.add(jb9,c);
		jb9.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				actualizarTexto("9");
				
			}});
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 0;
		panelCentral.add(jbSumaResta,c);
		jbSumaResta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				actualizarTexto("+/-");
				
			}});
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 0;
		panelCentral.add(jbFlecha,c);
		jbFlecha.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				eliminarAnterior();
				
			}});
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 1;
		panelCentral.add(jb4,c);
		jb4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				actualizarTexto("4");
				
			}});
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 1;
		panelCentral.add(jb5,c);
		jb5.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				actualizarTexto("5");
				
			}});
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 1;
		panelCentral.add(jb6,c);
		jb6.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				actualizarTexto("6");
				
			}});
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 1;
		panelCentral.add(jbMultiplica,c);
		jbMultiplica.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				actualizarTexto("x");
				
			}});
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 1;
		panelCentral.add(jbDivide,c);
		jbDivide.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				actualizarTexto("/");
				
			}});
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 2;
		panelCentral.add(jb1,c);
		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				actualizarTexto("1");
				
			}});
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 2;
		panelCentral.add(jb2,c);
		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				actualizarTexto("2");
				
			}});
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 2;
		panelCentral.add(jb3,c);
		jb3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				actualizarTexto("3");
				
			}});
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 2;
		panelCentral.add(jbResta,c);
		jbResta.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				actualizarTexto("-");
				
			}});
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 4;
		c.gridy = 2; 
		c.gridheight = 2;
		c.ipady = 26;
		panelCentral.add(jbIgual,c);
		jbIgual.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				actualizarTexto("=");
				
			}});
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 0;
		c.gridy = 3;
		c.gridheight = 1;
		c.gridwidth = 1;
		c.ipady = 0;
		panelCentral.add(jbC,c);
		jbC.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				eliminarTexto();
				
			}});
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 1;
		c.gridy = 3;
		panelCentral.add(jb0,c);
		jb0.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				actualizarTexto("0");
				
			}});
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 2;
		c.gridy = 3;
		panelCentral.add(jbPunto,c);
		jbPunto.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				actualizarTexto(".");
				
			}});
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.gridx = 3;
		c.gridy = 3;
		panelCentral.add(jbSuma,c);
		jbSuma.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				actualizarTexto("+");
				
			}});
		
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		panelSuperior.add(labelDinamico);
		panel.add(panelSuperior, BorderLayout.NORTH);
		panel.add(panelCentral, BorderLayout.CENTER);
		frame.add(panel);
		
	}
	
	public void iniciarVista() {
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		calculadora.iniciarVista();
	}
}
