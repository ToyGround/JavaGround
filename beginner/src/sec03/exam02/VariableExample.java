package sec03.exam02;

public class VariableExample {
    public static void main(String[] args) {
        int blockValue = 5;
        int sum = blockValue + 20;
        System.out.println(sum);
        if (blockValue < 10) {
            int ifValue = 10;
            System.out.println("[blockValue] " + blockValue);
            System.out.println("[ifValue] " + ifValue);
        }
    }
}
