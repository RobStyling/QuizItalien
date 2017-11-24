package moelrobi.quiz;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ScoreboardFrame extends JFrame {

	private JPanel contentPane;
	private JLabel label;
	private static JLabel label2;
	private JLabel label3;
	private JLabel label4;
	private JLabel label5;
	private JLabel label6;
	private JLabel label7;
	private JLabel label8;
	private JLabel label9;
	private JLabel label10;
	private JLabel label11;
	private JLabel label12;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ScoreboardFrame frame = new ScoreboardFrame();
					frame.setVisible(true);
					Load();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static void Load() {
		ArrayList<String> s = QuizHelper.dbcon.getScore();
		System.out.println(s.toArray());
		for (int i = 0; i < s.size(); i++) {
			System.out.println(s.get(i));
			label2.setText(s.get(i));
		}
		
	}

	/**
	 * Create the frame.
	 */
	public ScoreboardFrame() {
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		
		label = new JLabel("Hier sind die Besten Zehn:");
		panel_1.add(label);
		
		label2 = new JLabel("");
		panel_1.add(label);
		label3 = new JLabel("");
		panel_1.add(label);
		label4 = new JLabel("");
		panel_1.add(label);
		label5 = new JLabel("");
		panel_1.add(label);
		label6 = new JLabel("");
		panel_1.add(label);
		label7 = new JLabel("");
		panel_1.add(label);
		label8 = new JLabel("");
		panel_1.add(label);
		label9 = new JLabel("");
		panel_1.add(label);
		label10 = new JLabel("");
		panel_1.add(label);
		label11 = new JLabel("");
		panel_1.add(label);
	}

}
