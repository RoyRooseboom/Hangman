public class ShowOutput
{
    public void Output()
    {
        System.out.println("\033[H\033[2J");

        YourGuess();
        ShowWrongLetters();
        ShowCorrectLetters();
        ShowAwnser();
        System.out.println();
        System.out.println();
    }

    private void YourGuess()
    {
        System.out.println("You Guessed: " + Hangman.lettersGuessed);
    }

    private void ShowWrongLetters()
    {
        System.out.println("Wrong Letters: " + Hangman.wrongLetters);
    }

    private void ShowCorrectLetters()
    {
        System.out.println("Correct Letters: " + Hangman.correctLetters);
    }

    private void ShowAwnser()
    {
        char[] correctWordArray = Hangman.correctWord.toCharArray();

        for(int i = 0; i < correctWordArray.length; i++)
        {
            if(!Hangman.correctLetters.contains(correctWordArray[i]))
            {
                correctWordArray[i] = '_';
            }

            System.out.print(correctWordArray[i] + " ");
        }
    }

    public void Win(String awnser)
    {
        System.out.println();
        System.out.println("You Win!!!");
        System.out.println("The awnser is: " + awnser);
    }
}