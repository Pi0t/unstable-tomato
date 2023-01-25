import pojo.Human;
import service.Work;

public class Application {

    public static void main(String[] args) {
        Human human1 = new Human("Piotr ", "Smith", 8809200, 35, 5000);
        Human human2 = new Human("Andrzej ", "Black", 900000, 67, 8000);

        System.out.println("Some person: " + human1.name + human1.lastname + "PESEL:" + human1.pesel + " Age:" + human1.age + " Salary:" + human1.salary);
        System.out.println("Some person: " + human2.name + human2.lastname + "PESEL:" + human2.pesel + " Age:" + human2.age + " Salary:" + human2.salary);

        Work work = new Work();
        work.rise(human1, 1000);
        work.reduction(human2, 1000);


    }
}
