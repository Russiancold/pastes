package pastes.entities;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "pastes")
public class Paste implements Serializable{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String content;

    protected Paste(){}

    public Paste(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    @Override
    public String toString() {
        return "Paste{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
