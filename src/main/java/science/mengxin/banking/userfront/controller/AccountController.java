package science.mengxin.banking.userfront.controller;

import java.security.Principal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import science.mengxin.banking.userfront.domain.PrimaryAccount;
import science.mengxin.banking.userfront.domain.SavingsAccount;
import science.mengxin.banking.userfront.domain.User;
import science.mengxin.banking.userfront.service.UserService;

/**
 * User:    mengxin
 * Date:    07/11/2017
 * Project: banking-user-front
 * Package: science.mengxin.banking.userfront.controller
 * Description: AccountController.
 *
 * @author mengxin
 * @version 1.0
 */

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private UserService userService;

    @RequestMapping("/primaryAccount")
    public String primaryAccount(Model model, Principal principal) {
        User user = userService.findByUsername(principal.getName());
        PrimaryAccount primaryAccount = user.getPrimaryAccount();

        model.addAttribute("primaryAccount", primaryAccount);
        return "primaryAccount";
    }

    @RequestMapping("/savingsAccount")
    public String savingsAccount(Model model, Principal principal) {
        User user = userService.findByUsername(principal.getName());
        SavingsAccount savingsAccount = user.getSavingsAccount();

        model.addAttribute("savingsAccount", savingsAccount);
        return "savingsAccount";
    }
}
