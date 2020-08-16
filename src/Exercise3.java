public class Exercise3 {
    public static int bar (int N) {
        int result = 1;
        for (int i = 1; i<N; i*=2)
            result+=2;
        return result;
    }
}

/*
Because i is being exponentially increased,
we would say this has an O(log N)
 */
