package in.ineuron.main;
import java.util.*;
/*  Changes made to the program
 	User specific list of participants so program runs for n players.
 	List of all the winners who won the game.
 */
class Guesser{
	private int guessNum;
	int guessNum(){
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser kindly guess the number");
		guessNum=scan.nextInt();
		return guessNum;
	}	
}
class Player{
	private int guessNum;
	int guessNum(int i){
		Scanner scan=new Scanner(System.in);
		System.out.println("Player"+i+" kindly guess the number");
		guessNum=scan.nextInt();
		return guessNum;
	}
}
class Umpire{
	private int numFromGuesser;
	private int n;
	private int[] numFromPlayer;
	Umpire(){
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number of participats:");
		n=scan.nextInt();
		while(n<=0) {
			System.out.println("Participants must be greater than 0, Enter again: ");
			n=scan.nextInt();
		}
		numFromPlayer=new int[n];
;	}
	void collectNumFromGuesser(){
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayers(){
		Player p=new Player();
		for(int i=0;i<n;i++) {
			numFromPlayer[i]=p.guessNum(i+1);
		}
	}
	void compare(){	
		int[] winner=new int[n];
		int k=-1;
		for(int i=0;i<n;i++) {
			if(numFromPlayer[i]==numFromGuesser)
				winner[++k]=i+1;
		}
		if(k==-1) 
			System.out.println("There are no winners.");
		else {
			System.out.println("The list of the winners are: ");
			for(int i=0;i<=k;i++) {
				System.out.println("Player "+winner[i]);
			}
		}
	}
}
public class GusserGame {
	public static void main(String[] args) {
			Umpire u=new Umpire();
			u.collectNumFromGuesser();
			u.collectNumFromPlayers();
			u.compare();

	}

}
