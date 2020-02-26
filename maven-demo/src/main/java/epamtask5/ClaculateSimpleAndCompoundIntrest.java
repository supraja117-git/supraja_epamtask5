package epamtask5;
import java.util.Scanner;
import java.util.logging.*;
public class ClaculateSimpleAndCompoundIntrest {
	Logger log = Logger.getLogger(ClaculateSimpleAndCompoundIntrest.class.getName());
	public void simpleIntrest(double principle,double time,double rate) {
		double simpleintrestvalue = (principle * time * rate) / 100;
		 log.info(""+simpleintrestvalue);
	}
	public void compoundIntrest(double principle,double time,double rate) {
		double compoundintrestvalue = (principle * Math.pow(1.0 + rate / 100.0 , time) - principle);
	     log.info(""+compoundintrestvalue);
	}
	public void inputDetails() { 
		try (Scanner sc = new Scanner(System.in))
		{
			Boolean flag = true;
			ClaculateSimpleAndCompoundIntrest calculate = new ClaculateSimpleAndCompoundIntrest();
			while(flag) {
				log.info(""+"1.Simple Interest\n2.Compound Interest\n");
				log.info(""+"Choose the operation which you want to perform : \n");
				int ch = sc.nextInt();
				log.info(""+ "Enter the amount of principle : ");
				double p = sc.nextDouble();
				log.info(""+ "Enter the number of years : ");
				double t = sc.nextDouble();
				log.info(""+ "Enter the rate of interest : ");
				double r = sc.nextDouble();
				switch(ch) {
				case 1 :
					log.info(""+"-----SIMPLE INTEREST-----\n");
					log.info(""+ "The simple interest for the given amount is : ");
				calculate.simpleIntrest(p, t, r);
				log.info(""+ "\n");
				log.info("\nDo you want to perform more operations?(y/n)");
				        ch=sc.next().charAt(0);
				        if(ch == 'y'||ch=='Y')
				        flag = true;
				        else {
				        flag = false;
				        log.info(""+"Exit");
				        }
				        break;
				case 2:
					log.info("-----COMPOUND INTEREST-----\n");
					log.info(""+ "The compound interest for the given amount is : ");
				calculate.compoundIntrest(p, t, r);
				log.info(""+ "\n");
				log.info("\nDo you want to perform more operations?(y/n)");
				        ch=sc.next().charAt(0);
				        if(ch == 'y'||ch=='Y')
				        flag = true;
				        else {
				        flag = false;
				        log.info("Exit");
				        }
				        break;
				}
				}
				}
				catch(Exception e) {
					log.info(""+ "Input exception");
				}

	}
}

