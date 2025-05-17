package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {

        //형 변환 TypeCasting
        //정수형 -> 실수형
        //실수형 -> 정수형 변환 할때 쓰임

//    int score = 93+98.8; - 정수 + 실수(double) 이라 변환을 안하면 값이 성립이 안됨
//    int score = 93.2+98.8; - 계산된 값이 정수더라도 연산에 실수(double) 이기 때문에 성립 안됨


        // int to float, double 정수 -> 실수
        int score = 93;
        System.out.println(score); // 93
        System.out.println((float) score); // 93.0 - 변수 앞 괄호 내 변환하고싶은 변수 형태를 넣음
        System.out.println((double) score); //93.0 - 이하 동문

        // float, double to int 실수 -> 정수
        float score_f = 93.3f;
        double score_d = 98.8;
        System.out.println((int) score_f); // 93
        System.out.println((int) score_d); //98
        //정수로 변환 됨, 뒤의 실수 값 잘림

        //정수 + 실수 연산
        score = 93 + (int) 98.8; //실제 연산은 93 + 98
        System.out.println(score); //191

        score_d = 93 + 98.8;
        // 정수 + 실수 계산이라도, 앞의  score_d 가 double(실수) 값이기 때문에 자동으로 double로 들어감
        //score_d = (double)93 + 98.8; -> 실제 연산은 93.0 + 98.8 임
        System.out.println(score_d); // 191.8


        // 변수에 형변환된 데이터 집어넣기
        double convertedScoreDouble = score; // 정수형 데이터가 문제없이 더블 내로 들어감
        System.out.println(convertedScoreDouble); // 191.0 실수(double 값으로 들어감)
        // int -> long -> float -> double 단순하고 작은것에서 정교하고 넓은것으로 갈때 안전함
        // 정수(int) 타입이었던 score를 double 타입 변수에 저장하면서 자동 형변환됨
        // 더 작은 범위(int)에서 더 넓은 범위(double)로 가는 것은 안전하므로 별도 변환 없이 가능


        int convertedScoreInt = (int)score_d; // 191.8 -> 191
        System.out.println(convertedScoreInt); // 191
        //int convertedScoreInt = score_d; 소수점이 있는 double(넓은범위)변수 score_d는 자동으로 int(작은범위) 변환이 안됨
        //double -> float -> long -> int


        // 숫자를 문자열로
        String s1 = String.valueOf(93);
        s1 = Integer.toString(93); // toString = 정수를 문자열로 바꿔줌
        System.out.println(s1); // 문자열 93

        String s2 = String.valueOf(98.8);
        s2 = Double.toString(98.8);
        System.out.println(s2); // 실수 98.8 -> 문자열 98.8

        //문자열을 숫자로
        int i = Integer.parseInt("93"); // 문자열 "93"을 정수 93으로
        System.out.println(i);
        double d = Double.parseDouble("98.8"); // 문자열 "98.8 ="을 실수 98.8로
        System.out.println(d);

//        int error = Integer.parseInt("자바"); "자바"는 숫자가 아니기때문에 에러가 남
        // *parse 문장을 분석하다 parseOO은 해석하거나 OO으로 변형해준다








    }
}




