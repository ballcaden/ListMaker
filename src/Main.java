import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static ArrayList <String> list = new ArrayList<>();

    public static void main(String[] args) {
        boolean run = true;
        list.addAll(Arrays.asList("Drake", "Future", "Lil Wayne", "Nicki Minaj", "Kanye West", "21 Savage", "Lil Tjay", "Lil Baby", "Dababy", "Jay Z"));
        String menuOptions;

        while(run) {
            menuOptions = InputHelper.getRegExString(scan, "A - Add an item to the list\nD - Delete an item from the list\nP - Print the list\nQ - Quit the program", "[AaDdPpQq]");
            if (menuOptions.equalsIgnoreCase("a")) {
                add();
            } else if (menuOptions.equalsIgnoreCase("d")) {
                delete();
            } else if (menuOptions.equalsIgnoreCase("p")) {
                print();
            } else {
                if(quit()) {
                    System.out.println("Gotcha");
                    run = false;
                }
            }
        }


    }

    public static void add() {
        list.add(InputHelper.getNonZeroLenString(scan, "What item would you like to add?"));
        System.out.println();
    }

    public static void delete() {
        list.remove(InputHelper.getRangedInt(scan, "Enter the index of the value you want to remove from the list", 0, list.size()));
        System.out.println();
    }

    public static void print() {
        for(int i = 0; i < list.size(); i++) {
            System.out.println(i + " - " + list.get(i) + " , ");
        }
        System.out.println();
    }

    public static boolean quit() {
        return InputHelper.getYNConfirm(scan, "Are you sure you want to quit(Y/N)");
    }


}