import kareltherobot.*;
/**
 * Write a description of class TreasureDriver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreasureDriver implements Directions
{
    public static void main(String[] args)
    {
        World.reset();
        World.setDelay(2);
        World.readWorld("TreasureTest2.kwld");
        World.setTrace(true);
        World.setVisible(true);
        TreasureHunter blackBeardThePirate = new TreasureHunter(1, 8, North, 0);
        blackBeardThePirate.work();
    }
}
