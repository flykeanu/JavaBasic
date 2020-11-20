package SungJukV5Pack;
import java.util.Scanner;
public class SungJukService {
    String name;                                    // 메모리 사용량이 증가하는 측면도 있다
    int kor, eng, math, sum;
    double avg;
    char grd;

    public SungJukVO readSungJuk(){    //나눠서 쓰다보니 변수를 중복해서 선언해야한다
                                                                      // 메모리 사용량이 증가하는 측면도 있다

       // /**
       //  * 성적 데이터 입력 메서드
       //  * return 키보드로 입력받기 위해
       // *
       //  **/


        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력하세요 : ");
        name = sc.nextLine();
        System.out.println("국어점수를 입력하세요 : ");
        kor = sc.nextInt();
        System.out.println("영어점수를 입력하세요 : ");
        eng = sc.nextInt();
        System.out.println("수학점수를 입력하세요 : ");
        math = sc.nextInt();


        return new SungJukVO(name, eng, kor, math,0,0,'가');

    } //readSungJuk

    /**
     * 입력받은 성적에 대해
     * 총점, 평균, 학점을 계산하는 메서드
     **/

   /** public SungJukVO SungJukV5Sum() {
        sum = eng + math + kor;
    }

    public SungJukVO SungJukV5Avg() {
        avg = (double) sum / 3;
    }
    * */






    public void computeSungJuk(SungJukVO sj) {

        sj.setSum(sj.getKor() + sj.getEng() + sj.getMath());

        sj.setAvg((double)sj.getSum() / 3);

        switch ((int) (sj.getAvg() / 10)) {
            case 10:
                sj.setGrd('수');
                System.out.println("평어는 : " + sj.getGrd() + "입니다.");
                break;

            case 9:
                sj.setGrd('수');
                System.out.println("평어는 : " + sj.getGrd() + "입니다.");
                break;

            case 8:
                sj.setGrd('우');
                System.out.println("평어는 : " + sj.getGrd() + "입니다.");
                break;
            case 7:
                sj.setGrd('미');
                System.out.println("평어는 : " + sj.getGrd() + "입니다.");
                break;
            case 6:
                sj.setGrd('양');
                System.out.println("평어는 : " + sj.getGrd() + "입니다.");
                break;

            default:
                sj.setGrd('가');
                System.out.println("평어는 : " + sj.getGrd() + "입니다.");
                break;
        }




    } //computeSungJuk



    public void printSungJuk(SungJukVO sj) {

        System.out.println("이름 : " + sj.getName());
        System.out.println("영어 : " + sj.getEng());
        System.out.println("수학 : " + sj.getMath());
        System.out.println("국어 : " + sj.getKor());
        System.out.println("-------------------------");

        System.out.println("합계 : " + sj.getSum());
        System.out.println("과목평균 : " + sj.getAvg());
        System.out.println("과목평균변형 포맷 : " + sj.getAvg());
        System.out.printf("평균 : %.1f\n", sj.getAvg());
    }

}

