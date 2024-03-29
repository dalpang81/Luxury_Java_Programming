import javax.swing.*;
import java.util.*;

public class Main extends JFrame {
    class MyThread implements Runnable {
        public void run() {
            System.out.println("스레드 실행 시작");
            for(int i = 1; i <= 10; i++)
                System.out.print(i + " ");
            System.out.println();
            System.out.println("스레드 종료");
        }
    }

    Main() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("아무 키나 입력>> ");
        scanner.nextLine();
        scanner.close();
        Thread th = new Thread(new MyThread());
        th.start();
    }

    static public void main(String[] args) {
        new Main();
    }
}
