package flykeanu;

public class BeautyStudent {

    int num;
    String name;
    String address;
    String birthday;
    String major;
    String professor;

    public void print(){

        System.out.println("학번 : " + num);
        System.out.println("이름 : " + name);
        System.out.println("주소 : " + address);
        System.out.println("birthday : " + birthday);
        System.out.println("전공 : " + major);
        System.out.println("담당교수 : " + professor);

    }

    public static void main(String[] args) {

        BeautyStudent s1 = new BeautyStudent();

        s1.num = 201350050;
        s1.name = "김태희";
        s1.address = "경기도 고양시";
        s1.birthday = "1985.3.22";
        s1.major = "컴퓨터";
        s1.professor = "504";

        s1.print();





    }


}
