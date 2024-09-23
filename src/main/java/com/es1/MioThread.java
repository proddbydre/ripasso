package com.es1;

public class MioThread extends Thread {

    private int contatore;

    public void run() {

        for (int i = 0; i < contatore; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
        }
    }

    public MioThread(int n) {
        contatore = n;
    }
}
