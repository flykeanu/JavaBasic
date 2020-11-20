package ScorePack;

 import java.util.Scanner;

/**
  파일명 : ScoreV1
 작성일 : 성적처리 프로그램 V1
 이름 , 국어, 영어, 수학점수를 키보드로 입력받아
 총점, 평군, 학점을 계산하고 결과 출력
단, 평균은 소수점 첫째 자리까지 출력하고
학점기준은 '수우미양가'로 하되, switch 문으로 작성하시오


 ***삼항연산자
 (조건식)  ?  : (참일때 결과값)  :  (거짓일때 결과값)


 */

public class ScoreV5FunCopy22 {

    String name;
    int eng ;
    int math ;
    int kor ;
    int sum = 0;
    double avg = 0.0;
    char grd = '가';

    void eval_InputScore(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        name = scanner.nextLine();
        System.out.println("");
        System.out.print(name + "의 점수를 입력하세요 : ");
        eng = scanner.nextInt();
        math = scanner.nextInt();
        kor = scanner.nextInt();

    }


    void eval_sum(){

        sum = eng + math + kor;

    }

    void eval_avg() {

        avg = (double) sum / 3;
    }
    void eval_grade(){

        switch ((int) (avg / 10)) {
            case 10:
                grd = '秀';
                System.out.println("평어는 : " + grd + "입니다.");
                break;

            case 9:
                grd = '秀';
                System.out.println("평어는 : " + grd + "입니다.");
                break;

            case 8:
                grd = '優';
                System.out.println("평어는 : " + grd + "입니다.");
                break;
            case 7:
                grd = '美';
                System.out.println("평어는 : " + grd + "입니다.");
                break;
            case 6:
                grd = '良';
                System.out.println("평어는 : " + grd + "입니다.");
                break;

            default:
                grd = '佳';
                System.out.println("평어는 : " + grd + "입니다.");

                break;
        }

        }




    void print(){

        System.out.println("이름 : " + name);
        System.out.println("영어 : " + eng);
        System.out.println("수학 : " + math);
        System.out.println("국어 : " + kor);
        System.out.println("-------------------------------------");
        System.out.println("합계 : " + sum);
        System.out.println("과목평균과제값(Round함수) : " + (double)(Math.round(avg*100))/100);
        System.out.println("과목평균변형 포맷 미적용 : " + avg);
        System.out.printf("평균 : %.1f\n", avg);

    }

    public static void main(String[] args) {

        //첫번째 학생

        ScoreV5FunCopy22 s1 = new ScoreV5FunCopy22();

        s1.eval_InputScore();
        s1.eval_sum();
        s1.eval_avg();
        s1.eval_grade();
        s1.print();

        //두번째 학생

        ScoreV5FunCopy22 s2 = new ScoreV5FunCopy22();

        s2.eval_InputScore();
        s2.eval_sum();
        s2.eval_avg();
        s2.eval_grade();
        s2.print();

        //세번째 학생

        ScoreV5FunCopy22 s3 = new ScoreV5FunCopy22();

        s3.eval_InputScore();
        s3.eval_sum();
        s3.eval_avg();
        s3.eval_grade();
        s3.print();
    }
}




