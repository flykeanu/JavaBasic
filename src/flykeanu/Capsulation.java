package flykeanu;

public class Capsulation {



    /*private 선언된 멤버변수
    객체명.변수명으로 값을 대입하거나 읽어서 출력할 수 없다
    */



    //캡슐화
    //클래스와 멤버변수 선언시 정보의 은닉정도를 부여
    //정보은닉 : 사용자가 굳이 알 필요가 없는 정보는 가려서 보이지 않도록 하는 기법
    //최소한의 정보만으로 보안을 구현한다.

    //자바에서 지원하는 4가지 접근 제한자
    //public > default > protected > private

    public static void main(String[] args) {

        Person2 p = new Person2();

       // p.setName("홍길동");

       //p.name = "홍길동";

       //System.out.println(p.getName());
        //name 이라는 멤버변수의 값을 출력하려면
        //getter 메서드를 이용함

    }

}
