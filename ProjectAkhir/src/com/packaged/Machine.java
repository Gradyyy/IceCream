package com.packaged;

public class Machine {
    private String name;
    private MachineState currState;

    public Machine(String name) {
        this.name = name;
        this.currState = new IdleState();
    }

    public void setCurrentState(MachineState ms){
        this.currState = ms;
    }

    public void nextStateCycle(){
        ////////////////
        this.currState.changeState(this);
    }

    public MachineState getCurrState() {
        return currState;
    }

    public void setCurrState(MachineState currState) {
        this.currState = currState;
    }
}
