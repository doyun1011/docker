package milktea.taro.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Member {

    private String id;
    private String password;
    private String nickName;
    private String email;
    private int exp;

    public Member(String id, String password, String nickName, String email) {
        this.id = id;
        this.password = password;
        this.nickName = nickName;
        this.email = email;
    }

    public Member() {
    }
}

