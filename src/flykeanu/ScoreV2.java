package flykeanu;

public class ScoreV2 {
    public static void main(String[] args) {
        //변수선언
        String name = "김병만";    // = 양옆으로 띄워서 가독성을 높이자
        int kor = 99;
        int eng = 66;
        int math = 98;
        int sum = 0;
        double mean = 0.0;  //실수값을 저장할때는 float 보다는 double 추천

        char grd = '가';

        //처리
        sum = kor + eng + math;
        mean = (double)sum/3;


        //결과처리
    System.out.println("이름 : " + name);
    System.out.println("국어 : " + kor);
    System.out.println("수학 : " + math);
    System.out.println("합계 : " + sum);
    System.out.println("평균 : " + mean);
    System.out.println("평어 : " + grd);





    }


}
