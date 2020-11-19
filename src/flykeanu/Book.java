package flykeanu;

public class Book {
    //멤버 변수 선언
    String name;
    String writer;
    String pub_Name;
    String pub_Date;
    int price;
    double discnt;
    String bkimg;       //java.png

    //기본 생성자

    public Book() {
    }

    //매개 변수 생성자
    // ctrl + insert 키로 만든다
    public Book(String name, String writer, String pub_Name, String pub_Date, int price, double discnt, String bkimg) {
        this.name = name;
        this.writer = writer;
        this.pub_Name = pub_Name;
        this.pub_Date = pub_Date;
        this.price = price;
        this.discnt = discnt;
        this.bkimg = bkimg;



    }
}
