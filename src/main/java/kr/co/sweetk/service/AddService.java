package kr.co.sweetk.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class AddService {

    public ModelAndView add(int i, int j) {
//        int i = Integer.parseInt(request.getParameter("t1"));
//        int j = Integer.parseInt(request.getParameter("t2"));
        int k = i+j;

        ModelAndView mv = new ModelAndView();

        mv.setViewName("display");
        mv.addObject("result", k);
        return mv;
    }
}
