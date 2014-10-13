package CalcPackage;

public class FutureValueCalc {
	
	public static double futureValueCalc(double PresentValue, double Years, double AnnualInterestRate){
		double answer = (PresentValue * Math.pow((1 + AnnualInterestRate/100), Years));
		double newAnswer = Math.round(answer*100);
		double RoundedAnswer = newAnswer / 100;
		return RoundedAnswer;
		
	}


}
