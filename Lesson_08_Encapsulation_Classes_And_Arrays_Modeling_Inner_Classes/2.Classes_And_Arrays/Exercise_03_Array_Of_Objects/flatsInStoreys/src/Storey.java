class Storey {

    private Flat[] flats; // ARRAY OF FLAT OBJECTS

    /* CONSTRUCTOR ALLOCATE MEMORY FOR THE NUMBER OF
       FLATS IN THE STOREY */
    Storey(int cFlats) {
        this.flats = new Flat[cFlats];
        for(int i = 0; i < flats.length; i++)
            flats[i] = new Flat();
    }

    /* ADD PEOPLE IN A FLAT IN THE STOREY */
    public void setFlatsPeople(int flat, int people) {
        flats[flat].addPeople(people);
    }

    /* RETURNS THE NUMBER OF PEOPLE IN A FLAT OF
       THE STOREY */
    public int getFlatsPeople(int flat) {
        return flats[flat].getPeople();
    }

    /* RETURNS THE NUMBER OF THE FLATS IN
       THE STOREY */
    public int getFlats() {
        return flats.length;
    }
}
