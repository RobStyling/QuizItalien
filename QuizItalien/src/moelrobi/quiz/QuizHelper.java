package moelrobi.quiz;

import java.util.ArrayList;

public class QuizHelper {
	
	/* To my Future Self:
	 * Yes, everything you see here is actually working. You don't need to actually check that again.
	 * I know i were dumb enough to actually write this two times but i wanted the code to actually look good.
	 * I don't think you will ever look at it again in two years.
	 * Still thanks, Rob (the 17 year old one)
	 */
	
	//Setting instance variables.
	public static ArrayList<Frage> fragenListe = new ArrayList<Frage>();
	
	public static int loadCounter = 0;
	
	public static DatenbankHandler dbcon; //Creating a Database Handler globally;
	
	public static int right; 
	public static int wrong;
	
	public static final String ip = "127.0.0.1"; //IP for Downloading the Files and Accessing MySQL.
	
	public static void main(String[] args) {
		FragenHandler.prodFragen(); //Load up the FragenHandler (for Loading the Questions).
		System.out.println(fragenListe.toString());
		MainFrame.main(null); //Load the Frame.
		dbcon = new DatenbankHandler("jdbc:mysql://" + ip +":3306/flbk_rob?autoReconnect=true", "root", ""); //Creating a new Database Object.
	}
	
	public static String getFragen() { //Loading a Question
		//Falsify if Check. Used currently for Reseting the Game to a previous 0 State.
        if(loadCounter == fragenListe.size()) {
        	MainFrame.frame.setVisible(false);
        	FinishedFrame.main(null);
        }
		return fragenListe.get(loadCounter).getFrage();
	}
	
	public static String[] getAntworten() { //Loading the answers randomly
		//Local variable declaration.
		String a1;
		String a2;
		String a3;
		String a4;
		while(true) { //Endless loop for regenerating the Questions
			//Load some questions.
	        a1 = fragenListe.get(loadCounter).getAntwort(RNG(4,1));
	        a2 = fragenListe.get(loadCounter).getAntwort(RNG(4,1));
	        a3 = fragenListe.get(loadCounter).getAntwort(RNG(4,1));
	        a4 = fragenListe.get(loadCounter).getAntwort(RNG(4,1));
	        
	        if(CheckA(a1, a2, a3, a4) == true) { //If everything is non-duplicate break the loop.
	        	break;
	        }
		}
		
		// Push them into a Array....
		String [] an = new String[4];
		an[0] = a1;
		an[1] = a2;
		an[2] = a3;
		an[3] = a4;
        
		//... and send them.
        return an;
	}
	
    private static boolean CheckA(String a1, String a2, String a3, String a4) { //Check if a Answer is duplicate.
        if(a1.equals(a2) || a1.equals(a3) || a1.equals(a4)) {
            return false;
        }
        else if(a2.equals(a3) || a2.equals(a4)){
            return false;
        }
        else if(a3.equals(a4)) {
            return false;
        }
        else {
            return true;
        }
    }
    
    public static String getURL() { //Load the URL for an UI. Maybe going faster if UI access it directly
    	return fragenListe.get(loadCounter).getImgURL();
    }
    
    public static boolean CheckAnswer(String inputAnswer) { //Check if Answer is the correct answer.
		String rightAnswer = fragenListe.get(loadCounter).getAntwort(fragenListe.get(loadCounter).getRichtigeAntwrort());
		System.out.println(rightAnswer);
		System.out.println(inputAnswer);
		System.out.println(rightAnswer.equals(inputAnswer));
		if(rightAnswer.equals(inputAnswer)) {
			right++;
			System.out.println(true);
			return true;
		}
		else {
			wrong++;
			System.out.println(false);
			return false;
		}
    }
	
	public static void iCounter() { //Increases the loading variable.
		loadCounter++;
	}
	
	public static void ResetGame() { //Reseting all Points and Counters.
		loadCounter = 0;
		right = 0;
		wrong = 0;
	}

    public static int RNG(int Max, int Min) { //Random-Number-Generator
    	return (int) Math.floor(Math.random() * (Max - Min + 1)) + Min;
    }

	public static String getAuthor() { //Load the Author.
		return fragenListe.get(loadCounter).getAuthor();
	} 
}
