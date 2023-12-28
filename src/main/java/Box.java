import java.util.List;
import java.util.ArrayList;

public class Box<T extends Fruit>{
    private List<T> fList = new ArrayList<>();
    
    public void addFruit(T fruit){
        fList.add(fruit);
    }
    
    public Float getWeight(){
        Float total = 0.0F;
        for (T f: fList){
            total += f.getWeight();    
        }
        return total;
    }
    
    public boolean compare(Box<Orange> box){
        return getWeight().equals(box.getWeight());
    }
    
    public void move(Box<T> box){
        if (this.getClass().getTypeName().equals(box.getClass().getTypeName())){
            for (T f: fList){
                box.addFruit(f);
                this.fList = new ArrayList<>();
            }
        }
    }
}