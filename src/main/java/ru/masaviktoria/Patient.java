package ru.masaviktoria;

import org.springframework.stereotype.Component;

@Component("patient")
public class Patient {


    private final String name;
    private final Integer diseaseCodeByMKB10;

    public Patient(String name, Integer diseaseCodeByMKB10){
        this.diseaseCodeByMKB10 = diseaseCodeByMKB10;
        this.name = name;
        goToReception();
    }

    private void goToReception(){
        System.out.println("Patient: Help please! My disease has number "+ diseaseCodeByMKB10 + " in MKB 10 classification.");
    }

    void goToDoctor(Integer cabinet){
        System.out.println("Patient: I am going to cabinet " + cabinet + " to visit my doctor. Thank you very much!");
    }

    public int getDiseaseCodeByMKB10() {
        return diseaseCodeByMKB10;
    }
    public String getName() {
        return name;
    }
}
