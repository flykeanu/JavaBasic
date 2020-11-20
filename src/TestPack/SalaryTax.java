package TestPack;

import java.util.Scanner;

public class SalaryTax {
    double T;
    double k;
    int m;

    public void SalaryInputData() {   //결혼여부, 소득 입력 메서드

        Scanner sc = new Scanner(System.in);

        System.out.println("미혼이시면 숫자 0을 기혼이시면 숫자 1을 입력해주세요.");
        m = sc.nextInt();
        System.out.println("고객님의 소득을 만원단위로 입력해주세요.");
        k = sc.nextInt();
    }

    public double SalaryCalculator() {       //세금 산정 메서드

        if (m == 0 && k >= 3000) {
            T = k * 0.25;
        } else if (m == 0 && k < 3000) {
            T = k * 0.1;
        } else if (m == 1 && k < 6000) {
            T = k * 0.15;
        } else {
            T = k * 0.35;
        }

        return T;
    }

    public void TaxPrint() {             //산정 세금 출력메서드

        System.out.println("소득기준에 따라 납부하셔야 할 금액은 " + T + " 입니다.");
    }


    public static void main(String[] args) {

        SalaryTax p1 = new SalaryTax();

        p1.SalaryInputData();
        p1.SalaryCalculator();
        p1.TaxPrint();

    }
}



