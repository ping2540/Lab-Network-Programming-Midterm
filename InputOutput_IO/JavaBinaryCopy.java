
import java.io.*;
public class JavaBinaryCopy
{
    public static void main(String[] args) throws IOException
    {
        if (args.length != 2)
        {
            System.out.println("Usage :JavaBinaryCopy <source file> <destination file>");
            System.exit(0);
        }
        try
        {
            int n;
            byte[] b = new byte[16];
            File f1 = new File(args[0]);
            File f2 = new File(args[1]);
            FileInputStream fin = new FileInputStream(f1);
            FileOutputStream fout = new FileOutputStream(f2);
            while ((n = fin.read(b)) > 0)
            {
                String data = new String(b, 0, n);
                byte[] c = data.getBytes();
                fout.write(c);
                System.out.print("Write Data = "+data);
            }
            fout.close();
            fin.close();
        } catch (FileNotFoundException e)
        {
            System.out.println("Usage :JavaBinaryCopy <source file> <destination file>");
        }
    }
}
