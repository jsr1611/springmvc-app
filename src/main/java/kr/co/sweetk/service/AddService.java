package kr.co.sweetk.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Service
public class AddService {

    public ModelAndView add(HttpServletRequest request) {
        int i = Integer.parseInt(request.getParameter("t1"));
        int j = Integer.parseInt(request.getParameter("t2"));
        int k = i+j;

        ModelAndView mv = new ModelAndView();

        mv.setViewName("display.jsp");
        mv.addObject("result", k);
        return mv;
    }
}
