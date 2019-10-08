package model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer user_id;
    private String user_name;
    private String email;
    private String passwsord;
    private String image_file;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "posts", referencedColumnName = "user_id")
    private Set<Posts> posts;

    public int getUser_id() {
        return user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasswsord() {
        return passwsord;
    }

    public void setPasswsord(String passwsord) {
        this.passwsord = passwsord;
    }

    public String getImage_file() {
        return image_file;
    }

    public void setImage_file(String image_file) {
        this.image_file = image_file;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public User(String user_name, String email, String passwsord) {
        this.user_name = user_name;
        this.email = email;
        this.passwsord = passwsord;
    }

    protected User() {
    }
}
