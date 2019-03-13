package mngtool.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "teachers")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "teacher_id")
    private int id;
    private String name;
    private String phone;
    private String email;
    private int is_active;
    private String info;
    private int age;
}
