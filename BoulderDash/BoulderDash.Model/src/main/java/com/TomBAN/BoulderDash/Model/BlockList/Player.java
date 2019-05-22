package com.TomBAN.BoulderDash.Model.BlockList;

import com.TomBAN.BoulderDash.Model.Controllable;
import com.TomBAN.BoulderDash.Model.Killable;
import com.TomBAN.BoulderDash.Model.MovableBlock;
import com.TomBAN.BoulderDash.Model.MovementOrder;

public class Player extends MovableBlock implements Killable,Controllable{
	
	private static final String IMAGE = "";
	private MovementOrder currentOrder = MovementOrder.StopMovement;
	public Player(int x, int y) {
		super(IMAGE, x, y);
	}

	@Override
	public void getKilled() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void executeOrder(MovementOrder order) {
		currentOrder = order;
	}
	
}
