
public class TestArgs
{

    public static void main(String[] args)
    {
        if (args.length != 2)
        {
            System.out.println("Usage : java TestArgs <number1> <number2>");
            System.exit(0);
        }
        try
        {
            float num1 = Float.parseFloat(args[0]);
            float num2 = Float.parseFloat(args[1]);
            System.out.println("Result = "+(num1*num2));
        } catch (Exception e)
        {
            System.out.println("Usage : java TestArgs <number1> <number2>");
        }
    }
}
