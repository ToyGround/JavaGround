package sec03.exam02;

public class LongExample {
    public static void main(String[] args) {
        long var1 = 10;
        long var2 = 10L;
        //long var3 = 10000000000; < <-- 컴파일 에러 : Integer 범위 이상일경우 값 뒤에 소문자 l 또는 대문자 L 을 붙인다.
        long var3 = 10000000000L;
        long var4 = 10000000000l; // 소문자도 사용하긴하나 숫자 1과 비슷해 대문자를 권장한다.

        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);
        System.out.println(var4);
    }
}
