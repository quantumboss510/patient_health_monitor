package com.example.healthcare;

public class Main {
    public static void main(String[] args) {
        // Add sample patients
        PatientManager.addPatient("John Doe", "1990-01-01", "123 Main St", "555-1234");
        PatientManager.addPatient("Jane Smith", "1985-05-15", "456 Elm St", "555-5678");

        // View all patients
        PatientManager.viewPatients();
    }
}
