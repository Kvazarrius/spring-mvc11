package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import web.model.CarList;
import javax.servlet.http.HttpServletRequest;

@Controller
public class CarsController {

    @RequestMapping("/cars")
    public String viewCars(HttpServletRequest request, Model model) {
        if (request.getParameter("count") == null) {
            model.addAttribute("auto", new CarList().autoList(5));
        } else {
            int count = Integer.parseInt(request.getParameter("count"));
            if (count < 5) {
                model.addAttribute("auto", new CarList().autoList(count));
            } else if (count > 5) {
                model.addAttribute("auto", new CarList().autoList(5));
            }
        }
        return "cars";
    }
}