public class forloop {
    public static void main(String[]args){
        int sum, i, j;
        sum =0;
        j=0;
                for (i=0; i<10; i+=2){
                    for(j=3; j>2; j--){
                        sum=i+j;

                    }
                }


                System.out.println(i);
                System.out.println(j);
                System.out.println(sum);
    }
}
