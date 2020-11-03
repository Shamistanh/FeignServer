package app.controller;

import app.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import app.service.SampleService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class SampleController {

    private final SampleService sampleService;

    @GetMapping("subs")
    public ResponseEntity<List<User>> getUsers(){
        return ResponseEntity.ok(sampleService.getBody());
    }

    @GetMapping("findAll")
    public ResponseEntity<List<User>> getAll(){
        return ResponseEntity.ok(sampleService.getAll());
    }

    @GetMapping("findOne")
    public ResponseEntity<User> findOne(String id){
        return ResponseEntity.ok(sampleService.findOne(id));
    }

    @PostMapping("/save")
    public void add(User user) {
        sampleService.save(user);
    }

//    @PostMapping("/update_name")
//    public void update(String old_name, String new_name) {
//        sampleService.update(old_name,new_name);
//    }
    @PostMapping("/removeById")
    public void remove(int id) {
        sampleService.removeById(id);
    }
}