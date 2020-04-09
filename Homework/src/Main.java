public class Main {
    public static void main(String[] args) {
        //dz1
        int dim= 5 ;
        int[][] arr=new int[dim][dim];
        int i=1;
        int j=dim/2;
        int k=dim/2;
        int p=dim/2;
        for(k=1;k<=p;k++)
        {
            for (j=k-1;j<dim-k+1;j++)
                arr[k-1][j]=i++;
            for (j=k;j<dim-k+1;j++)
                arr[j][dim-k]=i++;
            for (j=dim-k-1;j>=k-1;--j)
                arr[dim-k][j]=i++;
            for (j=dim-k-1;j>=k;j--)
                arr[j][k-1]=i++;
        }
        if (dim%2==1)
            arr[p][p]=dim*dim;
        for(i=0;i<dim;i++)
            for(j=0;j<dim;j++)
            {
                System.out.print(arr[i][j]+" ");
                if(j==dim-1)
                    System.out.println("\n");
            }
        Array arr1 =new Array(1000000);
        for (int l = 0; l < 1000000; l++) {
            arr1.insert((int)(Math.random()*100));
        }
        arr1.Info();
        long start = System.currentTimeMillis();
        arr1.sortBubble();
        long finish = System.currentTimeMillis();
        System.out.println("Время сортировки пузырьком="+ (finish-start));
        start = System.currentTimeMillis();
        arr1.sortInsert();
        finish = System.currentTimeMillis();
        System.out.println("Время сортировки вставкой="+ (finish-start));
        start = System.currentTimeMillis();
        arr1.sortSelect();
        finish = System.currentTimeMillis();
        System.out.println("Время сортировки выбором="+ (finish-start));
    }
}
