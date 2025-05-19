package chap_04;

public class _08_NastedLoop {
    public static void main(String[] args) {
        //이중 반복문

        //별 (*) 사각형 만들기
        /*
        ******
        ******
        ******
        ******
        ******
        * */

        for (int i = 0; i < 5; i++) {
            System.out.print("*");
            System.out.print("*");
            System.out.print("*");
            System.out.print("*");
            System.out.print("*");
            System.out.println();
        }

        System.out.println();

        for (int i = 0 ; i < 5 ; i++) {
            for (int j = 0; j < 5 ; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // 별 (*) 왼쪽 삼각형 만들기

        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < i + 1 ; j++) { //i가 1,2,3,4,5순으로 커져야함
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();


        for (int i = 0; i <= 5 ; i++) { // 세로로 5번 반복
            for (int j = 0; j < i ; j++) { //안의 값이 먼저 실행 - <= 이면 같거나 의 값이 들어가서 한번 더 실행되어 별6개짜리 한번 더
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        // 별 (*) 오른쪽 삼각형 만들기
        /*
               *
              **
             ***
            ****
           *****

         */
        System.out.println("--------");

        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 4 - i ; j++) {
                System.out.print("s"); // 먼저 출력
            }
            for (int k = 0; k <= i ; k++) {
                System.out.print("*"); // 다음 출력

            }
            System.out.println();
        }

        System.out.println("--------------");

        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 4 - i ; j++) { //" "를 4번 출력 먼저 하고 값이 진행될때마다 커지는 i의 값만큼 빼면 서서히 줄어듦
                System.out.print(" ");
            }
            for (int k = 0; k <= i ; k++) { // i가 반복될때마다 같이 커지기 때문
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("----------------");

        for (int i = 0; i < 8 ; i++) {
            for (int j = 0; j < 7 - i ; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i ; k++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
}
