package demo02;

public class Main {
    public static void main(String[] args) {
        File f1 = new File("test.txt");
        File f2 = new File("./../io/simlink.txt");
        System.out.println(f1.getAbsolutePath());
        System.out.println(f2.getAbsolutePath());
        System.out.println(f2.getCanonicalPath());
    }
}
