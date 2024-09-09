public class ShowOutput
{
    public void Output()
    {
        System.out.println("\033[H\033[2J");
        System.out.flush();

        YourGuess();
        ShowWrongLetters();
        ShowCorrectLetters();
        ShowAwnser();
    }

    private void YourGuess(Object[] guessed)
    {
        System.out.println("You Guessed: " + guessed);
    }

    private void ShowWrongLetters(Object[] wrongLetters)
    {
        for(Object letters : wrongLetters)
        {
            System.out.println("Wrong Letters: " + wrongLetters);
        }
    }

    private void ShowCorrectLetters(Object[] correctLetters)
    {
        for(Object letters : correctLetters)
        {
            System.out.println("Wrong Letters: " + correctLetters);
        }
    }

    private void ShowAwnser(String awnser)
    {
        System.out.println("The awnser is: " + awnser);
    }
}