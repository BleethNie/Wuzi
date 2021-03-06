package com.bleeth.system;

import com.bleeth.chess.Player;
import com.bleeth.event.NetData;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.widgets.Display;

import java.util.List;

public abstract class WuZiSystem implements ISystem {

	public Player white = new Player(Player.WHITE_COLOR);

	public Player black = new Player(Player.BLACK_COLOR);

	public static NetData chessData ;

	public static NetData commandData;

	public GC gc;

	public Display display;

	public boolean isRun;

	public boolean state ;

	public boolean isBlack ;


	public boolean isWin(List<Integer> list) {
		if (list == null || list.size() < 5) {
			return false;
		}

		int tmp = list.get(list.size() - 1);
		int h = 0;
		for (int i = 0; i <= 10; i++) {
			if (list.contains(tmp - 500 + i * 100)) {
				++h;
				if (h == 5) {
					return true;
				}
			} else {
				h = 0;
			}
		}

		h = 0;
		for (int i = 0; i <= 10; i++) {
			if (list.contains(tmp - 5 + i)) {
				++h;
				if (h == 5) {
					return true;
				}
			} else {
				h = 0;
			}
		}

		 h = 0;
		for (int i = 0; i <= 10; i++) {
			if (list.contains(tmp - 505 + 101 * i)) {
				++h;
				if (h == 5) {
					return true;
				}
			} else {
				h = 0;
			}
		}

		h = 0;
		for (int i = 0; i <= 10; i++) {
			if (list.contains(tmp - 495 + 99 * i)) {
				++h;
				if (h == 5) {
					return true;
				}
			} else {
				h = 0;
			}
		}
		return false;
	}




}
