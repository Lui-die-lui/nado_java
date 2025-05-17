package chap_01;

public class _Quiz_01 {
    public static void main(String[] args) {
        /*Quiz
        버스 도착 정보를 출력하는 프로그램을 작성하시오.
        각 정보는 적절한 자료형의 변수에 정의합니다.

        정보
        *버스 번호는"1234", "상암08" 과 같은 형태
        *남은 시간은 분 단위(ex/3분, 5분)
        *남은 거리는 km단위 (ex/1.5km, 0.8km)
         */

        //버스 번호
        int busNum1 = 49;
        int busNum2 = 51;
        String busNum3 = "남구2";
        String busNum4 = "남구5";

        //남은 시간
        int min1 = 4;
        int min2 = 12;
        int min3 = 3;
        int min4 = 6;

        //남은 거리 float or Diuble
        float distance1 = 4.9f;
        float distance2 = 14.5f;
        float distance3 = 2.8f;
        float distance4 = 7.3f;

        // 걸과 출력

        System.out.println("버스 도착 정보 시스템");
        System.out.println(busNum1 + "번 버스의 도착 시간이 약" + min1 + "분 남았습니다. 남은 거리 : " + distance1 + "km");
        System.out.println(busNum2 + "번 버스의 도착 시간이 약" + min2 + "분 남았습니다. 남은 거리 : " + distance2 + "km");
        System.out.println(busNum3 + "번 버스의 도착 시간이 약" + min3 + "분 남았습니다. 남은 거리 : " + distance3 + "km");
        System.out.println(busNum4 + "번 버스의 도착 시간이 약" + min4 + "분 남았습니다. 남은 거리 : " + distance4 + "km");

        System.out.println(" ");

        System.out.println(busNum1 + "번 버스");
        System.out.println("약 " + min1 + "분 후 도착");
        System.out.println("남은 거리 " + distance1 + "km");

        System.out.println(" ");

        System.out.println(busNum2 + "번 버스");
        System.out.println("약 " + min2 + "분 후 도착");
        System.out.println("남은 거리 " + distance2 + "km");

        System.out.println(" ");


        System.out.println(busNum3 + "번 버스");
        System.out.println("약 " + min3 + "분 후 도착");
        System.out.println("남은 거리 " + distance3 + "km");

        System.out.println(" ");

        System.out.println(busNum4 + "번 버스");
        System.out.println("약 " + min4 + "분 후 도착");
        System.out.println("남은 거리 " + distance4 + "km");




    }
}
