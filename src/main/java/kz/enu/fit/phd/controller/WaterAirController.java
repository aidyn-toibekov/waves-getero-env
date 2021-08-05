package kz.enu.fit.phd.controller;

import kz.enu.fit.phd.model.WaterAirModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.TreeMap;

@Controller
public class WaterAirController {

    @GetMapping("/waterair")
    public String main(Model model) {
        model.addAttribute("model", new WaterAirModel());
        return "waterair";
    }

    @PostMapping("/waterair")
    public String greetingSubmit(@ModelAttribute WaterAirModel waterAirModel, Model model) {
        model.addAttribute("model", waterAirModel);

        Map<String, Double> graphData = new TreeMap<>();

        double i = waterAirModel.getLambdaMin();

        while (i <= waterAirModel.getLambdaMax()){
            graphData.put(String.valueOf(i), -1*waterAirModel.func(i));
            i=i+0.1;
        }
        model.addAttribute("chartData", graphData);

        return "waterair";
    }

}