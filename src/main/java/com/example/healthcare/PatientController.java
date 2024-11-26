package com.example.healthcare;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {

    @Autowired
    private PatientRepository patientRepository;

    // Endpoint to add a patient
    @PostMapping
    public String addPatient(@RequestBody Patient patient) {
        patientRepository.save(patient);
        return "Patient added successfully!";
    }

    // Endpoint to view all patients
    @GetMapping
    public List<Patient> viewPatients() {
        return patientRepository.findAll();
    }
}
