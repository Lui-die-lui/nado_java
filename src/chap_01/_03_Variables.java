package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
//        Strig name;
//        name "Lui";
//        아래와 동일
        String name = "Lui";
        int hour = 15;


        System.out.println(name + "님, 배송이 시작됩니다." + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님, 배송이 완료되었습니다.");

        double score = 90.5; //실수 변수
        char grade = 'A';//문자 변수 - 한 문자 ''
        name = "Nabell";//name 업데이트

        System.out.println(name + "님의 평균점수는" + score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;//boolean은 true,false - 참 거짓 판별
        System.out.println("이번 시험에 합격했을까요?" + pass);

        double d = 3.1412341234;
        float f = 3.1412341234f;//float는 무조건 f or F 붙여야함
        //double / float 구별해서 사용해야하는 이유
        /*
        -함수에 float 나 double 중 하나의 값만 사용 가능하다 명시되는 경우가 있음
        -double은 실수를 담을 수 있는 용량이 큰 변수이므로, 적은 값의 실수는 굳이 용량 늘려가며 사용 할 필요 없음
        -but 실제 사용되는 실수 변수는 double이 많은 편 (정밀도 + 범위가 더 넓기 때문)
        -float가 담을 수 있는 용량은 한계가 있음
         */
        System.out.println(d);
        System.out.println(f);

//        int i + 1000000000000; = 정수 범위 초과 (21억까지)
        long l = 1_000_000_000_000l; //long 은 int 보다 큰 범위 (_를 , 대신 사용 = 출력값에는 잡히지 않음)

//        int - long - float - double
//        char , string , boolean


    }
}
