package orchard_sp_calc;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;
import java.util.Scanner;

public class JavaApplication_Spraying_calculation {
	
		   
	    public static void main(String[] args) throws IOException {
	        // TODO code application logic here
	        //mTv-maximum tree volume,
	//mDs-maximum dilute spray,Running feet of row per acre
	//* Maximum tree volume/acre = tree width x tree height x running feet or row per acre. Running feet of row per acre = 43560 divided by the distance between rows.
	// Minimum dilute gallons per acre = approximately 0.7 gallon /1,000 cubic feet of tree volume.
	/*
	    /**
	     * @param args the command line arguments
	     */
	 double square,volume,disRows,treeH,treeW,mTv,mDs,rFofr,density,tRv,dRp,sDv;
	 
	 System.out.println( " Введите площадь  в m 2" );
	 Scanner tt=new Scanner(System.in);
	 square=tt.nextDouble();
	 System.out.println("площадь равна "  +square);
	 

	 
	 FileOutputStream fos = new FileOutputStream("Orchard_spraying_calculation_list.txt");
	     
	   PrintStream pw = new PrintStream(fos);
	 pw.println("hey,площадь равна " +square);
	 
	 String S;
	 System.out.println(" Input fruit name");
	 S= tt.next();
	 
	 pw.println("Fruit name is" +S);
	 System.out.println("Input active substance/commertial  name");
	 S=tt.next();
	 pw.println("active substance/commertial  name is"  +S);
	 System.out.println("Запись в файл произведена");
	 
	 System.out.println("Distance betweeen rows");
	 disRows=tt.nextDouble();
	 pw.println("Distance betweeen rows" +disRows);
	 System.out.println("Height of trees is... m");
	 treeH = tt.nextDouble();
	 pw.println("Height of trees is... m" +treeH);
	 System.out.println("Width of tres is ... m");
	 treeW=tt.nextDouble(); 
	 
	 tRv = (treeH *treeW*10000)/disRows;
	 System.out.println(" tree row volume =" +tRv +" m3 или небходимо " +tRv*0.08 +"литров на 1 га");// (0.08/m3)
	 pw.println("tree row volume =" +tRv+" m3 или");
	 mTv=tRv*0.001;
	 System.out.println(mTv+"mTv = Maximum spray Volume ");
	 pw.println (mTv+ "mTv = Maximum spray Volume " );
	 System.out.println("Density is ");
	 density=tt.nextDouble();
	 //Determining density factors using tree density estimates.(0.5-1)
	 System.out.println("Real spray volume is"+(mTv*density));
	 
	  
	  
	  System.out.println(" Input dilute rate of pesticide ");
	    
	  dRp = tt.nextDouble(); //dilute rate kg/ha
	  System.out.println("Your customized pesticide rate is " +(dRp*tRv)/100);
	  pw.println("Your customized pesticide rate is " +(dRp*tRv)/100);
	  Date date =new Date();
	  System.out.println("time is " +date);
	  pw.println("time is " +date);
	  System.out.println("second method of pesticide rate definition:");
	  pw.println("second method of pesticide rate definition:");
	 System.out.println("Input standart dilute volume");//sDv(apple 400gal/acre(605 l/ha),others 300gall/acre(454l/ha)
	 
	 
	  sDv=tt.nextDouble(); 
	 pw.println("Standart dilute volume is"  +sDv);
	 System.out.println("Standart dilute volume is"  +sDv);
	 
	 System.out.println("Quantity of pesticide decreases with " +tRv/sDv*100+" %'");
	 pw.println("Quantity of pesticide decreases with " +tRv/sDv*100+" %'");

	  System.out.println("We need totally " +square*(dRp*tRv)/10000 +"kg");
	        pw.println ("We need totally " +square*(dRp*tRv)/10000 + "kg");
	        
	      
	  
	    }}
	  
	 
