
import java.io.*;

public class JavaList {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage :JavaList <File/Directory Name>");
            System.exit(0);
        }
        File f = new File(args[0]);
        if (!f.exists()) {
            System.out.println("File not found");
        } else if (f.isDirectory()) {
            File list[] = f.listFiles();
            for (int i = 0; i < list.length; i++) {
                if (list[i].isFile()) {
                    System.out.println(list[i].getName() + " is a file.");
                } else if (list[i].isDirectory()) {
                    System.out.println(list[i].getName() + " is a directory.");
                }
            }
        } else {
            System.out.println(f.getName() + " is a file.");
            System.out.println("File size = " + f.length() + "KB");
        }
    }
}
