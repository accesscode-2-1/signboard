package nyc.c4q.ac21.signboard;

import java.util.Random;

public class Main {
    /**
     * Draws a scene with a scrolling multicolor zig-zag ribbon.
     * @param board
     *   The board on which to draw.
     * @param numCycles
     *   The number of cycles to draw for.
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

    public static void foodScene(SignBoard board, int numCycles) {
        int width = board.getWidth();
        int height = board.getHeight();
        int x = 0;
        int y = 0;
        int xOffset = 1;
        int yOffset = 1;
        String text =  "■     ■   ■ ■ ■   ■      ■ ■ ■  ■   ■  ■ ■ ■   ■ ■ ■  ■ ■ ■  ■ ■ ■  ■ ■";
        String text1 = "■     ■   ■       ■      ■   ■  ■   ■  ■       ■      ■   ■  ■   ■  ■  ■";
        String text2 = "■  ■  ■   ■ ■     ■      ■   ■  ■   ■  ■ ■     ■ ■    ■   ■  ■   ■  ■   ■";
        String text3 = "■  ■  ■   ■       ■      ■   ■  ■   ■  ■       ■      ■   ■  ■   ■  ■  ■ ";
        String text4 = " ■ ■ ■    ■ ■ ■   ■ ■ ■  ■ ■ ■   ■ ■   ■ ■ ■   ■      ■ ■ ■  ■ ■ ■  ■ ■";

        for (int i = 0; i < numCycles; ++i) {
            SignBoard.Frame frame = board.newFrame();


            setRandColor(frame);
            frame.write(x,y,text);
            setRandColor(frame);
            frame.write(x,y+1,text1);
            setRandColor(frame);
            frame.write(x,y+2,text2);
            setRandColor(frame);
            frame.write(x,y+3,text3);
            setRandColor(frame);
            frame.write(x,y+4,text4);

            y+=yOffset;
            if(y > 3) {
                yOffset = -1;
                y+=yOffset;
            }
            if(y < 0) {
                yOffset = 1;
                y+=yOffset;
            }
            x+=xOffset;
            if(x > width - text2.length()){
                xOffset = -1;
                x+=xOffset;
            }
            if(x < 0){
                xOffset = 1;
                x+=xOffset;
            }








            frame.finish(0.05);
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
        for (int x = -text.length(); x <= width; ++x) {
            SignBoard.Frame frame = board.newFrame();
            setRandColor(frame);
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

            frame.finish(0.02);
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
        int rightPosition = 3 * width / 4 - 17;
        int centerPosition = width/4;
        int y = board.getHeight() / 2;

        for (int i = 0; i < cycles * 2; ++i) {
            SignBoard.Frame frame = board.newFrame();

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
                setRandColor(frame);
                frame.write(leftPosition, y - 2, " SSS  U   U PPPPP EEEEE RRRRR       ");
                setRandColor(frame);
                frame.write(leftPosition, y - 1, "S     U   U P   P E     R   R     ");
                setRandColor(frame);
                frame.write(leftPosition, y    , "  SS  U   U PPPPP EEEEE RRRRR     ");
                setRandColor(frame);
                frame.write(leftPosition, y + 1, "S   S U   U P     E     RRR        ");
                setRandColor(frame);
                frame.write(leftPosition, y + 2, " SSS  UUUUU p     EEEEE R  RR");
            }
                else if (i % 3 == 1){
                setRandColor(frame);
                frame.write(rightPosition, y - 2, " CCCC  AAAAA  RRRRR  TTTTT");
                setRandColor(frame);
                frame.write(rightPosition, y - 1, "C      A   A  R   R    T  ");
                setRandColor(frame);
                frame.write(rightPosition, y,     "C      AAAAA  RRRRR    T ");
                setRandColor(frame);
                frame.write(rightPosition, y + 1, "C      A   A  RRR      T ");
                setRandColor(frame);
                frame.write(rightPosition, y + 2, " CCCC  A   A  R  RR    T ");
            }
//                else if (i % 2 == 0) {
//            frame.write(leftPosition, y - 2, " ktflyjfhhjgvjkbgblj/lk/l       ");
//            frame.write(leftPosition, y - 1, "hn jh ,hj vhkkjhbjbljbjbjbl    ");
//            frame.write(leftPosition, y    , "  Skjbjbljknlk;klm;;lml;m;l     ");
//            frame.write(leftPosition, y + 1, "ylgukghlkk;hknbbh hhhhhhguyu       ");
//            frame.write(leftPosition, y + 2, " SSS  UUUUU p     EEEEE R  RR");
//            }

             else {
                setRandColor(frame);
                frame.write(centerPosition, y - 2, "■■■■■   ■   ■■■■■   ■■■■■ ■■■■■");
                setRandColor(frame);
                frame.write(centerPosition, y - 1, "■   ■   ■      ■       ■  ■   ■");
                setRandColor(frame);
                frame.write(centerPosition, y,     "■■■■■   ■     ■       ■   ■■■■■");
                setRandColor(frame);
                frame.write(centerPosition, y + 1, "■       ■    ■       ■    ■   ■");
                setRandColor(frame);
                frame.write(centerPosition, y + 2, "■       ■   ■■■■■   ■■■■■ ■   ■");

             }

            frame.finish(0.25);
        }
    }
    public static void setRandColor(SignBoard.Frame frame){

//        Random randomGenerator = new Random();
//        int random = randomGenerator.nextInt(4);

        int random = (int)(Math.random() * 3);

        if(random == 0){
            frame.setGreen();
        }
        else if(random == 1){
            frame.setRed();
        }
        else if(random == 2){
            frame.setWhite();
        }
        else {
            frame.setYellow();
        }
    }
    public static void main(String[] args) {
        SignBoard signBoard = new SignBoard(8);

        // Run the sign board forever.
        while (true) {
            ribbonScene(signBoard, 48);

            scrollTextScene(signBoard, "~~~~~ ⚡⚡⚡ ★✮★★★★ < SUPER CART > ★★★★★★ ⚡⚡⚡ ~~~~~~");
            //scrollTextScene(signBoard, "###  SUPER CART  ###");
            //scrollTextScene(signBoard, "###  SUPER CART  ###");
            foodScene(signBoard, 200);
            ribbonScene(signBoard, 48);
            flashFreshHotScene(signBoard, 8);
        }
    }
}
