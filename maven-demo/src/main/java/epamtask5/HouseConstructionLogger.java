package epamtask5;
import java.util.Scanner;
import java.util.logging.*;
public class HouseConstructionLogger{
		public void dimensions(){
			int standard = 1200;
			int abvstandard = 1500;
			int highstandard = 1800;
			int fullyautomated = 2500;
			float area ;
			Logger log = Logger.getLogger(HouseConstructionLogger.class.getName());
			try (Scanner sc = new Scanner(System.in)) {
			
			float total_cost;
			Boolean flag = true;
			while(flag) {
				log.info("Enter the area of the home to be constructed : ");
				area = sc.nextFloat();
				log.info("Which type of home do you want to perform : ");
				log.info("\n1.Standard Material\n2.Above Standard Material\n3.High Standard Material\n4.Automated Home\n");
				int ch = sc.nextInt();
				switch(ch) {
					case 1 :
						total_cost = area*standard;
						log.info("-----Standard Material costs:---\n"+"The total cost for home using  STANDARD MATERIAL : "+ total_cost);
						log.info("\nDo you want to perform more operations?(y/n)");
						ch=sc.next().charAt(0);
						if(ch == 'y'||ch=='Y')
							flag = true;
						else {
							flag = false;
							log.info("Exit");
						}
						break;
					case 2 :
						total_cost = area*abvstandard;
						log.info("-----Above Standard Material costs:---\n"+"The total cost for home using ABOVE STANDARD MATERIAL : "+ total_cost);
						log.info("\nDo you want to perform more operations?(y/n)");
						ch=sc.next().charAt(0);
						if(ch == 'y'||ch=='Y')
							flag = true;
						else {
							flag = false;
							log.info("Exit");
						}
						break;
					case 3 :
						total_cost = area*highstandard;
						log.info("-----High Standard Material costs:---\n"+"The total cost for home using HIGH STANDARD MATERIAL : "+ total_cost);
						log.info("\nDo you want to perform more operations?(y/n)");
						ch=sc.next().charAt(0);
						if(ch == 'y'||ch=='Y')
							flag = true;
						else {
							flag = false;
							log.info("Exit");
						}
						break;
					case 4 :
						total_cost = area*fullyautomated;
						log.info("-----Fully Automated Material costs:---\n"+"The total cost for home using FULLY AUTOMATED COST : "+ total_cost);
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
				log.info("Given area is wrong");
			}
		}
}

