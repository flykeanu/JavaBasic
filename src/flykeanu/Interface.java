package flykeanu;
/**
//인터페이스
//추상메서드와 상수만으로 구성된 특수한 클래스
//어떤 클래스를 만들때 추상메서드를 통해
//기본이 되는 틀을 제공하여 규칙에 맞춰 코드를 짤 수 있게 한다
 //★interface는 접근제한자가 public 으로 되어야한다★
 //클래스와는 달리 다중상속을 지원한다

 //인터페이스 작성시 interface 를 사용
 //인터페이스를 구현할때는 implements 를 사용
 **/

public class Interface {
    public static void main(String[] args) {
        Cat3 c3 = new Cat3();
        System.out.println(c3.cry());

        Dog3 d3 = new Dog3();
        System.out.println(d3.cry());

    }
}
class Animal3{
    protected int weight;
    protected  int heigt;
    }

    interface Animal3Action{
    public static String COLOR = "brown";
        //static String COLOR = "brown";
        //String COLOR = "brown";
    abstract String cry();
    }

    class Cat3 extends Animal3 implements Animal3Action{

        @Override
        public String cry() {
            return "야옹~야옹~야옹~야옹~";
        }
    }

    class  Dog3 extends Animal3 implements Animal3Action{
        @Override
        public String cry() {
            return "왈왈왈왈 크르르르르르릉";
        }
    }

    class Murloc extends Animal3 implements Animal3Action{

        @Override
        public String cry() {
            return "아우우우우우우우우";
       }
    }