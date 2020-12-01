
import java.io.*;
public class JavaTextCopy {

    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Usage :JavaTextCopy <source file> <destination file>");
            System.exit(0);
        } else if (!((new File(args[0])).exists()) || !((new File(args[1])).exists())) {
            System.out.println("Usage :JavaTextCopy <source file> <destination file>");
            System.exit(0);
        }
        try {
            String msg;
            File f1 = new File(args[0]);
            File f2 = new File(args[1]);
            FileOutputStream fout = new FileOutputStream(f2);
            PrintWriter pout = new PrintWriter(fout);
            BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f1)));
            while ((msg = br.readLine()) != null) {
                pout.println(msg);
                pout.flush();
                System.out.println(msg);
            }
            pout.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
