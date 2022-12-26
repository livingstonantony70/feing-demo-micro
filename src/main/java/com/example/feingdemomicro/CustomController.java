package com.example.feingdemomicro;

import com.example.feingdemomicro.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomController {
    @Autowired
    FeignExampleServiceProxy feignExampleServiceProxy;

    @GetMapping("/feigndemo")
    public List<Teacher> invokeExampleMicroService() {
        System.out.println(".......Inside the Feign Proxy.........");
        return feignExampleServiceProxy.invokeExampleMicroservice();
    }

}
