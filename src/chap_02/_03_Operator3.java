package chap_02;

public class _03_Operator3 {
    public static void main(String[] args) {
        // 비교 연산자
        System.out.println(5 > 3); // 5는 3보다 크다 - true
        System.out.println(5 >= 3); // 5는 3보다 크거나 같다 - true
        System.out.println(5 >= 5); // 5는 5보다 크거나 같다 - true
        System.out.println(5 >= 7); // 5는 7보다 크거나 같다 - false

        System.out.println(5 < 3); // 5는 3보다 작다 - false
        System.out.println(5 <= 3); // 5는 3보다 0작거나 같다 - false

        System.out.println(5 == 5); // = 은 대입이기 때문에 같은지 확인하기 위해서는 == 으로 표시
        System.out.println(5 == 3); // 5는 3과 같다 - false
        System.out.println(5 != 5); // 5는 5와 같지 않다 - false ( ! = 부정 )
        System.out.println(5 != 3); // 5는 3와 같지 않다 - true


    }
}
