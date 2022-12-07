public class Pattern20 {
    public static void main(String[] args) {
        int k=0,alphabet = 97;
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print((char) (alphabet + k) +" "); 
                k++;
            }
            System.out.println();
        }
    }
}
