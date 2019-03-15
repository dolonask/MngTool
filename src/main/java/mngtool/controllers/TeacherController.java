package mngtool.controllers;

import mngtool.entity.Teacher;
import mngtool.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/teacher/")
public class TeacherController {

    @Autowired
    private TeacherRepository repository;

    @RequestMapping(value = "append/", method = RequestMethod.POST)
    public ResponseEntity<?> appendTeacher(@RequestBody Teacher teacher){
        teacher = repository.save(teacher);
        return new ResponseEntity<>(teacher, HttpStatus.CREATED);
    }

    @RequestMapping(value = "all/{is_active}", method = RequestMethod.GET)
    public ResponseEntity<?> getUsers(@PathVariable Long is_active){
        return new ResponseEntity<>(repository.findAll(),HttpStatus.OK);
    }

}
