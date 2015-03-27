package nyc.c4q.ac21.signboard;

public class Price {

    public static void printAndroid(SignBoard board) {
        int width = board.getWidth();
        int y = board.getHeight() / 2;

        for (int x = -13; x <= 30; ++x) {
            SignBoard.Frame frame = board.newFrame();
            frame.setGreen();

            if (x < 0) {
                // Scrolling from the left side.
                frame.write(0, y - 3, "     \\ /     ".substring(-x));
                frame.write(0, y - 2, "     @@@@     ".substring(-x));
                frame.write(0, y - 1, "    @ @@ @    ".substring(-x));
                frame.write(0, y, "@@ @@@@@@@@ @@".substring(-x));
                frame.write(0, y + 1, "@@ @@@@@@@@ @@".substring(-x));
                frame.write(0, y + 2, "   @@@@@@@@   ".substring(-x));
                frame.write(0, y + 3, "     @@ @@    ".substring(-x));
            } else if (x + 13 <= width) {
                // stopping in the middle
                frame.write(x, y - 3, "     \\ /     ");
                frame.write(x, y - 2, "     @@@@     ");
                frame.write(x, y - 1, "    @ @@ @    ");
                frame.write(x, y, "@@ @@@@@@@@ @@");
                frame.write(x, y + 1, "@@ @@@@@@@@ @@");
                frame.write(x, y + 2, "   @@@@@@@@   ");
                frame.write(x, y + 3, "     @@ @@    ");

            }
            frame.finish(0.1);
        }
    }


    public static void printPrice(SignBoard board, int cycles) {
        int width = board.getWidth();
        int y = board.getHeight() / 2;

        for (int i = 0; i < cycles * 2; ++i) {
            SignBoard.Frame frame = board.newFrame();
            frame.setGreen();

            //android not moving in the middle
            frame.write(30, y - 3, "     \\ /     ");
            frame.write(30, y - 2, "     @@@@     ");
            frame.write(30, y - 1, "    @ @@ @    ");
            frame.write(30, y, "@@ @@@@@@@@ @@");
            frame.write(30, y + 1, "@@ @@@@@@@@ @@");
            frame.write(30, y + 2, "   @@@@@@@@   ");
            frame.write(30, y + 3, "     @@ @@    ");

            //words appear on board
            if (i % 3 == 0) {
                frame.setYellow();
                frame.write(width - 75, y - 3, "****  **  *  *   *   *");
                frame.write(width - 75, y - 2, "*  *  * * *  *    *** ");
                frame.write(width - 75, y - 1, "****  *  **  ****  *  ");
            } else if (i % 2 == 0) {
                frame.setWhite();
                frame.write(width - 70, y, "****  ****  ****   ");
                frame.write(width - 70, y + 1, "**    *  *  ***    ");
                frame.write(width - 70, y + 2, "*     ****  *   *  ");
            } else {
                frame.setRed();
                frame.write(width - 30, y - 1, " $$$$$   $$$$$ $$$$$");
                frame.write(width - 30, y, "   $$    $   $ $   $");
                frame.write(width - 30, y + 1, "  $$     $   $ $   $");
                frame.write(width - 30, y + 2, " $$  $$  $$$$$ $$$$$");
            }
            frame.finish(0.60);


        }
    }

    public static void androidLeaving(SignBoard board) {
        int width = board.getWidth();
        int y = board.getHeight() / 2;

        //android leaving the board
        for (int x = 30; x <= width - 14; ++x) {
            SignBoard.Frame frame = board.newFrame();
            frame.setGreen();

            frame.write(x, y - 3, "     \\ /     ");
            frame.write(x, y - 2, "     @@@@     ");
            frame.write(x, y - 1, "    @ @@ @    ");
            frame.write(x, y, "@@ @@@@@@@@ @@");
            frame.write(x, y + 1, "@@ @@@@@@@@ @@");
            frame.write(x, y + 2, "   @@@@@@@@   ");
            frame.write(x, y + 3, "     @@ @@    ");
            frame.finish(0.08);

        }
    }
}
