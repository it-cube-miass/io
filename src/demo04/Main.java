package demo04;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        writeToFile("Hello!");
        String s = readFromFile();
        System.out.println(s);
    }

    public static void writeToFile(String str) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"))) {
            for (int i = 0; i < str.length(); i++) {
                bw.write(str.charAt(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String readFromFile() {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            int code;
            while ((code = br.read()) != -1) {
                sb.append(Character.toChars(code));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return sb.toString();
    }
}
