import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        FileInputStream f1, f2;
        FileOutputStream f3;
        String s1, s2;

        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        System.out.print("첫번째 파일 이름을 입력하세요>>");
        s1 = s.next();
        System.out.print("두번째 파일 이름을 입력하세요>>");
        s2 = s.next();

        try {
            f1 = new FileInputStream(s1);
            f2 = new FileInputStream(s2);
            f3 = new FileOutputStream(new File("appended.txt"));

            byte buff[] = new byte[1024];
            while(true) {
                int n = f1.read(buff);
                f3.write(buff, 0, buff.length);
                if(n < buff.length) break;
            }
            while(true) {
                int n = f2.read(buff);
                f3.write(buff, 0, buff.length);
                if(n < buff.length) break;
            }

            System.out.println("프로젝트 폴더 밑에 appended.txt 파일에 저장했습니다.");
            f1.close();
            f2.close();
            f3.close();

        }

        catch(IOException e) {
            e.printStackTrace();
        }


    }
}
