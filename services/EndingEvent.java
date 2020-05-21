package services;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class EndingEvent extends JFrame{
	
	private JTextField endingText;
	
	public EndingEvent(){
		setLayout(new FlowLayout());
		
		endingText = new JTextField("GAME OVER");
		endingText.setEditable(false);
		add(endingText);
		
		Handler handler = new Handler();
		endingText.addActionListener(handler);
		
	}
	
	private class Handler implements ActionListener{
		
		public void actionPerformed(ActionEvent ending) {
			
			String string = "";
			
			if(ending.getSource() == endingText) {
				string = String.format("%s", ending.getActionCommand());
			}
			
			JOptionPane.showMessageDialog(null, string);
			
		}
	}
	
}