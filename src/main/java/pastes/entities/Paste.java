package pastes.entities;

public class Paste {

    private final long id;
    private final String content;

    public Paste(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
