/**
 클래스와 인터페이스간 형 변환
 특정 객체가 자식클래스와 페이스 타입에서
 부모클래스와 인터페이스 타입 또는 반대로 형변환 하는 것을 의미한다
 **/

public class OOPcasting {
    public static void main(String[] args) {

        Unit u1 = new Unit();
        Marine m1 = new Marine();
        Firebat f1 = new Firebat();

        Unit m2 = new Marine();
// Marine 객체는 자동으로 Unit 객체로 형변환
        u1.attack();
        m1.attack();
        f1.attack();

        m2.attack();

        Marine m3 = (Marine)m2;
        m3.attack();
        /**
        컴파일시에는 오류가 나지 않지만
        실행시 오류가 발생한다
         Downcasting 조건이 맞지 않기 때문인데
         Unit 변수는 Marine 객체를 Unit 객체로 만든 것이기 때문
         따라서 Marine 객체로의 형변환이 가능하다
        **/
        //Unit 객체를 Firebat 객체로 형변환하려면
        //명시적 형변환이 필요하다
        //이런류의 변환을 다운캐스팅(DownCasting) 이라고 한다


        /**
         이처럼 상속관계에 있는 클래스간의 객체 생성시
         자식클래스 타입의 객체를 부모클래스 타입의 객체로
         선언하는 경우 업캐스팅(Upcasting) 이라고 한다
         **/
    }
}

class Unit{
    protected int hp;
    protected int ap;
    public void attack(){
        System.out.println("공격중입니다...");
    }
}

class Marine extends Unit{

    @Override
    public void attack() {
        System.out.println("해병이 공격중입니다...");
    }
}

class Firebat extends Unit{
    @Override
    public void attack() {
        System.out.println("화염방사병이 공격중입니다...");
    }
}

