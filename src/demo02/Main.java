package demo02;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File f1 = new File("test.txt");
        File f2 = new File("./../io/simlink.txt");
        System.out.println(f1.getAbsolutePath());
        System.out.println(f2.getAbsolutePath());
        System.out.println(f2.getCanonicalPath());
    }
}
