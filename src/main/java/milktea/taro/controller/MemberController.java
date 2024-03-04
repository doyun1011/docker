package milktea.taro.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MemberController {

    @GetMapping
    public String showLoginPage() {
        return "member/login";
    }

    @GetMapping("/register")
    public String showRegisterForm(Model model) {
        model.addAttribute("member", new Member());
        return "register";
    }

    @PostMapping("/register")
    public String register(Member member) {
        // 여기에 회원 가입 로직을 구현하세요.
        // 예를 들어, 데이터베이스에 회원 정보를 저장하고 로그인 페이지로 이동할 수 있습니다.
        return "redirect:/login";
    }
}
