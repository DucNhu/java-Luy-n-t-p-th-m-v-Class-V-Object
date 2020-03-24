package java_lssion7;

public class TestStudent {
    public static void main(String[] args) {
        Student ahTeck = new Student("Duc NHu", "Top1");
        System.out.println(ahTeck);
        ahTeck.setAddress("8 kg jv");
        System.out.println(ahTeck);
        System.out.println(ahTeck.getName());
        System.out.println(ahTeck.getAddress());
//
        ahTeck.addCoursesGrade("T1909", 90);
        ahTeck.addCoursesGrade("T1909c", 920);
        ahTeck.addCoursesGrade("T190c9", 902);
        ahTeck.printGrades();
        System.out.printf("The average fgrade is %.2f%n", ahTeck.getAverageGrade());
    }
}
