package sec03.exam02;

public class PrintfExample {
    public static void main(String[] args) {
        String title = "타이틀";
        int numberTen = 10;
        double doubleNumberPie = 3.14;
        boolean isTrue = true;

        System.out.printf("[String 문자열 : 퍼센트s] %s", title);
        System.out.printf("[int 정수 : 퍼센트d] %d", numberTen);
        System.out.printf("[doublet 실수 : 퍼센트f] %f", doubleNumberPie);
        System.out.printf("[boolean 논리 : 퍼센트b] %b", doubleNumberPie);
    }
}
