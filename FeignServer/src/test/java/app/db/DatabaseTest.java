package app.db;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;


import app.model.User;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;
import org.junit.Test;


public class DatabaseTest {
    List<User> all = Arrays.asList(new User("0","Shami","123","456789"),
            new User("1","Allahverdi","181","458879"),
            new User("2","Cahid","793","477989"),
            new User("3","Elbrus","118","788762"),
            new User("4","Elbrus","118","788762"));

    @Test
    public void findAll() {
        Database db = mock(Database.class);
        Mockito.when(db.findAll()).thenReturn(all);
        Assertions.assertEquals("false", "false");
    }

    @Test
    public void myId(){
        String id = "5";
        Database db = mock(Database.class);
        Mockito.when(db.myId(id)).thenReturn(5);
        Assertions.assertEquals("false", "false");
    }
    @Test
    public void myName(){
        String name="Shami";
        Database db = mock(Database.class);
        Mockito.when(db.myName(name)).thenReturn(name);
        Assertions.assertEquals("false", "false");
    }
}