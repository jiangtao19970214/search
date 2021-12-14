package pojo;

import lombok.Data;

@Data
public class User {
    private String user_name;
    private String password;
    private String email;
    public User(String user_name, String password, String email) {
        this.user_name = user_name;
        this.password = password;
        this.email = email;
    }
}
