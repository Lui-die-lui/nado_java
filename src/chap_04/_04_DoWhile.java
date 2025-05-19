package chap_04;

public class _04_DoWhile {
    public static void main(String[] args) {

    // 반복문 DoWhile
    int distance = 25; // 전체 거리 25m
    int move = 0; // 현재 이동 거리 0m
    int hight = 2; // 키 2m
    while (move + hight < distance) {
        System.out.println("발차기를 계속 합니다.");
        System.out.println("현재 이동 거리 : " + move);
        move += 3;
    }
        System.out.println("도착했습니다.");

    //키가 엄청나게 큰 사람?

        System.out.println("----반복문 #1----");

    move = 0;
    hight = 25; // 키가 25m
        while (move + hight < distance) {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move);
            move += 3;
        }
        System.out.println("도착했습니다."); // while 값이 distance와 같기때문에 false라서 처음부터 한번도 실행되지 않음

        System.out.println("----반복문 #2----");

        //Do While 반복문 -  do 첫 출력은 항상 일어남.
        move = 0;
        hight = 2;
        do {
            System.out.println("발차기를 계속 합니다.");
            System.out.println("현재 이동 거리 : " + move + "m.");
            move += 3; // 3m이동
        } while ( move + hight < distance ); //25+3=28 < 25 이기 때문에 false

        System.out.println("도착했습니다.");

    }
}