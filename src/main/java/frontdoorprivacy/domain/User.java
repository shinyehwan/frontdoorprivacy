package frontdoorprivacy.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class User {

    private long id;
    private Role role;
    private String userName;
    private String birth;
    private String phoneNumber;
    private String userId;
    private String password;
    private String email;
    // private UseYN userYN; 회원 탈퇴등에 쓰이는 거 같은데 아직 몰라서 구현 안해놓은 값임. 회의나 데베쪽에서 결정할 것

    public User(Role role, String userName, String birth, String phoneNumber, String userId,
                String password, String email) {
        this.role = role;
        this.userName = userName;
        this.birth = birth;
        this.phoneNumber = phoneNumber;
        this.userId = userId;
        this.password = password;
        this.email = email;
    }
}
