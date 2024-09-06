import java.util.Scanner;

public class GetPlayerInput
{
    Scanner input = new Scanner(System.in);

    public String GetInput()
    {
        return input.nextLine();
    }
}