package chap_04;

public class _09_MultipleTable {
    public static void main(String[] args) {
        // 구구단
        // 2 * 1 = 2
        // 2 * 2 = 4

        for (int i = 2 ; i < 10 ; i++) { // i = 구구단 시작 하는 수 ; 구구단은 9까지, 10보다 작게
            int j = 1;
            System.out.println(i + "*" + j + "=" +(i * j)); // 2 * 1 = 2
            j++;
            System.out.println(i + "*" + j + "=" +(i * j)); // 2 * 2 = 4
            j++;
            System.out.println(i + "*" + j + "=" +(i * j)); // 2 * 3 = 6
            System.out.println();
        }

        for (int i = 2 ; i < 10 ; i++) {
            for (int j = 1 ; j < 10 ; j++) {
                System.out.println(i + "x" + j + "=" +(i * j)); // 안쪽 값 먼저 9번 출력 - 바깥 for 문 i 값 1 +됨
            }
            System.out.println();

        }



        }
    }

