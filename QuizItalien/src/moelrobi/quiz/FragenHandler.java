package moelrobi.quiz;

public class FragenHandler {
	private static void addFrage(Frage frage) { //Unnecessary Method. Maybe gets Replaced.
		QuizHelper.fragenListe.add(frage); 
	}
	
	public static void debugQuestions() {
		//Example for a Question:
		Frage f1 = new Frage();
		f1.setFrage("Just some Debugging Stuff");
		f1.addAntwort("Right");
		f1.addAntwort("not right");
		f1.addAntwort("Definitv Falsch");
		f1.addAntwort("Wrong");
		f1.setImgURL("http://food.fnr.sndimg.com/content/dam/images/food/fullset/2008/3/5/0/NY0100_BBQ-Spaghetti.jpg.rend.hgtvcom.616.462.suffix/1371585656631.jpeg");
		f1.setRichtigeAntwrort(1);
		
		addFrage(f1);
	}
}
