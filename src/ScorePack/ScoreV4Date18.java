package ScorePack;

public class ScoreV4Date18 {

int c;

    public static void SayHello() {              //인사말 출력 메서드

        System.out.println("Hello, World~! 클래스에서 호출된 인사말입니다.");
    }

    public static void SayHello2() {            //for문을 3번 반복하는 메서드
        int j;
        for (j = 0; j < 3; j++) {

            System.out.println("Hello, Java~! 클래스에서 호출된  for 반복 인사말입니다.");

        }
    }
        public  static void SayHello3(String msg) {            //for문을 3번 반복하는 메서드
            int j;
            for (j = 0; j < 3; j++) {

                System.out.println(msg);

            }

    }

    public  static String SayHello4(String name) {            //for문을 3번 반복하는 메서드

        return name;

    }

    public int ComputeNumPlus(int a, int b){  //더하기

        c = a + b;
        return c;

    }

    public int ComputeAllSum(int i, int j) {  //더하기
        int q = 0;
        for (i = 1; i <= j; i++) {
            q = q + i;


        }
        return q;
    }


    public int ComputeNumMinus(int a, int b){   //빼기

        c = a - b;
        return c;

    }

    public float ComputeNumDivide(int a, int b){ //나누기
    float c;
        c = (float)(a / b);
        return c;

    }

    public int ComputeNumAnd(int a, int b){  //곱하기

        c = a * b;
        return c;

    }
    public int GausMathAdd(int i, int j) {
        int k;

        if (j % 2 == 0) {
            k = (j * (j + 1)) / 2;
        } else {

            k = ((j - 1) * j) / 2 + j;
        }
        return k;
    }

        public static void main (String[]args){
           int P;
           int Y;
           int i;
            int M;
            SayHello();                     //호출
            SayHello2();                  //호출2
            SayHello3("Hello, Android!!");

            ScoreV4Date18 z = new ScoreV4Date18();

            P = z.ComputeNumPlus(2,9);
            System.out.println(P);

            ScoreV4Date18 x = new ScoreV4Date18();

            Y = x.ComputeAllSum(1,5);
            System.out.println("1 + 2 + 3+ 4+ 5 = " + Y);

            ScoreV4Date18 f = new ScoreV4Date18();
            M = f.GausMathAdd(1,100);

            System.out.println("1 + 2 + 3 ....+100 = " + M);


            String result = SayHello4("안녕하세요, 세상아!");
            System.out.println(result);
            System.out.println("Hello, World~!");



        }
    }



   // readSungJuk();
    //computeSungJuk();
    //printSungJuk();



