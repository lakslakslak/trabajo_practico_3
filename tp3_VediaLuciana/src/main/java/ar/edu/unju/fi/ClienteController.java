package ar.edu.unju.fi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {

    @GetMapping("/form-cliente")
    public String formCliente() {
        return "form-cliente";
    }
}