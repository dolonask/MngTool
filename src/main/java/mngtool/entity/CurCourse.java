package mngtool.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.repository.cdi.Eager;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
@Data
@Table(name = "current_courses")
public class CurCourse {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cur_course_id")
    private int id;
    private int is_active;
    private Date start_date;
    private Date end_date;
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;

    @ManyToMany
            @JoinTable(name = "student_courses",
            joinColumns = @JoinColumn(name = "cur_course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    Set<Student> student;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    @ManyToMany
            @JoinTable(name = "course_times",
            joinColumns = @JoinColumn(name = "cur_course_id"),
            inverseJoinColumns = @JoinColumn(name = "time_id"))
    Set<Time> times;

    @ManyToMany
            @JoinTable(name = "course_days",
            joinColumns = @JoinColumn(name = "cur_course_id"),
            inverseJoinColumns = @JoinColumn(name = "day_id"))
    Set<Day> days;

    
}
