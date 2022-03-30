package kr.co.sweetk.controller;

import kr.co.sweetk.service.AddService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;

@Controller
public class AddController {

    private final AddService addService;

    public AddController(AddService addService){
        this.addService = addService;
    }

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("t1") int i, @RequestParam("t2") int j, HttpServletResponse response){
        return addService.add(i, j);
    }
}
