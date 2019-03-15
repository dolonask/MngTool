package mngtool.controllers;

import mngtool.entity.CurCourse;
import mngtool.repositories.CurCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/manage/")
public class CurrentCourseController {

    @Autowired
    private CurCourseRepository repository;

    @RequestMapping(value = "append/")
    public ResponseEntity<?> appendNewCourse(@RequestBody CurCourse curCourse){
        curCourse = repository.save(curCourse);
        return new ResponseEntity<>(curCourse, HttpStatus.CREATED);
    }

    @RequestMapping(value = "all/", method = RequestMethod.GET)
    public ResponseEntity<?> getAllCurCourses(){
        return new ResponseEntity<>(repository.findAll(),HttpStatus.OK);
    }
}
