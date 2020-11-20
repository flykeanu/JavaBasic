package SungJukV5Pack;

public class SungJukV5Main {

    public static void main(String[] args) {

        SungJukService sjsrv = new SungJukService();

        SungJukVO sj = sjsrv.readSungJuk();

        sjsrv.computeSungJuk(sj);

        sjsrv.printSungJuk(sj);

        /** 변수의 유효범위 scope
         * 변수가 생성된 위치와 사용하는 위치가 다른 경우
         * 그 결과가 개발자의 예상과는 다를 수 있다
         * 변수의 유효범위는 블록으로 { } 로 표현하는데
         * 기본자료형 변수 : call by value
         * 참조자료형 변수 : call by reference
         **/



// SungJukV5Main --> SungJukVO --> SungJukService


        }
    }




