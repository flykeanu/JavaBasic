package flykeanu;

 import java.util.Scanner;

public class ScoreV5FunCopyFinalTestVersion {

    String name;
    int eng ;
    int math ;
    int kor ;
    int sum = 0;
    double avg = 0.0;
    char grd = '가';

    void eval_InputScore(){     //ReadSungJuk
        Scanner sc = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        name = sc.nextLine();
        System.out.println("");
        System.out.print(name + "의 점수를 입력하세요 : ");
        eng = sc.nextInt();
        math = sc.nextInt();
        kor = sc.nextInt();

    }


    void eval_sum(){    //ComputerSungJuk1

        sum = eng + math + kor;

    }

    void eval_avg() {   //ComputerSungJuk2

        avg = (double) sum / 3;
    }

    void eval_grade(){    //ComputerSungJuk3

    if (avg >= 90){
            grd = '秀';
            System.out.println("평어는 : " + grd + " 입니다.");

        }
            else if(avg >=80) {
            grd = '優';
            System.out.println("평어는 : " + grd + " 입니다.");

        }
            else if(avg >=70){
                grd = '美';
                System.out.println("평어는 : " + grd + " 입니다.");

                }
         else if(avg >=60) {
            grd = '良';
            System.out.println("평어는 : " + grd + "입니다.");

        }
        else if(avg >=50) {
            grd = '佳';
            System.out.println("평어는 : " + grd + "입니다.");

        }
        else{
                grd = '佳';
                System.out.println("평어는 : " + grd + "입니다.");



        }

        }

    void print(){       //PrintSungJuk

        System.out.println("이름 : " + name);
        System.out.println("영어 : " + eng);
        System.out.println("수학 : " + math);
        System.out.println("국어 : " + kor);
        System.out.println("-------------------------------------");
        System.out.println("합계 : " + sum);
        System.out.println("과목평균과제값(round함수) : " + (double)(Math.round(avg*100))/100);
        System.out.println("과목평균변형 포맷 미적용 : " + avg);
        System.out.printf("평균 : %.1f\n", avg);

    }

    public static void main(String[] args) {

        //첫번째 학생

        ScoreV5FunCopyFinalTestVersion s1 = new ScoreV5FunCopyFinalTestVersion();

        s1.eval_InputScore();
        s1.eval_sum();
        s1.eval_avg();
        s1.eval_grade();
        s1.print();

        //두번째 학생

        ScoreV5FunCopyFinalTestVersion s2 = new ScoreV5FunCopyFinalTestVersion();

        s2.eval_InputScore();
        s2.eval_sum();
        s2.eval_avg();
        s2.eval_grade();
        s2.print();

        //세번째 학생

        ScoreV5FunCopyFinalTestVersion s3 = new ScoreV5FunCopyFinalTestVersion();

        s3.eval_InputScore();
        s3.eval_sum();
        s3.eval_avg();
        s3.eval_grade();
        s3.print();
    }
}




