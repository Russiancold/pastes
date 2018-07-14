package pastes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import pastes.entities.Paste;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pastes.repository.PastesRepository;

@RestController
public class Controller {

    @Autowired
    PastesRepository repository;

    @RequestMapping(path = "/create")
    public void create(@RequestParam(name = "content") String content) {
        repository.save(new Paste(content));
    }

    @RequestMapping(path = "/get")
    public String get(@RequestParam(name = "id") long id) {
        return repository.findById(id).get().getContent();
    }
}
