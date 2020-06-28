package com.neusoft;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuboting
 * @date 2020/6/23 10:24
 */
@RestController
public class DemoController {
    @GetMapping("/index")
    public String index(){
        return "hello Springboot";
    }
}
