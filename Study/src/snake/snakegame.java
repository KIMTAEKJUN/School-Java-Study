package snake;

import java.util.Scanner;

abstract class Sprite {
    int x = 3, y = 3;
    abstract void move(char c);
}

class Main extends Sprite {
    void move(char c) {
        if (c == 'h') {
            --x;
        } else if (c == 'j') {
            --y;
        } else if (c == 'k') {
            ++y;
        } else if (c == 'l') {
            ++x;
        }
    }
}

class Gold extends Sprite {
    public Gold() {
        x = 3;
        y = 6;
    }
    void move(char c) {}
}

class Monster extends Sprite {
    public Monster() {
        x = 7;
        y = 7;
    }
    void move(char c) {
        x += (Math.random()-0.5>0?1:-1);
        y += (Math.random()-0.5>0?1:-1);
    }
}

public class snakegame {
    // 문제 : 주인공을 움직여서 몬스터를 피하고 황금을 차지하는 게임이다. 화면에는 3가지의 스포라이트가 나타난다.
    // '@'은 주인공 캐릭터이고, 'M'은 몬스터, 'G'는 황금을 나타낸다. 주인공 캐릭터는 키보드의 h, j, k, l 키를 이용하여
    // 상하좌우로 움직인다. 몬스터는 난수만큼 이동한다. 황금은 움직이지 않는다.
    public static void main(String[] args) {
        char[][] map = {
            { '#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#' },
            { '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' },
            { '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' },
            { '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' },
            { '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' },
            { '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' },
            { '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' },
            { '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' },
            { '#',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','#' },
            { '#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#','#' },
        };

        Scanner scan = new Scanner(System.in);

        Main mine;
        Gold gold;
        Monster monster;

        mine = new Main();
        gold = new Gold();
        monster = new Monster();

        while(true){
            for (int y=0; y<map.length; y++){
                for(int x=0; x<map[y].length; x++){
                    if(y == monster.y && x == monster.x)
                        System.out.print("M");
                    else if(y == mine.y && x == mine.x)
                        System.out.print("@");
                    else if(y == gold.y && x== gold.x)
                        System.out.print("G");
                    else
                        System.out.print(map[y][x]);
                }

                System.out.println();
            }
            System.out.print("왼쪽(h), 위쪽(j), 아래쪽(k), 오른쪽 (l) : ");
            char c = scan.next().charAt(3);
            mine.move(c);
            monster.move(c);
        }
    }
}
