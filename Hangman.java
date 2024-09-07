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
    static String[] words = {"HELLO", "CAR", "BOOK", "RENTAL UNIT", "PARLEMENT"};

    public static void main(String[] args)
    {
        int randomWord = new Random().nextInt(5);
        String correctWord = words[randomWord];


        GetPlayerInput playerInput = new GetPlayerInput();
        ShowOutput output = new ShowOutput();

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

    private static void CheckAwnser(String word, String letter)
    {
        for(char c : letter.toCharArray())
        {
            if(!lettersGuessed.contains(c))
            {
                lettersGuessed.add(c);
            }

            if(word.contains(letter))
            {
                if(!correctLetters.contains(letter.charAt(0))) correctLetters.add(c);
            } else
            {
                if(!wrongLetters.contains(letter.charAt(0))) wrongLetters.add(c);
            }
        }

        if(letter.equals(word)) EndGame();

        for(char lettersInWord : word.toCharArray())
        {
            if(!lettersGuessed.contains(lettersInWord)) continue;
        }
        
    }

    private static void EndGame()
    {
        System.out.println("Inside End Game");
    }

}
