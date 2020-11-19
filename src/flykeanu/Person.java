package flykeanu;

    public class Person {

        //매개변수명과 멤버변수명이 같은 경우
        //변수가 Shadowing 현상이 발생한다.
        //클래스의 멤버변수임을 명확하게 표현하기 위해
        //변수명 앞에 this 라는 키워드를 추가 작성

        public Person(String name, String job, int age, String gender, String blood){

            this.name = name;
            this.job = job;
            this.age = age;
            this.gender = gender;
            this.bloodType = bloodType;
        }

        public Person(){
            name = "홍길동";
            job = job;
            age = 18;
            gender = gender;
            bloodType = bloodType;

        } //매개 변수를 사용하는 생성자


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


        Person p1 = new Person();
            p1.name = "Sandra";
            p1.job = "Doctor";
            p1.age = 20;
            p1.gender = "female";
            p1.bloodType = 'A';

        //기본 생성자로 초기화된 변수 확인

        System.out.println(choi.name);
        System.out.println(lee.name);
        System.out.println(kim.name);

        Person Song = new Person("준호", "취업준비생", 30,"남","0");


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
