package chap_03;

public class _01_String1 {
    public static void main(String[] args) {
        String s = "I like Java and Python and C."; // 선택 후 29 char 라고 오른쪽 하단에 뜸
        System.out.println(s);

        // 문자열의 길이
        System.out.println(s.length()); // s.입력시 뜨는 length 선택 - 29
        //ex) 특정 글자 수 보다 많이 써달라고 지시할때 사용하기 좋음

        // 대소문자 변환
        System.out.println(s.toUpperCase()); // s.입력시 뜨는 toUpperCase 선택 - I LIKE JAVA AND PYTHON AND C.(전부 대문자)
        System.out.println(s.toLowerCase()); // s.입력시 뜨는 toLowerCase 선택 - i like java and python and c.(전부 소문자)

        // 포함 관계 - 찾고싶은 문구가 문장 내에 있는지 알아봄
        System.out.println(s.contains("Java")); // 포함된다면 true / 포함되지 않는다면 false - true
        System.out.println(s.contains("C#")); // 포함된다면 true / 포함되지 않는다면 false - false
        System.out.println(s.indexOf("Java")); // 위치 정보 - 7번째 있다고 뜸 / 문자열 첫번째 위치가 0
        System.out.println(s.indexOf("C#")); // 위치 정보 - 포함되지 않는 값은 -1로 뜸
        System.out.println(s.indexOf("and")); // 처음 일치하는 위치 정보 - 12
        System.out.println(s.lastIndexOf("and")); // 마지막에 일치하는 위치 정보 - 23
        System.out.println(s.startsWith("I like")); // 해당 문자열로 시작하면 true / 아니면 false - true
        System.out.println(s.endsWith(".")); // 해당 문자열로 끝나면 true / 아니면 false - true



















    }
}

