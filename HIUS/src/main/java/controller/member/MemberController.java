package controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {
	@RequestMapping("member/memRegist")
	public String MemRegist() {
	 return "member/memRegist";
 };
}