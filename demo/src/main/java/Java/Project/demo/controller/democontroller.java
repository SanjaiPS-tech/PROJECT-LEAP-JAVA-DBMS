package Java.Project.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import Java.Project.demo.service.DemoService;

public class democontroller {
    @Autowired 
    DemoService  demoService;
    @PostMapping ("/car")
    public List <Car> saveCars(@RequestBody Car car){
        return demoService.saveCars(car);
    }
    
}










// package Java.Project.demo.controller;

// import org.springframework.web.bind.annotation.*;

// @RestController
// @RequestMapping("/api")
// public class DemoController {

//     @GetMapping("/hello")
//     public String hello() {
//         return "Hello from DemoController!";
//     }

//     @GetMapping("/hello/{name}")
//     public String helloName(@PathVariable String name) {
//         return "Hello, " + name + "!";
//     }

//     @PostMapping("/data")
//     public String postData(@RequestBody String data) {
//         return "Received: " + data;
//     }
// }
