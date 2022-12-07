public class Pattern18 {
    public static void main(String[] args) {
        int alphabet = 65;
        for (int i=4; i>=0; i--){
            for (int j =i; j<5; j++){   
                System.out.print((char) (alphabet + j) +" "); 
            }
            System.out.println();
        }
    }
}
