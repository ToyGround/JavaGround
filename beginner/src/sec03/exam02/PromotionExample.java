package sec03.exam02;

public class PromotionExample {
    public static void main(String[] args) {
        byte byteValue = 127;
        int intValue = byteValue;

        System.out.println("[origin Byte Type = byteValue] : " + byteValue);
        System.out.println("[Integer Type = intValue] : " + intValue);

        char charValue = '가';
        intValue = charValue;

        System.out.println("[origin charValue Type = charValue] : " + charValue);
        System.out.println("[유니코드 Type = intValue] : " + intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("[origin long Type = longValue] : " + longValue);

        float floatValue = longValue;
        System.out.println("[float Type = floatValue] : " + floatValue);

        double doubleValue = longValue;
        System.out.println("[double type = doubleValue] : " + doubleValue);
    }
}
