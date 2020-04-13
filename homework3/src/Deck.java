public class Deck {
    private int maxSize;
    private int[] deck;
    private int front;
    private int rear;
    private int items;

    public Deck(int s){
        maxSize = s;
        deck = new int[maxSize];
        front = 0;
        rear = -1;
        items = 0;
    }
    public void insertLeft(int i){
        if(rear == maxSize-1)
            rear = -1;
        deck[++rear] = i;
        items++;
    }
    public void insertRight(int i){
        deck[++front] = i;
    }

    public int removeRight(){
        int temp = deck[front++];
        if(front == maxSize)
            front = 0;
        items--;
        return temp;
    }
    public void removeLeft(){
        rear++;
        items--;
    }

    public boolean isEmpty(){
        return (items==0);
    }

    public boolean isFull(){
        return (items==maxSize);
    }

    public int size(){
        return items;
    }

}
