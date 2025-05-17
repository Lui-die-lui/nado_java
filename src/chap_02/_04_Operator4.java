package chap_02;

public class _04_Operator4 {
    public static void main(String[] args) {


        // 논리 연산자
        boolean 김치찌개 = false;
        boolean 계란말이 = true;
        boolean 제육볶음 = true;

        System.out.println(김치찌개 || 계란말이 || 제육볶음); // || = or (3개중에 하나라도 true면 true) = true (괜찮은 식당)

        //boolean 김치찌개 = false;
        //boolean 계란말이 = false;
        //boolean 제육볶음 = true;

        //System.out.println(김치찌개 || 계란말이 || 제육볶음); // = true

        //boolean 김치찌개 = false;
        //boolean 계란말이 = false;
        //boolean 제육볶음 = false;

        //System.out.println(김치찌개 || 계란말이 || 제육볶음); // = false (셋중 하나도  true가 없기 때문)

        boolean 김치찌개2 = true;
        boolean 계란말이2 = true;
        boolean 제육볶음2 = true;

        System.out.println(김치찌개2 && 계란말이2 && 제육볶음2); // && = 셋 다 모두 true 일때만 true (최고의 식당)

        //boolean 김치찌개2 = false;
        //boolean 계란말이2 = true;
        //boolean 제육볶음2 = true;

        //System.out.println(김치찌개2 && 계란말이2 && 제육볶음2); // = false

        // And 연산 - 연산 전체가 true 여야만 true
        System.out.println((5 > 3) && (3 > 1)); //5는 3보다 크고, 3은 1보다 크다 / 두 식 모두 true 일때 - true
        System.out.println((5 > 3) && (3 < 1)); //5는 3보다 크고, 3은 1보다 작다 - false

        // Or 연산 - 연산 하나만 true 여도 true
        System.out.println((5 > 3) || (3 > 1)); //5는 3보다 크거나, 3은 1보다 크다 - true 둘다 true
        System.out.println((5 > 3) || (3 < 1)); //5는 3보다 크거나, 3은 1보다 작다 - true 하나만 true
        System.out.println((5 < 3) || (3 < 1)); //5는 3보다 크거나, 3은 1보다 작다 - false 둘다 false, 값도 false

        //System.out.println(1 < 3 < 5); - 불가능한 코드
        //괄호가 없어도 연산 결과는 동일! but 가독성 신경쓸것

        //논리 부정 연산자 !-값을 반대로 냄
        System.out.println(!true); // false
        System.out.println(!false); // true
        System.out.println(!(5 == 5)); // 5는 5와 같지 않다 - false
        System.out.println(!(5 == 3)); // 5는 5와 같지 않다 - true


    }
}
