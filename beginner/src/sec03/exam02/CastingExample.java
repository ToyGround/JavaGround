package sec03.exam02;

public class CastingExample {
    public static void main(String[] args) {
        int intValue = 10;
        byte byteValue = (byte) intValue;
        double doubleValue = 3.14;
        int castingIntValue = (int) doubleValue;

        System.out.println(intValue);
        System.out.println(byteValue);
        System.out.println(doubleValue);
        System.out.println(castingIntValue);
    }
}
