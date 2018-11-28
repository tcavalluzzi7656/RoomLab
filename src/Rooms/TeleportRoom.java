package Rooms;

import Game.Runner;
import People.Person;

public class TeleportRoom extends Room
{

    public TeleportRoom(int x, int y) {
        super(x, y);

    }

    /**
     * Teleports the player to a random location
     * @param x the Person entering
     */
    @Override
    public void enterRoom(Person x) {

        occupant = x;
        xLoc=(int)(Math.random()*6);
        yLoc=(int)(Math.random()*6);
        x.setxLoc(this.xLoc);
        x.setyLoc(this.yLoc);
        System.out.println("Teedle dee teedle dum! I just teleported your bum!");
    }


}
