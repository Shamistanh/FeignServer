package app.controller;

import app.model.UpdateModel;
import app.model.User;
import app.service.SampleService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SampleController {

    private final SampleService sampleService;

    @GetMapping("findAll")
    public ResponseEntity<List<User>> getAll() {
        return ResponseEntity.ok(sampleService.findAll());
    }

    @GetMapping("findOne")
    public ResponseEntity<User> findOne(String id) {
        return ResponseEntity.ok(sampleService.findOne(id));
    }

    @PostMapping("/save")
    public void save(@RequestBody User user) {
        sampleService.save(user);
    }

    @PostMapping(value = "/update_name")
    public void update(@RequestBody UpdateModel updateModel) {
        sampleService.update(updateModel);
    }

    @PostMapping(value = "/removeById/{id}")
    public void remove(@PathVariable(value = "id") String id) {
        sampleService.removeById(id);
    }
}
