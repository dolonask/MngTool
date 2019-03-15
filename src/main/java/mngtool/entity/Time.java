package mngtool.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Set;

@Entity
@Data
@Table(name = "times")
public class Time {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "time_id")
    private int id;
    private LocalTime time;

    /*@ManyToMany(mappedBy = "times")
    Set<CurCourse> courses;*/

    public Time(){

    }

    public Time(LocalTime time){
        this.time = time;
    }
}
