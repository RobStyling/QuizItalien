package moelrobi.quiz;

public class Frage {
	
	private String frage;
	private int richtigeAntwrort;
	private String imgURL;
	private String author;
	private String[] antworten = new String[5];
	
	private int aCounter = 0;
	
	public void addAntwort(String antwort) {
		if(aCounter == 0) {
			this.antworten[aCounter] = null;
			aCounter++;
		}
		if(aCounter >= 5) {
			throw new UnsupportedOperationException("Du kannst keine weiteren Fragen hinzufügen.");
		}
		this.antworten[aCounter] = antwort;
		aCounter++;
	}
	
	public String getAntwort(int counter) {
		if(counter == 0) throw new IllegalArgumentException("Diese Antworten fangen nicht bei 0 An. Auch wenn Arrays tuen.");
		if(counter >= 5) throw new IllegalArgumentException("Das Object \"Frage\" hat nur 4 Objekte");
		String an = antworten[counter];
		return an;
	}

	public String getFrage() {
		return frage;
	}

	public void setFrage(String frage) {
		this.frage = frage;
	}

	public int getRichtigeAntwrort() {
		return richtigeAntwrort;
	}

	public void setRichtigeAntwrort(int richtigeAntwrort) {
		if(richtigeAntwrort == 0 || richtigeAntwrort >= 5) throw new IllegalArgumentException("Die richitge Antwort muss zwischen 1 und 4 liegen.");
		this.richtigeAntwrort = richtigeAntwrort;
	}

	public String getImgURL() {
		return imgURL;
	}

	public void setImgURL(String imgURL) {
		this.imgURL = imgURL;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
