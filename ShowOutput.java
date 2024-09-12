public class ShowOutput
{
    public void Output()
    {
        System.out.println("\033[H\033[2J");

        System.out.println("You Guessed: " + Hangman.lettersGuessed);
        System.out.println("Wrong Letters: " + Hangman.wrongLetters);
        System.out.println("Correct Letters: " + Hangman.correctLetters);
        ShowAwnser();
        System.out.println();
        System.out.println();
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

    public void Win()
    {
        System.out.println();
        System.out.println("You Win!!!");
        System.out.println("The awnser is: " + Hangman.correctWord);
    }
}