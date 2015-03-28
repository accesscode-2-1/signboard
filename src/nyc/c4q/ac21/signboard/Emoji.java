package nyc.c4q.ac21.signboard;

import java.util.Random;

/**
 * Created by sufeizhao on 3/22/15.
 */
public class Emoji {

    static String left1 = "     ,- *^^* -,     ";
    static String left2 = "    /          \\    ";
    static String left3 = "   /    /\\  /\\  \\   ";
    static String left4 = "  |  \\    ___   \\'  ";
    static String left5 = "   \\  \\         /\\  ";
    static String left6 = "    \\          /    ";
    static String left7 = "     '--v   v-'     ";

    static String right1 = "     ,- *^^* -,     ";
    static String right2 = "    /          \\    ";
    static String right3 = "   /  /\\  /\\    \\   ";
    static String right4 = "  '/   ___   /   |  ";
    static String right5 = "  /\\        /   /   ";
    static String right6 = "    \\          /    ";
    static String right7 = "     '-v   v--'     ";

    // enter emoji
    public static void emoji(SignBoard board) {
        Random random = new Random();
        int width = board.getWidth();
        int y = board.getHeight() / 2;

        for (int i = 0; i <= 20; ++i) {
            SignBoard.Frame frame = board.newFrame();
            int jump = random.nextInt(2);
            int length = 20;

            frame.write(0, y - 3 - jump, left1.substring(length - i));
            frame.write(0, y - 2 - jump, left2.substring(length - i));
            frame.write(0, y - 1 - jump, left3.substring(length - i));
            frame.write(0, y - jump, left4.substring(length - i));
            frame.write(0, y + 1 - jump, left5.substring(length - i));
            frame.write(0, y + 2 - jump, left6.substring(length - i));
            frame.write(0, y + 3 - jump, left7.substring(length - i));

            frame.write(width - i, y - 3 - jump, right1.substring(0, i));
            frame.write(width - i, y - 2 - jump, right2.substring(0, i));
            frame.write(width - i, y - 1 - jump, right3.substring(0, i));
            frame.write(width - i, y - jump, right4.substring(0, i));
            frame.write(width - i, y + 1 - jump, right5.substring(0, i));
            frame.write(width - i, y + 2 - jump, right6.substring(0, i));
            frame.write(width - i, y + 3 - jump, right7.substring(0, i));

            frame.finish(0.1);
        }
    }

    // emoji jumps. length of string = 20
    public static void Jump(SignBoard board, int numCycles) {
        Random random = new Random();
        int width = board.getWidth();
        int y = board.getHeight() / 2;
        int waffley = 4, offsety = 0;
        int length = 20;

        for (int i = 0; i <= numCycles; ++i) {
            SignBoard.Frame frame = board.newFrame();
            int jump = random.nextInt(2);

            if (jump == 1) {
                frame.write(1, y - 3 - jump, " *   ,- *^^* -, *   ");
                frame.write(1, y - 2 - jump, "*  */          \\    ");
                frame.write(1, y - 1 - jump, "   /    /\\  /\\  \\ * ");
                frame.write(1, y - jump, "* |  \\    ___   \\'  ");
                frame.write(1, y + 1 - jump, "   \\  \\_  \\_/   /\\_  ");
                frame.write(1, y + 2 - jump, " *  \\          / *  ");
                frame.write(1, y + 3 - jump, "*    '--v   v-'     ");
            } else {
                frame.write(1, y - 3 - jump, left1);
                frame.write(1, y - 2 - jump, left2);
                frame.write(1, y - 1 - jump, left3);
                frame.write(1, y - jump, left4);
                frame.write(1, y + 1 - jump, left5);
                frame.write(1, y + 2 - jump, left6);
                frame.write(1, y + 3 - jump, left7);
            }

            if (jump == 1) {
                frame.write(width - length, y - 3 - jump, " *  *,- *^^* -,  *  ");
                frame.write(width - length, y - 2 - jump, " *  /          \\   *");
                frame.write(width - length, y - 1 - jump, "   /  /\\  /\\    \\   ");
                frame.write(width - length, y - jump, "  '/   ___    /  | *");
                frame.write(width - length, y + 1 - jump, " _/\\   \\_/  _/  /   ");
                frame.write(width - length, y + 2 - jump, "    \\          /    ");
                frame.write(width - length, y + 3 - jump, "*    '-v   v--'  *  ");
            } else {
                frame.write(width - length, y - 3 - jump, right1);
                frame.write(width - length, y - 2 - jump, right2);
                frame.write(width - length, y - 1 - jump, right3);
                frame.write(width - length, y - jump, right4);
                frame.write(width - length, y + 1 - jump, right5);
                frame.write(width - length, y + 2 - jump, right6);
                frame.write(width - length, y + 3 - jump, right7);
            }

            frame.write(length + 3, waffley, "   __  ");
            frame.write(length + 3, waffley + 1, "  /■ ■\\  ");
            frame.write(length + 3, waffley + 2, " |■ ■ ■|  ");
            frame.write(length + 3, waffley + 3, "  \\■ ■/  ");

            if (waffley < 1) {
                offsety = 1;
                waffley += offsety;
            } else if (waffley > 3) {
                offsety = -1;
                waffley += offsety;
            } else if (waffley <= 3 && waffley >= 1) {
                waffley += offsety;
            }

            frame.finish(0.13);
        }
    }
}

