package submarinos.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/** Main java launcher for los submarinos spring boot application */
@SpringBootApplication
@ComponentScan(basePackages = {"submarinos.spring.kv"})
public class SubmarinosSpringApp {

  public static void main(String[] args) {
    SpringApplication.run(SubmarinosSpringApp.class, args);
  }
}
