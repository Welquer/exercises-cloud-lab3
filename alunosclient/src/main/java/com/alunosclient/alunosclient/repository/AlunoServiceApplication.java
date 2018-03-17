package com.alunosclient.alunosclient.repository;

import com.alunosclient.alunosclient.models.Aluno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AlunoServiceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AlunoServiceApplication.class, args);
    }

    @Autowired
    AlunoRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Aluno(null, "Welquer", 1, "welquerke@gmail.com"));
    }
}
