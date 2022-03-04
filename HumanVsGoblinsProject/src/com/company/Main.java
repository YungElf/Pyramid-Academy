package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //create a new game
        Game game = new Game();
        Player p = game.getPlayer();
        //create a scanner to process the user input
        Scanner scanner = new Scanner(System.in);

        //keep the game loop until the player dies (RIP)
        do {
            //print the game field at the start of the round
            System.out.println(game.toString());
            System.out.println("w/a/s/d to move around!");
            String input = scanner.next();
            //set the input to lower case, so we compare W and w
            switch (input.toLowerCase(Locale.ROOT)) {
                case "w":
                    //only move if the position is in bounds and available
                    if (game.getEntity(p.getX(), p.getY() - 1) != null)
                        break;
                    if (p.getY() > 0)
                        p.setY(p.getY() - 1);
                    break;
                case "a":
                    //only move if the position is in bounds and available
                    if (game.getEntity(p.getX() - 1, p.getY()) != null)
                        break;
                    if (p.getX() > 0)
                        p.setX(p.getX() - 1);
                    break;
                case "s":
                    //only move if the position is in bounds and available
                    if (game.getEntity(p.getX(), p.getY() + 1) != null)
                        break;
                    if (p.getY() < Game.HEIGHT - 1)
                        p.setY(p.getY() + 1);
                    break;
                case "d":
                    //only move if the position is in bounds and available
                    if (game.getEntity(p.getX() + 1, p.getY()) != null)
                        break;
                    if (p.getX() < Game.WIDTH - 1)
                        p.setX(p.getX() + 1);
                    break;
            }
            //update the game
            game.update();
        } while (game.isRunning());

        System.out.println("You died! RIP");
        System.out.println("You survived " + (game.getWaves() - 1) + " waves!");
    }
}
