package flykeanu;

public class GuGuDan {

   public void DanCal(){
       int i;
       int j;
       for(i = 2; i < 10; i++){

           for(j = 1; j < 10; j++){
               System.out.println(i + " X " + j + " = " + i * j);

           }
           System.out.println("-------------------------------");
           System.out.println("---------  " + i + "  단 종료----------");
       }
   }

   public void GoingSaid(){
       System.out.println("구구단을 2단부터 9단까지 출력합니다.");
   }

    public static void main(String[] args) {
        GuGuDan k = new GuGuDan();
        k.GoingSaid();
        k.DanCal();
    }

}
