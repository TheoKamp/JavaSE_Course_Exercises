class Main {
    public static void main(String[] args) {
        Cow molly = new Cow();
        Cow hegge = new Cow();

        hegge.weight = molly.weight;
        hegge.hunger = molly.hunger;

        System.out.println("Molly weight: " + molly.weight + " hunger: " + molly.hunger);
        System.out.println("Hegge weight: " + hegge.weight + " hunger: " + hegge.hunger);
    }
}
