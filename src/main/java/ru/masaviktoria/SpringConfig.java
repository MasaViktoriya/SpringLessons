package ru.masaviktoria;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean(name = "patient")
    public Patient patient(){
        return new Patient("Nik", 99);
    }

    @Bean(name = "archive")
    public Archive archive(){
        return new Archive();
    }

    @Bean(name = "schedule")
    public  Schedule schedule(){
        return new Schedule();
    }
}
