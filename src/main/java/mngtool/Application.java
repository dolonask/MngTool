package mngtool;

import mngtool.entity.Day;
import mngtool.repositories.DayRepository;
import mngtool.repositories.TimeRep;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application {

    @Autowired
    private DayRepository dayRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }


    /*@Bean
    InitializingBean saveInDb(){
        return ()->{
            dayRepository.saveAll(createDays());
        };
    }

    private List<Day> createDays(){
        return Arrays.asList(
                new Day("Monday", 1),
                new Day("Вторник", 1),
                new Day("Среда", 1),
                new Day("Четверг", 1),
                new Day("Пятница", 1),
                new Day("Суббота", 1),
                new Day("Воскресение", 0)

        );
    }*/
}
