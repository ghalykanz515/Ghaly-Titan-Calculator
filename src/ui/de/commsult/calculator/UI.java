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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;

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
        frmCalculator.setBounds(100, 100, 465, 585);
        frmCalculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //This button serves as the function to collaps the Calculator Buttons
        JToggleButton dropDown = new JToggleButton("Drop");
        dropDown.setFont(new Font("Tahoma", Font.BOLD, 20));
        dropDown.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (dropDown.isSelected()) {
                    panel.setVisible(false);
                } else {
                    panel.setVisible(true);
                }
            }
        });

        //TextField is where the Results and Numbers are going to be
        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.BOLD, 20));
        textField.setHorizontalAlignment(SwingConstants.CENTER);
        textField.setColumns(10);

        //Panel Contains all the buttons to make the Calculator
        panel = new JPanel();
        panel.setLayout(null);
        panel.setVisible(true);
  		
  		JButton Number1 = new JButton("1");
  		Number1.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				String number=textField.getText()+Number1.getText();
  				textField.setText(number);
  			}
  		});
  		
  		JButton Number0 = new JButton("0");
  		Number0.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				String number=textField.getText()+Number0.getText();
  				textField.setText(number);
  			}
  		});
  		Number0.setFont(new Font("Tahoma", Font.BOLD, 20));
  		Number0.setBounds(111, 304, 100, 65);
  		panel.add(Number0);
  		Number1.setFont(new Font("Tahoma", Font.BOLD, 20));
  		Number1.setBounds(0, 228, 100, 65);
  		panel.add(Number1);
  		
  		JButton Number2 = new JButton("2");
  		Number2.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				String number=textField.getText()+Number2.getText();
  				textField.setText(number);
  			}
  		});
  		Number2.setFont(new Font("Tahoma", Font.BOLD, 20));
  		Number2.setBounds(110, 228, 100, 65);
  		panel.add(Number2);
  		
  		JButton Number3 = new JButton("3");
  		Number3.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				String number=textField.getText()+Number3.getText();
  				textField.setText(number);
  			}
  		});
  		Number3.setFont(new Font("Tahoma", Font.BOLD, 20));
  		Number3.setBounds(220, 228, 100, 65);
  		panel.add(Number3);
  		
  		JButton Number4 = new JButton("4");
  		Number4.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				String number=textField.getText()+Number4.getText();
  				textField.setText(number);
  			}
  		});
  		Number4.setFont(new Font("Tahoma", Font.BOLD, 20));
  		Number4.setBounds(0, 152, 100, 65);
  		panel.add(Number4);
  		
  		JButton Number5 = new JButton("5");
  		Number5.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				String number=textField.getText()+Number5.getText();
  				textField.setText(number);
  			}
  		});
  		Number5.setFont(new Font("Tahoma", Font.BOLD, 20));
  		Number5.setBounds(111, 152, 100, 65);
  		panel.add(Number5);
  		
  		JButton Number6 = new JButton("6");
  		Number6.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				String number=textField.getText()+Number6.getText();
  				textField.setText(number);
  			}
  		});
  		Number6.setFont(new Font("Tahoma", Font.BOLD, 20));
  		Number6.setBounds(221, 152, 100, 65);
  		panel.add(Number6);
  		
  		JButton Number7 = new JButton("7");
  		Number7.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				String number=textField.getText()+Number7.getText();
  				textField.setText(number);
  			}
  		});
  		Number7.setFont(new Font("Tahoma", Font.BOLD, 20));
  		Number7.setBounds(0, 76, 100, 65);
  		panel.add(Number7);
  		
  		JButton Number8 = new JButton("8");
  		Number8.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				String number=textField.getText()+Number8.getText();
  				textField.setText(number);
  			}
  		});
  		Number8.setFont(new Font("Tahoma", Font.BOLD, 20));
  		Number8.setBounds(110, 76, 100, 65);
  		panel.add(Number8);
  		
  		JButton Number9 = new JButton("9");
  		Number9.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				String number=textField.getText()+Number9.getText();
  				textField.setText(number);
  			}
  		});
  		Number9.setFont(new Font("Tahoma", Font.BOLD, 20));
  		Number9.setBounds(220, 76, 100, 65);
  		panel.add(Number9);
  		
  		JButton Increment = new JButton("+");
  		Increment.setFont(new Font("Tahoma", Font.BOLD, 20));
  		Increment.setBounds(330, 228, 100, 65);
  		panel.add(Increment);
  		
  		JButton Subtract = new JButton("-");
  		Subtract.setFont(new Font("Tahoma", Font.BOLD, 20));
  		Subtract.setBounds(330, 152, 100, 65);
  		panel.add(Subtract);
  		
  		JButton Divide = new JButton("%");
  		Divide.setFont(new Font("Tahoma", Font.BOLD, 20));
  		Divide.setBounds(330, 0, 100, 65);
  		panel.add(Divide);
  		
  		JButton Times = new JButton("X");
  		Times.setFont(new Font("Tahoma", Font.BOLD, 20));
  		Times.setBounds(331, 76, 100, 65);
  		panel.add(Times);;
  		
  		JButton NegativePositive = new JButton("-/+");
  		NegativePositive.setFont(new Font("Tahoma", Font.BOLD, 20));
  		NegativePositive.setBounds(1, 304, 100, 65);
  		panel.add(NegativePositive);
      		
  		JButton Dot = new JButton(".");
  		Dot.setFont(new Font("Tahoma", Font.BOLD, 20));
  		Dot.setBounds(221, 304, 100, 65);
  		panel.add(Dot);
        
  		
  		//The Equals Button also serves as a function to Collapse the Buttons
  		JButton equals = new JButton("=");
        equals.setFont(new Font("Tahoma", Font.BOLD, 20));
        equals.setBounds(331, 304, 100, 65);
        panel.add(equals);
        GroupLayout groupLayout = new GroupLayout(frmCalculator.getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(dropDown, GroupLayout.PREFERRED_SIZE, 431, GroupLayout.PREFERRED_SIZE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(10)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 431, GroupLayout.PREFERRED_SIZE)
        						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 431, GroupLayout.PREFERRED_SIZE))))
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(textField, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(dropDown, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 366, GroupLayout.PREFERRED_SIZE)
        			.addGap(8))
        );
        
        JButton Delete = new JButton("Delete");
        Delete.setFont(new Font("Tahoma", Font.BOLD, 20));
        Delete.setBounds(0, 0, 100, 65);
        panel.add(Delete);
        
        JButton CE = new JButton("CE");
        CE.setFont(new Font("Tahoma", Font.BOLD, 20));
        CE.setBounds(111, 0, 100, 65);
        panel.add(CE);
        
        JButton CC = new JButton("CC");
        CC.setFont(new Font("Tahoma", Font.BOLD, 20));
        CC.setBounds(220, 0, 100, 65);
        panel.add(CC);
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
