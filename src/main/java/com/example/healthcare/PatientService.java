package com.example.healthcare;

import org.springframework.stereotype.Service;
import java.util.List;
import java.util.ArrayList;

@Service
public class PatientService {

    public void addPatient(Patient patient) {
        // Implement database insert logic here
    }

    public List<Patient> getPatients() {
        // Implement database query logic to get patients
        return new ArrayList<>();
    }
}
