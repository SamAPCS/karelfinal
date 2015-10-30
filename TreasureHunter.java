import kareltherobot.*;
/**
 * Write a description of class TreasureHunter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TreasureHunter extends Robot
{

    public TreasureHunter(int st, int ave, Direction dir, int beeps)
    {
        super(st, ave, dir, beeps);
    }

    public int countBeepers()
    {
        int x = 0;

        while(nextToABeeper()){
            pickBeeper();
            x++;
        }

        if(x == 5){
            for (int i = 1; i <= 5; i++){
                putBeeper();
            }
            x = 5;
        }
        if(x == 4){
            for (int i = 1; i <= 4; i++){
                putBeeper();
            }
            x = 4;
        }
        if(x == 3){
            for (int i = 1; i <= 3; i++){
                putBeeper();
            }
            x = 3;
        }
        if(x == 2){
            for (int i = 1; i <= 2; i++){
                putBeeper();
            }
            x = 2;
        }
        if(x == 1){
            for (int i = 1; i <= 1; i++){
                putBeeper();
            }
            x = 1;
        }
        return x;
    }

    public void moveToNextClue()
    {
        if(countBeepers() == 5){ //indicator to terminate program
            //move();
            turnOff();   
        }
        if(countBeepers() == 4){ // Needs to faceEast
            faceEast();
            move();
        }
        if(countBeepers() == 3){ // Needs to faceSouth
            faceSouth();
            move();
        }
        if(countBeepers() == 2){ // Needs to faceWest
            faceWest();
            move();
        }
        if(countBeepers() == 1){ // Needs to faceNorth
            faceNorth();
            move();
        }
    }

    public void work() 
    {
        int y = 0;

        while(true){
            y++;
            while(!nextToABeeper()){
                move();
            }
            countBeepers();
            moveToNextClue();
        }
    }

    public void faceSouth(){
        while(!facingSouth()){
            turnLeft();
        }
    }

    public void faceNorth(){
        while(!facingNorth()){
            turnLeft();
        }
    }

    public void faceWest(){
        while(!facingWest()){
            turnLeft();
        }
    }

    public void faceEast(){
        while(!facingEast()){
            turnLeft();
        }
    }

    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }

    public void turnAround(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
}
