package main.java.org.example.api;

import main.java.org.example.ComplimentPicker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComplimentController {

  @GetMapping("/random-compliment")
  public String getRandomCompliment() {
    return ComplimentPicker.getRandomCompliment();
  }

  @GetMapping("")
  public String returnIndex() {
    return "index";
  }
}