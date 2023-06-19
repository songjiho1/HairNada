package com.example.hairnada.controller.hair;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hair/*")
@RequiredArgsConstructor
public class HairController {

    @GetMapping("/hairStyleList")
    public void hairStyleList(){}

    @GetMapping("/hairStyleRead")
    public void hairStyleRead(){}
}
