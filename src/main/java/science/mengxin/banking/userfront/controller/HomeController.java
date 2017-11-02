package science.mengxin.banking.userfront.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * User:    mengxin
 * Date:    02/11/2017
 * Project: banking-user-front
 * Package: science.mengxin.banking.userfront.controller
 * Description: HomeController.
 *
 * @author mengxin
 * @version 1.0
 */

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home() {
        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String index() {
        // will render the thymeleaf template
        return "index";
    }
}
