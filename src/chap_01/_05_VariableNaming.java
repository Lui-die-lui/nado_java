package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        /*변수 이름 짓는 법
        * 1. 저장할 값에 어울리는 이름
        * 2.밑줄(_), 문자(abc), 숫자(123) 사용 가능 (공백 사용 금지)
        * 3 밑줄 또는 문자로 시작 가능
        * 4. 한 단어 또는 2개 이상 단어의 연속
        * 5. 소문자로 시작, 각 단어의 시작 글자는 대문자 (첫 단어는 제외)
        * 6. 예약어 사용 불가(public, static, void, int, double, float, ...)
        *  */

        // 입국 신고서 (여행)
        String nationality = "대한민국"; // 국적
        String firstName = "현성"; // 이름
        String lastName = "김"; // 성
        String dateOfBirth = "1996-05-28"; // 생년월일
        String residentialAdress = "oo호텔"; // 체류지
        String purposeOfVisit = "관광"; // 입국목적
        String flightNo = "KE657"; // 항공 편명
        String _flightNo = "KE657"; // 밑줄 시작
        String _flight_no_2 = "KE657"; // 밑줄과 숫자 포함
//        String -flightNo = "KE657"; 하이픈(-)은 이름 앞에 못 옴

        int accompany = 2; // 동반 가족 수
        int lengthOfStay = 5; // 체류 기간

        String item1 = "시계";
        String item2 = "가방";
//        String 3item = "전자제품"; 숫자는 앞에 못 옴

        // 프로그램의 흐름을 위해 사용되는 경우 등 (크게 이름이 중요하지 않을 때)
        int i = 0;
        String s = "";
        String str = "";

        //절대 변하지 않는 상수는 대문자로
        final String CODE = "KR";
//        CODE = "US"; - 실행(변경) 안됨 - 앞에서 KR을 상수로 지정했기





    }
}
