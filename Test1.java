import java.awt.AWTException;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Test1 {

	public static void main(String[] args) {
		
		JFrame contorno = new JFrame("/////test//////GUI//////");
		JPanel pannello = new JPanel();
		JButton bottone1 = new JButton("click here");
		
		contorno.setSize(400, 300);
		bottone1.setPreferredSize(new Dimension(80, 30));
		
		
		
		pannello.setLayout(new FlowLayout());
		pannello.add(bottone1);
		
		
		contorno.add(pannello);
		contorno.setVisible(true);
		
		
		
		
		bottone1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	System.out.println("Beep");
            	}
                
		});
    }
}
