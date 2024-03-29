import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args){
        File f;
        File fs[];

        try {
            f = new File("c:\\temp1\\");
            fs = f.listFiles();
            int cnt = 0;
            System.out.println(f.getPath() + "디렉토리의 .txt파일을 모두 삭제합니다.");
            for(int i = 0; i < fs.length; i++) {
                String n = fs[i].getName();
                int index = n.lastIndexOf(".txt");
                if(index != -1) {
                    System.out.println(fs[i].getName() + " 삭제");
                    fs[i].delete();
                    cnt++;
                }
            }
            System.out.println("총 " + cnt + "개의 .txt파일을 삭제했습니다.");
        }

        catch(Exception e) {
            e.printStackTrace();
        }

    }
}
