package com.pvr.springconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RateController {

  @Value("${rate}")
  String rate;
  
  @Value("${lanecount}")
  String laneCount;
  
  @Value("${tollstart}")
  String tollstart;
  
  @Value("${dummyString}")
  String dummyString;

  @RequestMapping("/rate")
  public String getRate(Model model) {
    model.addAttribute("rateamount", rate);
    model.addAttribute("lanes", laneCount);
    model.addAttribute("tollstart", tollstart);
    model.addAttribute("dummyString", dummyString);
    return "rateview";
  }

}
