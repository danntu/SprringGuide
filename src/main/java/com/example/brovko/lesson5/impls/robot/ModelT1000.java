package com.example.brovko.lesson5.impls.robot;

import com.example.brovko.lesson5.interfaces.Hand;
import com.example.brovko.lesson5.interfaces.Head;
import com.example.brovko.lesson5.interfaces.Leg;
import com.example.brovko.lesson5.interfaces.Robot;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class ModelT1000 implements Robot {

	private Hand hand;
	private Head head;
    private Leg leg;

	@Override
	public void action() {
		head.calc();
		hand.catchSomething();
		leg.go();
	}

	@Override
	public void dance() {
		System.out.println("T1000 is dancing!");
	}

}
