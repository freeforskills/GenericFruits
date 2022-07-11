import java.util.ArrayList;

public class MainApp {
    public static void main(String[] args) {

        //Создаем 3 коробки.
        Box<Orange> boxO1 = new Box<>();
        Box<Orange> boxO2 = new Box<>();
        Box<Apple> boxA1 = new Box<>();
        Box<Fruits> boxF = new Box<>();

        //Создаем 3 фрукта
        Orange o1 = new Orange(1.2f);
        Orange o2 = new Orange(0.9f);
        Apple a1 = new Apple(1.0f);

        //Помещаем фрукты в коробки
        boxO1.addFruit(o1);
        boxO2.addFruit(o2);
        boxA1.addFruit(a1);

        //Инфо по коробкам
        boxO1.getInfo();
        boxO2.getInfo();
        boxA1.getInfo();

        //Сравнение коробок
        //System.out.println(boxA1.compare(boxO1));

        //В одну коробку пересыпаем другую
        boxO1.addAll(boxO2);

        //Инфо по коробкам
        boxO1.getInfo();
        boxO2.getInfo();
        boxA1.getInfo();
    }
}