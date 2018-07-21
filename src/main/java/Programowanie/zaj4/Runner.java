package Programowanie.zaj4;

public class Runner {

    private static class RunnerImpl implements Runnable {

        private Long id;

        public RunnerImpl(Long id) {
            this.id = id;
        }

        @Override
        public void run() {
            System.out.println(String.format("Thread %d is working "));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new RunnerImpl(1L)).start();
    }
}
