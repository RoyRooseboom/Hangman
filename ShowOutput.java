public class ShowOutput
{
    public void Output()
    {
        System.out.println("\033[H\033[2J");
        System.out.flush();

        YourGuess(playerInput);
        ShowWrongLetters(wrongLetters);
        ShowAwnser(awnser);
    }

    private void YourGuess(String input)
    {
        System.out.println(input);
    }

    private void ShowWrongLetters(Object[] wrongLetters)
    {
        for(Object letters : wrongLetters)
        {
            System.out.println(letters);
        }
    }

    private void ShowAwnser(String awnser)
    {
        String correctAwnser = awnser;
        System.out.println();
    }
}