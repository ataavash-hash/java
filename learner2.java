package OOPjava.sem1.OOPclass;

public class learner2 {
    public static void main(String[] args){
        learner l1 = new learner();
        l1.name = "ram";
        l1.marks =60;
        l1.displayDetails();
        l1.resultchecker();

        learner l2 = new learner();
        l2.name = "sita";
        l2.marks = 34;
        l2.displayDetails();
        l2.resultchecker();
    }
}
