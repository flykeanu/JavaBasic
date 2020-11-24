package zzyzzy;

import java.util.Scanner;

/**
 * 파일명 : SungJukV2
 * 작성일 : 2020.11.17
 *
 * 프로그램 설명 : 성적처리프로그램 v2
 * 이름,국어,영어,수학점수를 키보드로 입력받아
 * 총점,평균,학점을 계산하고 결과 출력
 *
 * 단, 평균은 소수점 첫째 자리까지 출력하고
 * 학점기준은 '수우미양가'로 하되
 * switch문으로 학점을 계산하도록 함
 *
 * 만점은 100점, 100~90, 89~80,
 * 79~70, 69~60, 59~0기준으로 학점부여
 * name, kor, eng, mat, sum, mean, grd
 *
*/
public class SungJukV2 {
    public static void main(String[] args) {
        // 변수선언
        String name = "지현";
        int kor = 99;
        int eng = 98;
        int mat = 99;
        int sum = 0;
        double mean = 0.0;
        char grd = '가';

        // 처리
        // 성적데이터를 키보드로 입력받기 위해
        // Scanner 클래스 초기화
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        name = sc.nextLine();
        System.out.print("국어를 입력하세요 : ");
        kor = sc.nextInt();
        System.out.print("영어를 입력하세요 : ");
        eng = sc.nextInt();
        System.out.print("수학을 입력하세요 : ");
        mat = sc.nextInt();

        sum = kor + eng + mat;
        mean = (double)sum / 3;
        // 학점계산은 switch문으로 처리
        switch((int)(mean/10)) {
            case 10:
            case 9: grd = '수'; break;

            case 8: grd = '우'; break;
            case 7: grd = '미'; break;
            case 6: grd = '양'; break;
            default: grd = '가';
        }
        // String.format(형식지정자, 변수들)
        mean = Double.parseDouble(
                String.format("%.1f", mean));

        // 결과출력
        System.out.println("이름 : " + name);
        System.out.println("국어 : " + kor);
        System.out.println("영어 : " + eng);
        System.out.println("수학 : " + mat);
        System.out.println("----------");
        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + mean);
        //System.out.printf("평균 : %.1f\n", mean);
        System.out.println("학점 : " + grd);

    }
}
