package ru.masaviktoria;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component("archive")
public class Archive {

    private HashMap<String, MedicalRecord> recordsStore;

    public Archive(){
        this.recordsStore = new HashMap<>();
    }

    MedicalRecord getMedicalRecord(String patientName){
        MedicalRecord medicalRecord = new MedicalRecord();
        if (recordsStore.get(patientName)!=null) {
            medicalRecord = recordsStore.get(patientName);
            System.out.println("Reception: Here is your medical record.");
        } else {
            recordsStore.put(patientName, medicalRecord);
            System.out.println("Reception: Created a new medical record for you: " + patientName + ", " + recordsStore.get(patientName).toString());
        }
        return medicalRecord;
    }
}
