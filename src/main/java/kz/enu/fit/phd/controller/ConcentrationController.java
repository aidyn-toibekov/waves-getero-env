package kz.enu.fit.phd.controller;

import kz.enu.fit.phd.model.ConcentrationModel;
import kz.enu.fit.phd.model.LowFrequenciesModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;
import java.util.TreeMap;

@Controller
public class ConcentrationController {

    @GetMapping("/concentration")
    public String main(Model model) {
        model.addAttribute("model", new ConcentrationModel());
        return "concentration";
    }

    @PostMapping("/concentration")
    public String greetingSubmit(@ModelAttribute ConcentrationModel concentrationModel, Model model) {
        model.addAttribute("model", concentrationModel);

        Map<String, Double> graphData = new TreeMap<>();
        Map<String, Double> pointData = new TreeMap<>();

        double k = concentrationModel.getkMin();
        while (k <= concentrationModel.getkMax()){
            graphData.put(String.valueOf(k), -1*concentrationModel.func(k));
            pointData.put(String.valueOf(k), concentrationModel.func(k));
            k=k+0.01;
        }

        model.addAttribute("chartData", graphData);
        model.addAttribute("pointData", pointData);

        return "concentration";
    }

}