import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //문자열
        String s = "i like java";
        System.out.println(s.length()); //길이
        System.out.println(s.toUpperCase()); //대문자
        System.out.println(s.toLowerCase()); //소문자
        System.out.println(s.contains("java")); //포함하나요?
        System.out.println(s.indexOf("like")); // like 어디 인덱스에 있나요?
        System.out.println(s.lastIndexOf("v")); // 마지막 인덱스가 v인가요?
        System.out.println(s.startsWith("i")); // i로 시작하나요?
        System.out.println(s.endsWith("i")); // i로 끝나나요?
        System.out.println(s.replace("like","love")); // like를 love로 바꿔주세요.
        System.out.println(s.substring(8)); // 8까지 자르기
        System.out.println(s.trim()); // 앞뒤 공백 제거
        System.out.println(s.concat("and Python")); // 뒤에 결합

        //특수 문자
        /* \n : 줄바꿈
           \t : 탭
           \\ : 역슬래시
           \" : 큰따옴표
           \' : 작은따옴표
         */
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
5. 예약어 X(public, void, static, int, double, float)
6. 대소문자 구분(myName과 myname은 다른 변수)
*/

//상수 : 변하지 않는 값 (ex. final int hour = 15; hour = 20(X))

