package _04_gui_from_scratch._3_sound_effects_machine;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SoundEffects implements ActionListener {
	
	
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
	
	private void playSound(String soundFile) {
		String path = "";
			File sound = new File(path+soundFile);
			if (sound.exists()) {
				new Thread(() -> {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(sound));
					clip.start();
					Thread.sleep(clip.getMicrosecondLength()/1000);
				}
				catch (Exception e) {
					System.out.println("Could not play this sound");
				}}).start();
	 		}
			else {
				System.out.println("File does not exist");
			}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	Object save = e.getSource();
	if (save == button)
	{
	 playSound("C:\\Users\\Owner\\git\\level1-module0-denisergen\\src\\_04_gui_from_scratch\\_3_sound_effects_machine\\naides.wav");
	}
	else if (save == twobutton)
	{
	 playSound("C:\\Users\\Owner\\git\\level1-module0-denisergen\\src\\_04_gui_from_scratch\\_3_sound_effects_machine\\sawing-wood-daniel_simon.wav");
	}
	else if (save == threebutton)
	{
	 playSound("C:\\Users\\Owner\\git\\level1-module0-denisergen\\src\\_04_gui_from_scratch\\_3_sound_effects_machine\\[BTCLOD.COM] Kirk Franklin Revolution-64k (1).wav");
	}
	
	
	}

}
