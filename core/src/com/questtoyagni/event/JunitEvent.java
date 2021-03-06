
package com.questtoyagni.event;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.questtoyagni.board.Board;
import com.questtoyagni.coordinates.Coordinate;
import com.questtoyagni.field.Eventfield;
import com.questtoyagni.field.Finishfield;
import com.questtoyagni.player.Player;

/**
 * @author Lukas H
 */

class JunitEvent {
	
	@Test
	void testHint() {
		Board board = new Board(5,7);
		Player p = new Player("Player1",new Coordinate(0,3),board);
		Eventfield eventfield=(Eventfield) board.getField(p.getPosition());
    	Event event=eventfield.getEvent();
		Assertions.assertEquals("The finish is North from your position", event.triggerEvent(p, board),"Spieler ist an falscher Position");
	}
	
	@Test
	void testFinish() {
		Board board = new Board(5,7);
		Player p = new Player("Player1",new Coordinate(0,1),board);
		Finishfield finish=(Finishfield) board.getField(p.getPosition());
    	Event event=finish.getEvent();
		Assertions.assertEquals("Huuray! You've reached Yagni, the mighty East Westphalian God! Now let his wisdom rain down on you...", event.triggerEvent(p, board),"Spieler ist an falscher Position");
	}
	
	@Test
	void testWall() {
		Board board = new Board(5,7);
		Player p = new Player("Player1",new Coordinate(2,4),board);
		Eventfield eventfield=(Eventfield) board.getField(p.getPosition());
    	Event event=eventfield.getEvent();
		Assertions.assertEquals("walls in following directions: West East ", event.triggerEvent(p, board),"W�nde werden nicht korrekt gelesen");
	}
	

}
