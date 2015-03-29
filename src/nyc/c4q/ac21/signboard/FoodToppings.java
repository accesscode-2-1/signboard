package nyc.c4q.ac21.signboard;

import java.util.ArrayList;

/**
 * Created by sufeizhao on 3/29/15.
 */
public class FoodToppings {

    public static void toppings(SignBoard board) {
        ArrayList<String> apple = new ArrayList<>();
        apple.add("          .:'    ");
        apple.add("     __ :'__     ");
        apple.add("  .'`  `-'  ``.  ");
        apple.add(" :             : ");
        apple.add(" :             : ");
        apple.add("  :           :  ");
        apple.add("   `.__.-.__.'   ");
        ArrayList<String> jam = new ArrayList<>();
        jam.add("    _____    ");
        jam.add("   <_____>   ");
        jam.add("  /  ___  \\ ");
        jam.add("  |-'   `-|  ");
        jam.add("  |  JAM  |  ");
        jam.add("  |`-...-'|  ");
        jam.add("   `====='   ");
        ArrayList<String> banana = new ArrayList<>();
        banana.add("                   ");
        banana.add("                   ");
        banana.add("                   ");
        banana.add(" \".            ,# ");
        banana.add("  \\ `-._____,-'=/ ");
        banana.add("   `._ ----- _,'   ");
        banana.add("      `-----'      ");
        ArrayList<String> chicken = new ArrayList<>();
        chicken.add("      __//     ");
        chicken.add("     /.__.\\   ");
        chicken.add("     \\ \\/ /  ");
        chicken.add("  '__/     \\  ");
        chicken.add("   \\-      )  ");
        chicken.add("    \\_____/   ");
        chicken.add(" _____|_|____  ");
        ArrayList<String> iceCream = new ArrayList<>();
        iceCream.add("     ()       ");
        iceCream.add("  .-\"`''\"-. ");
        iceCream.add(" /         \\ ");
        iceCream.add(" \\         / ");
        iceCream.add(" /'---'---`\\ ");
        iceCream.add(" \\         / ");
        iceCream.add(" (_.-._.-._)  ");
        ArrayList<String> chocolate = new ArrayList<>();
        chocolate.add("  ___  ___  ___  ___  ___.---------------.");
        chocolate.add("  .'\\__\\'\\__\\'\\__\\'\\__\\'\\__,`   .  ____ ___ \\");
        chocolate.add(" \\\\/ __\\/ __\\/ __\\/ __\\/ _:\\   |`.  \\  \\___ \\");
        chocolate.add("  \\\\'\\__\\'\\__\\'\\__\\'\\__\\'\\_`.__|\"\"`. \\  \\___ \\");
        chocolate.add("   \\\\/ __\\/ __\\/ __\\/ __\\/ __:                \\");
        chocolate.add("    \\\\'\\__\\'\\__\\'\\__\\ \\__\\'\\_;-----------------`");
        chocolate.add("    \\\\/___\\/___\\/___\\/___\\/ :_________________|");

        int x = board.getWidth() / 5 -5;
        int height;

        for (height = 0; height <= board.getHeight(); ++height) {
            SignBoard.Frame frame = board.newFrame();

            frame.setRed();

            if (height == 0) {
                frame.write(x, height, jam.get(6));
            } else if (height == 1) {
                frame.write(x, height - 1, jam.get(5));
                frame.write(x, height, jam.get(6));
            } else if (height == 2) {
                frame.write(x, height - 2, jam.get(4));
                frame.write(x, height - 1, jam.get(5));
                frame.write(x, height, jam.get(6));
            } else if (height == 3) {
                frame.write(x, height - 3, jam.get(3));
                frame.write(x, height - 2, jam.get(4));
                frame.write(x, height - 1, jam.get(5));
                frame.write(x, height, jam.get(6));
            } else if (height == 4) {
                frame.write(x, height - 4, jam.get(2));
                frame.write(x, height - 3, jam.get(3));
                frame.write(x, height - 2, jam.get(4));
                frame.write(x, height - 1, jam.get(5));
                frame.write(x, height, jam.get(6));
            } else if (height == 5) {
                frame.write(x, height - 5, jam.get(1));
                frame.write(x, height - 4, jam.get(2));
                frame.write(x, height - 3, jam.get(3));
                frame.write(x, height - 2, jam.get(4));
                frame.write(x, height - 1, jam.get(5));
                frame.write(x, height, jam.get(6));
            } else if (height == 6 || height == 7) {
                frame.write(x, height - 6, jam.get(0));
                frame.write(x, height - 5, jam.get(1));
                frame.write(x, height - 4, jam.get(2));
                frame.write(x, height - 3, jam.get(3));
                frame.write(x, height - 2, jam.get(4));
                frame.write(x, height - 1, jam.get(5));
                frame.write(x, height, jam.get(6));
            } else {
                continue;
            }

            frame.setYellow();

            if (height == 0) {
                frame.write(x * 2, height, chicken.get(6));
            } else if (height == 1) {
                frame.write(x * 2, height - 1, chicken.get(5));
                frame.write(x * 2, height, chicken.get(6));
            } else if (height == 2) {
                frame.write(x * 2, height - 2, chicken.get(4));
                frame.write(x * 2, height - 1, chicken.get(5));
                frame.write(x * 2, height, chicken.get(6));
            } else if (height == 3) {
                frame.write(x * 2, height - 3, chicken.get(3));
                frame.write(x * 2, height - 2, chicken.get(4));
                frame.write(x * 2, height - 1, chicken.get(5));
                frame.write(x * 2, height, chicken.get(6));
            } else if (height == 4) {
                frame.write(x * 2, height - 4, chicken.get(2));
                frame.write(x * 2, height - 3, chicken.get(3));
                frame.write(x * 2, height - 2, chicken.get(4));
                frame.write(x * 2, height - 1, chicken.get(5));
                frame.write(x * 2, height, chicken.get(6));
            } else if (height == 5) {
                frame.write(x * 2, height - 5, chicken.get(1));
                frame.write(x * 2, height - 4, chicken.get(2));
                frame.write(x * 2, height - 3, chicken.get(3));
                frame.write(x * 2, height - 2, chicken.get(4));
                frame.write(x * 2, height - 1, chicken.get(5));
                frame.write(x * 2, height, chicken.get(6));
            } else if (height == 6 || height == 7) {
                frame.write(x * 2, height - 6, chicken.get(0));
                frame.write(x * 2, height - 5, chicken.get(1));
                frame.write(x * 2, height - 4, chicken.get(2));
                frame.write(x * 2, height - 3, chicken.get(3));
                frame.write(x * 2, height - 2, chicken.get(4));
                frame.write(x * 2, height - 1, chicken.get(5));
                frame.write(x * 2, height, chicken.get(6));
            } else {
                continue;
            }

            frame.setWhite();

            if (height == 0) {
                frame.write(x * 3 + 2, height, iceCream.get(6));
            } else if (height == 1) {
                frame.write(x * 3 + 2, height - 1, iceCream.get(5));
                frame.write(x * 3 + 2, height, iceCream.get(6));
            } else if (height == 2) {
                frame.write(x * 3 + 2, height - 2, iceCream.get(4));
                frame.write(x * 3 + 2, height - 1, iceCream.get(5));
                frame.write(x * 3 + 2, height, iceCream.get(6));
            } else if (height == 3) {
                frame.write(x * 3 + 2, height - 3, iceCream.get(3));
                frame.write(x * 3 + 2, height - 2, iceCream.get(4));
                frame.write(x * 3 + 2, height - 1, iceCream.get(5));
                frame.write(x * 3 + 2, height, iceCream.get(6));
            } else if (height == 4) {
                frame.write(x * 3 + 2, height - 4, iceCream.get(2));
                frame.write(x * 3 + 2, height - 3, iceCream.get(3));
                frame.write(x * 3 + 2, height - 2, iceCream.get(4));
                frame.write(x * 3 + 2, height - 1, iceCream.get(5));
                frame.write(x * 3 + 2, height, iceCream.get(6));
            } else if (height == 5) {
                frame.write(x * 3 + 2, height - 5, iceCream.get(1));
                frame.write(x * 3 + 2, height - 4, iceCream.get(2));
                frame.write(x * 3 + 2, height - 3, iceCream.get(3));
                frame.write(x * 3 + 2, height - 2, iceCream.get(4));
                frame.write(x * 3 + 2, height - 1, iceCream.get(5));
                frame.write(x * 3 + 2, height, iceCream.get(6));
            } else if (height == 6 || height == 7) {
                frame.write(x * 3 + 2, height - 6, iceCream.get(0));
                frame.write(x * 3 + 2, height - 5, iceCream.get(1));
                frame.write(x * 3 + 2, height - 4, iceCream.get(2));
                frame.write(x * 3 + 2, height - 3, iceCream.get(3));
                frame.write(x * 3 + 2, height - 2, iceCream.get(4));
                frame.write(x * 3 + 2, height - 1, iceCream.get(5));
                frame.write(x * 3 + 2, height, iceCream.get(6));
            } else {
                continue;
            }

            frame.setRed();

            if (height == 0) {
                frame.write(x * 4 + 2, height, apple.get(6));
            } else if (height == 1) {
                frame.write(x * 4 + 2, height - 1, apple.get(5));
                frame.write(x * 4 + 2, height, apple.get(6));
            } else if (height == 2) {
                frame.write(x * 4 + 2, height - 2, apple.get(4));
                frame.write(x * 4 + 2, height - 1, apple.get(5));
                frame.write(x * 4 + 2, height, apple.get(6));
            } else if (height == 3) {
                frame.write(x * 4 + 2, height - 3, apple.get(3));
                frame.write(x * 4 + 2, height - 2, apple.get(4));
                frame.write(x * 4 + 2, height - 1, apple.get(5));
                frame.write(x * 4 + 2, height, apple.get(6));
            } else if (height == 4) {
                frame.write(x * 4 + 2, height - 4, apple.get(2));
                frame.write(x * 4 + 2, height - 3, apple.get(3));
                frame.write(x * 4 + 2, height - 2, apple.get(4));
                frame.write(x * 4 + 2, height - 1, apple.get(5));
                frame.write(x * 4 + 2, height, apple.get(6));
            } else if (height == 5) {
                frame.write(x * 4 + 2, height - 5, apple.get(1));
                frame.write(x * 4 + 2, height - 4, apple.get(2));
                frame.write(x * 4 + 2, height - 3, apple.get(3));
                frame.write(x * 4 + 2, height - 2, apple.get(4));
                frame.write(x * 4 + 2, height - 1, apple.get(5));
                frame.write(x * 4 + 2, height, apple.get(6));
            } else if (height == 6 || height == 7) {
                frame.write(x * 4 + 2, height - 6, apple.get(0));
                frame.write(x * 4 + 2, height - 5, apple.get(1));
                frame.write(x * 4 + 2, height - 4, apple.get(2));
                frame.write(x * 4 + 2, height - 3, apple.get(3));
                frame.write(x * 4 + 2, height - 2, apple.get(4));
                frame.write(x * 4 + 2, height - 1, apple.get(5));
                frame.write(x * 4 + 2, height, apple.get(6));
            } else {
                continue;
            }

            frame.finish(0.6);
        }

    }

