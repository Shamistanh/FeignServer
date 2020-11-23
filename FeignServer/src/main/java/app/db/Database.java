package app.db;

import app.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Database {

    List<User> all = Arrays.asList(new User(0,"Shami","123","456789"),
            new User(1,"Allahverdi","181","458879"),
            new User(2,"Cahid","793","477989"),
            new User(3,"Elbrus","118","788762"),
            new User(4,"Elbrus","118","788762"));
    public List<User> findAll() {
       return all;
    }

    public Optional<User> findById(String id) {
        return Optional.of(new User(1,"Allahverdi","181","458879"));
    }

    public int myId(String id) {
        return Integer.parseInt(id);
    }
    public String myName(String name) {
        return name;
    }
}
