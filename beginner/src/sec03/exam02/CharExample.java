package sec03.exam02;

public class CharExample {
    public static void main(String[] args) {
        char var1 = 'A';
        char var2 = 'B';
        char var3 = '가';
        char var4 = '다';
        char var5 = 65; //10진수로 저장
        char var6 = '\u0041'; //16진수로 저장
        char var7 = 44032; //10진수로 저장
        char var8 = '\uac00'; //16진수로 저장

        int let1 = var1;
        int let2 = var2;
        int let3 = var3;
        int let4 = var4;
        // char var5 = "A"; <-- error 쌍따옴표로 String Type 이다.

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
        System.out.println(var5);
        System.out.println(var6);
        System.out.println(var7);
        System.out.println(var8);

        System.out.println(let1);
        System.out.println(let2);
        System.out.println(let3);
        System.out.println(let4);
    }
}
