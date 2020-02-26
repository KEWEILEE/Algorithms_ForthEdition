import edu.princeton.cs.algs4.StdRandom;
import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.Test;

public class Arrays {
    public void reverseArray(int[] a) {
        int back_index = a.length - 1;
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[back_index - i];
            a[back_index - i] = temp;
        }
    }

    @Test
    public void testReverseArray() {
        int[] a = {1, 2, 3, 4, 5};
        reverseArray(a);
        for (int i : a) {
            System.out.println(i);
        }
    }

    public int[][] multiplicationSquare(int[][] a, int[][] b) {
        int N = a.length;
        int[][] result = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) { //result的每一个点进行计算
                int temp = 0;
                for (int z = 0; z < N; z++) {
                    temp += a[i][z] * b[z][j];
                }
                result[i][j] = temp;
            }
        }
        return result;
    }

    @Test
    public void testMulti() {
        int[][] a = {
                {1, 2},
                {3, 4}
        };
        int[][] b = {
                {1, 2},
                {3, 4}
        };

        int [][] c = multiplicationSquare(a,b);
        for (int [] x:c){
            for (int y:x){
                System.out.println(y);
            }
        }
    }

}


