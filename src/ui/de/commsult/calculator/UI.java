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
        
        
        //This button serves as the function to collapse the Calculator Buttons
        JToggleButton dropDown = new JToggleButton("Collapse");
        dropDown.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (dropDown.isSelected()) {
                    panel.setVisible(false);
                    dropDown.setText("Expand");  
                } else {
                    panel.setVisible(true);
                    dropDown.setText("Collapse"); 
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
  		
        JButton Number0 = new JButton("0");
  		Number0.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				String number=textField.getText()+Number0.getText();
  				textField.setText(number);
  			}
  		});
  		Number0.setBounds(111, 304, 100, 65);
  		panel.add(Number0);
        
  		JButton Number1 = new JButton("1");
  		Number1.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				String number=textField.getText()+Number1.getText();
  				textField.setText(number);
  			}
  		});
  		Number1.setBounds(0, 228, 100, 65);
  		panel.add(Number1);
  		
  		JButton Number2 = new JButton("2");
  		Number2.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				String number=textField.getText()+Number2.getText();
  				textField.setText(number);
  			}
  		});
  		Number2.setBounds(110, 228, 100, 65);
  		panel.add(Number2);
  		
  		JButton Number3 = new JButton("3");
  		Number3.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				String number=textField.getText()+Number3.getText();
  				textField.setText(number);
  			}
  		});
  		Number3.setBounds(220, 228, 100, 65);
  		panel.add(Number3);
  		
  		JButton Number4 = new JButton("4");
  		Number4.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				String number=textField.getText()+Number4.getText();
  				textField.setText(number);
  			}
  		});
  		Number4.setBounds(0, 152, 100, 65);
  		panel.add(Number4);
  		
  		JButton Number5 = new JButton("5");
  		Number5.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				String number=textField.getText()+Number5.getText();
  				textField.setText(number);
  			}
  		});
  		Number5.setBounds(111, 152, 100, 65);
  		panel.add(Number5);
  		
  		JButton Number6 = new JButton("6");
  		Number6.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				String number=textField.getText()+Number6.getText();
  				textField.setText(number);
  			}
  		});
  		Number6.setBounds(221, 152, 100, 65);
  		panel.add(Number6);
  		
  		JButton Number7 = new JButton("7");
  		Number7.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				String number=textField.getText()+Number7.getText();
  				textField.setText(number);
  			}
  		});
  		Number7.setBounds(0, 76, 100, 65);
  		panel.add(Number7);
  		
  		JButton Number8 = new JButton("8");
  		Number8.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				String number=textField.getText()+Number8.getText();
  				textField.setText(number);
  			}
  		});
  		Number8.setBounds(110, 76, 100, 65);
  		panel.add(Number8);
  		
  		JButton Number9 = new JButton("9");
  		Number9.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				String number=textField.getText()+Number9.getText();
  				textField.setText(number);
  			}
  		});
  		Number9.setBounds(220, 76, 100, 65);
  		panel.add(Number9);
  		
  		JButton Increment = new JButton("+");
  		Increment.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				String number=textField.getText()+Increment.getText();
  				textField.setText(number);
  			}
  		});
  		Increment.setBounds(330, 228, 100, 65);
  		panel.add(Increment);
  		
  		JButton Subtract = new JButton("-");
  		Subtract.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				String number=textField.getText()+Subtract.getText();
  				textField.setText(number);
  			}
  		});
  		Subtract.setBounds(330, 152, 100, 65);
  		panel.add(Subtract);
  		
  		JButton Divide = new JButton("%");
  		Divide.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				String number=textField.getText()+Divide.getText();
  				textField.setText(number);
  			}
  		});
  		Divide.setBounds(330, 0, 100, 65);
  		panel.add(Divide);
  		
  		JButton Times = new JButton("X");
  		Times.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				String number=textField.getText()+Times.getText();
  				textField.setText(number);
  			}
  		});
  		Times.setBounds(331, 76, 100, 65);
  		panel.add(Times);;
  		
  		JButton NegativePositive = new JButton("-/+");
  		NegativePositive.setBounds(1, 304, 100, 65);
  		panel.add(NegativePositive);
      		
  		JButton Dot = new JButton(".");
  		Dot.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent e) {
  				String number=textField.getText()+Dot.getText();
  				textField.setText(number);
  			}
  		});
  		Dot.setBounds(221, 304, 100, 65);
  		panel.add(Dot);
        
  		JButton Delete = new JButton("<");
  		Delete.addActionListener(new ActionListener() {
  			public void actionPerformed(ActionEvent arg0) {
  				String Delete=(null);
  				if (textField.getText().length()>0) 
  					{
  					StringBuilder str=new StringBuilder(textField.getText());
  					str.deleteCharAt(textField.getText().length()-1);
  					Delete=str.toString();
  					textField.setText(Delete);
  					}		 			
  				}
  			});
        Delete.setBounds(0, 0, 100, 65);
        panel.add(Delete);
        
        JButton CE = new JButton("CE");
        CE.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		textField.setText(null);
        	}
        });
        CE.setBounds(111, 0, 100, 65);
        panel.add(CE);
        
        JButton CC = new JButton("CC");
        CC.setBounds(220, 0, 100, 65);
        panel.add(CC);
          		
  		//The Equals Button also serves as a function to Collapse the Buttons
  		JButton equals = new JButton("=");
        equals.setBounds(331, 304, 100, 65);
        panel.add(equals);
        equals.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Perform calculation here

                // Hide the panel (close dropdown)
                panel.setVisible(false);
                // Update the state of the dropdown button
                dropDown.setSelected(false);
                // Renamed Button to Expand
                dropDown.setText("Expand"); 
            }
        });
                   
                
        //This Code sets the layout of the Calculator
        GroupLayout groupLayout = new GroupLayout(frmCalculator.getContentPane());
        groupLayout.setHorizontalGroup(
        	groupLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(groupLayout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(dropDown, GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE))
        				.addGroup(groupLayout.createSequentialGroup()
        					.addGap(10)
        					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 431, GroupLayout.PREFERRED_SIZE)
        						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 431, GroupLayout.PREFERRED_SIZE))))
        			.addContainerGap())
        );
        groupLayout.setVerticalGroup(
        	groupLayout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(groupLayout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(textField, GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(dropDown, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(panel, GroupLayout.PREFERRED_SIZE, 366, GroupLayout.PREFERRED_SIZE)
        			.addGap(8))
        );
        frmCalculator.getContentPane().setLayout(groupLayout);
        
        

        //This is a Loader for Custom Fonts
        try {
            Font customFont = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("PublicPixel.ttf")).deriveFont(20f);

            // Set the font for specific components
            dropDown.setFont(customFont);
            textField.setFont(customFont);
            Number0.setFont(customFont);
            Number1.setFont(customFont);
            Number2.setFont(customFont);
            Number3.setFont(customFont);
            Number4.setFont(customFont);
            Number5.setFont(customFont);
            Number6.setFont(customFont);
            Number7.setFont(customFont);
            Number8.setFont(customFont);
            Number9.setFont(customFont);
            Increment.setFont(customFont);
            Subtract.setFont(customFont);
            Divide.setFont(customFont);
            Times.setFont(customFont);
            NegativePositive.setFont(customFont);
            Dot.setFont(customFont);
            Delete.setFont(customFont);
            CE.setFont(customFont);
            CC.setFont(customFont);
            equals.setFont(customFont);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
