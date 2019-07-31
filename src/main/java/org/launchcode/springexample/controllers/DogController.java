package org.launchcode.springexample.controllers;

import org.launchcode.springexample.models.Dog;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
@RequestMapping(value="dog")
public class DogController {

    @GetMapping(value="")
    public String getDog(Model model) {
        Dog exampleDog = new Dog("Bernie", 3.5, "Basset/Beagle");
        model.addAttribute("title", "Dog Title");
        model.addAttribute("dog", exampleDog);
        model.addAttribute("printStuff", false);
        model.addAttribute("doNotPrintStuff", true);
        ArrayList<Integer> stuff = new ArrayList<>();
        stuff.add(1);
        stuff.add(2);
        stuff.add(5);
        model.addAttribute("numbers", stuff);
        return "dog/index";
    }

    /*
    @GetMapping(value="")
    @ResponseBody
    public Dog getDog() {
        Dog exampleDog = new Dog("Bernie", 3.5, "Basset/Beagle");
        return exampleDog;
    }*/

    @PostMapping(value="")
    @ResponseBody
    public HashMap<String, String> postDog() {
        HashMap<String, String> exampleDogJSON = new HashMap<>();
        exampleDogJSON.put("name", "Bernie");
        return exampleDogJSON;
    }
}
