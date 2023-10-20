package org.learn.genericos;

public class Log <T,M>{
    private T cause;
    private M mitigation;

    public Log(T cause,M mitigation){
        this.cause=cause;
        this.mitigation=mitigation;
    }

    @Override
    public String toString() {
        return "Log{" +
                "cause=" + cause +
                ", mitigation=" + mitigation +
                '}';
    }
}
