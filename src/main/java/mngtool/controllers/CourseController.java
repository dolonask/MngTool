package mngtool.controllers;

import mngtool.entity.Course;
import mngtool.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/course/")
public class CourseController {

    @Autowired
    private CourseRepository courseRepository;

    @RequestMapping(value = "append/", method = RequestMethod.POST)
    public ResponseEntity<?> appendCourse(@RequestBody Course course){
        course = courseRepository.save(course);
        return new ResponseEntity<>(course, HttpStatus.OK);
    }

}
