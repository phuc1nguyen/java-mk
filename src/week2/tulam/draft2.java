package week2.tulam;

public class draft2 {
    public static void main(String[] args){
        int[][] a;
        int b[][] = new int[1000][1000];

        int[] c[] = {{10,11}, {11,12}, {13,14}};

        for (int j=0; j<2; ++j){
            for (int k=0; k<2; ++k){
                int item = c[j][k];
                System.out.println(item);
            }
        }
    }
}
