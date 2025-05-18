package chap_03;

public class _02_String2 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C.";

        //substring() : 인덱스 기준으로 잘라내서 출력
        //indexOf() : 문자열 내 존재하는 문자열에 대한 내용 기준으로 출력


        // 문자열 변환 / ex) and를 , 로 바꾸는 작업
        System.out.println(s.replace("and" , ",")); //"and" 를 "," 로 변환
        System.out.println(s.substring(7)); // 인덱스 기준 7부터 시작(이전 내용은 삭제)
        System.out.println(s); // s 변수 본래의 값에 변환 결과가 반영되는것은 아님!
        System.out.println(s.substring(s.indexOf("Java")));
        /*1.indexOf에서 먼저 Java의 위치값 파악
        * 2.위치값을 substring 에 사용
        * 3.Java 부터 출력됨
        * */
        System.out.println(s.substring(s.indexOf("Java"), s.indexOf("."))); // 시작 위치부터 끝 위치 "직전"
        // 앞 indexOf = 넣은 값부터 출력 / 뒷 indexOf = 넣은 값 앞까지 출력

        // 공백 제거
        s = "      I love Java.     ";
        System.out.println(s);
        System.out.println(s.trim()); // 앞 뒤 공백 제거

        // 문자열 결합
        String s1 = "Java";
        String s2 = "Python";
        System.out.println(s1 + s2); // JavaPython
        System.out.println(s1 + "," + s2); // Java,Python
        System.out.println(s1.concat(",").concat(s2)); // Java,Python
        // s1의 뒤에 ,를 연결시키고,그다음 s2도 연결시킨다.
        //*concatenate 연결시키다, 연쇄시키다






    }
}
