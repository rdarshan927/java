class Galaxy {
    String check1;
    int check2;
    double check3;

    public Galaxy(){
        System.out.println("Hello Galaxy!");
    }

    public Galaxy(String check1, int check2){
        this.check1 = check1;
        this.check2 = check2;
        System.out.println(this.check1 + " " + this.check2);
    }

    public Galaxy(String check1, int check2, int check3){
        this.check1 = check1;
        this.check2 = check2;
        this.check3 = check3;
    }
}


class World extends Galaxy{
    public World(){
        this("hello", 21);
        System.out.println("Hello World!");
    }

    public World(String check4, int check5){
        super("hello", 21);
        System.out.println("Hello World2");
    }
}

class Venus extends Galaxy{
    public Venus(){
        System.out.println("Hello Venus!");
    }
}

class Moon extends World{
    public Moon(){
        this("Hello", 21);
        System.out.println("Hello Moon!");
    }

    public Moon(String check6, int check7){
        System.out.println("Hello Moon2");
    }
}

public class Inheritance{
    public static void main(String[] args){
        System.out.println("Hello Milky way!\n\n");

        Moon object1 = new Moon();
        System.out.println("End of Moon\n\n");

        Venus object2 = new Venus();
        System.out.println("End of Venus\n\n");

        World object3 = new World();
        System.out.println("End of World\n\n");

        Galaxy object4 = new Galaxy();
        System.out.println("End of Galaxy");
    }
}