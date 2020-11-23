package app.db;

import app.model.User;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class DbRepo {

    private Database database;


    public Optional<User> findById(String id) {
        return database.findById(id);

    }

    public List<User> findAll() {
        return database.findAll();
    }

    public void save(User user) {
    }

    public void removeById(String id) {
    }
}
