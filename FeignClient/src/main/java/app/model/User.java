package app.model;

import com.sun.corba.se.spi.ior.ObjectId;
import lombok.Data;

@Data
public class User {
    String id;
    String name;
    String password;
    String number;
}