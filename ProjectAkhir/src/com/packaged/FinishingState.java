package com.packaged;

public class FinishingState implements MachineState{
    @Override
    public void changeState(Machine m) {
        System.out.println("Machine status: Finishing");

        m.setCurrentState(new IdleState());
    }
}
