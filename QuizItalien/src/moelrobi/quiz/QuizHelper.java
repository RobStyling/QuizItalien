package moelrobi.quiz;

import java.util.ArrayList;

public class QuizHelper {
	
	public static ArrayList<Frage> fragenListe = new ArrayList<Frage>();
	
	private int counter = 0;
	
	private int points;
	public int right;
	public int wrong;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FragenHandler.debugQuestions();
		System.out.println(fragenListe.toString());
	}
	
	public void iCounter() {
		counter++;
	}
	
	public void ResetGame() {
		counter = 0;
		points = 0;
		right = 0;
		wrong = 0;
	}
}
