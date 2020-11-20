package flykeanu;

public class Overloading {

    /**
     * 메서드 다중정의
     * 객체지향 3대 중요개념 중 하나인 다형성에 해당
     * 같은 이름의 메서드를 중복해서 정의하는 것을 의미
     * 한 클래스에 같은 이름의 메서드가 2개 이상 존재할 수 있음
     * 이때 메서드의 서명만 다르게 작성한다면 정의가능하다
     **/
}
    class NonOverloading {
        //간단한 덧셈 프로그램


        public int AddIntegerTwo(int a, int b) {         // 1. 정수 2개를 더하는 프로그램
            int c;
            c = a + b;
            return c;
        }

        public double AddDoubleTwo(double x, double y) {         // 2. 실수 2개를 더하는 프로그램
            double z;
            z = x + y;
            return z;

        }

        public int AddIntegerThree(int p, int q, int g) {        // 3. 정수 3개를 더하는 프로그램
            int f;
            f = p + q + g;
            return f;
        }

    }
    /**
     * 생성한 메서드마다 이름을 제가각으로 정해야하므로
     * 개발자가 일일히 기억해서 사용해야 하는 불편을 초래한다
     *
     *
     **/

    class ApplyOverloading{
        public int plus(int s, int d){
           return s + d;
        }

        public double plus(double s, double d){
            return s + d;
        }
        public int plus(int s, int d, int e){
            return s + d + e;
        }
        /** 메서드 다중정의를 적용하면 메서드의 이름을 하나로 통일해서  작성하는 것이 가능해진다
         * 개발자가 외울 메서드의 이름이 줄어드는 장점이 있다
         *  단, 메서드를 어떻게 호출할지만 알고 있으면 됨

         **/
    }

