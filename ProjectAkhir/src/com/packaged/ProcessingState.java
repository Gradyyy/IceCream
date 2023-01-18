package com.packaged;

public class ProcessingState implements MachineState{

    @Override
    public void changeState(Machine m) {
        System.out.println("Machine status: Processing");

        m.setCurrentState(new FinishingState());
    }
}
