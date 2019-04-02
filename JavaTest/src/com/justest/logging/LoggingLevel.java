package com.justest.logging;

public enum LoggingLevel {
    PENDING(1), PROCESSING(2), PROCESSED(3) ;

    private int i;

    private LoggingLevel(int i) {
        this.i = i;
    }

    public int code(){
        return i;
    }

    public boolean isPending(){
        return this == PENDING;
    }

    public boolean isProcessing(){
        return this == PROCESSING;
    }

    public boolean isProcesed(){
        return this == PROCESSED;
    }
}
