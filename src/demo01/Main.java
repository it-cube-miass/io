package demo01;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
        writeToFile("Hello!");
        String s = readFromFile();
        System.out.println(s);

    }

    public static void writeToFile(String str) {
        FileWriter fw = null;

        try {
            fw = new FileWriter("test.txt");
            for (int i = 0; i < str.length(); i++) {
                fw.write(str.charAt(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String readFromFile() {
        StringBuilder sb = new StringBuilder();
        FileReader fr = null;

        try {
            fr = new FileReader("test.txt");
            int code;
            while ((code = fr.read()) != -1) {
                sb.append(Character.toChars(code));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return sb.toString();
    }
}
