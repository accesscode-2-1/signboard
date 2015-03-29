package nyc.c4q.ac21.signboard;

import java.util.Random;

/**
 * Created by Madelyn on 3/29/15.
 * Menu.java
 * Prints menu topping options
 */

public class Menu {

    // length = 38
    static String menu1 = ".##.....##.########.##....##.##.....##";
    static String menu2 = ".###...###.##.......###...##.##.....##";
    static String menu3 = ".####.####.##.......####..##.##.....##";
    static String menu4 = ".##.###.##.######...##.##.##.##.....##";
    static String menu5 = ".##.....##.##.......##..####.##.....##";
    static String menu6 = ".##.....##.##.......##...###.##.....##";
    static String menu7 = ".##.....##.########.##....##..#######.";

    public static void menuScene(SignBoard board) {
        int width = board.getWidth()*2;
        int y = board.getHeight() / 2;
        for (int x = -38; x <= width - 38; ++x) {
            SignBoard.Frame frame = board.newFrame();
            frame.setRed();

            if (x >= width)
                break;

            if (x < 0) {
                frame.write(0, y - 3, menu1.substring(-x));
                frame.write(0, y - 2, menu2.substring(-x));
                frame.write(0, y - 1, menu3.substring(-x));
                frame.write(0, y, menu4.substring(-x));
                frame.write(0, y + 1, menu5.substring(-x));
                frame.write(0, y + 2, menu6.substring(-x));
                frame.write(0, y + 3, menu7.substring(-x));
            } else if (x + 38 <= width) {
                frame.write(x, y - 3, menu1);
                frame.write(x, y - 2, menu2);
                frame.write(x, y - 1, menu3);
                frame.write(x, y, menu4);
                frame.write(x, y + 1, menu5);
                frame.write(x, y + 2, menu6);
                frame.write(x, y + 3, menu7);
            } else {
                frame.write(x, y - 3, menu1.substring(0, width - x));
                frame.write(x, y - 2, menu2.substring(0, width - x));
                frame.write(x, y - 1, menu3.substring(0, width - x));
                frame.write(x, y, menu4.substring(0, width - x));
                frame.write(x, y + 1, menu5.substring(0, width - x));
                frame.write(x, y + 2, menu6.substring(0, width - x));
                frame.write(x, y + 3, menu7.substring(0, width - x));
            }

            frame.finish(0.02);
        }
    }

    public static void flashApps(SignBoard board, int cycles) {
        Random random = new Random();
        int width = board.getWidth();
        int leftPosition = width / 4;
        int rightPosition = 3 * width / 4 - 24;
        int y = board.getHeight() / 2;

        for (int i = 0; i < cycles * 2; ++i) {
            SignBoard.Frame frame = board.newFrame();

            int color = random.nextInt(4);
            if (color == 0)
                frame.setGreen();
            else if (color == 1)
                frame.setRed();
            else
                frame.setYellow();
            if (i%2==0) {
                // length = 69
                frame.write(leftPosition, y - 3, "d888888b  .o88b. d88888b    .o88b. d8888b. d88888b  .d8b.  .88b  d88.");
                frame.write(leftPosition, y - 2, "` 88'   d8P  Y8 88'       d8P  Y8 88  `8D 88'     d8' `8b 88'YbdP`88");
                frame.write(leftPosition, y - 1, "  88    8P      88ooooo   8P      88oobY' 88ooooo 88ooo88 88  88  88");
                frame.write(leftPosition, y, "  88    8b      88~~~~~   8b      88`8b   88~~~~~ 88~~~88 88  88  88");
                frame.write(leftPosition, y + 1, " .88.   Y8b  d8 88.       Y8b  d8 88 `88. 88.     88   88 88  88  88");
                frame.write(leftPosition, y + 2, "888888P  `Y88P' Y88888P    `Y88P' 88   YD Y88888P YP   YP YP  YP  YP");
            }
            else{
                // length = 47
                frame.write(rightPosition, y - 3,".d8b.  d8888b. d8888b. db      d88888b .d8888. ");
                frame.write(rightPosition, y - 2,"d8' `8b 88  `8D 88  `8D 88      88'     88'  YP");
                frame.write(rightPosition, y - 1,"88ooo88 88oodD' 88oodD' 88      88ooooo `8bo.");
                frame.write(rightPosition, y ,"88~~~88 88~~~   88~~~   88      88~~~~~   `Y8b. ");
                frame.write(rightPosition, y +1,"88   88 88      88      88booo. 88.     db   8D");
                frame.write(rightPosition, y +2,"YP   YP 88      88      Y88888P Y88888P `8888Y'");
            }

            frame.finish(0.3);
        }
    }
    public static void flashChoc(SignBoard board, int cycles) {
        Random random = new Random();
        int width = board.getWidth();
        int leftPosition = width / 4;
        int rightPosition = 0;
        int y = board.getHeight() / 2;

        for (int i = 0; i < cycles * 2; ++i) {
            SignBoard.Frame frame = board.newFrame();

            int color = random.nextInt(4);
            if (color == 0)
                frame.setGreen();
            else if (color == 1)
                frame.setRed();
            else
                frame.setYellow();
            if (i%2==0) {
                // length = 57
                frame.write(leftPosition, y - 3, "8888b.  .d8b.  d8b   db  .d8b.  d8b   db  .d8b.  .d8888. ");
                frame.write(leftPosition, y - 2, "88  `8D d8' `8b 888o  88 d8' `8b 888o  88 d8' `8b 88'  YP ");
                frame.write(leftPosition, y - 1, "88oooY' 88ooo88 88V8o 88 88ooo88 88V8o 88 88ooo88 `8bo. ");
                frame.write(leftPosition, y, "88~~~b. 88~~~88 88 V8o88 88~~~88 88 V8o88 88~~~88   `Y8b");
                frame.write(leftPosition, y + 1, "88   8D 88   88 88  V888 88   88 88  V888 88   88 db   8D ");
                frame.write(leftPosition, y + 2, "Y8888P' YP   YP VP   V8P YP   YP VP   V8P YP   YP `8888Y' ");
            }
            else{
                // length = 75
                frame.write(rightPosition, y - 3," .o88b. db   db  .d88b.   .o88b.  .d88b.  db       .d8b.  d888888b d88888b ");
                frame.write(rightPosition, y - 2,"d8P  Y8 88   88 .8P  Y8. d8P  Y8 .8P  Y8. 88      d8' `8b `~~88~~' 88'     ");
                frame.write(rightPosition, y - 1,"8P      88ooo88 88    88 8P      88    88 88      88ooo88    88    88ooooo ");
                frame.write(rightPosition, y ,"8b      88~~~88 88    88 8b      88    88 88      88~~~88    88    88~~~~~ ");
                frame.write(rightPosition, y +1,"Y8b  d8 88   88 `8b  d8' Y8b  d8 `8b  d8' 88booo. 88   88    88    88.     ");
                frame.write(rightPosition, y +2," `Y88P' YP   YP  `Y88P'   `Y88P'  `Y88P'  Y88888P YP   YP    YP    Y88888P ");
            }

            frame.finish(0.3);
        }
    }
}
