package mngtool.repositories;

import mngtool.entity.Time;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalTime;

public interface TimeRep extends JpaRepository<Time,Integer> {
    @Query("select u from Time  u where u.time = ?1")
    Time getOnyByTimeVal(LocalTime time);
}
