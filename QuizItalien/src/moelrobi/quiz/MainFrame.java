package moelrobi.quiz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8824982341997885339L;
	private JPanel contentPane;
	private static JLabel lblNewLabel;
	private static JLabel lblPlaceholderText;
	private static JButton btnNewButton;
	private static JButton btnNewButton_1;
	private static JButton btnNewButton_2;
	private static JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
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
		
		//Loading a Image of a External HTTP Source:
		Image downloadingIcon = null;
		ImageIcon finishedIcon;
		
		try {
			downloadingIcon = ImageIO.read(new URL(QuizHelper.getURL()));
		} catch(IOException ex) { //If it fails, log why it did.
			Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
		}
		
		//Rescale the Image to a more optimal size. 
		//TODO: Make Scaling look good.
		downloadingIcon.getScaledInstance(WIDTH, HEIGHT, java.awt.Image.SCALE_SMOOTH);
		finishedIcon = new ImageIcon(downloadingIcon);
		
		lblNewLabel.setText(fr);
		btnNewButton.setText(an[0]);
		btnNewButton_1.setText(an[1]);
		btnNewButton_2.setText(an[2]);
		btnNewButton_3.setText(an[3]);
		lblPlaceholderText.setIcon(finishedIcon);
	}

	/**
	 * Create the frame.
	 */
	public MainFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		btnNewButton_3 = new JButton("New button");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				QuizHelper.CheckAnswer(btnNewButton_3.getText());
				LoadQuestion();
			}
		});
		panel.add(btnNewButton_3);
		
		btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuizHelper.CheckAnswer(btnNewButton_2.getText());
				LoadQuestion();
			}
		});
		panel.add(btnNewButton_2);
		
		btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuizHelper.CheckAnswer(btnNewButton_1.getText());
				LoadQuestion();
			}
		});
		panel.add(btnNewButton_1);
		
		btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				QuizHelper.CheckAnswer(btnNewButton.getText());
				LoadQuestion();
			}
		});
		panel.add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		
		lblNewLabel = new JLabel("New label");
		panel_1.add(lblNewLabel);
		
		JPanel panel_2 = new JPanel();
		contentPane.add(panel_2, BorderLayout.CENTER);
		
		lblPlaceholderText = new JLabel("placeholder Text");
		panel_2.add(lblPlaceholderText);
	}

}
