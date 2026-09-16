package Java.Project.demo;


import org.springframework.web.bind.annotation.*;

@RestController
public class demo {
    @GetMapping("/display/{name}")
    public String hello(@PathVariable String name){
        return "hello every one "+name;
    }

}
