package _04_gui_from_scratch._1_fortune_cookie;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class cookie implements ActionListener {
	JButton buttonn = new JButton();
	int rand = new Random().nextInt(5);
	
    public void showButton() {
    	JFrame bbooxx = new JFrame();
    	bbooxx.setVisible(true);
        
        bbooxx.add(buttonn);
        bbooxx.pack();
        buttonn.addActionListener(this);
        
   }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==buttonn)
		{
			JOptionPane paneee = new JOptionPane();
	        paneee.showMessageDialog(null, "Woohoo");	
	        paneee.setVisible(true);
	        

	         if (rand==0)
	         {
	 	        paneee.showMessageDialog(null, "you will wash your hands.");	 
	         }
	         if (rand==1)
	         {
	        	 paneee.showMessageDialog(null, "you will eat food.");	
	         }
	         if (rand==2)
	         {
	        	 paneee.showMessageDialog(null, "you will jump.");	
	         }
	         if (rand==3)
	         {
	        	 paneee.showMessageDialog(null, "you will run.");	
	         }
	         if (rand==4)
	         {
	        	 paneee.showMessageDialog(null, "you will burp.");	
	         }
	        
		}
	}
}

