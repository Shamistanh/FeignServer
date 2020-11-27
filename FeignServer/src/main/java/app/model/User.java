package app.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
public class User {
    @Field
    String id;
    @Field
    String name;
    @Field
    String password;
    @Field
    String number;
}
