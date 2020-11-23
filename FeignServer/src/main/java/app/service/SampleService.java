package app.service;

import app.db.DbRepo;
import app.model.User;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

//    private final UserRepo userRepo;
//
//    public SampleService(UserRepo userRepo) {
//        this.userRepo = userRepo;
//    }
//
//    public Optional<User> findById(String id) {
//        return userRepo.findById(id);
//    }
//
//    public List<User> findAll() {
//        return userRepo.findAll();
//    }
//
//    public void save(User user) {
//        userRepo.save(user);
//    }
//
//    public void removeById(String id) {
//        userRepo.removeById(id);
//    }

//    public void removeAll() {
////        userRepo.removeAll();
//    }

    private final DbRepo dbRepo;

    public SampleService(DbRepo dbRepo) {
        this.dbRepo = dbRepo;
    }


    public Optional<User> findById(String id) {
        return dbRepo.findById(id);
    }

    public List<User> findAll() {
        return dbRepo.findAll();
    }

    public void save(User user) {
        dbRepo.save(user);
    }

    public void removeById(String id) {
        dbRepo.removeById(id);
    }
}
