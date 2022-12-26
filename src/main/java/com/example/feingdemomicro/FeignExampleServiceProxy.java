package com.example.feingdemomicro;

import com.example.feingdemomicro.model.Teacher;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

//@FeignClient(name = "testDemo", url = "http://localhost:8082")
@FeignClient(name = "school-teachers")
public interface FeignExampleServiceProxy {

    @GetMapping("/teachers/all")
    public List<Teacher> invokeExampleMicroservice();

}


