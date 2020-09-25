package com.homework22;


import com.homework22.executor.Executor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main implements ApplicationRunner {

    private final Executor executor;

    @Autowired
    public Main(Executor executor) {
        this.executor = executor;
    }

    public static void main(String[] args) {
        SpringApplication.run(com.homework22.Main.class, args);
    }

    public void run(ApplicationArguments args) throws Exception {
        executor.execute();
    }
}
