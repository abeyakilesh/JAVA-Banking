package com.abey.banking;

public class ProcessingAnimation implements Runnable {

    @Override
    public void run() {
        try {
            String[] steps = {
                    "Connecting to bank server",
                    "Verifying credentials",
                    "Processing transaction",
                    "Finalizing request"
            };

            for (String step : steps) {
                System.out.print(step);
                for (int i = 0; i < 3; i++) {
                    Thread.sleep(300);
                    System.out.print(".");
                }
                System.out.println(" ✔");
            }
            System.out.println();
        } catch (InterruptedException ignored) {}
    }
}
