package com.kushd.minesweeper;

import com.kushd.minesweeper.R;

import android.content.Context;
import android.graphics.Color;
import android.widget.Button;
/**
 * Represents the block in the grid
 * @author kushal
 *
 */
public class MineButton extends Button {
	//Position of the block in the grid.
	private int pos;
	private boolean hasMine;
	private int value;
	
	
	public MineButton(Context context) {
		super(context);
	}
	
	public void initFields(){
		value=-1;
		this.setClickable(true);
		hasMine=false;
		this.setBackgroundResource(R.drawable.grey);
		this.setText("");
	}
	


	/**
	 * @return the hasMine
	 */
	public boolean hasMine() {
		return hasMine;
	}



	/**
	 * @param hasMine the hasMine to set
	 */
	public void setMine(boolean hasMine) {
		this.hasMine = hasMine;
	}



	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}



	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}

	/**
	 * @return the pos
	 */
	public int getPos() {
		return pos;
	}

	/**
	 * @param pos the pos to set
	 */
	public void setPos(int pos) {
		this.pos = pos;
	}

	public void showMine(boolean win) {
		this.setText("M");
		if(win){
			this.setTextColor(Color.GREEN);
		}else{
			this.setTextColor(Color.RED);
		}
	}

	public void showValue() {
		this.setClickable(false);
		this.setBackgroundResource(R.drawable.blue);
		if (value != 0)
		{
			this.setText(Integer.toString(value));
			switch (value)
			{
				case 1:
					this.setTextColor(Color.BLUE);
					break;
				case 2:
					this.setTextColor(Color.YELLOW);
					break;
				case 3:
					this.setTextColor(Color.GRAY);
					break;
				case 4:
					this.setTextColor(Color.MAGENTA);
					break;
				case 5:
					this.setTextColor(Color.GREEN);
					break;
				case 6:
					this.setTextColor(Color.CYAN);
					break;
				case 7:
					this.setTextColor(Color.DKGRAY);
					break;
				case 8:
					this.setTextColor(Color.RED);
					break;
				default: 
					break;
			}
		}
	}


}
