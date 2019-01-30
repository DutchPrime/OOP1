package models;

public abstract class Product {
    //Variables
    /**
     * Symbool voor Euro-teken
     */
    public static final String EURO = "\u20AC";

    protected String naam;
    protected double prijs;

    //Constructor
    public Product(String naam, double prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }

    public abstract boolean isLegaal();

    public double getPrijs() {
        return prijs;
    }

    public static String getEURO() {
        return EURO;
    }

    @Override
    public String toString() {
        return "Naam: " + naam + "\n"
                + "\tPrijs: " + EURO + String.format("%.2f%n", prijs);
    }


}
