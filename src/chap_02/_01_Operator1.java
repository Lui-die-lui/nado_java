package chap_02;

public class _01_Operator1 {
    public static void main(String[] args) {
        // 산술 연산자

        // 일반 연산
        System.out.println(4 + 2); // 덧셈 = 두 정수 사이 + = 6
        System.out.println(4 - 2); // 뺄셈 = 두 정수 사이 - = 2
        System.out.println(4 * 2); // 곱셈 = 두 정수 사이 * = 8
        System.out.println(4 / 2); // 나눗셈 = 두 정수사이 / = 2
        System.out.println(5 / 2); // 정수 계산 = 소숫점 없이 정수만 출력됨 = 2
        System.out.println(2 / 4); // = 0
        System.out.println(4 % 2); // 4를 2로 나눴을때의 나머지값 = 0 / 나머지 연산
        System.out.println(5 % 2); // = 1 /나머지 연산

        //우선 순위 연산
        System.out.println(2 + 2 * 2); // 수학 연산과 동일 - 곱셈 먼저 = 6
        System.out.println((2+2)*2); // = 8
        System.out.println(2 + (2 * 2)); // 괄호 안 연산이 우선순위가 되어야 할때 사용 = 6

        //변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c); // 30

        c = a - b;
        System.out.println(c); // 10

        c = a * b;
        System.out.println(c); // 200

        c = a / b;
        System.out.println(c); // 2

        c = a % b;
        System.out.println(c); // 0

        //증감 연산 ++, --
        int val;
        val = 10;
        System.out.println(val); // 10
        System.out.println(++val); // 11
        //val 앞에 ++가 붙었기 때문에 위 코드 실행과 동시에 값이 11이 됨
        System.out.println(val++); //11
//        val = val + 1과 같은 값
//        val++;//문장을 먼저 수행하고 값 +1
//        ++val;//연산을 먼저 수행하고 값 +1

        val = 10;
        System.out.println(val); // 10
        System.out.println(val++); // 10
        //val뒤에 ++가 붙었기 때문에 위 코드가 실행 되고 난 다음 아래 코드에서 값이 변경됨
        System.out.println(val); //11

        val = 10;
        System.out.println(val); // 10
        System.out.println(--val); // 9
        System.out.println(val); // 9

        val = 10;
        System.out.println(val); // 10
        System.out.println(val--); // 10
        System.out.println(val); // 9

        val = 10;
        System.out.println(val); // 10

        //은행 대기번호 표
        int waiting = 0;
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 0
        // 처음 대기한 인원 + 1 된 값으로 다음 결과 적용
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 1
        //대기 표를 다음 고객이 뽑을때마다 1.뽑고나서 2.더해짐
        System.out.println("대기 인원 : " + waiting++); // 대기 인원 : 2
        //이제  waiting의 값은 ++ 3번 값으로 더해진 값이 출력 됨
        System.out.println("총 대기 인원 : " + waiting); // 총 대기 인원 : 3


    }
}
