package milktea.taro.repository;

import milktea.taro.entity.Member;

public class MemberRepositoryImpl implements MemberRepository {

    private final MemberRepository memberJpaRepository;

    public MemberRepositoryImpl(MemberRepository memberJpaRepository) {
        this.memberJpaRepository = memberJpaRepository;
    }

    @Override
    public Member save(Member member) {
        return memberJpaRepository.save(member);
    }
}
