import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruits> {
    public List<T> boxlist = new ArrayList<>();
    public void addFruit(T fruit){
        this.boxlist.add(fruit);
    }

    public float getWeight(){
        if (boxlist.isEmpty()) return 0;
        float totalWeight=0;
        for (T fruit:boxlist) {
            totalWeight += fruit.weight;
        }
        return totalWeight;
    }

    public void getInfo() {
        if (boxlist.isEmpty()) {
            System.out.println("Коробка пуста");
        } else {
            String label = boxlist.get(0).getClass().getSimpleName();
            System.out.println(label + ": " + boxlist.size() + " шт " + this.getWeight() + " кг");
        }
    }

    public boolean compare(Box<? extends Fruits> box){
        return (this.getWeight()==box.getWeight());
    }

    public void addAll(Box<? extends T> box){
        if (box==null) {
            System.out.println("Коробка отсутствует");
        } else if (box.boxlist.isEmpty()) {
            System.out.println("Коробка "+box+" пустая");
        } else if (this==box) {
            System.out.println("Это тажа самая коробка");
            return;
        } else {
            this.boxlist.addAll(box.boxlist);
            box.boxlist.clear();
        }
    }
}
