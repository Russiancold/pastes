package pastes.controller;

import pastes.entities.Paste;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pastes.storage.Storage;

@RestController
public class Controller {

    @RequestMapping(path = "/create")
    public void create(@RequestParam(name = "content") String content) {
        Storage.putPaste(new Paste(Storage.getLastId(), content));
    }

    @RequestMapping(path = "/get")
    public String get(@RequestParam(name = "id") long id) {
        return Storage.getPasteById(id).getContent();
    }
}
