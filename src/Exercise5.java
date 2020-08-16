public class Exercise5 {
    /*
        Array: {1, 29, 14, 15, 94}

        Insertion--
        {1, 29, 14, 15, 94}
	    {1, 14, 29, 15, 94}
	    {1, 14, 15, 29, 94}
	    {1, 14, 15, 29, 94}

        1 will not move since it is the smallest number and already on the left.
        29 will swap with 14, since 29 is larger than 14.
        29 will swap with 15, since 29 is larger than 15.
        29 and 94 will stay in their indexes, since 94 is larger than 29.



        Selection--
        {1, 29, 14, 15, 94}
	    {1, 14, 29, 15, 94}
	    {1, 14, 15, 29, 94}
	    {1, 14, 15, 29, 94}
	    {1, 14, 15, 29, 94}

	    [0] will not move, since 1 is the smallest number.
	    [1] will be swapped with [2].
	    [2] will be swapped with [3].
	    [3] will not move, since 29 is the next smallest number.
	    [4] will not move, since 94 is the last smallest number.
     */
}
