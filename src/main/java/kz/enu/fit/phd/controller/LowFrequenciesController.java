package kz.enu.fit.phd.controller;

import kz.enu.fit.phd.model.LowFrequenciesModel;
import kz.enu.fit.phd.model.WaterAirModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;
import java.util.TreeMap;

@Controller
public class LowFrequenciesController {

    @GetMapping("/lowfrequencies")
    public String main(Model model) {
        model.addAttribute("model", new LowFrequenciesModel());
        return "lowfrequencies";
    }

    @PostMapping("/lowfrequencies")
    public String greetingSubmit(@ModelAttribute LowFrequenciesModel lowFrequenciesModel, Model model) {
        model.addAttribute("model", lowFrequenciesModel);

        Map<String, Double> graphData1 = new TreeMap<>();
        Map<String, Double> pointData1 = new TreeMap<>();
        Map<String, Double> graphData2 = new TreeMap<>();
        Map<String, Double> pointData2 = new TreeMap<>();
        Map<String, Double> graphData3 = new TreeMap<>();
        Map<String, Double> pointData3 = new TreeMap<>();

        double xi = lowFrequenciesModel.getXiMin()*Math.PI;
        while (xi <= lowFrequenciesModel.getXiMax()*Math.PI){
            graphData1.put(String.valueOf(xi), -1*lowFrequenciesModel.func(xi,lowFrequenciesModel.getK11()));
            pointData1.put(String.valueOf(xi), lowFrequenciesModel.func(xi, lowFrequenciesModel.getK11()));
            graphData2.put(String.valueOf(xi), -1*lowFrequenciesModel.func(xi, lowFrequenciesModel.getK22()));
            pointData2.put(String.valueOf(xi), lowFrequenciesModel.func(xi, lowFrequenciesModel.getK22()));
            graphData3.put(String.valueOf(xi), -1*lowFrequenciesModel.func(xi, lowFrequenciesModel.getK33()));
            pointData3.put(String.valueOf(xi), lowFrequenciesModel.func(xi, lowFrequenciesModel.getK33()));
            xi=xi+0.1;
        }

        model.addAttribute("chartData1", graphData1);
        model.addAttribute("pointData1", pointData1);
        model.addAttribute("chartData2", graphData2);
        model.addAttribute("pointData2", pointData2);
        model.addAttribute("chartData3", graphData3);
        model.addAttribute("pointData3", pointData3);

        return "lowfrequencies";
    }

}