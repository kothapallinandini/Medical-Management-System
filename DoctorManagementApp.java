package Intermediate_Project;

import java.util.ArrayList;
import java.util.List;

public class DoctorManagementApp {
    private List<Doctor> doctors;

    // Constructor
    public DoctorManagementApp() {
        doctors = new ArrayList<>();
    }

    // Method to add a new doctor
    public void addDoctor(String name, String specialization) {
        int id = doctors.size() + 1; // Simple ID assignment
        Doctor doctor = new Doctor(id, name, specialization);
        doctors.add(doctor);
    }

    // Method to view all doctors
    public void viewAllDoctors() {
        System.out.println("List of Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }

    // Method to simulate accessing patient records for a doctor
    public void accessPatientRecords(int doctorId) {
        for (Doctor doctor : doctors) {
            if (doctor.getId() == doctorId) {
                doctor.viewPatients();
                return;
            }
        }
        System.out.println("Doctor not found with ID: " + doctorId);
    }

    // Main method to test the DoctorManagementApp
    public static void main(String[] args) {
        DoctorManagementApp app = new DoctorManagementApp();

        // Adding some doctors
        app.addDoctor("Dr. John Doe", "Cardiologist");
        app.addDoctor("Dr. Jane Smith", "Pediatrician");

        // Viewing all doctors
        app.viewAllDoctors();

        // Simulating accessing patient records for a doctor
        app.accessPatientRecords(1); // Assuming doctor with ID 1

        // Simulating providing medical services by a doctor
        Doctor doctor = app.doctors.get(0); // Assuming the first doctor in the list
        doctor.provideMedicalServices();
    }
}
