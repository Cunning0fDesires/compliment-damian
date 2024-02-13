package org.example.api;

import main.java.org.example.ComplimentPicker;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ComplimentController {

  @GetMapping("/random-compliment")
  @ResponseBody
  public String getRandomCompliment() {
    return ComplimentPicker.getRandomCompliment();
  }

  @GetMapping("")
  public String returnIndex() {
    return "index";
  }
}