/**
 * 
 */
package tp8;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * @author flore
 *
 */
	public class Gui extends JFrame implements ActionListener {
	
	JFrame window;
	JButton swap, close;
	JPanel swapPanel, ClosePanel;
	JTextField text1,text2;
	Container c;
	

	
	public Gui() {
		closeETSwap();
	}
	
	public void closeETSwap() {
		window = new JFrame();
		window.setSize(500, 500);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.getContentPane().setBackground(Color.gray);
		window.setLayout(null);
		c = window.getContentPane();
		
		text1 = new JTextField("Hello");
		text1.setBounds(100, 300, 100, 30);
		
		text2 = new JTextField("World");
		text2.setBounds(300, 300, 100, 30);
		
		swap = new JButton("SWAP");
		swap.setBounds(100, 100, 100, 100);
		swap.setFocusPainted(false);
		swap.addActionListener(this);
		
		close = new JButton("FERMER");
		close.setBounds(300, 100, 100, 100);
		close.setFocusPainted(false);
		close.addActionListener(this);
		
		c.add(swap);
		c.add(close);
		c.add(text1);
		c.add(text2);
		
		window.setVisible(true);
	}
		
			
		public void actionPerformed(ActionEvent event) {
			Object  source = event.getSource();
			
			if(source == swap) {
				String mot1 = text1.getText();
				String mot2 = text2.getText();
				text1.setText(mot2);
				text2.setText(mot1);
			}
			else if(source == close) {
				window.dispose();
			}
	}
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Gui();

	}

}
