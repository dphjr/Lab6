public class Exercise2 {

    int foo(int N) {
        int result = 0;
        for (int i = 0; i < N; i++);
            result++;

        for (int j = 0; j < 1000000; j++)
            result+=j;

        return result;
    }
}

/*
Because the second loop goes to 1000000, we will focus on the first loop
since N can theoretically be much greater than 10000000.

The first loop is a simple loop that is incremented by a constant amount.
Therefore we will have a time complexity of O(N), since this is a linear equation.
 */
