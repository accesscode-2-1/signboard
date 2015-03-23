package nyc.c4q.ac21.signboard;

import java.util.Random;

/**
 * Created by sufeizhao on 3/22/15.
 */
public class Emoji {

    // enter emoji. length of string = 20
    public static void emoji(SignBoard board) {
        Random random = new Random();
        int width = board.getWidth();
        int y = board.getHeight() / 2;

        for (int i = 0; i<=20; ++i) {
            SignBoard.Frame frame = board.newFrame();
            int jump = random.nextInt(2);

            frame.write(0, y - 3 - jump, "     ,- *^^* -,     ".substring(20-i));
            frame.write(0, y - 2 - jump, "    /          \\    ".substring(20-i));
            frame.write(0, y - 1 - jump, "   /    /\\  /\\  \\   ".substring(20-i));
            frame.write(0, y - jump, "  |  \\    ___   \\'  ".substring(20-i));
            frame.write(0, y + 1 - jump, "   \\  \\         /\\  ".substring(20-i));
            frame.write(0, y + 2 - jump, "    \\          /    ".substring(20-i));
            frame.write(0, y + 3 - jump, "     '--v   v-'     ".substring(20-i));


            frame.write(width-i, y - 3 - jump, "     ,- *^^* -,     ".substring(0, i));
            frame.write(width-i, y - 2 - jump, "    /          \\    ".substring(0, i));
            frame.write(width-i, y - 1 - jump, "   /  /\\  /\\    \\   ".substring(0, i));
            frame.write(width-i, y - jump, "  '/   ___   /   |  ".substring(0, i));
            frame.write(width-i, y + 1 - jump, "  /\\        /   /   ".substring(0, i));
            frame.write(width-i, y + 2 - jump, "    \\          /    ".substring(0, i));
            frame.write(width-i, y + 3 - jump, "     '-v   v--'     ".substring(0, i));

            frame.finish(0.1);
        }
    }

    // emoji jumps. length of string = 20
    public static void Jump(SignBoard board, int numCycles) {
        Random random = new Random();
        int width = board.getWidth();
        int y = board.getHeight() / 2;

        for (int i = 0; i <= numCycles; ++i) {
            SignBoard.Frame frame = board.newFrame();
            int jump = random.nextInt(2);

            if (jump == 1) {
                frame.write(1, y - 3 - jump, "     ,- *^^* -,     ");
                frame.write(1, y - 2 - jump, "    /          \\    ");
                frame.write(1, y - 1 - jump, "   /    /\\  /\\  \\   ");
                frame.write(1, y - jump, "  |  \\    ___   \\'  ");
                frame.write(1, y + 1 - jump, "   \\  \\_  \\_/   /\\_  ");
                frame.write(1, y + 2 - jump, "    \\          /    ");
                frame.write(1, y + 3 - jump, "     '--v   v-'     ");
            } else {
                frame.write(1, y - 3 - jump, "     ,- *^^* -,     ");
                frame.write(1, y - 2 - jump, "    /          \\    ");
                frame.write(1, y - 1 - jump, "   /    /\\  /\\  \\   ");
                frame.write(1, y - jump, "  |  \\    ___   \\'  ");
                frame.write(1, y + 1 - jump, "   \\  \\         /\\  ");
                frame.write(1, y + 2 - jump, "    \\          /    ");
                frame.write(1, y + 3 - jump, "     '--v   v-'     ");
            }

            if (jump == 1) {
                frame.write(width-20, y - 3 - jump, "     ,- *^^* -,     ");
                frame.write(width-20, y - 2 - jump, "    /          \\    ");
                frame.write(width-20, y - 1 - jump, "   /  /\\  /\\    \\   ");
                frame.write(width-20, y - jump, "  '/   ___    /  |  ");
                frame.write(width-20, y + 1 - jump, " _/\\   \\_/  _/  /   ");
                frame.write(width-20, y + 2 - jump, "    \\          /    ");
                frame.write(width-20, y + 3 - jump, "     '-v   v--'     ");
            } else {
                frame.write(width-20, y - 3 - jump, "     ,- *^^* -,     ");
                frame.write(width-20, y - 2 - jump, "    /          \\    ");
                frame.write(width-20, y - 1 - jump, "   /  /\\  /\\    \\   ");
                frame.write(width-20, y - jump, "  '/   ___    /  |  ");
                frame.write(width-20, y + 1 - jump, "  /\\         /  /   ");
                frame.write(width-20, y + 2 - jump, "    \\          /    ");
                frame.write(width-20, y + 3 - jump, "     '-v   v--'     ");
            }

            frame.finish(0.13);
        }
    }
}
