import java.util.*;

class MyPoint {
    int x, y;

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean equals(Object obj) {
        MyPoint q = (MyPoint) obj;
        if(this.x == q.x && this.y == q.y)
            return true;
        else return false;
    }

    public String toString() {
        return "Point(" + x + "," + y + ")";
    }

}

public class Main {
    public static boolean[] prime;

    public static void main(String[] args) {
        MyPoint p = new MyPoint(3, 50);
        MyPoint q = new MyPoint(4, 50);
        System.out.println(p);
        if(p.equals(q))
            System.out.println("같은 점");
        else
            System.out.println("다른 점");

    }
}
