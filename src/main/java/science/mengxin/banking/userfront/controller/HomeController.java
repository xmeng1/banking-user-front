package science.mengxin.banking.userfront.controller;

import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import science.mengxin.banking.userfront.dao.RoleDao;
import science.mengxin.banking.userfront.domain.User;
import science.mengxin.banking.userfront.domain.security.UserRole;
import science.mengxin.banking.userfront.service.UserService;

// import science.mengxin.banking.userfront.domain.User;

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

    @Autowired
    UserService userService;
    @Autowired
    private RoleDao roleDao;


    @RequestMapping("/")
    public String home() {
        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String index() {
        // will render the thymeleaf template
        return "index";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signup(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "signup";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String signupPost(@ModelAttribute("user") User user, Model model) {
        if (userService.checkUserExists(user.getUsername(), user.getEmail())) {
            if (userService.checkEmailExists(user.getEmail())) {
                model.addAttribute("emailExists", true);
            }

            if (userService.checkUsernameExists(user.getUsername())) {
                model.addAttribute("usernameExists", true);
            }

            return "signup";
        } else {
            // userService.save(user);
            // user create user replace the save user directly

            Set<UserRole> userRoles = new HashSet<>();
            userRoles.add(new UserRole(user, roleDao.findByName("ROLE_USER")));
            userService.createUser(user, userRoles);

            return "redirect:/";
        }
    }
}
