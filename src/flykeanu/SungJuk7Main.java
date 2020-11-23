package flykeanu;

import java.util.Scanner;

/**
//파일명 : SungJuk7Main
//중간고사와 기말고사 성적처리 프로그램을 만들려고 함
//기말고사 성적 클래스를 인터페이스를 이용해서 작성하세요


//부모클래스 SungJukV6
 //인터페이스 ISungJukV6
//중간고사(MidSungJuk) : 국어(kor), 영어(eng), 수학(math)
// 기말고사(FinalSungJuk) : 국어, 영어, 수학, 미술(art), 과학(sci)
//성적처리 : computeSungJuk
//결과출력 : printSungJuk
**/


public class SungJuk7Main {
    public static void main(String[] args) {
        MidSungJuk2 msj2 = new MidSungJuk2();
        msj2.readSungJuk();
        msj2.computeSungJuk();
        msj2.printSungJuk();
    }
}
class SungJukV7 {

    protected String name;
    protected int eng;
    protected int math;
    protected int kor;
    protected int sum = 0;
    protected double avg = 0.0;
    protected char grd = '가';

    public SungJukV7() {
    }

    public SungJukV7(String name, int eng, int math, int kor, int sum, double avg, char grd) {
        this.name = name;
        this.eng = eng;
        this.math = math;
        this.kor = kor;
        this.sum = sum;
        this.avg = avg;
        this.grd = grd;
    }

    public String getName() {
        return name;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }

    public int getKor() {
        return kor;
    }

    public int getSum() {
        return sum;
    }

    public double getAvg() {
        return avg;
    }

    public char getGrd() {
        return grd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public void setGrd(char grd) {
        this.grd = grd;
    }
}
    abstract class SungJunk7 {
        abstract interface ISungJukV7 {

            void eval_InputScore() {     //ReadSungJuk
                Scanner sc = new Scanner(System.in);
                System.out.print("이름을 입력하세요 : ");
                name = sc.nextLine();
                System.out.println("");
                System.out.print(name + "의 점수를 입력하세요 : ");
                eng = sc.nextInt();
                math = sc.nextInt();
                kor = sc.nextInt();

            }


            void eval_sum() {    //ComputerSungJuk1

                sum = eng + math + kor;

            }

            void eval_avg() {   //ComputerSungJuk2

                avg = (double) sum / 3;
            }

            void eval_grade() {    //ComputerSungJuk3

                if (avg >= 90) {
                    grd = '秀';
                    System.out.println("평어는 : " + grd + " 입니다.");

                } else if (avg >= 80) {
                    grd = '優';
                    System.out.println("평어는 : " + grd + " 입니다.");

                } else if (avg >= 70) {
                    grd = '美';
                    System.out.println("평어는 : " + grd + " 입니다.");

                } else if (avg >= 60) {
                    grd = '良';
                    System.out.println("평어는 : " + grd + "입니다.");

                } else if (avg >= 50) {
                    grd = '佳';
                    System.out.println("평어는 : " + grd + "입니다.");

                } else {
                    grd = '佳';
                    System.out.println("평어는 : " + grd + "입니다.");

                }
            }


        }
    }

    class MidSungJuk2 extends SungJukV7 implements ISungJuk(){



    }

}