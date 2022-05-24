class Building {

    private Storey[] storeys; // ARRAY OF STOREY OBJECTS

    /* CONSTRUCTOR ALLOCATE MEMORY FOR STOREYS
       IN THE BUILDING AND THE NUMBER OF FLATS
       IN A STOREY */
    Building(int cStoreys, int cFlats) {
        storeys = new Storey[cStoreys];
        for(int i = 0; i < storeys.length; i++)
            storeys[i] = new Storey(cFlats);
    }

    /* ADD PEOPLE IN A FLAT OF STOREY */
    public void addPeople(int storey, int flat, int people) {
        storeys[storey].setFlatsPeople(flat, people);
    }

    /* PRINT THE BUILDING STOREYS, FLATS AND
       THE NUMBER OF PEOPLE IN THE FLATS */
    public void printBuilding() {
        for(int i = storeys.length-1; i >= 0 ; i--) {
            System.out.println("Storey " + i);
            for (int j = 0; j < storeys[i].getFlats(); j++)
                System.out.println("\tFlat " + (j + 1) + ": " + storeys[i].getFlatsPeople(j));
        }
    }

    /** THIS TWO METHODS BELOW IS FOR THE LOOP IN MAIN CLASS */

    /* RETURNS THE NUMBER OF STOREYS IN THE BUILDING */
    public int getBuildingLength() {
        return storeys.length;
    }

    /* RETURNS THE NUMBER OF FLATS IN A STOREY */
    public int getStoreysFlats(int storey) {
        return storeys[storey].getFlats();
    }
}
