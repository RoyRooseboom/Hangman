import java.util.ArrayList;
import java.util.Random;

public class Hangman
{
    static int timesYouCanTry = 15;

    static ArrayList<Character> lettersGuessed = new ArrayList<Character>();
    static ArrayList<Character> wrongLetters = new ArrayList<Character>();
    static ArrayList<Character> correctLetters = new ArrayList<Character>();
    static ArrayList<Character> charactersFromCorrectWord = new ArrayList<Character>();
    static String[] words = {"HELLO", "CAR", "BOOK", "RENTAL UNIT", "PARLEMENT"};

    static GetPlayerInput playerInput = new GetPlayerInput();
    static ShowOutput output = new ShowOutput();

    static String correctWord;

    public static void main(String[] args)
    {
        int randomWord = new Random().nextInt(words.length);
        correctWord = words[randomWord];

        for(char let : correctWord.toCharArray())
        {
            charactersFromCorrectWord.add(let);
        }

        while(timesYouCanTry > 0)
        {
            System.out.println("You have " + timesYouCanTry + " guesses left.");
            System.out.print("Please input a letter: ");
            CheckAwnser(correctWord, playerInput.GetInput(correctWord));

            System.out.println("\033[H\033[2J");
            output.Output();

            timesYouCanTry--;
        }

        System.out.println("Out of tries...");
    }

    private static void CheckAwnser(String word, String letters)
    {
        char[] lettersArray = letters.toCharArray();

        for(int i = 0; i < letters.length(); i++)
        {
            if(!lettersGuessed.contains(lettersArray[i]))
            {
                lettersGuessed.add(lettersArray[i]);
            }

            char target = lettersArray[i];

            if(charactersFromCorrectWord.contains(target))
            {
                if(!correctLetters.contains(target)) correctLetters.add(target);
            } else
            {
                if(!wrongLetters.contains(target)) wrongLetters.add(target);
            }
        }

        if(correctLetters.containsAll(charactersFromCorrectWord)) EndGame(word);

        if(letters.equals(word)) EndGame(word);        
    }

    private static void EndGame(String word)
    {
        output.Win(word);
        System.exit(0);
    }

}
