package sec01_basicsyntax.EX03_ConsoleOutput;

public class ConsoleOutput {
    public static void main(String[] arg) {
        // 1. System.out.printIn()
        System.out.println("안녕하세요");
        System.out.println("안녕" + "하세요");
        System.out.println(2+4);
        System.out.println(4.6);
        System.out.println("문자" + 1);
        System.out.println("문자"+1+2);
        System.out.println(1 + 2 + "문자");
        System.out.println();
        int a = 5;
        String b = "하세요";
        System.out.println(a);
        System.out.println(b);
        System.out.println("안녕" + b);
        System.out.println(a + "안녕" + b);
        System.out.println();
    }
}
