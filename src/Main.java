public class Main {
    public static void main(String[] args) {

        // 형 변환 int -> float
        int score = 93;
        float score_f = (float)score;
        System.out.println(score_f);

        // 산술 연산자
        int a = 1; int b = 2;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(++a); //전위 연산
        System.out.println(a++); //후위 연산
        System.out.println(a--);
        System.out.println(a);

        // 대입 연산자
        int num =10;
        num = num + 2;
        System.out.println(num);

        // 복합 연산자
        int number = 10;
        number += 10;
        System.out.println(number);

        // 비교 연산자
        boolean bool = 1 != 2;
        System.out.println(bool);

        // 논리 연산자
        boolean bb = (5>3) || (4>2);
        System.out.println(bb);

        //삼항 연산자
        int x = 3; int y =5;
        int max = x>y ? x:y;
        System.out.println(max);




    }
}
// 기본 자료형 : 실제 데이터 값 저장 (ex.int,float,double,boolean)
// 참조 자료형 : 데이터가 저장된 메모리 주소 값 저장 (ex. string)
// 변수 : 자료 값을 저장 하는 공간 (ex. int hour = 15;)

/*
1. 밑줄,문자,숫자 가능
2. 밑줄 또는 문자로 시작 가능
3. 한 단어 또는 2개 이상 단어의 연속
4. 소문자로 시작, 각 단어의 시작 글자는 대문자(첫 단어 제외)
5.예약어 X(public, void, static, int, double, float)
6. 대소문자 구분(myName과 myname은 다른 변수)
*/

//상수 : 변하지 않는 값 (ex. final int hour = 15; hour = 20(X))

