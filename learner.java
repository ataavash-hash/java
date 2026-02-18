package OOPjava.sem1.OOPclass;

public class learner {
             String name;
             int marks ;

             void displayDetails(){
                 System.out.println("the name of student :"+name);
                 System.out.println(" marks:"+marks);
             }
             void resultchecker(){
                 if(marks>=40){
                     System.out.println("pass");
                 }
                 else{
                     System.out.println("fail");
                 }
             }
}
