package chap_04;

public class Quiz_04 {
    public static void main(String[] args) {
        /*Quiz
        * 조건문을 활용하여 주차 요금 정산 프로그램을 작성하시오
        * 조건
        * 주차 요금은 시간당 4000원(일일 최대 요금은 30000원)
        * 경차 또는 장애인 차량은 최종요금에서 50% 할인
        * 주차요금 예시
        * 일반 차량 5시간 주차 시 20000원
        * 경차 5시간 주차 시 10000원
        * 장애인 차량 10시간 주차 시 15000원*/

        int hour = 5; //주차
        boolean isSmallCar = true; //경차 여부
        boolean withDisabledPerson = false; // 장애인 차량 여부
        int fee = hour * 4000; //시간당 4000원

        //30000원 초과 시 일일 최대 요금으로 수정

        if (fee > 30000) {
            fee = 30000;//일일 최대요금 적용
        }

        if (isSmallCar||withDisabledPerson) {
            System.out.println(fee/=2); // 50% 할인 적용
        }
        System.out.println("주차 요금은" + fee + "원 입니다." );


    }
}
