package com.TomBAN.BoulderDash.Game.Model.BlockList;

import com.TomBAN.BoulderDash.Game.Model.Block;

public class Boundary extends Block {
	private static final String[] IMAGE = {"BOUNDARY.png"};

	public Boundary(int x,int y) {
		super(IMAGE, x, y);
	}
}
