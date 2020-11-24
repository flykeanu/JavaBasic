public interface Interface2 {
    public static void main(String[] args) {
        Cat4 c4 = new Cat4();
        Dog4 d4 = new Dog4();

        System.out.println(c4.cry());
        System.out.println(d4.cry());
    }
}

/**
    //인터페이스는 대상을 바라보는 관점으로 설명할 수 있다
    // 1. 식당에서 한끼를 해결하려는 손님 입장에서
    // "불닭 돈가스"는 하나의 메뉴이다
    // =>단순한 정보일 뿐 복잡한 정보는 필요없다

    // 2. 식당에서 요리하는 요리사 입장에서
    //"불닭 돈까스"는 하나의 음식이다
    // => 요리이므로 복잡한 정보가 필요하다

    // 3. 식당에서 고객과 요리사를 관리하는 주인의 입장에서
    //"불닭 돈까스"는 하나의 상품이다
    //=>하나의 사업이므로 식당운영에 필요한 정보 필요
//같은 대상이라도 자신의 입장에서 바라보는 시선이 다르다
 //누구나 동일한 시선을 제공해야 할 필요가 있는데
 // => 인터페이스를 강제해서 이것을 해결할 수 있다

 //대부분의 음식점에서 "불닭돈가스"를 요리하고 있는데
 //요리사의 역량에 따라 기본은 지켜가면서
 //제각각의 결과물을 만들어내게 된다
 //어느 음식점을 가더라도 조금의 차이는 존재하지만
 //불닭돈가스라는 음식은 비슷하게 만들어 낼 수 있게 된다


 //기본 base 클래스
 인터페이스를 구현하면 자식클래스에는 추상메서드를
 반드시 재정의해야한다
 만일, 재정의하고 싶지 않거나, 재정의할 필요가 없는데도
 재정의해야하는 불편함을 초래할 수 있으므로
 이때에는 추상클래스를 통해 임의로 구현한 다음에
 이 추상클래스를 상속해서 클래스를 만드는 것이 더 편리하다
 이때 만든 클래스는 기본클래스라고 부른다
 **/




class Animal4{

    protected int height;
    protected int weight;

}

interface Animal4Action{
    String cry();
}

abstract class Animal4Base extends Animal4 implements Animal4Action {

    @Override
    public String cry() {
        return "동물이 울부짖고 있습니다.";
    }
}

class Cat4 extends Animal4Base {

    @Override
    public String cry() {
        return "야옹~야옹~야야야야야야야옹";
    }
}
    class Dog4 extends Animal4Base {

        @Override
        public String cry() {
            return "왈왈왈 크르르르르르르르릉";
        }
    }


