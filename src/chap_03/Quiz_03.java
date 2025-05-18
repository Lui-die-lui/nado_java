package chap_03;

public class Quiz_03 {
    public static void main(String[] args) {
        /*Quiz
        * 주민등록번호에서 생년월일 및 성별까지만 출력하는 프로그램을 작성하시오
        * 참고
        * 주민등록번호는 13자리의 숫자로 구성
        * 앞 6자리는 생년월일 정보, 뒷 7자리 중 첫 번째 숫자는 성별 정보
        * 입력 데이터는 - 을 포함한 14자리 문자열 형태
        * 예시
        * "901231-1234567" 인 경우 901231-1 까지 출력
        * "030708-4567890" 인 경우 030708-4 까지 출력 */


        String residentNum = ("970628-2478577");
        System.out.println(residentNum.substring(0, 8)); // 0위치부터 8위치 직전까지

        String id = ("901231-1234567");
        System.out.println(id.substring(0, id.indexOf("-") + 2)); // 0 위치부터 하이픈 위치 + 2 직전 까지
      /*1.하이픈의 위치를 찾고
      * 2.자리값에 + 2를해서
      * 3.뒷 값은 직전까지 출력됨
      */


    }
}
