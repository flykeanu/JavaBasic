package ScorePack;
/**
//파일명 : SungJukV6Main
작성일 : 2020.11.23
프로그램 설명 : 성적처리프로그램 V6
중간고사와 기말고사 성적처리 프로그램을 만드려고 한다
SungJukV1을 토대로 중간고사 성적과 기말고사 성적 클래스를 상속을 이용하여
작성하세요
 중간고사(MidSungJuk) : 국어(kor), 영어(eng), 수학(math)
 기말고사(FinalSungJuk) : 국어, 영어, 수학, 미술(art), 과학(sci)
 성적처리 : computeSungJuk
 결과출력 : printSungJuk
**/

 import java.util.Scanner;

public class SungJukV6Main {

    public static void main(String[] args) {

        //첫번째 학생

        MidSungJuk s1 = new MidSungJuk();

        s1.eval_InputScore();
        s1.eval_sum();
        s1.eval_avg();
        s1.eval_grade();
        s1.print();

        //두번째 학생

        MidSungJuk s2 = new MidSungJuk();

        s2.eval_InputScore();
        s2.eval_sum();
        s2.eval_avg();
        s2.eval_grade();
        s2.print();

        //세번째 학생

        MidSungJuk s3 = new MidSungJuk();

        s3.eval_InputScore();
        s3.eval_sum();
        s3.eval_avg();
        s3.eval_grade();
        s3.print();

        //네번째 학생 기말고사 점수 입력 및 출력
        FinalSungJuk s4 = new FinalSungJuk();

        s4.eval_InputScore();
        s4.eval_sum();
        s4.eval_avg();
        s4.eval_grade();
        s4.print();

    }
}
    class MidSungJuk {
        String name;
        int eng;
        int math;
        int kor;
        int sum = 0;
        double avg = 0.0;
        char grd = '가';

        public MidSungJuk() {
        }

        public MidSungJuk(String name, int eng, int math, int kor, int sum, double avg, char grd) {
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

         void print() {       //PrintSungJuk

            System.out.println("이름 : " + name);
            System.out.println("영어 : " + eng);
            System.out.println("수학 : " + math);
            System.out.println("국어 : " + kor);
            System.out.println("-------------------------------------");
            System.out.println("합계 : " + sum);
            System.out.println("과목평균과제값(round함수) : " + (double) (Math.round(avg * 100)) / 100);
            System.out.println("과목평균변형 포맷 미적용 : " + avg);
            System.out.printf("평균 : %.1f\n", avg);

        }



    }

    class FinalSungJuk extends MidSungJuk{

    protected int art;
    protected  int sci;



        public FinalSungJuk() {
            //부모클래스에 정의된 멤버변수 초기화 코드를
            //super 라는 이름으로 치환해서 호출할 수 있다
            //super(생성자 매개변수목록)
            //super(name, kor, eng, math);
            this.name = name;
            this.kor = kor;
            this.eng = eng;
            this.math = math;

            this.art = art;
            this.sci = sci;
        }
        // 부모클래스에 정의된 성적 입력코드를
        //super 라는 이름으로 치환해서 호출할 수 있음
        // => super.메서드이름()


        @Override
        void eval_InputScore() {
            super.eval_InputScore();

            Scanner sc = new Scanner(System.in);
            System.out.println("미술점수를 입력하세요 : ");
            art = sc.nextInt();

            System.out.println("과학점수를 입력하세요 : ");
            sci = sc.nextInt();
        }
        @Override
        void eval_sum() {
            super.eval_sum();
            sum = super.sum + sci + art;

        }

        @Override
        void eval_avg() {
            super.eval_sum();
            avg = (super.sum +sci + art)/5;
        }

        @Override
        void eval_grade() {
            super.eval_grade();
        }

        @Override
        void print() {
            super.print();{
                System.out.println("미술 : " + art);
                System.out.println("과학 : " + sci);
            }
            }
    }








