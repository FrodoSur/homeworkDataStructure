import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(rec(3,2));
    }
    public static int rec(int x, int step){
            if(step!=1)
                x*=rec(x,step-1);
            return(x);
    }
    /*ArrayList items = new ArrayList();

    items.add(new Item("Бинокль", 2, 5000));
    items.add(new Item("Аптечка", 4, 1500));
    items.add(new Item("Ноутбук", 2, 40000));
    items.add(new Item("Котелок", 1, 500));
    Backpack bp = new Backpack((int)(10));

    bp.MakeAllSets(items);
    List<Item> solve = bp.GetBestSet();

    if(solve == null)
    {
        MessageBox.Show("Нет решения!");
    }
    else
    {
        for (Item i: solve) {
            System.out.println(i.name+ " ");
        }
    }*/

    MyArr arr = new MyArr(10);

        arr.insert(-10);
        arr.insert(45);
        arr.insert(26);
        arr.insert(20);
        arr.insert(25);
        arr.insert(40);
        arr.insert(75);
        arr.insert(80);
        arr.insert(82);
        arr.insert(91);

    int search = -10;


        arr.binaryFind(search);
}
