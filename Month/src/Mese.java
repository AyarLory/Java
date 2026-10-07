public class Mese {

    private int month;
    private Year year;

    public Mese(int month, Year year) {
        this.month = month;
        this.year = year;
    }

    // Restituisce il numero di giorni del mese
    public int getDays() {

        if (month == 1) {
            return 31;
        }
        if (month == 2) {
            if (year.isLeapYear()) {
                return 29;
            } else {
                return 28;
            }}
            if (month == 3) {
                return 31;
            }
            if (month == 4) {
                return 30;
            }
            if (month == 5) {
                return 31;
            }
            if (month == 6) {
                return 30;
            }
            if (month == 7) {
                return 31;
            }
            if (month == 8) {
                return 31;
            }
            if (month == 9) {
                return 30;
            }
            if (month == 10) {
                return 31;
            }
            if (month == 11) {
                return 30;
            }
            if (month == 12) {
                return 31;
            }
        return 0;
    }





    // Restituisce il nome del mese
    public String getMonth() {

        if (month == 1) {
            return "Gennaio";
        }
        if (month == 2) {
            return "Febbraio";
        }
        if (month == 3) {
            return "Marzo";
        }
        if (month == 4) {
            return "Aprile";
        }
        if (month == 5) {
            return "Maggio";
        }
        if (month == 6) {
            return "Giugno";
        }
        if (month == 7) {
            return "Luglio";
        }
        if (month == 8) {
            return "Agosto";
        }
        if (month == 9) {
            return "Settembre";
        }
        if (month == 10) {
            return "Ottobre";
        }
        if (month == 11) {
            return "Novembre";
        }
        if (month == 12) {
            return "Dicembre";
        }
        return "Mese non valido";
    }
}