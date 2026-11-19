import java.util.Scanner;


public class main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Name your Pet!");

    String name = scanner.nextLine();

    Cimon cimon = new Cimon(name);

    System.out.println("Meet your new pet, " + name + "!");

    boolean exit = false;
    while (!exit) {
        System.out.println("(1) Feed your pet!");
        System.out.println("(2) Sleep");
        System.out.println("(3) Play a game");
        System.out.println("(4) Study");
        System.out.println("(5) Check stats");
        System.out.println("(6) Quit");
        System.out.println("Enter your choice (1-6)");

        String input = scanner.nextLine().toLowerCase().trim();

        if(input.equals("1")){
            cimon.eat();
            break;
        }
        if(input.equals("2")){
            cimon.sleep();
            break;
        }
        if(input.equals("3")){
            cimon.game();
            break;
        }
        if(input.equals("4")){
            cimon.study();
            break;
        }
        if(input.equals("5")){
            cimon.stats();
            break;
        }
        if(input.equals("6")){
            break;
        }
            

    }


   
}
}

