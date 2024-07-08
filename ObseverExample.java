import java.util.ArrayList;
import java.util.List;

// Subject (Đối tượng quan sát)
class Subject {
    private List<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    // Phương thức để đăng ký đối tượng quan sát
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    // Phương thức để hủy đăng ký đối tượng quan sát
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    // Phương thức để thông báo cho tất cả các đối tượng quan sát khi trạng thái thay đổi
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

// Observer (Đối tượng quan sát)
class Observer {
    private String name;

    public Observer(String name) {
        this.name = name;
    }

    // Phương thức để cập nhật trạng thái
    public void update() {
        System.out.println(name + " da duoc thong bao ve thay doi!");
    }
}

// Sử dụng
public class ObseverExample {
    public static void main(String[] args) {
        Subject subject = new Subject();
        Observer observer1 = new Observer("Observer 1");
        Observer observer2 = new Observer("Observer 2");

        subject.registerObserver(observer1);
        subject.registerObserver(observer2);

        subject.notifyObservers();

        subject.unregisterObserver(observer1);

        subject.notifyObservers();
    }
}
