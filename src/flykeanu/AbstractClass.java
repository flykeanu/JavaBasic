package flykeanu;
/**
//추상클래스
//추상메서드를 포함하는 클래스
//추상메서드 : 메서드의 선언부만 있고, 몸체가 없는 메서드
//메서드의 몸체는 이것을 상속하는 자식클래스에서 정의한다
//추상클래스는 불완전 클래스이므로 객체화할 수 없음
 //추상메서드나 추상클래스는 abstract 라는 키워드를 사용한다

**/


public class AbstractClass {
    public static void main(String[] args) {


        Cat2 c2 = new Cat2();
        System.out.println(c2.cry());

        Dog2 d2 = new Dog2();
        System.out.println(d2.cry());
    }
}
abstract class Animal2 {
    protected int weight;

    abstract protected String cry(); //추상메서드

}

class Dog2 extends Animal2 {

    @Override
    protected String cry() {
        return "멍~멍멍멍멍멍";

    }
}
class  Cat2 extends Animal2{

    @Override
    protected String cry(){
        return "야옹~야옹~";
    }
}