package sec03.exam03;

public class MethodExample {
    public static void main(String[] args) {
        int n = 3;
        int a = square(n);
        int b = sum(n, a);

        System.out.printf("%d의 제곱은 %d \n", n, a);
        System.out.printf("%d와 %d의 합은 %d", n, a, b);
    }

    public static int square(int num) {
        int result;
        result = num * num;
        return result;
    }

    public static int sum(int a, int b) {
        int result;
        result = a + b;
        return result;
    }
}
