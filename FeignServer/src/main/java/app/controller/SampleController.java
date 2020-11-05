package app.controller;

import app.model.UpdateModel;
import app.model.User;
import app.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
public class SampleController {

    private final UserRepo userRepo;

    @Autowired
    MongoTemplate mongoTemplate;

    @GetMapping("findOne")
    public Optional<User> findOne(String id){
        return userRepo.findById(id);
    }
    @GetMapping("findAll")
    public List<User> findAll(){
        return userRepo.findAll();
    }
    @PostMapping("/save")
    public void save(User user) {
        userRepo.save(user);
    }

    @PostMapping("/update_name")
    public void update(@RequestBody UpdateModel updateModel) {
        Query query = new Query();
        query.addCriteria(Criteria.where("name").is(updateModel.getOld_name()));
        Update update = new Update();
        update.set("name", updateModel.getNew_name());
        User user = mongoTemplate.findAndModify(query, update, User.class);

    }

    @PostMapping("/removeById/{id}")
    public void remove(@PathVariable(value = "id") String id) {
        System.out.println(id);
        userRepo.removeById(id);
    }
}
