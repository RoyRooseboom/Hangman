import java.util.ArrayList;

public class Hangman
{
    ArrayList<Character> lettersGuessed = new ArrayList<Character>();
    ArrayList<Character> wrongLetters = new ArrayList<Character>();
    String[] words = {"Hello", "Car", "Book", "Rental Unit", "Parlement"};

    public static void main(String[] args)
    {
        Hangman hangman = new Hangman();
        GetPlayerInput playerInput = new GetPlayerInput();
        ShowOutput output = new ShowOutput();


        output.Output(playerInput.GetInput());

        output.ShowWrongLetters(hangman.wrongLetters.toArray());
    }
}
