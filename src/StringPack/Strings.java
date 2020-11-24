/**
 C언어에서는 문자열은 char형 배열로 표현하지만
 자바에서는 문자열 처리를 위한 별도의 String 클래스를 제공한다

 String 클래스의 객체는 한번 생성되면
 그 값을 읽기만 가능하고 변경할 수 없는 불변 객체이다
 따라서 + 연산자로 문자열을 결합하는 경우에
 기존의 문자열이 변경되는 것이 아니고 각각의 내용을 합쳐 새로운 객체를 생성
 하는 것이다

**/
public class Strings {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";
        str1 = str1 + str2;
        str1 = str1 + "WOW";

        /**
        => StringBuffer, StringBuilder 를 써서 메모리 낭비를 피할 것을 추천한다

         **/

        StringBuffer sb = new StringBuffer();
        sb.append("Hello").append("World").append("WOW");
        System.out.println(sb);

        /**
        문자열을 서로 비교할 때, 문자열 상수 pool 이라는 개념을 이해해야 한다
         a 라는 객체를 생성한다고 할때 "Hello"를 SCP(메모리 공간)에 저장한다
         b라는 객체를 또 하나 선언한다고 할때 SCP(메모리 공간)에 이미 존재하므로 값이 저장된
         위치만 저장한다(주소값을 이용해서 같은 값을 가리키도록 한다)
         c라는 객체를 생성하면 새로운 위치에 "Hello" 를 생성

         ★문자열 변수간 비교에서 == 연산자는 값을 비교하는 것이 아니고
         값이 저장된 메모리상의 위치를 비교한다★

         ☆그러므로 문자열간 값을 비교할때는 equals 메서드를 사용해야 한다☆


        **/
        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");    //new 연산자를 썼기 때문이다

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
        System.out.println(c == a);

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(b.equals(c));


    }
}
