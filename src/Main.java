import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Создайте свой поток исполнения,
        // обязательно использовав методы run() и start(),
        // в методе run() выведите время и текущую дату.

        class DataTime extends Thread {
            @Override
            public void run() {
                Date date =  new Date();
                System.out.println("Сегодня : ");
                System.out.println(date);
            }
        }

        DataTime dataTime = new DataTime();
        dataTime.start();
    }
}