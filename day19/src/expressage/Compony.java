package expressage;

import java.util.Queue;

public class Compony {
    private Queue defaultProcess;
    private Queue completedProcess;
    private  String number;
    public Queue getCompletedProcess() {
        return completedProcess;
    }

    public void setCompletedProcess(Queue completedProcess) {
        this.completedProcess = completedProcess;
    }

    public Queue getDefaultProcess() {
        return defaultProcess;
    }

    public void setDefaultProcess(Queue defaultProcess) {
        this.defaultProcess = defaultProcess;
    }

    public Compony(Queue defaultProcess) {
        this.defaultProcess = defaultProcess;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
