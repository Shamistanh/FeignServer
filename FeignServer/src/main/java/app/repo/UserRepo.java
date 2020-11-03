package app.repo;

import app.model.User;
import com.sun.corba.se.spi.ior.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends MongoRepository<User, ObjectId> {

    void removeById(int id);

    User findById(String id);
}
