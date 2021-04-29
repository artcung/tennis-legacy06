package com.summitthai.tennis_legacy06;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String player1 = "Player1";
    	String player2 = "Player2";
    	
    	int player1Point = 0;
    	int player2Point = 0;
    	int[] x;
    	
        System.out.println( "Start Game...!" );
        printBoard(player1, player1Point, player2, player2Point);
        
        for (int i = 0; i < 4; i++) {
        	player1Point++;
        	x = checkScore(player1, player1Point, player2, player2Point);
        	player1Point = x[0];
        	player2Point = x[1];
        	
        	player2Point++;
        	x = checkScore(player1, player1Point, player2, player2Point);
        	player1Point = x[0];
        	player2Point = x[1];
		}
        player1Point++;
        player1Point++;
        x = checkScore(player1, player1Point, player2, player2Point);
    }
    
    private static int[] checkScore(String player1, int point1, String player2, int point2) {
    	printBoard(player1, point1, player2, point2);
    	if (point1 == 4 && point2 == 4) {
        	return new int[] {3,3};
        }
    	return new int[] {point1, point2};
    }
    
    private static void printBoard(String player1, int point1, String player2, int point2) {
    	if (point1 == point2 && point1 >= 3 ) {
    		System.out.println( "deuce" );
    	} else if (point1 == 5) {
        	System.out.println(player1 + " is winner!!!" );
        } else if (point2 == 5) {
        	System.out.println(player2 + " is winner!!!" );
    	} else {
    		System.out.println( genScroe(player1, point1) );
            System.out.println( genScroe(player2, point2) );
    	}
    	System.out.println( "===============================" );
    }
    
    private static String genScroe(String player, int point) {
    	return player + " " +  describedScore(point);
    }
    
    private static String describedScore(int point) {
    	String[] described = {"love","fifteen","thirty","forty","advantage"}; 
    	return described[point];
    }
}
