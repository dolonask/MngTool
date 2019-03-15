package mngtool.repositories;

import mngtool.entity.Day;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DayRepository extends JpaRepository<Day,Integer> {
}
