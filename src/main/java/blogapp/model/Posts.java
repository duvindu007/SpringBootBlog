package blogapp.model;

import com.sun.deploy.security.ValidationState;

import javax.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "posts")

public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String title;
    private Date date_posted;
    private String content;

    /*
    @ManyToOne(cascade = CascadeType.ALL, targetEntity = User.class)
    private Long user_id;
     */
}
