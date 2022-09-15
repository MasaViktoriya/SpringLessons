package ru.masaviktoria;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Reception {

    public Reception(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Patient patient = context.getBean("patient", Patient.class);
        sayHello(patient);
        seekPatientsMedicalRecord(patient);
        MedicalRecord patientsMedicalRecord = context.getBean("archive", Archive.class).getMedicalRecord(patient.getName());
        patient.goToDoctor(context.getBean("schedule", Schedule.class).findCabinet(patient.getDiseaseCodeByMKB10()));
    }

    private void sayHello(Patient patient) {
        System.out.println("Reception: Hello, " + patient.getName() + ", we are glad to see you in our clinic.");
    }

    private void seekPatientsMedicalRecord(Patient patient) {
        System.out.println("Reception: Just a minute, we need to find your medical record.");
    }

    public static void main(String[] args) {
        new Reception();
    }

}
