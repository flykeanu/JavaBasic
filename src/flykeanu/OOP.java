package flykeanu;

    public class OOP {

              String name;
        String job;
        int age;
        String gender;
        char bloodType;

    public static void main(String[] args) {

        //각 변수별로 값을 대입하는 것은 다소 불편
        //생성자를 이용해서 좀 더 편하게 값을 대입할 수 있다


       Person choi = new Person();
        Person kim = new Person();
        Person lee = new Person();


        OOP p1 = new OOP();
            p1.name = "Sandra";
            p1.job = "Doctor";
            p1.age = 20;
            p1.gender = "female";
            p1.bloodType = 'A';

        //기본 생성자로 초기화된 변수 확인

        System.out.println(choi.name);
        System.out.println(lee.name);
        System.out.println(kim.name);


        System.out.println(p1.name);
        System.out.println(p1.job);
        System.out.println(p1.age);
        System.out.println(p1.gender);
        System.out.println(p1.bloodType);

        //생성자(constructor)
        //public 클래스명(매개변수,...){
        //변수 초기화
        //}
    }


}
