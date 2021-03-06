class MyArr{
    private int[] arr;
    private int size;

    public MyArr(int size) {
        this.size = 0;
        this.arr = new int[size];
    }

    public int binaryFind(int search) {
        if(recBinaryFind(search, 0, size-1)==-1)
            System.out.println("false Ваш элемент не найден");
        else{
            System.out.println("true Индекс вашего элемента = " + recBinaryFind(search, 0, size-1));
        }
    }

    private int recBinaryFind(int searchKey, int low, int high) {
        int curIn;
        curIn = (low + high ) / 2;
        if (arr[curIn] == searchKey)
            return curIn;
        else
        if(low > high)
            return high;
        else{
            if(arr[curIn] < searchKey)
                return recBinaryFind(searchKey, curIn+1, high);
            else
                return recBinaryFind(searchKey, low, curIn-1);
        }
    }


    public void insert(int value){
        int i;
        for(i=0;i<this.size;i++){
            if (this.arr[i]>value)
                break;
        }
        for(int j=this.size;j>i;j--){
            this.arr[j] = this.arr[j-1];
        }
        this.arr[i] = value;
        this.size++;
    }

}


