package at.refugeescode.mp13magic8ball;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/")
public class TemplateController {

    List<String> sentences = new ArrayList<>();

    @ModelAttribute("sentence")
    String sentence(){

        sentences.add("u r lucky");
        sentences.add("u r the best");
        sentences.add("please keep smiling");

        Collections.shuffle(sentences);

        return sentences.get(0);
    }

   @GetMapping
   String page(){
       return "home";
   }

}
