public class Patient {
    private int id;        // patient's ID
    private String name;   // patient's full name
    private int birthYear; // patient's year of birth (CE)
    private double height; // patient's height in centimeters
    private double weight; // patient's weight in kilograms

    /************************************************
     ***************** Constructor ******************
     *************************************************/

    public Patient(int id, String name, int birthYear,
                   double height, double weight) {
        // TODO: Initialize fields with validation
        // Consider: What makes a valid birthYear?
        //           What are valid ranges for height and weight?
        this.id = id;
        this.name = name;

        //birthYear: between 1900 and current year
        if (birthYear >= 1900 && birthYear <= 2025) {
            this.birthYear = birthYear;
        }
        else {
            this.birthYear = 0;
        }

        //height: 30-300 cm
        if (height >= 30 && height <= 300){
            this.height = height;
        }
        else {
            this.height = 0;
        }

        //weight: 0.5-500 kg
        if (weight >= 0.5 && weight <= 500) {
            this.weight = weight;
        }
        else {
            this.weight = 0;
        }
    }

    /************************************************
     ***************** Getter ******************
     *************************************************/

    public int getId() {
        return this.id;
    }

    // TODO: Implement getters for other fields

    public String getName() {
        return this.name;
    }

    public int getBirthYear() {
        return this.birthYear;
    }

    public double getHeight() {
        return this.height;
    }

    private double getWeight(){
        return this.weight;
    }

    public int getAge(int currentYear) {
        // TODO: Add validation and age calculation
        int age = currentYear-birthYear;
        if (age > 0){
            return age;
        }
        else {
            return 0;
        }
    }

    public void displayDetails(int currentYear) {
        System.out.println("Patient Name: " + name);
        System.out.println("Patient Age: " + getAge(currentYear));
        System.out.println("Patient Height (cm): " + height);
        System.out.println("Patient Weight (kg): " + weight);
    }

}