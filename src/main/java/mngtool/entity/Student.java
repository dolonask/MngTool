package mngtool.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id")
    private int id;
    private String name;
    private String phone;
    private String email;
    private int is_active;
    private String info;
    private int age;
    @ManyToMany(mappedBy = "student")
    Set<CurCourse> courses;
}
