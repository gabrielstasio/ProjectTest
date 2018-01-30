package br.com.gsc.testProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
public class Boot
{

   public static void main(String[] args)
   {

      SpringApplication.run(Boot.class, args);
      System.out.println("Application is running.");
      Boot boot = new Boot();
      boot.home();
      System.out.println("Application is running 2.");
   }

   @GetMapping("/")
   @ResponseBody
   public String home()
   {
      System.out.println("Called home.");
      return "home";
   }
}
