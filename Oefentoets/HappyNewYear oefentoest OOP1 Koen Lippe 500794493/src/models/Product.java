package models;

/**
 * This class represents a Product
 *
 * @author Koen Lippe 500794493
 */
public abstract class Product {

    //Variables
    /**
     * Symbool voor Euro-teken
     */
    public static final String EURO = "\u20AC";

    protected String naam;
    protected double prijs;

    //Constructor

    /**
     * This constructor creates an instance of Product
     *
     * @param naam
     * @param prijs
     */
    public Product(String naam, double prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }

    //Methods

    /**
     * This method returns the price of the product
     *
     * @return the price of the product
     */
    public double getPrijs() {
        return prijs;
    }

    /**
     * Returns the Euro sign
     *
     * @return Euro sign in String format
     */
    public static String getEURO() {
        return EURO;
    }


    abstract boolean isLegaal();

    /**
     * This method gives a visual representation of the Products's information
     * To be used to print out on the screen
     *
     * @return string containing information of the Product
     */
    @Override
    public String toString() {
        return "Naam: " + naam + "\n"
                + "\tPrijs: " + EURO + String.format("%.2f%n", prijs);
    }
}
