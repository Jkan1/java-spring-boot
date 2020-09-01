package com.example.Java.App1;

import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author kan
 */
@RestController
public class Controller {

    DatabaseService dataStore = new DatabaseService();

    @GetMapping("/hi")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/search")
    public String search(@RequestParam String q) {
        return dataStore.search(q);
    }

    @GetMapping("/search-data")
    public DatabaseService searchData() {
        return dataStore;
    }

    @PostMapping("/search-add")
    public String addToSearch(Object payload) {
        System.out.print(">>>>>>>>> INSIDE POST ");
        return "success";
    }

    @GetMapping("/search/{id}")
    public String searchDataById(@PathVariable int id) {
        return "Find " + id;
    }

    @DeleteMapping("/search-delete/{id}")
    public String deleteData(@PathVariable int id) {
        return "Deleted " + id;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @ApiOperation("For Update Any Search Data Stored")
    @PutMapping("/search-update")
    public String updateData(@PathVariable int id) {
        return "Update " + id;
    }
}
