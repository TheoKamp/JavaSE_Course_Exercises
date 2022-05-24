class Main {

    public static void main(String[] args) {
        Cycle cycle = new Cycle(1.0, "in");
        System.out.println("Perimeter to cm: " + cycle.perimeterCm());
        System.out.println("Perimeter to in: " + cycle.perimeterIn());
    }
}
