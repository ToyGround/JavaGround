package sec03.exam03;

public class MethodExample {
    public static void main(String[] args) {
        int n = 3;
        int a = square(n);

        System.out.printf("%d의 제곱은 %d",n,a);
    }
    public static int square(int num) {
        int result;
        result = num * num;
        return result;
    }
}
