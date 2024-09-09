import java.util.ArrayList;

public class ShowOutput
{
    public void Output(ArrayList<Character> guesses, ArrayList<Character> wrongLetters, ArrayList<Character> correctLetters)
    {
        System.out.println("\033[H\033[2J");
        System.out.flush();

        YourGuess(guesses);
        ShowWrongLetters(wrongLetters);
        ShowCorrectLetters(correctLetters);
        ShowAwnser();
    }

    private void YourGuess(ArrayList<Character> guessed)
    {
        System.out.println("You Guessed: " + guessed);
    }

    private void ShowWrongLetters(ArrayList<Character> wrongLetters)
    {
        System.out.println("Wrong Letters: " + wrongLetters);
    }

    private void ShowCorrectLetters(ArrayList<Character> correctLetters)
    {
        System.out.println("Correct Letters: " + correctLetters);
    }

    private void ShowAwnser()
    {
        // Spell out the word here, each round. In the following way:
        // B _ _ K
    }

    public void Win(String awnser)
    {
        System.out.println();
        System.out.println("You Win!!!");
        System.out.println("The awnser is: " + awnser);
    }
}