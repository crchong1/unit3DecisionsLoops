import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Rock;
import info.gridworld.grid.Grid;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Location;
import java.util.ArrayList;
import java.util.Random;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import info.gridworld.actor.Actor;

/**
 * The test class GameOfLifeTest.
 *
 * @author  @gcschmit
 * @version 19 July 2014
 */
public class GameOfLifeTest
{
    /**
     * Default constructor for test class GameOfLifeTest
     */
    public GameOfLifeTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testInitialState()
    {
        /* expected pattern for initial state
         *  (X: alive; -: dead)
         * 
         *    0 1 2 3 4 5 6 7 8 9 10 11 12 
         *  0 - - - - - - - - - - -  -  - 
         *  1 - - - - - - - - - - -  -  -
         *  2 - - - - - - - - - - -  -  -
         *  3 - - - - - - - - - - -  -  -
         *  4 X X X X X X X X - - -  -  -
         *  5 - - - - - - - - - - -  -  -
         *  6 - - - - - - - - - - -  -  -
         *  7 - - - - - - - - - - -  -  -
         *  8 - - - - - - - - - - -  -  -
         *  9 - - - - - - - - - - -  -  -
         *  10  - - - - - - - - - - - - -
         */
        
        GameOfLife game = new GameOfLife();
        final int ROWS = game.getNumRows();
        final int COLS = game.getNumCols();

        for(int row = 0; row < ROWS; row++)
        {
            for(int column = 0; column < COLS; column++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Rock cell = game.getRock(row, column);

                // if the cell at the current row and col should be alive, assert that the actor is not null
                if( (row == 4 && column == 0) ||
                    (row == 4 && column == 1) ||
                    (row == 4 && column == 2) ||
                    (row == 4 && column == 3) ||
                    (row == 4 && column == 4) ||
                    (row == 4 && column == 5) ||
                    (row == 4 && column == 6) ||
                    (row == 4 && column == 7)                
                    ) 
                {
                    assertNotNull("expected alive cell at (" + row + ", " + column + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + column + ")", cell);
                }
            }
        }
    }

    @Test
    public void testState1() throws InterruptedException
    {   
         GameOfLife game = new GameOfLife();
         final int ROWS = game.getNumRows();
         final int COLS = game.getNumCols();
         
         // after 1 generation
         for (int i = 1; i<2; i++) 
         {
             Thread.sleep(500);
            game.createNextGeneration();
         }
            
         /*   0 1 2 3 4 5 6 7 8 9 10 11 12 
         *  0 - - - - - - - - - - -  -  - 
         *  1 - - - - - - - - - - -  -  -
         *  2 - - - - - - - - - - -  -  -
         *  3 - X X X X X X - - - -  -  -
         *  4 - X X X X X X - - - -  -  -
         *  5 - X X X X X X - - - -  -  -
         *  6 - - - - - - - - - - -  -  -
         *  7 - - - - - - - - - - -  -  -
         *  8 - - - - - - - - - - -  -  -
         *  9 - - - - - - - - - - -  -  -
         *  10  - - - - - - - - - - - - -
         */
         
        
        for(int row = 0; row < ROWS; row++)
        {
            for(int column = 0; column < COLS; column++)
            {
                // in this example, an alive cell has a non-null actor and a dead cell has a null actor
                Rock cell = game.getRock(row, column);
                // if the cell at the current row and col should be alive, assert that the actor is not null
                if( (row == 3 && column == 1) ||
                    (row == 3 && column == 2) ||
                    (row == 3 && column == 3) ||
                    (row == 3 && column == 4) ||
                    (row == 3 && column == 5) ||
                    (row == 3 && column == 6) ||
                    (row == 4 && column == 1) ||
                    (row == 4 && column == 2) ||
                    (row == 4 && column == 3) ||
                    (row == 4 && column == 4) ||
                    (row == 4 && column == 5) ||
                    (row == 4 && column == 6) ||
                    (row == 5 && column == 1) ||
                    (row == 5 && column == 2) ||
                    (row == 5 && column == 3) ||
                    (row == 5 && column == 4) ||
                    (row == 5 && column == 5) ||
                    (row == 5 && column == 6)                
                )
                {
                    assertNotNull("expected alive cell at (" + row + ", " + column + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + column + ")", cell);
                }
            }
        }
    }
    

    @Test
    public void testSeventhState() throws InterruptedException
    {
        /* verify that the actual pattern matches the expected pattern after 3 generations         *  
         */
        GameOfLife game = new GameOfLife();
        
        final int ROWS = game.getNumRows();
        final int COLS = game.getNumCols();
        
        // 7th generation
        for(int i=1; i < 7; i++)
        {
            Thread.sleep(500);
            game.createNextGeneration();
        }
        
        /*    0 1 2 3 4 5 6 7 8 9 10 11 12 
         *  0 - - - - - - - - - - -  -  - 
         *  1 - - - - - - - - - - -  -  -
         *  2 X X - - - - X X - - -  -  -
         *  3 - - X - - X - - X - -  -  - 
         *  4 - - X - - X - - X - -  -  -
         *  5 - - X - - X - - X - -  -  -
         *  6 X X - - - - X X - - -  -  -
         *  7 - - - - - - - - - - -  -  -
         *  8 - - - - - - - - - - -  -  -
         *  9 - - - - - - - - - - -  -  -
         *  10  - - - - - - - - - - - - -
         */
        
        for(int row = 0; row < ROWS; row++)
        {
            for(int column = 0; column < COLS; column++)
            {
                
                Rock cell = game.getRock(row, column);
                if(
                    (row == 2 && column == 0) ||
                    (row == 2 && column == 1) ||
                    (row == 2 && column == 6) ||
                    (row == 2 && column == 7) ||
                    (row == 3 && column == 2) ||
                    (row == 4 && column == 2) ||
                    (row == 5 && column == 2) ||
                    (row == 6 && column == 0) ||
                    (row == 6 && column == 1) ||
                    (row == 3 && column == 5) ||
                    (row == 4 && column == 5) ||
                    (row == 5 && column == 5) ||
                    (row == 3 && column == 8) ||
                    (row == 4 && column == 8) ||
                    (row == 5 && column == 8) ||
                    (row == 6 && column == 6) ||
                    (row == 6 && column == 7)
                
                ) 
                {
                    assertNotNull("expected alive cell at (" + row + ", " + column + ")", cell);
                }
                else // else, the cell should be dead; assert that the actor is null
                {
                    assertNull("expected dead cell at (" + row + ", " + column + ")", cell);
                }
            }
        }
        
    }
}

