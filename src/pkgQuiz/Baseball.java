package pkgQuiz;

import java.util.Scanner;

public class Baseball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		
		System.out.println("player Name: ");
		String n = input.next();
		
		System.out.println("player Name: ");
		String l = input.next();
		
		System.out.println("At Bats: ");
		int AB = input.nextInt();
		
		System.out.println("Hits: ");
		int H = input.nextInt();
		
		System.out.println("Doubles: ");
		int TwoB = input.nextInt();
	
		System.out.println("Triples: ");
		int ThreeB = input.nextInt();
		
		System.out.println("Home Runs: ");
		int HR = input.nextInt();
		
		System.out.println("Walks: ");
		int BB = input.nextInt();
		
		System.out.println("Runs: ");
		int R = input.nextInt();
		
		input.close();
		
		double BA = getBA( AB, H);
		double OBP = getOBP( AB, H, BB);
		double SLG = getSLG (H, TwoB, ThreeB, HR, AB);
		double OBS = getOBS (OBP, SLG);
		double TB = getTB( H, TwoB, ThreeB, HR);
		
		System.out.println("Player Name:" + n + " " + 1 + "\n");
		System.out.println("Player's Batting Average: " + BA + "\n");
		System.out.println("Player's On Base Percentage: " + OBP + "\n");
		System.out.println("Player's Slugging Percentage: " + SLG + "\n");
		System.out.println("Player's On Base Plus Slugging Percentage: " + OBS + "\n");
		System.out.println("Player's Total Bases: " + TB + "\n");
		System.out.println("Player's Runs: " + R + "\n");
	}
	
	public static double getBA(double AB, double H) {
		double BA = (H/AB);
		return BA;
	}
	
	public static double getOBP(double AB, double H, double BB) {
		double OBP = (H+BB)/(AB+BB);
		return OBP;
	}
	
	public static double getOBS( double OBP, double SLG) {
		double OBS = OBP + SLG;
		return OBS;
	}
	
	public static double getSLG(double H, double twoB, double threeB, double HR, double AB) {
		double oneB = H - (twoB + threeB + HR);
		double SLG = (oneB + 2*twoB + 3*threeB + 4*HR)/AB;
		return SLG;
	}
	public static double getTB( double H, double twoB, double threeB, double HR) {
		double oneB = H - (twoB + threeB + HR);
		double TB = (oneB + 2*twoB + 3*threeB + 4*HR);
		return TB; 
	}

}
