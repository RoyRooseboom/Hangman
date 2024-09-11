import java.util.Scanner;

public class GetPlayerInput
{
    Scanner input = new Scanner(System.in);

    public String GetInput(String correctWord)
    {
        String value = input.nextLine().toUpperCase();

        if(value.equals(correctWord)) return value;

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
            return Character.toString(value.charAt(0));
        }
    }
}