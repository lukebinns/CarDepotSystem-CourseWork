public class Date
{
    /** Fields of a Date - just the day, month and year*/
    private int day;
    private int month;
    private int year;
    
      
    /**
     * Constructor for objects of class Date
     * @param d - the day part of the date (1 - 31, depending on the month).
     * @param m - the month part of the date (1 - 12).
     * @param y - the year part of the date.*/
    public Date(int d, int m, int y)
    {
        day = d;
        month = m;
        year = y;
    }
    /**
     * Default Constructor for objects of class Date set the constructed date to 1/01/1970.  This is a default setting
     * and is obviously "in the past"
     */
    public Date()
    {
        day = 1;
        month = 1;
        year = 1970;
    }

    /**
     * method to set the Date
     * @param d - the day part of the date (1 - 31, depending on the month).
     * @param m - the month part of the date (1 - 12).
     * @param y - the year part of the date.
     * Note: No error checking in this version ! */
    public void setDate(int d, int m, int y)
    {
        day = d;
        month = m;
        year = y;
    }
    
    /**
     * @return the date as a String, format "09/11/2002" */
    public String toString()
    {
        return as2Digits(day) + "/" + as2Digits(month) + "/" + year;
    }
    
    /** Internal method to add a leading zero if necessary. */
    private String as2Digits (int i)
    {
        if (i <10) {return "0" + i;}
        else {return "" + i;}
    }
    public boolean equals(Object o){
        if (o instanceof Date){
            Date d = (Date)o;
            return d.toString().equals(this.toString());
        }
        return false;
    }
        
}
