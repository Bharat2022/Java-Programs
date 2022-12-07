public class Pattern8 {
    public static void main(String[] args) {
        int k=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5;j++){
                System.out.print(k+" ");
                if(k>8)
                    k=1;
                else
                    k++;
            }
            System.out.println();
        }
    }
}
