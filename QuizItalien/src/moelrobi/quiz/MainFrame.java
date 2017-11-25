package moelrobi.quiz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 8824982341997885339L;
	public static JPanel contentPane;
	private static JLabel lblNewLabel;
	private static JLabel lblPlaceholderText;
	private static JButton btnNewButton;
	private static JButton btnNewButton_1;
	private static JButton btnNewButton_2;
	private static JButton btnNewButton_3;
	private JPanel panel_3;
	private static JLabel lblRichtig;
	private static JLabel lblFalsch;
	private JPanel panel_4;
	private static JLabel lblFrageVon;
	public static MainFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new MainFrame();
					frame.setVisible(true);
					LoadQuestion();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void LoadQuestion() {
		//Loading the Questions and Answers.
		String fr = QuizHelper.getFragen();
		String[] an = QuizHelper.getAntworten();
		String author = QuizHelper.getAuthor();
		
		//Loading a Image of a External HTTP Source:
		Image downloadingIcon = null;
		ImageIcon finishedIcon;
		
		try {
			downloadingIcon = ImageIO.read(new URL(QuizHelper.getURL()));
		} catch(IOException ex) { //If it fails, log why it did. (Actually it shouldn't.)
			Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		//Rescale the Image to a more optimal size. 
		//TODO: Make Scaling look good.
		
		Image scaledIcon = downloadingIcon.getScaledInstance(505, 262, java.awt.Image.SCALE_SMOOTH);
		finishedIcon = new ImageIcon(scaledIcon);
		
		//Setting all labels with the appropriate Content.
		lblNewLabel.setText(fr);
		btnNewButton.setText(an[0]);
		btnNewButton_1.setText(an[1]);
		btnNewButton_2.setText(an[2]);
		btnNewButton_3.setText(an[3]);
		lblPlaceholderText.setIcon(finishedIcon);
		lblRichtig.setText("Richtig: " + QuizHelper.right);
		lblFalsch.setText("Falsch: " + QuizHelper.wrong);
		lblFrageVon.setText("Frage von: " + author);
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 550, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		btnNewButton_3 = new JButton("New button");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean s = QuizHelper.CheckAnswer(btnNewButton_3.getText());
				if(s == true) JOptionPane.showMessageDialog(null, "Diese Antwort ist richtig!", "Richtig!", JOptionPane.OK_OPTION);
				if(s == false) JOptionPane.showMessageDialog(null, "Diese Antwort ist falsch! Die richtige Antwort ist " + QuizHelper.fragenListe.get(QuizHelper.loadCounter).getAntwort(QuizHelper.fragenListe.get(QuizHelper.loadCounter).getRichtigeAntwrort()),"Falsch!", JOptionPane.OK_OPTION);
				QuizHelper.iCounter();
				LoadQuestion();
			}
		});
		panel.add(btnNewButton_3);
		
		btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean s = QuizHelper.CheckAnswer(btnNewButton_3.getText());
				if(s == true) JOptionPane.showMessageDialog(null, "Diese Antwort ist richtig!", "Richtig!", JOptionPane.OK_OPTION);
				if(s == false) JOptionPane.showMessageDialog(null, "Diese Antwort ist falsch! Die richtige Antwort ist " + QuizHelper.fragenListe.get(QuizHelper.loadCounter).getAntwort(QuizHelper.fragenListe.get(QuizHelper.loadCounter).getRichtigeAntwrort()),"Falsch!", JOptionPane.OK_OPTION);
				QuizHelper.iCounter();
				LoadQuestion();
			}
		});
		panel.add(btnNewButton_2);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean s = QuizHelper.CheckAnswer(btnNewButton_3.getText());
				if(s == true) JOptionPane.showMessageDialog(null, "Diese Antwort ist richtig!", "Richtig!", JOptionPane.OK_OPTION);
				if(s == false) JOptionPane.showMessageDialog(null, "Diese Antwort ist falsch! Die richtige Antwort ist " + QuizHelper.fragenListe.get(QuizHelper.loadCounter).getAntwort(QuizHelper.fragenListe.get(QuizHelper.loadCounter).getRichtigeAntwrort()),"Falsch!", JOptionPane.OK_OPTION);
				QuizHelper.iCounter();
				LoadQuestion();
			}
		});
		panel.add(btnNewButton_1);
		
		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean s = QuizHelper.CheckAnswer(btnNewButton_3.getText());
				if(s == true) JOptionPane.showMessageDialog(null, "Diese Antwort ist richtig!", "Richtig!", JOptionPane.OK_OPTION);
				if(s == false) JOptionPane.showMessageDialog(null, "Diese Antwort ist falsch! Die richtige Antwort ist " + QuizHelper.fragenListe.get(QuizHelper.loadCounter).getAntwort(QuizHelper.fragenListe.get(QuizHelper.loadCounter).getRichtigeAntwrort()),"Falsch!", JOptionPane.OK_OPTION);
				QuizHelper.iCounter();
				LoadQuestion();
			}
		});
		panel.add(btnNewButton);
		
		panel_3 = new JPanel();
		panel.add(panel_3);
		
		lblRichtig = new JLabel("Richtig: 0");
		panel_3.add(lblRichtig);
		
		lblFalsch = new JLabel("Falsch:0");
		panel_3.add(lblFalsch);
		lblFalsch.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFalsch.setVerticalAlignment(SwingConstants.BOTTOM);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		
		lblNewLabel = new JLabel("New label");
		panel_1.add(lblNewLabel);
		
		panel_4 = new JPanel();
		panel_1.add(panel_4);
		
		lblFrageVon = new JLabel("Frage von:");
		panel_4.add(lblFrageVon);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		contentPane.add(panel_2, BorderLayout.CENTER);
		
		lblPlaceholderText = new JLabel("");
		lblPlaceholderText.setVerticalAlignment(SwingConstants.TOP);
		panel_2.add(lblPlaceholderText);
	}
}
