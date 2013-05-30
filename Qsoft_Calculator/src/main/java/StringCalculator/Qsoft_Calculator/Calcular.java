package StringCalculator.Qsoft_Calculator;

public class Calcular {

	public int add(String string) {
		// TODO Auto-generated method stub
		int value = 0;
		String regex = "";
		if(string.isEmpty())
			return 0;
		else if(string.contains("-"))
			throw new IllegalArgumentException("negatives not allowed"); 
		else{
			if(string.contains("//")){
				regex= ""+string.charAt(2);
				string = string.split("\n")[1];
			} else regex = "[,\n]";
			
			if(string.length()==1)
				return Integer.parseInt(string);
			else {
				String []tmp = string.split(regex);
				for(String i:tmp)
					value+=Integer.parseInt(i);
			}
		}
		return value;
	}

}
