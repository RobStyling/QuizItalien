package moelrobi.quiz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FinishedFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8976330196169747246L;
	private JPanel contentPane;
	private JButton btnRestart;
	private JButton btnScoreboard;
	private static JLabel label;
	public static FinishedFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new FinishedFrame();
					Load();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

public static void Load() {
	String s = (String) JOptionPane.showInputDialog(null, "Bitte gebe deinen Namen ein:", "Name bitte", JOptionPane.PLAIN_MESSAGE, null, null, null);
	if(!s.equals(null)) {
		QuizHelper.dbcon.InsertScore(s, QuizHelper.right);
	}
	BufferedImage downloadingIcon = null;
	try {
		downloadingIcon = ImageIO.read(new URL("http://" + QuizHelper.ip + "/img/it_check.png"));
	} catch(IOException ex) { //If it fails, log why it did. (Actually it shouldn't.)
		Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
	}
	
	//Rescale the Image to a more optimal size. 
	//TODO: Make Scaling look good.
	
	Image scaledIcon = downloadingIcon.getScaledInstance(400, 200, java.awt.Image.SCALE_SMOOTH);
	ImageIcon finishedIcon = new ImageIcon(scaledIcon);
	label.setIcon(finishedIcon);
}
	/**
	 * Create the frame.
	 */
	public FinishedFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 200, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		btnRestart = new JButton("Restart");
		btnRestart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				QuizHelper.ResetGame();
				frame.setVisible(false);
				MainFrame.main(null);
			}
		});
		panel.add(btnRestart);
		
		btnScoreboard = new JButton("Scoreboard");
		btnScoreboard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ScoreboardFrame.main(null);
			}
		});
		panel.add(btnScoreboard);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		label = new JLabel("");
		panel_1.add(label);
	}

}
