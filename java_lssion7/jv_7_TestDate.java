package java_lssion7;

public class jv_7_TestDate {
    public static void main(String[] args) {
        Date d1 = new Date(2019,3,21);
        System.out.println(d1);
        d1.setYear(2019);
        d1.setMonth(2);
        d1.setDay(21);
        System.out.println("year is: " + d1.getYear());
        System.out.println("Month is: " + d1.getMonth());
        System.out.println("Day is: " + d1.getday());
        d1.setDate(2019, 3,21);
        System.out.println(d1);
    }
}
