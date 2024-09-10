import java.util.ArrayList;
import java.util.Random;

public class Hangman
{
    static int timesYouCanTry = 15;

    static ArrayList<Character> lettersGuessed = new ArrayList<Character>();
    static ArrayList<Character> wrongLetters = new ArrayList<Character>();
    static ArrayList<Character> correctLetters = new ArrayList<Character>();
    static ArrayList<Character> charactersFromCorrectWord = new ArrayList<Character>();
    static String[] words = {"HELLO", "CAR", "BOOK", "RENTALUNIT", "PARLEMENT"};

    static GetPlayerInput playerInput = new GetPlayerInput();
    static ShowOutput output = new ShowOutput();

    static String correctWord;

    public static void main(String[] args)
    {
        int randomWord = new Random().nextInt(words.length);
        correctWord = words[randomWord];

        for(int i = 0; i < timesYouCanTry; timesYouCanTry--)
        {
            System.out.println("You have " + timesYouCanTry + " guesses left.");
            System.out.print("Please input a letter: ");
            CheckAwnser(correctWord, playerInput.GetInput(correctWord));

            System.out.println("\033[H\033[2J");
            output.Output();
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

        if(correctLetters.containsAll(charactersFromCorrectWord)) EndGame(word);

        if(letters.equals(word)) EndGame(word);        
    }

    private static void EndGame(String word)
    {
        output.Win(word);
        System.exit(0);
    }

}
