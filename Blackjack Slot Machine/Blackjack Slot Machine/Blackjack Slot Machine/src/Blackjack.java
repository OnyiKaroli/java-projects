import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Blackjack {

	public static void main(String[] args) {

		BlackjackGame mygame = new BlackjackGame();

		mygame.initializeGame();
		do {						//Functions of the game are called
			mygame.shuffle();
			mygame.getBets();
			mygame.dealCards();
			mygame.printStatus();
			mygame.checkBlackjack();
			mygame.hitOrStand();
			mygame.dealerPlays();
			mygame.settleBets();
			mygame.printMoney();
			mygame.clearHands();
		} while (mygame.playAgain());
		//mygame.endGame();
	}
	}