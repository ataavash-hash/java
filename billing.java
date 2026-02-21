package OOPjava.sem1.lab2;

public class billing {
        public static void main(String[] args) {
            double bill = 150.00;
            int friends = 4;
            double splitWithoutTip = bill / friends;
            System.out.println("Each pays without tip: Rs." + splitWithoutTip);
            double tip = bill * 0.1;
            double totalWithTip = bill + tip;
            double splitWithTip = totalWithTip / friends;
            System.out.println("Each pays with 10% tip: Rs." + splitWithTip);
        }
}
