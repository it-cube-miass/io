package demo03;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        writeToFile("Hello!");
        String s = readFromFile();
        System.out.println(s);
    }

    public static void writeToFile(String str) {
        BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("test.txt"));
            for (int i = 0; i < str.length(); i++) {
                bw.write(str.charAt(i));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static String readFromFile() {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = null;

        try {
            FileReader fr = new FileReader("test.txt");
            br = new BufferedReader(fr);

            int code;
            while ((code = br.read()) != -1) {
                sb.append(Character.toChars(code));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        return sb.toString();
    }
}
