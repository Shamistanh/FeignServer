package app.repo;

import app.model.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepo extends MongoRepository<User, String> {

    void removeById(String id);

    Optional<User> findById(String id);
}
