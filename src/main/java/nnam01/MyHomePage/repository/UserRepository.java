package nnam01.MyHomePage.repository;

import nnam01.MyHomePage.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // username으로 회원 찾기 (로그인 기능에 사용)
    Optional<User> findByUsername(String username);

    // email로 회원 찾기 (회원가입 시 중복 체크에 사용)
    Optional<User> findByEmail(String email);
}
