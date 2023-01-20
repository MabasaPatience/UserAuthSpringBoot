package patience.com.example.UserAuthSpringBoot.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name="User", uniqueConstraints  =@UniqueConstraint(columnNames ="email"))
public class User {

    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long id;


    private String firstname;
    private String lastname;
    private String email;
    private String password;


    @ManyToMany(fetch=FetchType.EAGER,cascade = CascadeType.ALL)
    @JoinTable(
            name="user_roles",
            joinColumns =@JoinColumn(
                    name="user_id",referencedColumnName = "id"
            ) ,
            inverseJoinColumns = @JoinColumn(
                    name="role_id",referencedColumnName = "id"
            )
    )
    private List<Role> role;

    public User() {
    }

    public User(String firstname, String lastname, String email, String password, List<Role> role) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Role> getRole() {
        return role;
    }

    public void setRole(List<Role> role) {
        this.role = role;
    }
}
