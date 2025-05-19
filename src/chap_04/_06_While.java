package chap_04;

public class _06_While {
    public static void main(String[] args) {
        // 반복문 While - 어떤 조건 while(조건) 이 참일동안 반복 수행
        //수영장에서 수영을 하는 모습
        int distance = 25; // 전체 거리 25m
        int move = 0; // 현재 이동 거리 0m
        while ( move < distance ) { // 현재 이동 거리가 전체 거리보다 작다는 조건이 참인 동안 반복 수행
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move + "m.");
            move += 3; // 코드 수행될때마다 3 미터씩 이동 - 탈출을 위해 무조건 필요
        }
        System.out.println("도착하였습니다.");

        // 무한 루프
//        move = 0;
//        while ( move < distance ) { // 현재 이동 거리가 전체 거리보다 작다는 조건이 참인 동안 반복 수행
//            System.out.println("발차기를 계속 합니다.");
//            System.out.println("현재 이동 거리 : " + move + "m.");
//        }
//        System.out.println("도착하였습니다.");
    }
}
