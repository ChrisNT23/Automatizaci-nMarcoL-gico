package com.kruger.utils;

import com.kruger.constants.Month;

/**
 * The DateManager class manages date-related operations.
 * It parses a date string and provides methods to retrieve its components such as year, month, and day.
 */
public class DateManager {
    private final static LoggerManager LOG = LoggerManager.getInstance();
    private final String year;
    private final String monthAbbreviation;
    private final String monthName;
    private final String day;

    /**
     * Constructs a new DateManager instance with the given date string.
     *
     * @param date The date string in the format "yyyy/MM/dd".
     */
    public DateManager(String date) {
        String[] dateDivided = date.split("/");
        validateDateFormat(dateDivided);
        this.year = dateDivided[0];
        try {
            int monthNumber = Integer.parseInt(dateDivided[1]);
            int dayNumber = Integer.parseInt(dateDivided[2]);
            Month month = Month.getMonthFromNumber(monthNumber);
            this.monthAbbreviation = month.getAbbreviation();
            this.monthName = month.getName();
            this.day = String.valueOf(dayNumber);
        } catch (IllegalArgumentException e) {
            LOG.error("Error parsing date --> " + date);
            throw new IllegalArgumentException("Error parsing date --> " + date + e.getMessage());
        }
    }

    /**
     * Validates the format of the date string.
     *
     * @param dateDivided The array containing the date components.
     */
    private void validateDateFormat(String[] dateDivided) {
        if (dateDivided.length != 3) {
            LOG.error("Invalid format date");
            throw new IllegalArgumentException("Invalid format date");
        }
    }

    public String getDay() {
        return day;
    }

    public String getYear() {
        return year;
    }

    public String getMonthAbbreviation() {
        return monthAbbreviation;
    }

    public String getMonthName() {
        return monthName;
    }

}
