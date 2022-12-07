public class Pattern7 {
    public static void main(String[] args) {
        int alphabet = 65;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                System.out.print((char) (alphabet + j) +" ");
            }
            System.out.println();
        }
    }
}
