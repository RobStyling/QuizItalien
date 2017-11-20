package moelrobi.quiz;

public class FragenHandler {
	private static void addFrage(Frage frage) {
		QuizHelper.fragenListe.add(frage); //Unnecessary Method. Maybe gets Replaced.
	}
	
	public static void debugQuestions() {
		//Example for a Question:
		Frage f1 = new Frage();
		f1.setFrage("Just some Debugging Stuff");
		f1.addAntwort("Right");
		f1.addAntwort("not right");
		f1.addAntwort("Definitv Falsch");
		f1.addAntwort("Wrong");
		f1.setImgURL(null);
		f1.setRichtigeAntwrort(1);
		
		addFrage(f1);
	}
}
