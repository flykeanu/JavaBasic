package flykeanu;

import java.util.ArrayList;

/**
지네릭(Generic)
 데이터 유형을 일반화(통일)한다는 것을 의미한다
 여러 유형의 데이터를 사용하는 클래스의 경우에 매개변수의 유형을
 Object로 선언하는 경우에 때때로 원래의 유형으로 변환해야만 하는
 번거로움이 존재하고 오류가 발생할 수 있는 가능성 또한 존재한다
**/
public class Collections {
    public static void main(String[] args) {
        Object[] zoo = new Object[10];
        /**동물들을 동물원 우리에 가두기
         일반적으로 배열은 동일한 유형의 자료들을 저장하는 구조이다
         하지만 배열의 유형을 Object로 선언하면
         온갖 종류의 자료(data)를 저장할 수 있다


         **/
        zoo[0] = new Tiger();       //Upcasting 적용
        zoo[1] = new Lion();
        zoo[2] = new Zebra();

        /**우리에서 동물을 하나씩 빼내기
        하지만 배열에 저장된 데이터를 추출해낼 때는 적절한 형변환이 꼭 필요하다


        **/
        Tiger t1 = (Tiger)zoo[0];      //타입 불일치 오류 //Downcasting 으로 해결

        Lion l1 = (Lion)zoo[1];

        Zebra z1 = (Zebra)zoo[2];

        /**
        컬렉션 프레임워크(Collection framework)
         다수의 데이터를 쉽고 효과적으로 처리할 수 있도록
         표준화된 방법을 제공하는 클래스이다
         데이터를 저장하는 자료구조와 처리하는 각종 알고리즘을 구조화하여
         클래스로 구현한 것이다
         예를들어 동적배열, 집합, 해키맵, 트리, 큐 등이 있다

        **/
        ArrayList zoo2 = new ArrayList();
        /**
        컬렉션프로임워크에서 제공하는 동적배열
        동적배열의 기본형은 Object 타입이다
        **/
        zoo2.add(new Tiger());
        zoo2.add(new Lion());
        zoo2.add(new Zebra());

        //t1 = zoo2.get(0);
        //t1 = zoo2.get(1);
        //t1 = zoo2.get(2);
        //동적배열을 사용했지만 앞의 경우와 동일하게 형변환시 오류가 발생했다

        /**
        지네릭을 이용하면 데이터의 타입을 통일시켜 컴파일시 타입체크와
         불필요한 형변환을 하지 않아도 된다
         type-parameter <>(다이아몬드라고 부름) 를 이용해서 자료구조의 데이터 유형을
         미리 설정해둔다
        **/
        ArrayList<Tiger> zoo3 = new ArrayList<>();
        zoo3.add(new Tiger());
        zoo3.add(new Tiger());
        // zoo3.add(new Lion()); //미리 설정해둔 자료구조와 불일치해서 에러!
        t1 = zoo3.get(0);
        // 자동으로 형변환 되기 때문에 오류없이 처리가 가능하다

        ArrayList<Lion> zoo4 = new ArrayList<>();
        zoo4.add(new Lion());
        zoo4.add(new Lion());
        zoo4.add(new Lion());

        l1 = zoo4.get(0);

    }
}

class Tiger{}
class Lion{}
class Zebra{}

