package pl.kamilTestZAkademii.springTest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @GetMapping("/")
    public String add(){
        return"add";
    }
}
