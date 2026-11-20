import java.util.Scanner;


public class main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Name your Cimon!");

    String name = scanner.nextLine();

    Cimon cimon = new Cimon(name);

    System.out.println("Meet your new Cimon, " + name + "!");

    System.out.println("You trek along the earth to search for the coveted diamond encrusted anh nguyen");
    System.out.println("Suddenly, you stumble upon a cave with wild snovelberry bushes conviently placed around the perimeter of the mouth");
    System.out.println("You notice a strange, shimmering, almost blinding figure laying amongst a pile of flaming hot cheetos");
    System.out.println("Do you approach the figure? Y/N");
     String choice = scanner.nextLine();

    if(choice.equalsIgnoreCase("Y")){
        System.out.println("One step into the gaping mouth of the cave and, BOOM! You crash through a thin bore to the bottom of the pit");
        System.out.println("You wipe the suffocating dust from your eyes, from the rocks appears Vorgaloth, the Dread-Maw");
        System.out.println("What is your first move?");
         boolean exit = false;
    while (!exit) {
        System.out.println("(1) Attack!");
        System.out.println("(2) Heal");
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
    if(choice.equalsIgnoreCase("N")){
        System.out.println("You leave like a loser");
    }


   
}
}

