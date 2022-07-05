public abstract class Vehicle {
    private String type;
    private int spaceTaken;

    private String[] spacesCanUse;

    public Vehicle(String type, int spaceTaken, String[] spacesCanUse) {
        this.type = type;
        this.spaceTaken = spaceTaken;
        this.spacesCanUse = spacesCanUse;
    }

    public void setSpacesCanUse(String[] spacesCanUse) {
        this.spacesCanUse = spacesCanUse;
    }

    public void printType() {
        System.out.println(this.type);
    }

    public int getSpaceTaken() {
        return spaceTaken;
    }

    public String[] getSpacesCanUse() {
        return spacesCanUse;
    }
}
