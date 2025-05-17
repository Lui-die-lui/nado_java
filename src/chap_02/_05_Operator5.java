package chap_02;

public class _05_Operator5 {
    public static void main(String[] args) {
        // 삼항 연산자
//        결과 = (조건) ? (참의 경우 결과값) : (거짓의 경우 결과값)
//        int x = 5;
//        int y = 3;
//        int max = (x > y) ? x : y;
//        System.out.println(max); // int 변수 값으로 나옴 - 5 (x가 더 크기때문에 참)

        int x = 3;
        int y = 5;
        int max = (x > y) ? x : y;
        System.out.println(max); // = 5 (x가 더 작기때문에 거짓)

        int min = (x < y) ? x : y;
        System.out.println(min); // = 3 (y가 더 크기 때문에 참)

        x = 3;
        y = 3;
        boolean b = (x == y) ? true : false; // == - x,y값이 같은가?
        System.out.println(b);

        String s = (x != y) ? "달라요" : "같아요"; // x,y값이 같지 x? / 거짓 / 아니다. 같다.
        System.out.println(s); // 같아요

        String s1 = (x <= y) ? "네" : "아니요"; // y가 x보다 크거나 같다 / 참 / 네
        System.out.println(s1); // 네
    }
}
