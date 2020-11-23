package app.controller;

import app.model.UpdateModel;
import app.model.User;
import app.service.SampleService;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SampleController {

    private final SampleService sampleService;

    @Autowired
    MongoTemplate mongoTemplate;

    @GetMapping("findOne")
    public Optional<User> findOne(String id) {
        return sampleService.findById(id);
    }

    @GetMapping("findAll")
    public List<User> findAll() {
        return sampleService.findAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody User user) {
        sampleService.save(user);
    }

    @PostMapping("/update_name")
    public void update(@RequestBody UpdateModel updateModel) {
        Query query = new Query();
        query.addCriteria(Criteria.where("name").is(updateModel.getOldName()));
        Update update = new Update();
        update.set("name", updateModel.getNewName());
        User user = mongoTemplate.findAndModify(query, update, User.class);

    }

    @PostMapping("/removeById/{id}")
    public void remove(@PathVariable(value = "id") String id) {
        sampleService.removeById(id);
    }

    @PostMapping("/removeAll")
    public void removeAll() {
//        sampleService.removeAll();
    }
}
