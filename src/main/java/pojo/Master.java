package pojo;

import lombok.Data;

@Data
public class Master {
    private String username;
    private String count;
    private String password;

    public Master(String username, String count, String password) {
        this.username = username;
        this.count = count;
        this.password = password;
    }
}
