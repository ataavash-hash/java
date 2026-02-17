package OOPjava.sem1.OOPclass;

public class box2 {
    public static void main(String[] args){
        box b1=new box();
        b1.length=20;
        b1.breath=40;
        b1.calculateArea();
        b1.checkRoomType();

        box b2=new box();
        b2.length=2;
        b2.breath=4;
        b2.calculateArea();
        b2.checkRoomType();
    }
}