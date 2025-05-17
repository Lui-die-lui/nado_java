package chap_01;

public class _06_Constants {
    public static void main(String[] args) {
        //바뀔 일이 잘 없는 값들은 상수로 선언 ex)국가 명 or 국가 번호
        final String KR_COUNTRY_CODE = "+82"; // 국가 번호 (빨리)
//        KR_COUNTRY_CODE = "+8282"; -실행 안됨. "+82"값으로 상수 선언 했음
        System.out.println(KR_COUNTRY_CODE);

        final double PI = 3.141592; // 원주율
        // "파이" 값을 코드 여러 곳에서 사용할 경우,
        // 다른 값이 사용되지 않도록 하기 위해 'final' 키워드를 붙여 상수로 선언함
        // final로 선언된 상수는 한 번 초기화되면 값을 바꿀 수 없음
        // 이렇게 하면 실수로 값이 바뀌는 것을 방지할 수 있고, 코드의 신뢰성이 높아짐
        final String DATE_OF_BIRTH = "1996-05-28"; // 생년 월일 - 상수는 전부 대문자이기 때문에 밑줄로 구분해주면 좋음

    }
}
