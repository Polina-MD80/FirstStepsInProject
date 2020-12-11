package app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public
class HomeController {

    @GetMapping("/hello")

    public ModelAndView home(ModelAndView modelAndView) {
        modelAndView.setViewName ("hello.html");
        List<String> names = Arrays.asList ("Az","Ti","Toy");
        modelAndView.addObject ("names",names);

        return modelAndView;
    }
}
