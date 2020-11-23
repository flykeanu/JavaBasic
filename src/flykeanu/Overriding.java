package flykeanu;

//메서드 재정의 override
//객체지향 중요 3대개념중 다형성에 해당
//상속관계에 있는 상위클래스의 메서드를
//하위클래스에서 같은 이름의 메서드로 다시 작성하는 것을 의미한다
//즉, 상속받은 메서드를 새로 정의해서 사용하는 것을 말한다

public class Overriding {
    public static void main(String[] args) {
        Animal an = new Animal();       //부모클래스를 객체화
        System.out.println(an.cry());

        Cat ca = new Cat();
        System.out.println(ca.cry());

        Dog dg = new Dog();
        System.out.println(dg.cry());

    }


}


class Animal {
    protected String cry() {
        return "동물이 웁니다";
    }
}
/**
//@Override 의 의미는 cry가 Cat의 자체 메서드가 아니라 상속을 받아
//재정의한 메서드라는 의미이다
 //개발자와 컴파일러가 이해하기 위한 또 하나의 주석문이라고 이해하면 된다
**/
    class Cat extends Animal{
        @Override
        protected String cry() {
            return "야옹~야옹~";
        }
    }

    class Dog extends Animal{
        @Override
        protected String cry() {
            return "멍멍~멍멍~";
        }
    }
