public class Year {

    private int year;

    public Year(int year) {
        this.year = year;
    }

    // Restituisce true se l'anno è bisestile
    public boolean isLeapYear() {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    // Restituisce l'anno
    public int getYear() {
        return year;
    }
}