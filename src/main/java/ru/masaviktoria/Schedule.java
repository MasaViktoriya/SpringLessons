package ru.masaviktoria;

import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component("schedule")
public class Schedule {

    private final HashMap<Integer, String[]> doctorsClassificationByDiseases;
    private final HashMap<String, Integer> cabinetsByDoctor;
    public Schedule(){
        doctorsClassificationByDiseases = new HashMap<>();
        doctorsClassificationByDiseases.put(99, new String[]{"doctor1", "doctor2"});
        cabinetsByDoctor = new HashMap<>();
        cabinetsByDoctor.put("doctor1", 101);
        cabinetsByDoctor.put("doctor2", 102);
    }

    Integer findCabinet(Integer diseaseCodeByMKB10) {
        Integer cabinet = 0;
        String doctor;
        if (doctorsClassificationByDiseases.containsKey(diseaseCodeByMKB10)) {
            doctor = doctorsClassificationByDiseases.get(diseaseCodeByMKB10)[(int) (Math.random() * doctorsClassificationByDiseases.get(diseaseCodeByMKB10).length)];
            if (cabinetsByDoctor.containsKey(doctor)) {
                cabinet = cabinetsByDoctor.get(doctor);
            }
        }
        if (!cabinet.equals(0)) {
            System.out.println("Reception: Your doctor is waiting at cabinet " + cabinet + ".");
        } else {
            System.out.println("Reception: Sorry, we don't have a suitable specialist right now.");
        }
        return cabinet;
    }

/*
    public HashMap<Integer, String[]> getDoctorsClassificationByDiseases() {
        return doctorsClassificationByDiseases;
    }

    public HashMap<String, Integer> getCabinetsByDoctor() {
        return cabinetsByDoctor;
    }
*/

}
