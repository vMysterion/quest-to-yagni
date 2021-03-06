
package com.questtoyagni.event;

import com.questtoyagni.board.Board;
import com.questtoyagni.player.Player;

/**
 * trap-event, triggers a trap event
 * @author Lukas H
 */
public class Trapevent extends Event{

    /**
     * @param id    ID of Event
     * @param name  Name of Event
     */
    public Trapevent(int id,String name){
        super(id,name);
    }

    /**
     * Triggers the Event Method
     * @param p Player
     * @param b Board
     * @return returns event-msg as String
     */
    @Override
    public String triggerEvent(Player p,Board b) {
    	return null;
    }

    /**
     * Functionality of the Trap Event if a player triggers a Event
     * @return returns trap-msg as String
     */
    String trapEvent(){
    	return null;
    }
}