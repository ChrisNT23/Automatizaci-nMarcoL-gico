package com.kruger.constants;

/**
 * The Month enum represents the months of the year and provides methods for working with them.
 * This enum is used for handling dates in testing scenarios.
 */
public enum Month {
    JANUARY("Enero", "ene"),
    FEBRUARY("Febrero", "feb"),
    MARCH("Marzo", "mar"),
    APRIL("Abril", "abr"),
    MAY("Mayo", "may"),
    JUNE("Junio", "jun"),
    JULY("Julio", "jul"),
    AUGUST("Agosto", "ago"),
    SEPTEMBER("Septiembre", "sep"),
    OCTOBER("Octubre", "oct"),
    NOVEMBER("Noviembre", "nov"),
    DECEMBER("Diciembre", "dic");

    private final String name;
    private final String abbreviation;

    /**
     * Constructs a new Month enum with the specified name and abbreviation.
     *
     * @param name         The full name of the month.
     * @param abbreviation The abbreviation of the month.
     */
    Month(String name, String abbreviation) {
        this.name = name;
        this.abbreviation = abbreviation;
    }

    /**
     * Gets the Month enum based on the provided month number.
     *
     * @param number The month number (1 for January, 2 for February, etc.).
     * @return The Month enum corresponding to the provided number.
     * @throws IllegalArgumentException if the provided number is out of range.
     */
    public static Month getMonthFromNumber(int number) {
        try {
            int index = number - 1;
            return Month.values()[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalArgumentException("Invalid month number. " + e.getMessage());
        }
    }

    /**
     * Gets the full name of the month.
     *
     * @return The full name of the month.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the abbreviation of the month.
     *
     * @return The abbreviation of the month.
     */
    public String getAbbreviation() {
        return abbreviation;
    }
}
