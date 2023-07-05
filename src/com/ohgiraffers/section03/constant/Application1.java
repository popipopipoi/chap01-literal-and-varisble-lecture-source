package com.ohgiraffers.section03.constant;

public class Application1 {
    public static void main(String[] args) {
        /* 상수에 대해 이해하고 사용할 수 있다. */

        /* 1. 상수 선언
         * 상수 선언 시 자료형 앞에 final 키워드를 붙인다. */
        //상수로 선언할때는 변수랑 다르게 대문자로 입력한다.
        final int AGE;

        /* 2. 초기화 */
        AGE = 20;
        //AGE = 30; //한 번 초기화 한 이후 값을 재 대입하는 것은 불가능하다.

        /* 3. 필요한 위치에 상수를 호출해서 사용한다. */
        /* 3-1. 출력 구문에서 사용 */
        System.out.println("AGE의 값 : " + AGE);
        /* 3-2. 필요시 연산식에 호출해서 사용 */
        System.out.println("AGE의 2배 : " + (AGE * 2));
        /* 대입 연산자의 오른편에 값으로 사용하는 것은 문제 없음 */
        int sum = AGE;
    }
}
