package com.example.workflow;

import org.camunda.bpm.application.ProcessApplication;
import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@EnableProcessApplication
public class Application 
{
  public static void main(String[] args) 
  {
    SpringApplication.run(Application.class);
  }

}
//1.) there is no src/main/webapp with spring boot applications, use src/main/resources/static
//
//2.) for camunda to link the resource to the engine, you will need a process application. This is done easily by adding "@EnableProcessApplication" to your spring boot app.
//
//3.) Autodeployment requires a src/main/resources/META-INF/processes.xml file, but you can leave it empty