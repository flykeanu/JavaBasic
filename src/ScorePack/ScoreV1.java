package ScorePack;

/**
  파일명 : ScoreV1
 작성일 : 성적처리 프로그램 V1
 이름 , 국어, 영어, 수학점수를 설정하면
 총점, 평군, 학점을 계산하고 결과 출력

 ***삼항연산자

 (조건식)  ?  : (참일때 결과값)  :  (거짓일때 결과값)


 */

public class ScoreV1 {

    public static void main(String[] args) {

        String name = "송준호";
        int eng = 77;
        int math = 88;
        int kor = 70;
        int sum;
        float avg;
        char grd = '가';


            sum = eng + math + kor;

            avg = (float)(sum) / 3;

            System.out.println("이름 : " + name);
            System.out.println("영어 : " + eng);
            System.out.println("수학 : " + math);
            System.out.println("국어 : " + kor);
            System.out.println("합계 : " + sum);
            System.out.println("과목평균 : " + avg);

        if(avg>=90) {
            grd = '수';
            System.out.println("평어는 : " + grd +  "입니다.");
        }
        else if(avg>=80) {
             grd = '우';
            System.out.println("평어는 : " + grd +  "입니다.");

        }else if(avg>=70) {
             grd = '미';
            System.out.println("평어는 : " + grd +  "입니다.");

        }else if(avg>=60) {
             grd = '양';
                    System.out.println("평어는 : " + grd +  "입니다.");
                }
            else{
             grd = '가';
                System.out.println("평어는 : " + grd +  "입니다.");}
        }



    }

