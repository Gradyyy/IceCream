package com.packaged;

public class EcoState implements MachineState{
    @Override
    public void changeState(Machine m) {
        System.out.println("Machine status: Eco Mode");

        m.setCurrentState(new FinishingState());
    }
}
