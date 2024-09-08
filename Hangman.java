import java.util.ArrayList;
import java.util.Random;

public class Hangman
{
    /*
    *  You guessed: A
    *  Wrong Letters: A, T, Q
    *  Awnser: D _ G
    */

    static int timesYouCanTry = 15;

    static ArrayList<Character> lettersGuessed = new ArrayList<Character>();
    static ArrayList<Character> wrongLetters = new ArrayList<Character>();
    static ArrayList<Character> correctLetters = new ArrayList<Character>();
    static ArrayList<Character> charactersFromCorrectWord = new ArrayList<Character>();
    static String[] words = {"HELLO", "CAR", "BOOK", "RENTALUNIT", "PARLEMENT"};

    static boolean continueGame = true;

    public static void main(String[] args)
    {
        int randomWord = new Random().nextInt(5);
        String correctWord = words[randomWord];


        GetPlayerInput playerInput = new GetPlayerInput();
        ShowOutput output = new ShowOutput();

        while (continueGame) 
        {
            for(int i = 0; i < timesYouCanTry; i++)
            {
                CheckAwnser(correctWord, playerInput.GetInput(correctWord));

                System.out.println("\033[H\033[2J");
                // System.out.flush();

                System.out.println("Guessed: " + lettersGuessed);
                System.out.println("Wrong: " + wrongLetters);
                System.out.println("Correct: " + correctLetters);
                System.out.println("Word: " + correctWord);

            }        
        }
    }

    private static void CheckAwnser(String word, String letters)
    {
        charactersFromCorrectWord.removeAll(charactersFromCorrectWord);

        for(char l : word.toCharArray())
        {
            charactersFromCorrectWord.add(l);
        }

        for(char c : letters.toCharArray())
        {
            if(!lettersGuessed.contains(c))
            {
                lettersGuessed.add(c);
            }

            if(word.contains(letters))
            {
                if(!correctLetters.contains(letters.charAt(0))) correctLetters.add(c);
            } else
            {
                if(!wrongLetters.contains(letters.charAt(0))) wrongLetters.add(c);
            }
        }

        // This works, however the "flushing of the screen" removes this.
        // we have to end the game here.
        if(charactersFromCorrectWord.containsAll(correctLetters)) continueGame = false;

        // If they typed to full word
        if(letters.equals(word)) EndGame();        
    }

    private static void EndGame()
    {
        System.out.println("Inside End Game");
    }

}
