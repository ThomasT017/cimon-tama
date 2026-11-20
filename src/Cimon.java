public class Cimon {
    private String name;
    private int hunger;
    private int energy;
    private int health;
    private int sanity;
    private int intelligence;
    private int happiness;


    public Cimon(String name) {
        this.name = name;
        this.hunger = 100;
        this.energy = 100;
        this.health = 50;
        this.sanity = 100;
        this.intelligence = 5;
        this.happiness = 100;
    }


    public void eat() {
        System.out.println(name + " ate food");
        hunger -= 5;
    
    }
    public void sleep() {
       System.out.println(name + " is taking a nap");
    }
    public void study() {
        System.out.println(name + " is studying hard!");
       
    }
    public void game() {
        System.out.println(name + " is having some fun!");
       
    }
    public void stats() {
        System.out.println(name + "'s STATS");
        System.out.println("Hunger = " + hunger);
        System.out.println("Energy = " + energy);
        System.out.println("Health = " + health);
        System.out.println("Sanity = " + sanity);
        System.out.println("Happiness = " + happiness);
        System.out.println("Iq = " + intelligence);

       
    }
}





