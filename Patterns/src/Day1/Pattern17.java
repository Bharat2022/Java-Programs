public class Pattern17 {
    public static void main(String[] args) {
        int alphabet = 65;
        for (int i=0; i<5; i++){
            for (int j = i; j >=0; j--){   
                System.out.print((char) (alphabet + j) +" "); 
            }
            System.out.println();
        }
    }
}
