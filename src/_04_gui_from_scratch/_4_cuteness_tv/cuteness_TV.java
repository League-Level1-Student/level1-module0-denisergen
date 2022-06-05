package _04_gui_from_scratch._4_cuteness_tv;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cuteness_TV implements ActionListener {

	JButton button = new JButton();
	JButton twobutton = new JButton();
	JButton threebutton = new JButton();
	JFrame window = new JFrame();
	JPanel panel = new JPanel();
	
	public void run() 
	{
		window.add(panel);
		panel.add(button);
		panel.add(twobutton);
		panel.add(threebutton);
		window.setVisible(true);
		button.addActionListener(this);
		twobutton.addActionListener(this);
		threebutton.addActionListener(this);
		window.pack();
	}
	
	
	void showDucks() {
	     playVideo("https://www.youtube.com/watch?v=MtN1YnoL46Q");
	}

	void showFrog() {
	     playVideo("https://www.youtube.com/watch?v=cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
	     playVideo("https://www.youtube.com/watch?v=a-xWhG4UU_Y");
	}

	void playVideo(String videoID) {
	     
	     // Workaround for Linux because "Desktop.getDesktop().browse()" doesn't
	     //work on some Linux implementations
	     try {
	     if (System.getProperty("os.name").toLowerCase().contains("linux")) {
	     if (Runtime.getRuntime().exec(new String[] {
	      "which", "xdg- open" }).getInputStream().read() != -1) {
	     Runtime.getRuntime().exec(new String[] { "xdg-open", videoID });
	     }
	     } else {
	          URI uri = new URI(videoID);
	          java.awt.Desktop.getDesktop().browse(uri);
	     }      } catch (Exception e) {
	          e.printStackTrace();
	     }
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object save = e.getSource();
		if (save == button)
		{
		showDucks();

		}
		else if (save == twobutton)
		{
		showFrog();

		}
		else if (save == threebutton)
		{
		showFluffyUnicorns();

		}
		
	}
	
	
}
