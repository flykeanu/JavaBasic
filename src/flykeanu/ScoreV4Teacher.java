package flykeanu;

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

public class ScoreV4Teacher {

    public static void main(String[] args) {

        String name = "송준호";
        //성적데이터를 키보드로 입력받기 위해
        //Scanner 클래스 초기화
        Scanner scanner = new Scanner(System.in);
        System.out.print("이름을 입력하세요 : ");
        name = scanner.nextLine();
        System.out.println("");
        System.out.print("점수를 입력하세요 : ");
        int eng = scanner.nextInt();
        int math = scanner.nextInt();
        int kor = scanner.nextInt();
        int sum = 0;
        double avg = 0.0;
        char grd = '가';
        //String.format(형식지정자, 변수들);
        avg = Double.parseDouble(String.format("%.1f" , avg));

        sum = eng + math + kor;

        avg = (double)sum / 3;

        System.out.println("이름 : " + name);
        System.out.println("영어 : " + eng);
        System.out.println("수학 : " + math);
        System.out.println("국어 : " + kor);
        System.out.println("-------------------------");

        System.out.println("합계 : " + sum);
        System.out.println("과목평균 : " + avg);
        System.out.println("과목평균변형 포맷 : " + avg);
        System.out.printf("평균 : %.1f\n", avg);

        switch ((int) (avg / 10)) {
            case 10:
                grd = '수';
                System.out.println("평어는 : " + grd + "입니다.");
                break;

            case 9:
                grd = '수';
                System.out.println("평어는 : " + grd + "입니다.");
                break;

            case 8:
                grd = '우';
                System.out.println("평어는 : " + grd + "입니다.");
                break;
            case 7:
                grd = '미';
                System.out.println("평어는 : " + grd + "입니다.");
                break;
            case 6:
                grd = '양';
                System.out.println("평어는 : " + grd + "입니다.");
                break;

                default : grd = '가';
                break;
        }

    }
}




