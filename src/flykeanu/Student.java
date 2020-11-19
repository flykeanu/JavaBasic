package flykeanu;


public class Student {

    int num;
    String name;
    String address;
    String birthday;
    String major;
    String professor;

    public Student(int num, String name, String address, String birthday, String major, String professor){

        this.num = num;
        this.name = name;
        this.address =  address;
        this.birthday = birthday;
        this.major = major;
        this.professor = professor;

    }

    public Student(){   //매개변수가 대입이 되기때문에 에러는 나지 않지만 혼동을 방지하기 위해 this 를 붙이는게 낫다
        num = 201000000;
        name = "홍길동";
        address =  "다산중앙로82번길";
        birthday = "1987.11.10";
        major = "컴퓨터";
        professor = "500";
    }
    //기본생성자로 만든 객체 내용 출력



    public void print_1() {

        System.out.println("학번 : " + num);
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + address);
        System.out.println("birthday : " + birthday);
        System.out.println("전공 : " + major);
        System.out.println("담당교수 : " + professor);

    }
}








