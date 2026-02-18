package OOPjava.sem1.OOPclass;

public class result {
    public int total(int m1, int m2, int m3) {
        return (m1 + m2 + m3);
    }

    public boolean passed(int total) {
        if (total >= 120) {
            return true;
        } else {
            return false;
        }
    }
}