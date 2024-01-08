import java.util.List;
import java.util.ArrayList;

public class Box<T extends Fruit>{
    private List<T> fList = new ArrayList<>();

    /**
     * Метод добавления фрукта в ящик
     * @param fruit фрукт для добавления
     */
    public void addFruit(T fruit){
        fList.add(fruit);
    }

    /**
     * Метод подсчета веса ящика
     * @return вес ящика
     */
    public Float getWeight(){
        Float total = 0.0F;
        for (T f: fList){
            total += f.getWeight();    
        }
        return total;
    }

    /**
     * Метод сравнения ящиков
     * @param box ящик с которым выполняется сравнение
     * @return true/false
     */
    public boolean compare(Box<?> box){
        return getWeight().equals(box.getWeight());
    }

    /**
     * Перемещение содержимого текущего ящика
     * @param box ящик, в который перемещается
     */
    public void move(Box<T> box){
        if (this.getClass().getTypeName().equals(box.getClass().getTypeName())){
            for (T f: fList){
                box.addFruit(f);
            }
            this.fList = new ArrayList<>();
        }
    }

    /**
     * Перемещение содержимого текущего ящика (другой вариант метода)
     * @param box ящик, в который перемещается
     */
    public void move2(Box<? super T> box){
        if (this.getClass().getTypeName().equals(box.getClass().getTypeName())){
            for (T f: fList){
                box.addFruit(f);
            }
            fList.clear();
        }
    }

}