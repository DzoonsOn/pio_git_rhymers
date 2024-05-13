package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {


    public static int INT = 12;
    private int[] numbers = new int[INT];

    public int totalCount = -1;

    public void countIn(int in) {
        if (!isFull())
            numbers[++totalCount] = in;
    }

        public boolean callCheck() {
            return totalCount == -1;
        }
        
            public boolean isFull() {
                return totalCount == 11;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return -1;
                    return numbers[totalCount];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return -1;
                        return numbers[totalCount--];
                    }

}
