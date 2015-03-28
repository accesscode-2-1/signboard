package nyc.c4q.ac21.signboard;

import java.util.Random;

public class WaffleText {

    public static void printWaffleDanceScene(SignBoard board, int cycles) {

        Random random = new Random();
        int width = board.getWidth();
        int y = board.getHeight() / 2;

        for (int i = 0; i < cycles * 2; ++i) {
            SignBoard.Frame frame = board.newFrame();

            // Choose a color at random.
            int color = random.nextInt(2);
            if (color == 0)
                frame.setYellow();
            else
                frame.setWhite();

            if (i % 2 == 0) {
                frame.write(5, y - 3, "╔═╦═╦═╦═╗           ╔═╦═╦═╦═╗           ╔═╦═╦═╦═╗           ╔═╦═╦═╦═╗");
                frame.write(5, y - 2, "╠═╬═╬═╬═╣ ╔═╦═╦═╦═╗ ╠═╬═╬═╬═╣ ╔═╦═╦═╦═╗ ╠═╬═╬═╬═╣ ╔═╦═╦═╦═╗ ╠═╬═╬═╬═╣");
                frame.write(5, y - 1, "╠═╬═╬═╬═╣ ╠═╬═╬═╬═╣ ╠═╬═╬═╬═╣ ╠═╬═╬═╬═╣ ╠═╬═╬═╬═╣ ╠═╬═╬═╬═╣ ╠═╬═╬═╬═╣");
                frame.write(5, y    , "╠═╬═╬═╬═╣ ╠═╬═╬═╬═╣ ╠═╬═╬═╬═╣ ╠═╬═╬═╬═╣ ╠═╬═╬═╬═╣ ╠═╬═╬═╬═╣ ╠═╬═╬═╬═╣");
                frame.write(5, y + 1, "╚═╩═╩═╩═╝ ╠═╬═╬═╬═╣ ╚═╩═╩═╩═╝ ╠═╬═╬═╬═╣ ╚═╩═╩═╩═╝ ╠═╬═╬═╬═╣ ╚═╩═╩═╩═╝");
                frame.write(5, y + 2, "          ╚═╩═╩═╩═╝           ╚═╩═╩═╩═╝           ╚═╩═╩═╩═╝          ");
            } else {
                frame.write(5, y - 3, "          ╔═╦═╦═╦═╗           ╔═╦═╦═╦═╗           ╔═╦═╦═╦═╗          ");
                frame.write(5, y - 2, "╔═╦═╦═╦═╗ ╠═╬═╬═╬═╣ ╔═╦═╦═╦═╗ ╠═╬═╬═╬═╣ ╔═╦═╦═╦═╗ ╠═╬═╬═╬═╣ ╔═╦═╦═╦═╗");
                frame.write(5, y - 1, "╠═╬═╬═╬═╣ ╠═╬═╬═╬═╣ ╠═╬═╬═╬═╣ ╠═╬═╬═╬═╣ ╠═╬═╬═╬═╣ ╠═╬═╬═╬═╣ ╠═╬═╬═╬═╣");
                frame.write(5, y    , "╠═╬═╬═╬═╣ ╠═╬═╬═╬═╣ ╠═╬═╬═╬═╣ ╠═╬═╬═╬═╣ ╠═╬═╬═╬═╣ ╠═╬═╬═╬═╣ ╠═╬═╬═╬═╣");
                frame.write(5, y + 1, "╠═╬═╬═╬═╣ ╚═╩═╩═╩═╝ ╠═╬═╬═╬═╣ ╚═╩═╩═╩═╝ ╠═╬═╬═╬═╣ ╚═╩═╩═╩═╝ ╠═╬═╬═╬═╣");
                frame.write(5, y + 2, "╚═╩═╩═╩═╝           ╚═╩═╩═╩═╝           ╚═╩═╩═╩═╝           ╚═╩═╩═╩═╝");
            }
            frame.finish(0.23);
        }
    }

    public static void shakeWaffleText(SignBoard board, int cycles) {
        Random random = new Random();
        int width = board.getWidth();
        int x = board.getWidth();
        int y = board.getHeight() - 1;

        for (int i = 0; i < cycles * 2; ++i) {
            SignBoard.Frame frame = board.newFrame();

            int color = random.nextInt(4);

            if (color == 0)
                frame.setYellow();
            else if (color == 1)
                frame.setGreen();
            else if (color == 2)
                frame.setRed();
            else
                frame.setWhite();

            int randX = random.nextInt(80 - 22); // Must subtract length of string to stay in bounds.
            int randY = random.nextInt(6);

            // Print "WAFFLES!" at random coordinates.
            for (int j = 0; j < cycles * 2; j++) {

                frame.write(randX, y - 2 - randY, "╦ ╦╔═╗╔═╗╔═╗╦  ╔═╗╔═╗┬");
                frame.write(randX, y - 1 - randY, "║║║╠═╣╠╣ ╠╣ ║  ║╣ ╚═╗│");
                frame.write(randX, y -     randY, "╚╩╝╩ ╩╚  ╚  ╩═╝╚═╝╚═╝o");

            }
            frame.finish(0.3);
        }
    }

}
