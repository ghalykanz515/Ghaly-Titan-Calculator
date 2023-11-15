package de.commsult.calculator;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class UI {

    private JFrame frmCalculator;
    private JTextField textField;
    private JPanel panel;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                UI window = new UI();
                window.frmCalculator.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * @wbp.parser.entryPoint
     */
    public UI() {
        initialize();
    }

    private void initialize() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        frmCalculator = new JFrame();
        frmCalculator.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 20));
        frmCalculator.setTitle("Calculator");
        frmCalculator.setBounds(100, 100, 465, 570);
        frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JToggleButton dropDown = new JToggleButton("Drop");
        dropDown.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (dropDown.isSelected()) {
                    panel.setVisible(true);
                } else {
                    panel.setVisible(false);
                }
            }
        });

        textField = new JTextField();
        textField.setColumns(10);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setVisible(true);
              		
  		JButton Number7 = new JButton("7");
  		Number7.setFont(new Font("Tahoma", Font.BOLD, 20));
  		Number7.setBounds(0, 0, 100, 65);
  		panel.add(Number7);
  		
  		JButton Number8 = new JButton("8");
  		Number8.setFont(new Font("Tahoma", Font.BOLD, 20));
  		Number8.setBounds(110, 0, 100, 65);
  		panel.add(Number8);
  		
  		JButton Number9 = new JButton("9");
  		Number9.setFont(new Font("Tahoma", Font.BOLD, 20));
  		Number9.setBounds(220, 0, 100, 65);
  		panel.add(Number9);
  		
  		JButton Divide = new JButton("%");
  		Divide.setFont(new Font("Tahoma", Font.BOLD, 20));
  		Divide.setBounds(330, 0, 100, 65);
  		panel.add(Divide);
  		
  		JButton Number4 = new JButton("4");
  		Number4.setFont(new Font("Tahoma", Font.BOLD, 20));
  		Number4.setBounds(0, 76, 100, 65);
  		panel.add(Number4);
  		
  		JButton Number5 = new JButton("5");
  		Number5.setFont(new Font("Tahoma", Font.BOLD, 20));
  		Number5.setBounds(111, 76, 100, 65);
  		panel.add(Number5);
  		
  		JButton Number6 = new JButton("6");
  		Number6.setFont(new Font("Tahoma", Font.BOLD, 20));
  		Number6.setBounds(221, 76, 100, 65);
  		panel.add(Number6);
  		
  		JButton Times = new JButton("X");
  		Times.setFont(new Font("Tahoma", Font.BOLD, 20));
  		Times.setBounds(331, 76, 100, 65);
  		panel.add(Times);
  		
  		JButton Number1 = new JButton("1");
  		Number1.setFont(new Font("Tahoma", Font.BOLD, 20));
  		Number1.setBounds(0, 152, 100, 65);
  		panel.add(Number1);
  		
  		JButton Number2 = new JButton("2");
  		Number2.setFont(new Font("Tahoma", Font.BOLD, 20));
  		Number2.setBounds(110, 152, 100, 65);
  		panel.add(Number2);
  		
  		JButton Number3 = new JButton("3");
  		Number3.setFont(new Font("Tahoma", Font.BOLD, 20));
  		Number3.setBounds(220, 152, 100, 65);
  		panel.add(Number3);
  		
  		JButton Subtract = new JButton("-");
  		Subtract.setFont(new Font("Tahoma", Font.BOLD, 20));
  		Subtract.setBounds(330, 152, 100, 65);
  		panel.add(Subtract);
  		
  		JButton NegativePositive = new JButton("-/+");
  		NegativePositive.setFont(new Font("Tahoma", Font.BOLD, 20));
  		NegativePositive.setBounds(1, 228, 100, 65);
  		panel.add(NegativePositive);
  		
  		JButton Number0 = new JButton("0");
  		Number0.setFont(new Font("Tahoma", Font.BOLD, 20));
  		Number0.setBounds(111, 228, 100, 65);
  		panel.add(Number0);
      		
  		JButton Dot = new JButton(".");
  		Dot.setFont(new Font("Tahoma", Font.BOLD, 20));
  		Dot.setBounds(221, 228, 100, 65);
  		panel.add(Dot);
        
  		JButton equals = new JButton("=");
        equals.setFont(new Font("Tahoma", Font.BOLD, 20));
        equals.setBounds(331, 228, 100, 65);
        panel.add(equals);
        GroupLayout groupLayout = new GroupLayout(frmCalculator.getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(10)
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addComponent(textField, GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
        				.addComponent(dropDown, GroupLayout.PREFERRED_SIZE, 431, GroupLayout.PREFERRED_SIZE)
        				.addComponent(panel, GroupLayout.PREFERRED_SIZE, 431, GroupLayout.PREFERRED_SIZE))
        			.addGap(10))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGap(11)
        			.addComponent(textField, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
        			.addGap(11)
        			.addComponent(dropDown, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
        			.addGap(8)
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 293, GroupLayout.PREFERRED_SIZE)
        			.addGap(8))
        );
        frmCalculator.getContentPane().setLayout(groupLayout);
        equals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Perform calculation here

                // Hide the panel (close dropdown)
                panel.setVisible(false);
                // Update the state of the dropdown button
                dropDown.setSelected(false);
            }
        });
    }
}
