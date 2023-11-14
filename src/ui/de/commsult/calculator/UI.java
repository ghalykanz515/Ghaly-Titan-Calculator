package de.commsult.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class UI {

	private JFrame frmCalculator;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UI window = new UI();
					window.frmCalculator.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculator = new JFrame();
		frmCalculator.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 20));
		frmCalculator.setTitle("Calculator");
		frmCalculator.setBounds(100, 100, 465, 410);
		frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculator.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 431, 53);
		frmCalculator.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton Number7 = new JButton("7");
		Number7.setFont(new Font("Tahoma", Font.BOLD, 20));
		Number7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Number7.setBounds(10, 75, 100, 65);
		frmCalculator.getContentPane().add(Number7);
		
		JButton Number8 = new JButton("8");
		Number8.setFont(new Font("Tahoma", Font.BOLD, 20));
		Number8.setBounds(120, 75, 100, 65);
		frmCalculator.getContentPane().add(Number8);
		
		JButton Number9 = new JButton("9");
		Number9.setFont(new Font("Tahoma", Font.BOLD, 20));
		Number9.setBounds(230, 75, 100, 65);
		frmCalculator.getContentPane().add(Number9);
		
		JButton Divide = new JButton("%");
		Divide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Divide.setFont(new Font("Tahoma", Font.BOLD, 20));
		Divide.setBounds(340, 75, 100, 65);
		frmCalculator.getContentPane().add(Divide);
		
		JButton Number4 = new JButton("4");
		Number4.setFont(new Font("Tahoma", Font.BOLD, 20));
		Number4.setBounds(11, 151, 100, 65);
		frmCalculator.getContentPane().add(Number4);
		
		JButton Number5 = new JButton("5");
		Number5.setFont(new Font("Tahoma", Font.BOLD, 20));
		Number5.setBounds(121, 151, 100, 65);
		frmCalculator.getContentPane().add(Number5);
		
		JButton Number6 = new JButton("6");
		Number6.setFont(new Font("Tahoma", Font.BOLD, 20));
		Number6.setBounds(231, 151, 100, 65);
		frmCalculator.getContentPane().add(Number6);
		
		JButton Times = new JButton("X");
		Times.setFont(new Font("Tahoma", Font.BOLD, 20));
		Times.setBounds(341, 151, 100, 65);
		frmCalculator.getContentPane().add(Times);
		
		JButton Number1 = new JButton("1");
		Number1.setFont(new Font("Tahoma", Font.BOLD, 20));
		Number1.setBounds(10, 227, 100, 65);
		frmCalculator.getContentPane().add(Number1);
		
		JButton Number2 = new JButton("2");
		Number2.setFont(new Font("Tahoma", Font.BOLD, 20));
		Number2.setBounds(120, 227, 100, 65);
		frmCalculator.getContentPane().add(Number2);
		
		JButton Number3 = new JButton("3");
		Number3.setFont(new Font("Tahoma", Font.BOLD, 20));
		Number3.setBounds(230, 227, 100, 65);
		frmCalculator.getContentPane().add(Number3);
		
		JButton Subtract = new JButton("-");
		Subtract.setFont(new Font("Tahoma", Font.BOLD, 20));
		Subtract.setBounds(340, 227, 100, 65);
		frmCalculator.getContentPane().add(Subtract);
		
		JButton NegativePositive = new JButton("-/+");
		NegativePositive.setFont(new Font("Tahoma", Font.BOLD, 20));
		NegativePositive.setBounds(11, 303, 100, 65);
		frmCalculator.getContentPane().add(NegativePositive);
		
		JButton Number0 = new JButton("0");
		Number0.setFont(new Font("Tahoma", Font.BOLD, 20));
		Number0.setBounds(121, 303, 100, 65);
		frmCalculator.getContentPane().add(Number0);
		
		JButton Dot = new JButton(".");
		Dot.setFont(new Font("Tahoma", Font.BOLD, 20));
		Dot.setBounds(231, 303, 100, 65);
		frmCalculator.getContentPane().add(Dot);
		
		JButton Equals = new JButton("=");
		Equals.setFont(new Font("Tahoma", Font.BOLD, 20));
		Equals.setBounds(341, 303, 100, 65);
		frmCalculator.getContentPane().add(Equals);
	}
}
