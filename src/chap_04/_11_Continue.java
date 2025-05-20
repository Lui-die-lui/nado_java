package chap_04;

public class _11_Continue {
    public static void main(String[] args) {
        // Continue

        // 치킨 주문 손님중에 노쇼 손님이 있다고 가정
        //For
        int max = 20; // 최대 치킨 판매 수량
        int sold = 0; // 현재 치킨 판매 수량
        int noShow = 17; // 대기번호 17번 노쇼 손님
        for (int i = 1 ; i <= 50 ; i++) {
            System.out.println(i + "번 손님 주문하신 치킨 나왔습니다.");

            //손님이 없다면? (noShow)
            if (i == noShow) {
                System.out.println(i + "번 손님 노쇼로 인해 다음손님에게 기회가 넘어갑니다.");
                continue; // 이 코드는 계산하지 않고 다음 증감으로 넘어감
            }

            sold++; // 판매 처리
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }

        }System.out.println("영업을 종료합니다."); // 17번 건너뛰고 21번까지 가져감


        System.out.println("------------------------------");
        //While 문
        sold = 0;
        int index = 0; // 원래는 1
        while (index < 50) { // 아래 차례대로 쭉쭉 내려갔다가 반복됨 원래는 <=
            index++; // 한번 만 넣어도 아래 문장들에 적용됨 - 위 변수들 변경한건 이것때문
            System.out.println(index + "번 손님 주문하신 치킨 나왔습니다.");

            //손님이 없다면 (noShow)
            if (index == noShow ) {
                System.out.println(index + "번 손님 노쇼로 인해 다음손님에게 기회가 넘어갑니다.");
//                index++; //while 문에서는  index++이 따로 없음 noShow 값이랑 같을때만 실행됨
                continue;
            }
            sold++;
            if (sold == max) {
                System.out.println("금일 재료가 모두 소진되었습니다.");
                break;
            }
//            index++;
        }
        System.out.println("영업을 종료합니다.");













    }
}
