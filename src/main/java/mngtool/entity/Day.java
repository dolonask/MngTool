package mngtool.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "days")
@Data
public class Day {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dayid")
    private int id;

    private String name;

    private int is_active;

    /*@ManyToMany(mappedBy = "days")
    Set<CurCourse> courses;*/

    public Day(String name, int is_active) {
        this.name = name;
        this.is_active = is_active;
    }

    public Day(){

    }
}
