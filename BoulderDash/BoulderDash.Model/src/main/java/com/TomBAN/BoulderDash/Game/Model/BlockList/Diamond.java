/**
 * 
 */
package com.TomBAN.BoulderDash.Game.Model.BlockList;

import com.TomBAN.BoulderDash.Game.Model.Breakable;
import com.TomBAN.BoulderDash.Game.Model.Instable;
import com.TomBAN.BoulderDash.Game.Model.MovableBlock;
import com.TomBAN.BoulderDash.Game.Model.Unblowable;
import com.TomBAN.BoulderDash.Game.Model.StrategyList.FallingBlockStrategy;

/**
 * @author TomBANCHEREAU
 *
 */
public class Diamond extends MovableBlock implements Breakable,Instable,Unblowable {
	private static final String[] IMAGE = {"Diamond/DIAMOND_0.png","Diamond/DIAMOND_1.png","Diamond/DIAMOND_2.png","Diamond/DIAMOND_3.png"};
	public Diamond(int x, int y) {
		super(IMAGE, x, y);
		setStrategy(new FallingBlockStrategy(this));
	}

	@Override
	public int getImageId() {
		// TODO Auto-generated method stub
		return (getLastUpdate()/2)%IMAGE.length;
	}
	@Override
	public void getBroken() {
		getMap().addDiamond();
	}

}
