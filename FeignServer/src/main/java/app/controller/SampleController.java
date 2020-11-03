package app.controller;

import app.model.User;
import app.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class SampleController {

    private final UserRepo userRepo;

    @Autowired
    MongoTemplate mongoTemplate;

    @GetMapping("subs")
    public List<User> getSubs(){
        User sb = new User("1","Shami","pass","+994501234567");
        return Arrays.asList(sb);
    }

    @GetMapping("findOne")
    public User findOne(String id){
        return userRepo.findById(id);
    }
    @GetMapping("findAll")
    public List<User> findAll(){
        return userRepo.findAll();
    }
    @PostMapping("/save")
    public void add(User user) {
        userRepo.save(user);
    }

//    @PostMapping("/update_name")
//    public void update(String old_name, String new_name) {
//        Query query = new Query();
//        query.addCriteria(Criteria.where("name").is(old_name));
//        Update update = new Update();
//        update.set("name", new_name);
//        User user = mongoTemplate.findAndModify(query, update, User.class);
//
//    }

    @PostMapping("/removeById")
    public void remove(int id) {
        userRepo.removeById(id);
    }
}
