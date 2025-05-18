package chap_04;

public class _05_For {
    public static void main(String[] args) {
        // 반복문 For
        // 나코 매장
        System.out.println("어서오세요. 나코입니다.");
        // 또다른 손님이 들어오면?
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        System.out.println("어서오세요. 나코입니다.");
        // 만약에 인사 법이 바뀌면?
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        System.out.println("환영합니다. 나코입니다.");
        // 매장 이름이 바뀌면?
        // 나코 -> 코나
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");
        System.out.println("환영합니다. 코나입니다.");


        // 반복문 사용 For
//        for ( 선언 int i = 0 ; 조건 i < 10 (10이 될때까지 반복함) ; i++ 아니면 i += 1  ) {  // ()괄호 안 값만큼 {} 괄호를 반복
//            ... 수행 명령...
//        }

        System.out.println(" ---- 반복문 사용 ---- ");

        for(int i = 0 ; i < 10 ; i ++ ) {
           /* System.out.println("어서오세요. 나코입니다." + i );
            System.out.println("환영합니다. 나코입니다." + i ); */
            System.out.println("어서오세요. 코나입니다." + i );
        }
       /* 어서오세요. 나코입니다.0
        어서오세요. 나코입니다.1
        어서오세요. 나코입니다.2
        어서오세요. 나코입니다.3
        어서오세요. 나코입니다.4
        어서오세요. 나코입니다.5
        어서오세요. 나코입니다.6
        어서오세요. 나코입니다.7
        어서오세요. 나코입니다.8
        어서오세요. 나코입니다.9
        이후 i=10 이 되었기 때문에 반복문 탈출 */

        //짝수만 출력 (for i 만 적고 엔터)
        //0, 2, 4, 6, 8
        for (int i = 0; i < 10 ; i+= 2) {
            System.out.print(i); // ln 빼면 02468 이런식으로 나옴
        }

        System.out.println();

        //홀수만 출력
        //1, 3, 5, 7, 9
        for (int i = 1; i < 10 ; i += 2) {
            System.out.print(i);
        }

        System.out.println();

        // 거꾸로 숫자
        // 5, 4, 3, 2, 1
        for (int i = 5 ; i > 0 ; i -- ) {
            System.out.println(i);
        }

        System.out.println();

        //1부터 10까지의 수들의 합
        //1+...+10 = 55
        int sum = 0;
        for (int i = 1; i <= 10 ; i++) {
            sum += i;
            System.out.println("현재까지 총합은" + sum + "입니다.");
        }
        System.out.println("1부터 10까지의 모든 수의 총합은 " + sum + "입니다.");



    }
}
