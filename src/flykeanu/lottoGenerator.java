package flykeanu;

import java.util.Scanner;

public class lottoGenerator {

    public static void main(String[] args) {

        int[] num = new int[6];  //구입자 입력번호 저장공간

        int[] lotto = new int[6];		//그 회 당첨번호 저장공간

        int i, j;			//i, j 변수 선언

        int bonus = 0;    //2등 보너스 번호 0으로 일단 초기화

        for(i = 0; i < 6; i++)
        { //구입자가 6개 번호 입력하기 시작함
            System.out.printf("%d 번째 번호를 입력하세요.(_1~45_) : ", i + 1);
            Scanner scanner = new Scanner(System.in);

            num[i] = scanner.nextInt();

            if(num[i] < 1 || num[i] > 45)
            { //1 미만 or 45 초과한 숫자는 입력 받을 수 없다 조건코딩
                System.out.printf("번호는 1부터 45까지만 입력해야 합니다.\n");
                i--;   //카운트 하나 줄이고(OMR아닌 인터넷 구매만 해당)
                continue;   //다시 번호 입력하도록 선행 for문으로 이동
            }

            if(i > 0)
            {   //중복되는 번호 없도록 로직구성(OMR아닌 인터넷 구매만 가능할듯)
                for(j = 0; j < i; j++)
                {
                    if(num[i] == num[j])
                    {
                        System.out.printf("번호는 중복 되어서는 안됩니다. \n");
                        i--;              //카운트 하나 줄이고
                        break;		//다시 번호 입력하도록 첫번째 for문으로 이동
                    }
                }
            }
        }
        System.out.printf("\n---------▷입력하신 번호 출력◁---------------------\n");
        for(i = 0; i < 6; i++)
        {
            System.out.printf("%6d", num[i]);
        }
        System.out.printf("\n-----------------------------------------------------");

        //시스템이 생각하는 당첨번호 코딩 시작(이 회차 당첨번호)

        for(i = 0; i < 6; i++)
        {
            lotto[i] = (int)(Math.random()*45) + 1;
            if(i > 0)
            {
                for(j = 0; j < i; j++)
                {
                    if(lotto[i] == lotto[j])
                    {
                        i--;              //카운트 하나 줄이고
                        continue;		//다시 번호 난수발생 하도록 선행 for문으로 이동
                    }


                }




            }
        }


        //2등 보너스 번호 만드는 문장

        for(i = 0; i < 1; i++)
        {
            bonus = (int)(Math.random()*45) + 1;  //난수발생기는 0.xxxxx에서 44.xxx까지
            //수를 발생시키기 때문에 정수화해서 1~45나오도록 더하기 1 해준다
            for(j = 0; j < 6; j++)
            {
                if(lotto[j] == bonus)
                {
                    System.out.println("보너스 번호 역시 중복되어서는 안됩니다. \n");
                    i--;              //카운트 하나 줄이고
                    //continue;	//다시 번호 난수발생 하도록 선행 for문으로 이동
                    break;

                }

            }

        }






        System.out.printf("\n---------▶최종 응모하신 번호는◀---------------\n");
        for(i = 0; i < 6; i++){
            System.out.printf("%6d", num[i]);
        }
        System.out.printf("-----------------------------------------------------");


        System.out.printf("\n---------★이번회차 당첨번호는★---------------\n");
        for(i = 0; i < 6; i++){
            System.out.printf("%6d", lotto[i]);
        }

        System.out.println("---------------------------------------------\n");
        System.out.printf("●-------------보너스 번호-------------------------● \n");
        System.out.printf("\n---------------------%d-------------------------------\n", bonus);

        System.out.printf("-----------------------------------------------------");

        //맞춘 갯수가 몇 개 인지 코딩
        int count = 0;
        for(i = 0; i < 6; i++){
            for(j = 0; j < 6; j++){
                if(num[i] == lotto[j])
                    count++;
            }

        }

        //보너스 번호 검사

        int b_count = 0;

        for(i = 0; i < 6; i++){
            if(num[i] == bonus)
                b_count = 1;
        }


        System.out.println("\n------------------------------------------------------");
        System.out.println("고객님께서 맞추신 번호는" + count + "개 입니다.");
        System.out.println("------------------------------------------------------");
        if(count == 6){
            System.out.println("1등에 당첨되었습니다");
        }

        else if(count == 5 && b_count == 1){
            System.out.println("2등에 당첨되었습니다");
        }

        else if(count == 5){
            System.out.println("3등에 당첨되었습니다");
        }
        else if(count == 4){
            System.out.println("4등에 당첨되었습니다");
        }
        else if(count == 3){
            System.out.println("5등에 당첨되었습니다");
        }
        else {
            System.out.println("꽝입니다. 다음기회에");
        }
    }

}
