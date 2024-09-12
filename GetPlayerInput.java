import java.util.Scanner;

public class GetPlayerInput
{
    Scanner input = new Scanner(System.in);

    public String GetInput()
    {
        String value = input.nextLine().toUpperCase();

        if(value.equals(Hangman.correctWord)) return value;

        if (value.matches("[A-Za-z]{1}")) 
        {
            return value;
        }
        else if(value.matches("[\\d\\W]+") || value.isBlank()) 
        {
            return "";
        }
        else 
        {
            return value.replaceAll("[\\d\\W]+", "");
        }
    }
}