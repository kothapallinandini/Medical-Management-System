package Intermediate_Project;
import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private int id;
    private String name;
    private String specialization;
    private List<Patient> patients; // Simulating patient records associated with the doctor

    // Constructor
    public Doctor(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    // Method to add a patient to the doctor's list of patients
    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    // Method to view all patients associated with the doctor
    public void viewPatients() {
        System.out.println("Patients of Dr. " + name + ":");
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    // Method to provide medical services (dummy method)
    public void provideMedicalServices() {
        System.out.println("Dr. " + name + " is providing medical services.");
    }

    @Override
    public String toString() {
        return "Doctor ID: " + id + ", Name: " + name + ", Specialization: " + specialization;
    }
}
