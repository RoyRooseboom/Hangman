public class ShowOutput
{
    public void Output(String playerInput)
    {
        System.out.println("\033[H\033[2J");
        System.out.flush();

        System.out.println(playerInput);
    }

    public void ShowWrongLetters(Object[] wrongLetters)
    {
        System.out.println(wrongLetters);
    }
}