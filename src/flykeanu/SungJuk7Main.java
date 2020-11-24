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

        FinalSungJuk2 fsj2 = new FinalSungJuk2();

        fsj2.eval_InputScore();
        fsj2.computeSungJuk();
        fsj2.printSungJuk();


    }
}

abstract class SungJukV7 {
    protected String name;
    protected int kor;
    protected int eng;
    protected int math;
    protected int sum;
    protected double avg;
    protected char grd;

    public SungJukV7() { }

    public SungJukV7(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    public int getEng() {
        return eng;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int mat) {
        this.math = math;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public double getMean() {
        return mean;
    }

    public void setMean(double mean) {
        this.mean = mean;
    }

    public char getGrd() {
        return grd;
    }

    public void setGrd(char grd) {
        this.grd = grd;
    }
}

interface ISungJukV7 {
    void readSungJuk();
    void computeSungJuk();
    void printSungJuk();
}

class MidSungJuk2 extends SungJukV7
        implements ISungJukV7 {

    Class FinalSungJuk2 extends SungJukV7 implements ISungJukV7{
        protected int sci;
        protected int art;

//빈 생성자
//생성자 넣기


    }

   class FinalSungJuk2 extends MidSungJuk2() {
        //부모클래스에 정의된 멤버변수 초기화 코드를
        //super 라는 이름으로 치환해서 호출할 수 있다
        //super(생성자 매개변수목록)
        //super(name, kor, eng, math);
        int art;
        int sci;

        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;


    }
    // 부모클래스에 정의된 성적 입력코드를
    //super 라는 이름으로 치환해서 호출할 수 있음
    // => super.메서드이름()





}
    }

