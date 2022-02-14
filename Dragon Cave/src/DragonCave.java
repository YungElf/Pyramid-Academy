import java.util.Scanner;

public class DragonCave {
    public static void print(String text) {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
        System.out.println(text);
    }

    public static void main(String[] args) {
        DragonCave.print("You are in a land full of dragons.");
        DragonCave.print("In front of you, you see two caves.");
        DragonCave.print("In one cave, the dragon is friendly and will share his treasure with you.");
        DragonCave.print("The other dragon is greedy and hungry and will eat you on sight.");
        DragonCave.print("Which cave will you go into, adventurer?");
        Scanner myObj = new Scanner(System.in);
        String cave;
        System.out.println("Cave 1 or Cave 2?");
        cave = myObj.nextLine();

        if (cave.equals("1")) {
            System.out.println("A large dragon jumps out in front of you! You are eaten before you have a chance to react");
            ;
        } else {
            System.out.println("A tiny dragon beckons to you. He offers you a lion's share of gold and jewels. Your village will never struggle for food again.");
        }
    }
}
