package mngtool.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "courses")
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_id")
    private int id;

    private String name;
    private Long price;
    private int is_active;
    private float duration;

}
