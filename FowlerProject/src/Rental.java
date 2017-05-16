class Rental {
    // ===== Attributes ===== //
	private Movie movie;
    private int daysRented;
    
    // ===== Constructor ===== //
    public Rental(Movie pMovie, int pDaysRented) {
        movie = pMovie;
        daysRented = pDaysRented;
    }
    
    // ===== Getter & Setter ===== //
    public int getDaysRented() { return daysRented; }
    public Movie getMovie() { return movie; }
}