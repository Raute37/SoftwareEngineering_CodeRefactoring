public class Movie {
	// ===== Attributes ===== //
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDRENS = 2;
    
    private String title;
    private int priceCode;
    
    // ===== Constructor ===== //
    public Movie(String pTitle, int pPriceCode) {
        title = pTitle;
        priceCode = pPriceCode;
    }
    
    // ===== Getter & Setter ===== //
    public int getPriceCode() { return priceCode; }
    public void setPriceCode(int pPriceCode) { priceCode = pPriceCode; }
    public String getTitle() { return title; }
}