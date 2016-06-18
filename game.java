import java.io.*;
import java.util.ArrayList;
public class game {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		wordBank wordBank = new wordBank();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("HANGMAN \n"
						 + "Enter the size of your word");
		String num = in.readLine();
		wordBank.wordLengths(Integer.parseInt(num));
		while(true)
		{
		System.out.println("Guess a letter:");
		num = (in.readLine()).toUpperCase();
		System.out.println(wordBank.guessALetter(num));
		System.out.println("Guesses: " + wordBank.getGuesses());
			if(wordBank.hasWon())
			{
				break;
			}
		}
		System.out.println("YOU WIN!!!");
	}

}
