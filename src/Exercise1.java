public class Exercise1 {

    public static int complex(int N) {
        int result = 0;
        for (int i = 0; i < N; i++) {  // O(n)
            for (int j = 0; j < N; j++) {  // O(n**2)
                for (int k = 0; k < N; k++) { //O(n**3)
                    result++;
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        System.out.print(complex(3));
    }
}
