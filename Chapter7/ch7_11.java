import java.util.*;

class Nation {
    String country;
    String capital;

    Nation(String country, String capital) {
        this.country = country;
        this.capital = capital;
    }

    String getCountry() {
        return country;
    }

    String getCapital() {
        return capital;
    }
}

class QuizVector {
    Scanner s = new Scanner(System.in);
    Vector<Nation> v = new Vector<>();

    public QuizVector() {
        v.add(new Nation("멕시코", "멕시코시티"));
        v.add(new Nation("스페인", "리스본"));
        v.add(new Nation("프랑스", "파리"));
        v.add(new Nation("영국", "런던"));
        v.add(new Nation("그리스", "아테네"));
        v.add(new Nation("독일", "베를린"));
        v.add(new Nation("일본", "동경"));
        v.add(new Nation("중국", "베이찡"));
        v.add(new Nation("러시아", "모스크바"));
    }

    boolean contains(String country) {
        for(int i = 0; i < v.size(); i++)
        {
            if(v.get(i).getCountry().equals(country))
                return true;
        }
        return false;
    }

    public void insert() {
        System.out.println("현재 " + v.size() + "개 나라와 수도가 입력되어 있습니다.");
        while(true) {
            System.out.print("나라와 수도 입력" + (v.size() + 1) + ">> ");
            String country = s.next();
            if(country.equals("그만"))
                break;
            String capital = s.next();

            if(contains(country)) {
                System.out.println(country + "는 이미 있습니다!");
                continue;
            }

            v.add(new Nation(country, capital));
        }
    }

    public void play() {
        while(true) {
            int index = (int)(Math.random() * v.size());

            Nation nation = v.get(index);
            String question = nation.getCountry();
            String answer = nation.getCapital();

            System.out.print(question + "의 수도는? ");
            String user = s.next();
            if(user.equals("그만"))
                break;

            if(user.equals(answer))
                System.out.println("정답!!");
            else
                System.out.println("아닙니다!!");
        }
    }



    public void run() {
        System.out.println("**** 수도 맞추기 게임을 시작합니다. ****");
        while(true) {
            System.out.print("입력:1, 퀴즈:2, 종료:3>> ");
            int select = s.nextInt();

            switch(select) {
                case 1:
                    insert(); break;
                case 2:
                    play(); break;
                case 3:
                    System.out.println("게임을 종료합니다.");
                    return;
            }
        }
    }
}

public class Main {
    public static void main(String[] args){
        QuizVector q = new QuizVector();
        q.run();
    }
}
