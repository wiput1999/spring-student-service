package me.wiput.studentservice;

import javax.websocket.server.PathParam;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableEurekaClient
public class StudentServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(StudentServiceApplication.class, args);
  }

  @GetMapping("/v1/student/{id}")
  ResponseEntity<Student> getStudent(@PathVariable int id) {
    System.out.println(String.format("Requested with id : %d", id));
    return ResponseEntity.ok(new Student(id));
  }


}
