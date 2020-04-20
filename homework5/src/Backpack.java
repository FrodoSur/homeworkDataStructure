import java.util.List;

public class Backpack {
    private List<Item> bestItems;
    private int bestCost;
    private int maxWeight;

    public Backpack(int maxWeight) {
        this.maxWeight = maxWeight;
    }
    private int CalcWeight(List<Item> items){
        int sumWeight = 0;
        for (Item i: items) {
            sumWeight+=i.weight;
        }
        return(sumWeight);
    }
    private int CalcCost(List<Item> items){
        int sumCost = 0;
        for (Item i: items) {
            sumCost+=i.price;
        }
        return(sumCost);
    }
    private void CheckSet(List<Item> items)
    {
        if (bestItems == null)
        {
            if (CalcWeight(items) <= maxWeight)
            {
                bestItems = items;
                bestCost = CalcCost(items);
            }
        }
        else
        {
            if(CalcWeight(items) <= maxWeight && CalcCost(items) > bestCost)
            {
                bestItems = items;
                bestCost = CalcCost(items);
            }
        }
    }
    public void MakeAllSets(List<Item> items)
    {
        if (items.size()>0)
            CheckSet(items);

        for (int i = 0; i < items.size(); i++)
        {
            List<Item> newSet = items;

            newSet.remove(i);

            MakeAllSets(newSet);
        }

    }
    public List<Item> GetBestSet()
    {
        return bestItems;
    }
}
