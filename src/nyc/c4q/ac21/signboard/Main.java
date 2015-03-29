package nyc.c4q.ac21.signboard;

import java.util.Random;

public class Main {
    /**
     * Draws a scene with a scrolling multicolor zig-zag ribbon.
     * @param board
     *   The board on which to draw.
     * @param numCycles
     *   The number of cycles to draw for.
     *
     *   x goes from left to right
     *   y goes from up and down
     *
     *
     */
    public static void ribbonScene(SignBoard board, int numCycles) {
        int width = board.getWidth();
        int height = board.getHeight();
        for (int i = 0; i < numCycles; ++i) {
            SignBoard.Frame frame = board.newFrame();

            for (int x = -2; x < width; ++x) {
                int y = (2 * height - 2 + x + i) % (2 * height - 2);
                if (y >= height)
                    y = 2 * height - y - 2;
                if (0 < x) {
                    frame.setYellow();
                    frame.write(x, y, "*");
                }
                if (0 < x + 1 && x + 1 < width) {
                    frame.setGreen();
                    frame.write(x + 1, y, "*");
                }
                if (x + 2 < width) {
                    frame.setRed();
                    frame.write(x + 2, y, "*");
                }
            }

            frame.finish(0.02);
        }
    }

    /**
     * Draws a scene with text scrolling across the screen..
     * @param board
     *   The board on which to draw.
     * @param text
     *   The text to scroll.
     */
    public static void scrollTextScene(SignBoard board, String text) {
        int width = board.getWidth();
        int y = board.getHeight() / 2;
        for (int x = -text.length(); x <= width; ++x) {   //
            SignBoard.Frame frame = board.newFrame();

            if (x >= width)
                break;

            if (x < 0)
                // Scrolling on to the left side.
                frame.write(0, y, text.substring(-x));
            else if (x + text.length() <= width)
                // Fully on the board.
                frame.write(x, y, text);
            else
                // Scrolling off the board.
                frame.write(x, y, text.substring(0, width - x));

            frame.finish(0.10); // one-fiftheth of a second
        }
    }


    /**
     * Draws a scene which flashes the words "FRESH" and "HOT".
     * @param board
     *   The board on which to draw.
     * @param cycles
     *   The number of cycles to draw for.
     */
    public static void flashFreshHotScene(SignBoard board, int cycles) {
        Random random = new Random();
        int width = board.getWidth();
        int leftPosition = width / 4 - 12;
        int rightPosition = width / 4 - 7;
        int y = board.getHeight() / 2;

        for (int i = 0; i < cycles * 2; ++i) {
            SignBoard.Frame frame = board.newFrame();
            //y = board.getHeight() / 2 - 2 + (i % 4);

            // Choose a color at random.
            int color = random.nextInt(4);
            if (color == 0)
                frame.setGreen();
            else if (color == 1)
                frame.setRed();
            else if (color == 2)
                frame.setWhite();
            else
                frame.setYellow();
            // Write a word.
            if (i % 3 == 0) {
                frame.write(leftPosition, y - 2, " CCCC HH   HH EEEEE EEEEE SSSSS EEEEE");
                frame.write(leftPosition, y - 1, "CC    HH   HH EE    EE    SS    EE   ");
                frame.write(leftPosition, y    , "C     HHHHHHH EEEE  EEEE  SSSSS EEEE ");
                frame.write(leftPosition, y + 1, "CC    HH   HH EE    EE       SS EE   ");
                frame.write(leftPosition, y + 2, " CCCC HH   HH EEEEE EEEEE SSSSS EEEEE");
            }
            else if (i % 3 == 1){
                frame.write(rightPosition, y - 2, "FFFFF RRRRRR III  CCCC KK  KK EEEEE NN   NN");
                frame.write(rightPosition, y - 1, "FF    RR  RR III CC    KK KK  EE    NNN  NN");
                frame.write(rightPosition, y,     "FFFF  RRRRR  III C     KKK    EEEE  NN N NN");
                frame.write(rightPosition, y + 1, "FF    RR  RR III CC    KK KK  EE    NN  NNN");
                frame.write(rightPosition, y + 2, "FF    RR  RR III  CCCC KK  KK EEEEE NN   NN");
            }
            else {
                frame.write(rightPosition, y - 2, "DDD     OOOOO   OOOOO  DDD    DDD    LL     EEEEE SSSSS !!  ");
                frame.write(rightPosition, y - 1, "D  DD  OO   OO OO   OO D  DD  D  DD  LL     EE    SS    !!  ");
                frame.write(rightPosition, y    , "D   DD OO   OO OO   OO D   DD D   DD LL     EEEE  SSSSS !!  ");
                frame.write(rightPosition, y + 1, "D  DD  OO   OO OO   OO D  DD  D  DD  LL     EE       SS     ");
                frame.write(rightPosition, y + 2, "DDDD    OOOOO   OOOOO  DDDD   DDDD   LLLLLL EEEEE SSSSS !!  ");
            }

            frame.finish(0.50);
        }
    }

    public static void main(String[] args) {
        SignBoard signBoard = new SignBoard(8);

        // Run the sign board forever.
        while (true) {
            ribbonScene(signBoard, 48);
            scrollTextScene(signBoard, "~~~~~~~~~~~GET THEM WHILE THEY'RE HOT!!!~~~~~~~~~~~");
            ribbonScene(signBoard, 48);
            flashFreshHotScene(signBoard, 10);
        }
    }
}
