package milktea.taro.repository;

import milktea.taro.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
    // 추가적인 메서드가 필요한 경우 여기에 작성
}
