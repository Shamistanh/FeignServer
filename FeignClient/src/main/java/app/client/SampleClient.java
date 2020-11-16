package app.client;

import app.model.UpdateModel;
import app.model.User;
import feign.Headers;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "SampleClient", url = "http://localhost:8081")
public interface SampleClient {

    @GetMapping("/findAll")
    List<User> findAll();

    @GetMapping("/findOne")
    User findOne(String id);

    @PostMapping("/save")
    void save(@RequestBody User user);

    @Headers("Content-Type: application/json")
    @PostMapping("/update_name")
    void update(UpdateModel updateModel);

    @PostMapping("/removeById/{id}")
    void remove(@PathVariable(value = "id") String id);

}
