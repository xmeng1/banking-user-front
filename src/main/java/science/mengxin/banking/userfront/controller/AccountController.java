package science.mengxin.banking.userfront.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping("/primaryAccount")
    public String primaryAccount() {
        return "primaryAccount";
    }

    @RequestMapping("/savingsAccount")
    public String savingsAccount() {
        return "savingsAccount";
    }
}
