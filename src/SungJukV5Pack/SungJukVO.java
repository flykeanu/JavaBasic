package SungJukV5Pack;

import java.util.Scanner;

/**
 ** 파일명 : SungJukVO
 * *  작성일 : 2020.11.20

 *  총점, 평균, 학점을 계산하고 결과 출력
 * 단, 평균은 소수점 첫째 자리까지 출력하고
 * 학점기준은 '수우미양가'로 하되, switch 문으로 작성하시오
 *
 * 프로그램 설명 : 성적처리프로그램 v5
 * 이름 , 국어, 영어, 수학점수 등에 관한 변수를 정의한 클래스
 *
 *  ***삼항연산자
 *  (조건식)  ?  : (참일때 결과값)  :  (거짓일때 결과값)
 *
 *
**/
public class SungJukVO {

    private String name;
    private int eng;
    private int math;
    private int kor;
    private int sum;
    private double avg;
    private char grd;

    public SungJukVO(){

    }

    public SungJukVO(String name, int eng, int math, int kor, int sum, double avg, char grd) {
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
