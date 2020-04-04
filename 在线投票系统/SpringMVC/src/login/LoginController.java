package login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@RequestMapping("lsl")
@SessionAttributes(value={"user"})
public class LoginController {
//@RequestMapping("/login")
@RequestMapping(value="/login",produces="text/html;charset=UTF-8")
@ResponseBody
public String checkUser(String username,String password) {
	Login login=new Login();
	if (login.doLogin(username,password)) {
		return "µÇÂ¼³É¹¦"+username;
	} else {
		return "µÇÂ¼Ê§°Ü";
	}
}

/*public String checkUser(User user) {
Login login=new Login();
if (login.doLogin(user.getUsername(),user.getPassword())) {
return "login_suc";
} else {
return "login_err";
}
}*/
}

