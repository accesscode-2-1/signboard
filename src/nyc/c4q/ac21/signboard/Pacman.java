package nyc.c4q.ac21.signboard;

import java.util.Random;

/**
 * Created by sufeizhao on 3/29/15.
 */
public class Pacman {

    // length = 16
    static String open1 = "┈┈  ╱ ▔▔▔▔▔ ╲   ";
    static String open2 = "┈┈╱      /\\ ╱   ";
    static String open3 = "┈┈▏       ╱     ";
    static String open4 = "┈┈▏       ╲     ";
    static String open5 = "┈┈╲         ╲   ";
    static String open6 = "┈┈  ╲_______╱   ";

    static String close1 = "┈┈  ╱ ▔▔▔▔▔ ╲   ";
    static String close2 = "┈┈╱      /\\   ╲ ";
    static String close3 = "┈┈▏            |";
    static String close4 = "┈┈▏        ▔▔▔▔|";
    static String close5 = "┈┈╲           ╱ ";
    static String close6 = "┈┈  ╲_______╱   ";

    //credit to sufei
    public static void pacmanEnter(SignBoard board) {
        Random random = new Random();
        int x = board.getWidth() / 5 + 5;
        int y = board.getHeight() / 2;
        int length = 16;

        for (int i = 0; i <= x; ++i) {
            SignBoard.Frame frame = board.newFrame();
            int open = random.nextInt(2);

            // pacman enters
            frame.setYellow();
            if (i < 16) {
                if (open == 1) {
                    frame.write(0, y - 3, open1.substring(length - i));
                    frame.write(0, y - 2, open2.substring(length - i));
                    frame.write(0, y - 1, open3.substring(length - i));
                    frame.write(0, y, open4.substring(length - i));
                    frame.write(0, y + 1, open5.substring(length - i));
                    frame.write(0, y + 2, open6.substring(length - i));
                } else {
                    frame.write(0, y - 3, close1.substring(length - i));
                    frame.write(0, y - 2, close2.substring(length - i));
                    frame.write(0, y - 1, close3.substring(length - i));
                    frame.write(0, y, close4.substring(length - i));
                    frame.write(0, y + 1, close5.substring(length - i));
                    frame.write(0, y + 2, close6.substring(length - i));
                }
            } else {
                if (open == 1) {
                    frame.write(i - length, y - 3, open1);
                    frame.write(i - length, y - 2, open2);
                    frame.write(i - length, y - 1, open3);
                    frame.write(i - length, y, open4);
                    frame.write(i - length, y + 1, open5);
                    frame.write(i - length, y + 2, open6);
                } else {
                    frame.write(i - length, y - 3, close1);
                    frame.write(i - length, y - 2, close2);
                    frame.write(i - length, y - 1, close3);
                    frame.write(i - length, y, close4);
                    frame.write(i - length, y + 1, close5);
                    frame.write(i - length, y + 2, close6);
                }
            }


            // still chocolate
            frame.setGreen();
            frame.write(x, y - 3, "  ___  ___  ___  ___  ___.---------------.      ");
            frame.write(x, y - 2, " .'\\__\\'\\__\\'\\__\\'\\__\\'\\__,`   .  ____ ___ \\    ");
            frame.write(x, y - 1, " \\\\/ __\\/ __\\/ __\\/ __\\/ _:\\   |`.  \\  \\___ \\   ");
            frame.write(x, y, "  \\\\'\\__\\'\\__\\'\\__\\'\\__\\'\\_`.__|\"\"`. \\  \\___ \\  ");
            frame.write(x, y + 1, "   \\\\/ __\\/ __\\/ __\\/ __\\/ __:                \\ ");
            frame.write(x, y + 2, "    \\\\'\\__\\'\\__\\'\\__\\ \\__\\'\\_;-----------------`");
            frame.write(x, y + 3, "     \\\\/___\\/___\\/___\\/___\\/ :_________________|");

            frame.finish(0.1);
        }
    }

    public static void eatTopping(SignBoard board) {
        Random random = new Random();
        int width = board.getWidth();
        int x = board.getWidth() / 5 + 5;
        int y = board.getHeight() / 2;
        int length = 16;

        for (int i = 0; i <= width - length - x + 15; i++) {
            SignBoard.Frame frame = board.newFrame();
            int open = random.nextInt(2);

            // chocolate disappears
            frame.setGreen();
            if (i < 48) {
                frame.write(x + i, y - 3, "  ___  ___  ___  ___  ___.---------------.      ".substring(i));
                frame.write(x + i, y - 2, " .'\\__\\'\\__\\'\\__\\'\\__\\'\\__,`   .  ____ ___ \\    ".substring(i));
                frame.write(x + i, y - 1, " \\\\/ __\\/ __\\/ __\\/ __\\/ _:\\   |`.  \\  \\___ \\   ".substring(i));
                frame.write(x + i, y, "  \\\\'\\__\\'\\__\\'\\__\\'\\__\\'\\_`.__|\"\"`. \\  \\___ \\  ".substring(i));
                frame.write(x + i, y + 1, "   \\\\/ __\\/ __\\/ __\\/ __\\/ __:                \\ ".substring(i));
                frame.write(x + i, y + 2, "    \\\\'\\__\\'\\__\\'\\__\\ \\__\\'\\_;-----------------`".substring(i));
                frame.write(x + i, y + 3, "     \\\\/___\\/___\\/___\\/___\\/ :_________________|".substring(i));
            }

            // pacman moves across board
            frame.setYellow();
            if (open == 1) {
                frame.write(x + i - length, y - 3, open1);
                frame.write(x + i - length, y - 2, open2);
                frame.write(x + i - length, y - 1, open3);
                frame.write(x + i - length, y,     open4);
                frame.write(x + i - length, y + 1, open5);
                frame.write(x + i - length, y + 2, open6);
            } else {
                frame.write(x + i - length, y - 3, close1);
                frame.write(x + i - length, y - 2, close2);
                frame.write(x + i - length, y - 1, close3);
                frame.write(x + i - length, y,     close4);
                frame.write(x + i - length, y + 1, close5);
                frame.write(x + i - length, y + 2, close6);
            }

            frame.finish(0.1);
        }
    }

    public static void pacmanExit(SignBoard board) {
        Random random = new Random();
        int y = board.getHeight() / 2;
        int width = board.getWidth();

        for (int i = width-16; i <=width; ++i) {
            SignBoard.Frame frame = board.newFrame();
            int open = random.nextInt(2);

            // pacman enters
            frame.setYellow();
            if (open == 1) {
                frame.write(i, y - 3, open1.substring(0, width - i));
                frame.write(i, y - 2, open2.substring(0, width - i));
                frame.write(i, y - 1, open3.substring(0, width - i));
                frame.write(i, y,     open4.substring(0, width - i));
                frame.write(i, y + 1, open5.substring(0, width - i));
                frame.write(i, y + 2, open6.substring(0, width - i));
            } else {
                frame.write(i, y - 3, close1.substring(0, width - i));
                frame.write(i, y - 2, close2.substring(0, width - i));
                frame.write(i, y - 1, close3.substring(0, width - i));
                frame.write(i, y,     close4.substring(0, width - i));
                frame.write(i, y + 1, close5.substring(0, width - i));
                frame.write(i, y + 2, close6.substring(0, width - i));
            }

            frame.finish(0.1);
        }
    }
}
