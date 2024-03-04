package milktea.taro.service;

import milktea.taro.entity.Member;
import milktea.taro.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MemberService {

    private final MemberRepository memberRepository;

    @Autowired
    public MemberService(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    public void signUp(String username, String password) {
        Member member = new Member();
        member.setUsername(username);
        member.setPassword(password);
        memberRepository.save(member);
    }
}