    public static void toppingsOneLine(SignBoard board) {
        int x = board.getWidth() / 5;
        int y = board.getHeight() / 2;

        for (int i = 0; i < x * 5; i++) {
            SignBoard.Frame frame = board.newFrame();

            frame.setGreen();

            //jam, chicken, ice cream, apple
            frame.write(x + i, y - 3, "  ___  ___  ___  ___  ___.---------------.".substring(i));
            frame.write(x + i, y - 2, " .'\\__\\'\\__\\'\\__\\'\\__\\'\\__,`   .  ____ ___ \\".substring(i));
            frame.write(x + i, y - 1, " \\\\/ __\\/ __\\/ __\\/ __\\/ _:\\   |`.  \\  \\___ \\".substring(i));
            frame.write(x + i, y,     "  \\\\'\\__\\'\\__\\'\\__\\'\\__\\'\\_`.__|\"\"`. \\  \\___ \\".substring(i));
            frame.write(x + i, y + 1, "   \\\\/ __\\/ __\\/ __\\/ __\\/ __:                \\".substring(i));
            frame.write(x + i, y + 2, "    \\\\'\\__\\'\\__\\'\\__\\ \\__\\'\\_;-----------------`".substring(i));
            frame.write(x + i, y + 3, "     \\\\/___\\/___\\/___\\/___\\/ :_________________|".substring(i));

            frame.finish(0.15);
        }
    }
}
