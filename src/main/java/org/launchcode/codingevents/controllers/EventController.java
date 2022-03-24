package org.launchcode.codingevents.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Chris Bay
 */
@Controller
@RequestMapping("events")
public class EventController {

//    private static List<String> events = new ArrayList<>();
//
//    @GetMapping
  public String displayAllEvents(Model model) {
//        model.addAttribute("title", "All Events");
//        model.addAttribute("events", events);
//        return "events/index";


      HashMap<String, String> events = new HashMap<>();
      events.put("muchos chip destroyers","winner wins water to end their dehydration" );
      events.put("roller derby" , " losers get to go to the hospital");
      events.put("type racers", "winner get bragging rights");
      model.addAttribute("events",events);
      return "events/index";
  }
        @GetMapping("create")
    public String displayCreateEventForm(Model model) {
        model.addAttribute("title", "Create Event");
        return "events/create";
    }

    @PostMapping("create")
    public String processCreateEventForm(@RequestParam HashMap<String, String> events) {
        events.entrySet();
        return "redirect:";
    }

}
