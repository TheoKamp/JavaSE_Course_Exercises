class Flat {

    private int people;

    /* CONSTRUCTOR FOR FLAT SETS THE PEOPLE NUMBER IN 0 */
    Flat() {
        this.people = 0;
    }

    /* GETTER AND SETTER FOR PEOPLE IN FLAT */
    public void setPeople(int people) {
        this.people = people;
    }
    public int getPeople() {
        return people;
    }

    /* ADD PEOPLE IN FLAT */
    public void addPeople(int people) {
        this.people += people;
    }
}
