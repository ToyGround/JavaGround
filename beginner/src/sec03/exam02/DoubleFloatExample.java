package sec03.exam02;

public class DoubleFloatExample {
    public static void main(String[] args) {
        double var1 = 3.14;
        // float var2 = 3.14; <-- error 기본적으로 실수는 double 타입으로 해석해서 에러가 발생
        float var2 = 3.14f; // long 타입처럼 값의 뒤에 소문자 f
        float var3 = 3E6F; // 또는 대문자 F 선언한다.

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
    }
}
