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
		f1.setAuthor("Rob (The Developer of that great App)");
		
		addFrage(f1);
	}
	 public static void prodFragen() 
	    {	        
	        Frage it_hauptstadt = new Frage();
	        it_hauptstadt.setFrage("Was ist die Hauptstadt Italiens?");
	        it_hauptstadt.addAntwort("Rom");
	        it_hauptstadt.addAntwort("Mailand");
	        it_hauptstadt.addAntwort("Turin");
	        it_hauptstadt.addAntwort("Neapel");
	        it_hauptstadt.setRichtigeAntwrort(1);
	        it_hauptstadt.setImgURL("http://"+ QuizHelper.ip +"/img/it_karte.jpg");
	        it_hauptstadt.setAuthor("Rob");
	        
	        Frage it_vulkan = new Frage();
	        it_vulkan.setFrage("Was ist der höchste Vulkan Europas?");
	        it_vulkan.addAntwort("Narkondam");
	        it_vulkan.addAntwort("Ätna");
	        it_vulkan.addAntwort("Venus");
	        it_vulkan.addAntwort("Eyjafjallajökull");
	        it_vulkan.setRichtigeAntwrort(2);
	        it_vulkan.setImgURL("http://"+ QuizHelper.ip +"/img/it_vulkan.jpg");
	        it_vulkan.setAuthor("Rob");
	        
	        Frage it_grosstadt = new Frage();
	        it_grosstadt.setFrage("Welche Stadt in Italien hat die meisten Einwohner?");
	        it_grosstadt.addAntwort("Mailand");
	        it_grosstadt.addAntwort("Venedig");
	        it_grosstadt.addAntwort("Rom");
	        it_grosstadt.addAntwort("Neapel");
	        it_grosstadt.setRichtigeAntwrort(1);
	        it_grosstadt.setImgURL("http://"+ QuizHelper.ip +"/img/it_itstadt.jpg");
	        it_grosstadt.setAuthor("Denise");
	        
	        Frage it_spagetti = new Frage();
	        it_spagetti.setFrage("Wie viel Pasta isst der Durschnittsitaliener?");
	        it_spagetti.addAntwort("26kg");
	        it_spagetti.addAntwort("24kg");
	        it_spagetti.addAntwort("20kg");
	        it_spagetti.addAntwort("28kg");
	        it_spagetti.setRichtigeAntwrort(1);
	        it_spagetti.setImgURL("http://"+ QuizHelper.ip +"/img/it_spag.jpeg");
	        it_spagetti.setAuthor("Felix");
	        
	        Frage it_flaeche = new Frage();
	        it_flaeche.setFrage("Wie groß ist die Fläche Italiens?");
	        it_flaeche.addAntwort("300.000km²");
	        it_flaeche.addAntwort("200.000km²");
	        it_flaeche.addAntwort("400.000km²");
	        it_flaeche.addAntwort("250.000km²");
	        it_flaeche.setRichtigeAntwrort(1);
	        it_flaeche.setImgURL("http://"+ QuizHelper.ip +"/img/it_karte.png");
	        it_flaeche.setAuthor("Lukas Oe");
	        
	        Frage it_gruendung = new Frage();
	        it_gruendung.setFrage("Wann fand die Gründung Italliens Stadt?");
	        it_gruendung.addAntwort("1861");
	        it_gruendung.addAntwort("1912");
	        it_gruendung.addAntwort("1823");
	        it_gruendung.addAntwort("1760");
	        it_gruendung.setRichtigeAntwrort(1);
	        it_gruendung.setImgURL("http://"+ QuizHelper.ip +"/img/it_flag.jpg");
	        it_gruendung.setAuthor("Lukas Oe");
	        
	        Frage it_vorwahl = new Frage();
	        it_vorwahl.setFrage("Wie lautet die Vorwahl Italiens?");
	        it_vorwahl.addAntwort("+39");
	        it_vorwahl.addAntwort("+49");
	        it_vorwahl.addAntwort("+1");
	        it_vorwahl.addAntwort("+12");
	        it_vorwahl.setRichtigeAntwrort(1);
	        it_vorwahl.setImgURL("http://"+ QuizHelper.ip +"/img/it_telefon.png");
	        it_vorwahl.setAuthor("Denis");
	        
	        Frage it_sprache = new Frage();
	        it_sprache.setFrage("Welche Sprache Spricht man in Italien?");
	        it_sprache.addAntwort("Italienisch");
	        it_sprache.addAntwort("Französisch");
	        it_sprache.addAntwort("Deutsch");
	        it_sprache.addAntwort("Spanisch");
	        it_sprache.setRichtigeAntwrort(1);
	        it_sprache.setImgURL("http://"+ QuizHelper.ip +"/img/it_sprechen.jpg");
	        it_sprache.setAuthor("Denis");
	        
	        Frage it_wm = new Frage();
	        it_wm.setFrage("Wie oft wurde Italien Weltmeister?");
	        it_wm.addAntwort("Vier Mal");
	        it_wm.addAntwort("Fünf Mal");
	        it_wm.addAntwort("Neun Mal");
	        it_wm.addAntwort("Jeff");
	        it_wm.setRichtigeAntwrort(1);
	        it_wm.setImgURL("http://"+ QuizHelper.ip +"/img/it_ball.jpg");
	        it_wm.setAuthor("Mattis");
	        
	        Frage it_ausbruch = new Frage();
	        it_ausbruch.setFrage("Wann brach der Ätna zuletzt aus?");
	        it_ausbruch.addAntwort("2012");
	        it_ausbruch.addAntwort("2013");
	        it_ausbruch.addAntwort("2002");
	        it_ausbruch.addAntwort("2008");
	        it_ausbruch.setRichtigeAntwrort(1);
	        it_ausbruch.setImgURL("http://"+ QuizHelper.ip +"/img/it_vulkan.jpg");
	        it_ausbruch.setAuthor("Denise");
	        
	        Frage it_mafia = new Frage();
	        it_mafia.setFrage("In welcher italienischen Region hat die Mafia ihre Wurzeln?");
	        it_mafia.addAntwort("Sizilien");
	        it_mafia.addAntwort("Toskana");
	        it_mafia.addAntwort("Lombardei");
	        it_mafia.addAntwort("Latium");
	        it_mafia.setRichtigeAntwrort(1);
	        it_mafia.setImgURL("http://"+ QuizHelper.ip +"/img/it_mafia.jpg");
	        it_mafia.setAuthor("Abdul und Emre");
	        
	        Frage it_wmdabei = new Frage();
	        it_wmdabei.setFrage("Ist Italien bei der WM dabei?");
	        it_wmdabei.addAntwort("Ja");
	        it_wmdabei.addAntwort("Nein");
	        it_wmdabei.addAntwort("Placeholder");
	        it_wmdabei.addAntwort("Same");
	        it_wmdabei.setRichtigeAntwrort(1);
	        it_wmdabei.setImgURL("http://"+ QuizHelper.ip +"/img/it_ball.jpg");
	        it_wmdabei.setAuthor("Rob");
	        
	        addFrage(it_hauptstadt);
	        addFrage(it_vulkan);
	        addFrage(it_grosstadt);
	        addFrage(it_spagetti);
	        addFrage(it_flaeche);
	        addFrage(it_gruendung);
	        addFrage(it_vorwahl);
	        addFrage(it_sprache);
	        addFrage(it_wm);
	        addFrage(it_ausbruch);
	        addFrage(it_mafia);
	        addFrage(it_wmdabei);
	}
}
