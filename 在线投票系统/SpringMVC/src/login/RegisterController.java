package login;

import javax.annotation.Resource;
import javax.validation.Valid;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class RegisterController {
	@Resource(name="login1")
	ILogin login;
	public ILogin getLogin() {
		return login;
	}
	public void setLogin(ILogin login) {
		this.login = login;
	}
	@RequestMapping("/reg")
	public String checkUser(User user) {
	// 使用spring框架加载配置文件
//	ApplicationContext act = new ClassPathXmlApplicationContext("spring.xml");
//	ILogin login = (ILogin) act.getBean("login");
	if (login.execute(user)) {
		return "register_succ";
	}else{
		return "register_err";
	}
}
/*
	public String registerUser(@Valid User user,Errors errors) {
		if (errors.getErrorCount()>0) {
			for(FieldError error:errors.getFieldErrors()){
				System.out.println(error.getField() + ":" + error.getDefaultMessage());//调试信息，可看到错误信息
			}
			return "forward:/register.jsp";
		} else {
			return "register_succ";
		}
	}
	@RequestMapping("/changeLocale")
	public String changeLocale(){
	return "forward:/register.jsp";
	}
*/

}
