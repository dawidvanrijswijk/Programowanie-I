package Programowanie.zaj4;

public class Memory {
    public static void main(String[] args) throws InterruptedException {
        int arrsize = 15;
        long memoryConsumed = 0;

        long[] memoryAllocated = null;
        for (int loop = 0; loop < Integer.MAX_VALUE; loop++) {
            memoryAllocated = new long[arrsize];
            memoryAllocated[0] = 1;
            memoryConsumed += arrsize * Long.SIZE;
            System.out.println("Memory consumed till now: " + memoryConsumed);
            arrsize *= 10;
            Thread.sleep(500); //usypiamy główny wątek na pół sekundy
        }
    }
}
