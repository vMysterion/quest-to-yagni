package com.questtoyagni;

import com.questtoyagni.tui.InputController;

/**
 * text-based main calls the game input and ends the game after the finish-field is reached
 * @author Mathis B
 */
public class Main {

    public static void main(String[] args){
        InputController ic = new InputController(5,7);
        int condition = 0;
        while(condition == 0) {
            condition = ic.eingabe();
        }
    }
}
