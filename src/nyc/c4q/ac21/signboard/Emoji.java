package nyc.c4q.ac21.signboard;

import java.util.Random;

/**
 * Created by Sufei on 3/22/15.
 * Emoji.java
 * Emoji slide with jumping emojis and moving waffle
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

    static String leftJump1 = " *   ,- *^^* -, *   ";
    static String leftJump2 = "*  */          \\    ";
    static String leftJump3 = "   /    /\\  /\\  \\ * ";
    static String leftJump4 = "* |  \\    ___   \\'  ";
    static String leftJump5 = "   \\  \\_  \\_/   /\\_  ";
    static String leftJump6 = " *  \\          /   ";
    static String leftJump7 = "*    '--v   v-'  *  ";

    static String rightJump1 = " *  *,- *^^* -,  *  ";
    static String rightJump2 = " *  /          \\   *";
    static String rightJump3 = "   /  /\\  /\\    \\   ";
    static String rightJump4 = "  '/   ___    /  | *";
    static String rightJump5 = " _/\\   \\_/  _/  /   ";
    static String rightJump6 = "    \\          /    ";
    static String rightJump7 = "*    '-v   v--'  *  ";

    static String waffle1 = "  _____  ";
    static String waffle2 = " |■ ■ ■| ";
    static String waffle3 = " |■ ■ ■| ";
    static String waffle4 = " |■ ■ ■| ";


    // enter emoji from left and right
    public static void emoji(SignBoard board) {
        Random random = new Random();
        int width = board.getWidth();
        int y = board.getHeight() / 2;

        for (int i = 0; i <= 20; ++i) {
            SignBoard.Frame frame = board.newFrame();
            int jump = random.nextInt(2);
            int length = 20;

            frame.setGreen();
            frame.write(0, y - 3 - jump, left1.substring(length - i));
            frame.write(0, y - 2 - jump, left2.substring(length - i));
            frame.write(0, y - 1 - jump, left3.substring(length - i));
            frame.write(0, y - jump,     left4.substring(length - i));
            frame.write(0, y + 1 - jump, left5.substring(length - i));
            frame.write(0, y + 2 - jump, left6.substring(length - i));
            frame.write(0, y + 3 - jump, left7.substring(length - i));

            frame.write(width - i, y - 3 - jump, right1.substring(0, i));
            frame.write(width - i, y - 2 - jump, right2.substring(0, i));
            frame.write(width - i, y - 1 - jump, right3.substring(0, i));
            frame.write(width - i, y - jump,     right4.substring(0, i));
            frame.write(width - i, y + 1 - jump, right5.substring(0, i));
            frame.write(width - i, y + 2 - jump, right6.substring(0, i));
            frame.write(width - i, y + 3 - jump, right7.substring(0, i));

            frame.finish(0.1);
        }
    }

    // emoji jumps at set position
    public static void Jump(SignBoard board, int numCycles) {
        Random random = new Random();
        int width = board.getWidth();
        int y = board.getHeight() / 2;
        int length = 20;
        int wafflex = 23, offsetx = 0, waffley = 4, offsety = 0;
        int yumx = width - 30, yumOffx = 0;

        for (int i = 0; i <= numCycles; ++i) {
            SignBoard.Frame frame = board.newFrame();
            int jump = random.nextInt(2);
            frame.setGreen();

            // left jump with randomized number
            if (jump == 1) {
                frame.write(1, y - 3 - jump, leftJump1);
                frame.write(1, y - 2 - jump, leftJump2);
                frame.write(1, y - 1 - jump, leftJump3);
                frame.write(1, y - jump,     leftJump4);
                frame.write(1, y + 1 - jump, leftJump5);
                frame.write(1, y + 2 - jump, leftJump6);
                frame.write(1, y + 3 - jump, leftJump7);
            } else {
                frame.write(1, y - 3 - jump, left1);
                frame.write(1, y - 2 - jump, left2);
                frame.write(1, y - 1 - jump, left3);
                frame.write(1, y - jump,     left4);
                frame.write(1, y + 1 - jump, left5);
                frame.write(1, y + 2 - jump, left6);
                frame.write(1, y + 3 - jump, left7);
            }

            // right jump with randomized number
            if (jump == 1) {
                frame.write(width - length, y - 3 - jump, rightJump1);
                frame.write(width - length, y - 2 - jump, rightJump2);
                frame.write(width - length, y - 1 - jump, rightJump3);
                frame.write(width - length, y - jump,     rightJump4);
                frame.write(width - length, y + 1 - jump, rightJump5);
                frame.write(width - length, y + 2 - jump, rightJump6);
                frame.write(width - length, y + 3 - jump, rightJump7);
            } else {
                frame.write(width - length, y - 3 - jump, right1);
                frame.write(width - length, y - 2 - jump, right2);
                frame.write(width - length, y - 1 - jump, right3);
                frame.write(width - length, y - jump,     right4);
                frame.write(width - length, y + 1 - jump, right5);
                frame.write(width - length, y + 2 - jump, right6);
                frame.write(width - length, y + 3 - jump, right7);
            }

            // waffle moves around board
            frame.setYellow();
            frame.write(wafflex, waffley,     waffle1);
            frame.write(wafflex, waffley + 1, waffle2);
            frame.write(wafflex, waffley + 2, waffle3);
            frame.write(wafflex, waffley + 3, waffle4);

            if (wafflex <= 23) {
                offsetx = 3;
                wafflex += offsetx;
            } else if (wafflex >= width - 30) {
                offsetx = -3;
                wafflex += offsetx;
            } else if (wafflex > 23 && wafflex < width - 30) {
                wafflex += offsetx;
            }

            if (waffley < 2) {
                offsety = 1;
                waffley += offsety;
            } else if (waffley > 3) {
                offsety = -1;
                waffley += offsety;
            } else if (waffley <= 3 && waffley >= 2) {
                waffley += offsety;
            }

            // "YUM" scrolls across board
            int color = random.nextInt(4);
            if (color == 0)
                frame.setGreen();
            else if (color == 1)
                frame.setRed();
            else if (color == 2)
                frame.setWhite();
            else
                frame.setYellow();

            frame.write(yumx, 0, "~ YUMMY! ~");
            if (yumx <= 23) {
                yumOffx = 3;
                yumx += yumOffx;
            } else if (yumx >= width - 30) {
                yumOffx = -3;
                yumx += yumOffx;
            } else if (yumx > 23 && yumx < width - 30) {
                yumx += yumOffx;
            }

            frame.finish(0.13);
        }
    }
}

