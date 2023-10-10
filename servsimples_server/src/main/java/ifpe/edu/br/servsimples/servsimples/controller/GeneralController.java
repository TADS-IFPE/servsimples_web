package ifpe.edu.br.servsimples.servsimples.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class GeneralController {
    @GetMapping("/")
    public String initial(Model m) {

        return "index";

    }

}
