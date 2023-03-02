
import java.util.HashMap;

class Manager {

    HashMap<Integer, Task> tasks = new HashMap<>();
    HashMap<Integer, Epic> epics = new HashMap<>();
    HashMap<Integer, Subtask> subtasks = new HashMap<>();
    public Manager() {

        Task task1 = new Task("Задача1, ","Описание задачи1, ", 47,", NEW");
        Task task2 = new Task ("Задача2, ", "Описание задачи2, ", 52, ", DONE");
        Epic epic1 = new Epic("Эпик1, ", "Описание эпика1, ",56,", IN PROGRESS");
        Epic epic2 = new Epic("Эпик2, ", "Описание эпика2, ",63,", NEW");
        Subtask subtask1 = new Subtask("Подзадача1, ", "Описание подзадачи1, ", 76, ", IN PROGRESS");
        Subtask subtask2 = new Subtask("Подзадача2, ", "Описание подзадачи2, ", 84, ", DONE");
        Subtask subtask3 = new Subtask("Подзадача3, ", "Описание подзадачи3, ", 93, ", DONE");

        tasks.put(task1.getId(),task1);
        tasks.put(task2.getId(), task2);
        epics.put(epic1.getId(),epic1);
        epics.put(epic2.getId(),epic2);
        subtasks.put(subtask1.getId(), subtask1);
        subtasks.put(subtask2.getId(), subtask2);
        subtasks.put(subtask3.getId(), subtask3);

        Task task = tasks.get(task1.getId());
        System.out.println(task);

        for (Integer allTasks:tasks.keySet()) {
            System.out.println(allTasks);
        }

        tasks.remove(task1.getId());
        System.out.println(tasks.get(task1.getId()));

        for (Integer allEpics:epics.keySet()) {
            System.out.println(allEpics);
        }

        epics.remove(epic1.getId());
        System.out.println(epics.get(epic1.getId()));

        for (Integer allSubtasks:epics.keySet()) {
            System.out.println(allSubtasks);
        }

        subtasks.remove(subtask1.getId());
        System.out.println(subtasks.get(subtask1.getId()));
    }

}

public class Main {
    public static void main(String[] args) {

        Manager manager = new Manager();

        }
    }

