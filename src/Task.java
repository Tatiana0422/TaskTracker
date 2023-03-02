import java.util.HashMap;

public class Task {
    String title;
    String description;
    int id;
    String status;

    public Task(String title, String description, int id, String status) {
        this.title = title;
        this.description = description;
        this.id = id;
        this.status = status;
        System.out.println(title + description + id + status);
    }

    public int getId() {

        return id;
    }
    public String getTitle() {

        return title;
    }
    public String getDescription() {

        return description;
    }
    public String getStatus() {

        return status;

    }
}

