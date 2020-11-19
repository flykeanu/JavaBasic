package flykeanu;

public class StudentMain2 {

        public static void main(String[] args) {

            Student s1 = new Student();

            s1.num = 201350050;
            s1.name = "김태희";
            s1.address = "경기도 고양시";
            s1.birthday = "1985.3.22";
            s1.major = "컴퓨터";
            s1.professor = "504";

            s1.print_1();

            Subject p1 = new Subject();

            p1.subj_Name = "컴퓨터공학";
            p1.phone_Num = "123-4567-8901";
            p1.loc = "E동 2층";
            p1.subj_Header = "504";

            p1.print2();

            Professor t1 = new Professor();

            t1.pro_Num = 301;
            t1.pro_name = "이순신";
            t1.major_field = "프로그래밍";

            t1.print3();

        }   //main
    } //StudentMain2



