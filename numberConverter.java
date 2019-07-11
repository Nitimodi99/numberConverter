//classType=1 convert binary to decimal nd vice versa

	
public class numberConverter{

	/**
	* i.e "invalid number of arguments <br> Number Converter "number" "conversion type" <br>
		"conversion type" <br> 1.binary to decimal <br> 2.decimal to binary <br> "number" <br> appropriate number
	**/

	public static void main(String[] args) {
		
		if(args.length!=2)
		{
			
			System.out.println("invalid number of arguments");
			System.out.println(" Number Converter <number> <conversion type> ");
			System.out.println("<conversion type> \n 1.binary to decimal \n 2.decimal to binary");
			System.out.println("<number> \n appropriate number");

		}



		int number=Integer.parseInt(args[0]);
		int classType=Integer.parseInt(args[1]);
		double decimal=0;
		int temp=number;

		if(classType==1){


			

			for (int i=0;temp>0 ;i++ ) {
				
				int a=temp%10;
				decimal=decimal+(a*Math.pow(2,i));
				temp=temp/10;
			}
		
			System.out.println(decimal);

		}
		else{

				String binary="";

				while(temp>0){

					int a=temp%2;
					binary=binary+a;
					temp=temp/2;
				}

				//prints binary as actually obtained tat is reverse than the actual value.
				//System.out.println(binary);


				String reverse="";
				for(int j=(binary.length()-1);j>=0;j--)
				{
					reverse=reverse+binary.charAt(j);
				}
				
				System.out.println(reverse);

		}


	}
}