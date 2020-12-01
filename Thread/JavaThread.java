
public class JavaThread extends Thread
{

    int x;

    public JavaThread(int arg)
    {
        x = arg;
    }

    public void run()
    {
            System.out.println(x+" HelloWorld");
    }

    public static void main(String[] args)
    {
        if (args.length != 1)
        {
            System.exit(0);
        }
        try
        {
            for (int i = 0 ; i < Integer.parseInt(args[0]); i++)
            {
                JavaThread x = new JavaThread(i);
                x.start();
            }
        } catch (Exception e)
        {
            System.out.println("Parameter isn't " + "Integer");
        }

    }

}
