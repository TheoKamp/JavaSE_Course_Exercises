class CliArgs {
    public static void main(String[] args) {
        if (args.length > 2 || args.length == 0)
            System.out.println("Wrong Input!");
        else if (args[0].equals("-h"))
            System.out.println("This is the help section");
        else if (args[0].equals("-p"))
            System.out.println("Running with parameter " + args[1]);
        else
            System.out.println("Wrong Input!");

    }
}
