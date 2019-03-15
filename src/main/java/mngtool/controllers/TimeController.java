package mngtool.controllers;

import mngtool.entity.Time;
import mngtool.repositories.TimeRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;

@RestController
@RequestMapping(value = "time/")
public class TimeController {
    @Autowired
    private TimeRep timeRep;

    @RequestMapping(value = "append",method = RequestMethod.POST)
    public ResponseEntity<?> appendTime(@RequestBody Time time){
        time = timeRep.save(time);
        return new ResponseEntity<>(time, HttpStatus.OK);
    }

    @RequestMapping(value = "find/{time}", method = RequestMethod.GET)
    public ResponseEntity<?> getTimeId(@PathVariable LocalTime time){
        Time tm = timeRep.getOnyByTimeVal(time);
        if (tm == null){
            tm = timeRep.save(new Time(time));
        }
        return new ResponseEntity<>(tm,HttpStatus.OK);
    }

    @RequestMapping(value = "all/", method = RequestMethod.GET)
    public ResponseEntity<?> getTimes(){
        return new ResponseEntity<>(timeRep.findAll(), HttpStatus.OK);
    }
}
