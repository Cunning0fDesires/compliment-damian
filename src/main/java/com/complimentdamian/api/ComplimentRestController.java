package com.complimentdamian.api;

import com.complimentdamian.ComplimentPicker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ComplimentRestController {

  @GetMapping("/random-compliment")
  public String getRandomCompliment() {
    return ComplimentPicker.getRandomCompliment();
  }

}
