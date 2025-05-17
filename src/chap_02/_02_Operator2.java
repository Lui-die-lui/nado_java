package chap_02;

public class _02_Operator2 {
    public static void main(String[] args) {
        //대입 연산자
        int num = 10; // num에 10의 값을 대입
        num = num + 2; //이미 num이 10이기 때문에 대입함. 10 + 2와 같은값임
        System.out.println(num); // = 12

        num = num - 2; // 위의 처리된 연산값 12에서 2를 뺌
        System.out.println(num); // 10

        num = num * 2;
        System.out.println(num); // 20

        num = num / 2;
        System.out.println(num); // 10

        num = num % 2;
        System.out.println(num); // 0

        //복합 대입 연산자 - 대입 연산자의 동일한 변수 중복사용을 줄임
        num = 10;
        //num + num + 2;
        num +=2; //자기자신의 값을 연산에 넣을경우 사용가능
        System.out.println(num); // 12

        // num = num - 2;
        num -= 2;
        System.out.println(num); // 10

        // num = num * 2;
        num *= 2;
        System.out.println(num); // 20

        // num = num / 2;
        num /= 2;
        System.out.println(num); // 10

        //num = num % 2;
        num %= 2;
        System.out.println(num); // 0


    }
}
