//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int currentYear = 2024;

        //Test new parameters (bloodGroup, phoneNumber)
        Patient patient = new Patient(1001, "John Doe", 1978,
                175.5, 78.0, "A", "123-456-7890");
        patient.displayDetails(currentYear);

        //Test BMI calculation
        System.out.printf("Patient BMI: "+ patient.getBMI());

    }

}