package com.packaged;

public class IdleState implements MachineState{
    @Override
    public void changeState(Machine m) {
        System.out.println("=======================");
        System.out.println("Machine is Idling");
        m.setCurrentState(new ProcessingState());
    }
}
