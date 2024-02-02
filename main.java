import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
public class PotionMakingApplication {

    public static void main(String[] args) {
        SpringApplication.run(PotionMakingApplication.class, args);
    }
}

@Controller
class PotionController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @PostMapping("/rest/potions")
    @ResponseBody
    public String checkPotion(@RequestParam String potionName) {
        if (potionName.toLowerCase().equals("secretpotion")) {
            return "You found the flag! VishwaCTF{pr3^@r!c@t3_3l!x!r}";
        } else {
            return "Not a secret potion!";
        }
    }
}
