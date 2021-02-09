
package MyDatePcg;

//import java.time.DayOfWeek;
import java.time.LocalDate; 
//import java.util.Calendar;

public class MyDate {


    private int year;
    private int month;
    private int day;

    private static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
   // private static String[] weekDays2 = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
    private static int[] daysInMonths = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

    public static boolean IsLeapYear(int year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
        {
            return true;
        }
        else return false;                      
    }

    public static boolean isValid(int year, int month, int day) {
        boolean a1;

        a1 = false;
        if ((year > 0 && year <10000) &&
            (month > 0 && month < 13 ) &&
            (day > 0 && day <= daysInMonths[month-1])|| (IsLeapYear(year)))
        { 
            a1 = true;
        }

        if (!(IsLeapYear(year)) && month==2 && day>=29)
        {
            a1 = false;
        }

        return a1;
    }
    
    
     // vraci string
    //public static String getDayOfWeek(int year, int month, int day) {

    	//LocalDate localDate = LocalDate.of(year, month, day);
    	//java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();

        //return dayOfWeek.toString());

    //}
    
   // public static int getDayOfWeek(int year, int month, int day) {

     //   DateTime dateValue = new DateTime(year, month, day);

       // return (int)dateValue.DayOfWeek;

    //}
    

    public MyDate(int year, int month, int day)
    {
        setDate(year, month, day);
    }

    public void setDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;

        if (isValid(year, month, day)==false)
        {
            System.out.println("Invalid year, month or day!");
        }
       
    }

    public void setYear(int year) {

        if (year > 0 && year < 10000)
        {
            this.year = year;
        }
        else { System.out.println("Invalid year!"); }
    }

    public void setMonth(int month)
    {

        if (month > 0 && month < 13)
        {
            this.month = month;
        }
        else { System.out.println("Invalid year!"); }
    }

    public void setDay(int day)
    {

        if ((day > 0 && day < (daysInMonths[month-1])|| (month == 2 && IsLeapYear(year) && day == 29)))
        {
            this.day = day;
        }

        else { System.out.println("Invalid day!"); }
    }

    public int getDay() {return day;}
    public int getMonth() {return month;}
    public int getYear() { return year; }

    public String toString()
    {

    	LocalDate localDate = LocalDate.of(year, month, day);
    	java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
    	

        return  dayOfWeek.toString() +" "+  day +" "+ strMonths[month - 1]+" "+ year;


    }

    public MyDate nextDay() {

       
        if (IsLeapYear(year))
        {
            daysInMonths[1] = 29;
        }

        if ((day == daysInMonths[month - 1]) && month==12)
        {
            month = 1;
            day = 1;
            year += 1; 
        }

        else if (day == daysInMonths[month - 1])
        {
            month += 1;
            day = 1;
        }
        else day += 1;

        if (month > 12)
        {
            month = 1;
            year = +1;
        }

        MyDate oDen = new MyDate(year, month, day);

        return oDen;
    }

    public MyDate nextMonth()
    {

        month = month + 1;
        MyDate oMesic = new MyDate(year, month, day);
        return oMesic;

    }

    public MyDate nextYear() {
        
        year = year + 1;

        MyDate oRok = new MyDate(year, month, day);
        return oRok;
    }

    public MyDate previousDay()
    {

        if (IsLeapYear(year))
        {
            daysInMonths[1] = 29;
        }

        if (month == 1 && day==1)
        {
            month = 12;
            year = year - 1;
            day = daysInMonths[month - 1];
        }
        else
        {
            day = day - 1;
        }
  
        MyDate oDen = new MyDate(year, month, day);

        return oDen;
    }
    public MyDate previousMonth() {
        month = month - 1;

        if (day > daysInMonths[month - 1])
        {
            day = daysInMonths[month - 1];
        }

        MyDate oMesic = new MyDate(year, month, day);
        return oMesic;
    }

    public MyDate previousYear()
    {
        if (IsLeapYear(year) && month == 2)
        {
            day -= 1;
        }
        year = year - 1;

        MyDate oRok = new MyDate(year, month, day);
        return oRok;
    }
}
