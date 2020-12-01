
public class Grade
{

    public static void main(String[] args)
    {
        if (args.length != 1)
        {
            System.out.println("Please enter your score");
            System.exit(0);
        }
        try
        {
            int score = Integer.parseInt(args[0]);
            if (score > 100 || score < 0)
            {
                System.out.println("Please enter number 0-100");
            } else if (score >= 80)
            {
                System.out.println("Grade A");
            } else if (score >= 70)
            {
                System.out.println("Grade B");
            } else if (score >= 60)
            {
                System.out.println("Grade C");
            } else if (score >= 50)
            {
                System.out.println("Grade D");
            } else
            {
                System.out.println("Grade F");
            }
        } catch (NumberFormatException e)
        {
            System.out.println("Please enter integer number");
        }

    }

}
