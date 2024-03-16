package com.complimentdamian.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ComplimentController {

  @GetMapping("/")
  public String returnIndex() {
    return "index";
  }
}