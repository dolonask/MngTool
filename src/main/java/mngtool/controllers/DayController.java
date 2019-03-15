package mngtool.controllers;

import mngtool.entity.Day;
import mngtool.repositories.DayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/days/")
public class DayController {

    @Autowired
    private DayRepository repository;
    @RequestMapping(value = "all/", method = RequestMethod.GET)
    public ResponseEntity<?> getDays(){
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }

    @RequestMapping(value = "append/", method = RequestMethod.POST)
    public ResponseEntity<?> appendDay(@RequestBody Day day){
        day = repository.save(day);
        return new ResponseEntity<>(day, HttpStatus.CREATED);
    }




}
