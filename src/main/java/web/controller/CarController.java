package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    private static List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car(1111, "KIA", "Roman"));
        carList.add(new Car(2222, "MERCEDES", "Milana"));
        carList.add(new Car(3333, "BENTLEY", "Elena"));
        carList.add(new Car(4444, "BMW", "Andrey"));
        carList.add(new Car(5555, "TOYOTA", "Grigoriy"));
    }

    @GetMapping("/cars")
    public String showCars(@RequestParam(value = "count", required = false) Integer count, Model model) {

        if (count == null) {
            model.addAttribute("carList", carList);
        } else if (count > 0 & count <= 5) {
            model.addAttribute("carList", carList.subList(0, count));
        } else {
            model.addAttribute("carList", carList);
        }

        return "/cars";
    }

}

