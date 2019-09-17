package com.example.eurekaclient.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

// name  访问得哪个应用？
@FeignClient(name="product")
public interface ProductClient {

    @GetMapping("/msg")
    String productMsg();


}
