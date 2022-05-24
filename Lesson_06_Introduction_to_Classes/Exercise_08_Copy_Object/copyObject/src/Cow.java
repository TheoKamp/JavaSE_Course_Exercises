class Cow {
    /* Attributes */
    int weight;
    int hunger;

    /* Methods */
    Cow(){
        this.weight = 500;
        this.hunger = 10;
    }

    void express(){
        if(hunger > 5)
            System.out.println("Mooooowwwwwwwwwww");
        else
            System.out.println("Mowwww");
    }
}
