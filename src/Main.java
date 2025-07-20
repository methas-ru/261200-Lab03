//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int currentYear = 1980;

        System.out.println("\n");

        // Test valid patient
        Patient validPt = new Patient(1001, "John Doe", 1978, 175.5, 78.0);
        validPt.displayDetails(currentYear);

        System.out.println("\n");

        // Test invalid patient
        Patient invalidPt = new Patient(1002, "Joe Dohn", 1990, -160.0, -65.0);
        invalidPt.displayDetails(currentYear);
    }

}