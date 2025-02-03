package nnam01.MyHomePage.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "users")  // 테이블 이름 지정
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;  // 고유 ID (자동 증가)

    @Column(nullable = false, unique = true, length = 50)
    private String username;  // 사용자 아이디 (유니크)

    @Column(nullable = false, length = 50)
    private String password;  // 비밀번호 (암호화 필요)

    @Column(nullable = false, unique = true, length = 50)
    private String email;  // 이메일 (유니크)

    @Column(nullable = false, length = 20)
    private String name;  // 사용자 이름

    @CreationTimestamp
    private LocalDateTime createdAt;  // 가입 날짜 (자동 생성)

    private LocalDate birthday;  // 생년월일

    @Column(length = 15)
    private String phone;  // 전화번호
}