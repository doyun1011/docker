package milktea.taro.controller;

import milktea.taro.entity.Member;
import milktea.taro.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class MemberController {

    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping("/")
    public String getSignUpForm(Model model) {
        model.addAttribute("member", new Member());
        return "signup_form"; // 회원가입 폼을 나타내는 HTML 페이지의 이름
    }

    @PostMapping("/signup")
    public String signUp(@ModelAttribute Member member) {
        memberService.signUp(member.getUsername(), member.getPassword());
        return "redirect:/"; // 루트 경로로 리다이렉션
    }
}
