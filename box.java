package OOPjava.sem1.OOPclass;

public class box {
    double length;
    double breath;
    int Area;

    void calculateArea(){
        System.out.println("The Area of the box is "+ length*breath);
    }
    void checkRoomType(){
        if(Area>=100){
            System.out.println("Large room");
        }
        else{
            System.out.println("small room");
        }
    }

}
