import java.util.Scanner;
 public class CreditNumber{
  Scanner input = new Scanner(System.in);

   public String cardType(String card){
    String type = "";

if(card.charAt(0) == '4'){
   type = "Visa Card";
}else if(card.charAt(0) == '5'){
   type ="Master Card";

}else if(card.charAt(0) == '3' && card.charAt(1) == '7'){
   type = "American Express cards";

}else if(card.charAt(0) == '6'){
   type = "Discover cards";

}else  type = "Invalid";
   return type;
}

public int AddNumber1(String cardNumber){
int result = 0;
for(int count = cardNumber.length() - 1 ; count >= 0; count--){
var cardValue = Integer.parseInt(String.valueOf(cardNumber.charAt(count))) * 2;
if (count % 2 == 0 && cardValue < 10){
result += cardValue;
}
}
return result;
}

public int AddNumber2(String cardNumber){ 
int result = 0;
for(int count = cardNumber.length() - 1 ; count >= 0; count--){
var cardValue = Integer.parseInt(String.valueOf(cardNumber.charAt(count))) * 2;
if (count % 2 == 0 && cardValue >= 10){
	String  cardValue2 = String.valueOf(cardValue);
	for(int count1 = 0; count1 < cardValue2.length(); count++){
	var cardValue1 = Integer.parseInt(String.valueOf(cardValue2.charAt(count1)));
	result += cardValue1;}
}
}
return result;
}

public int AddNumber3(String cardNumber){
int result = 0;
for(int count = cardNumber.length() -1; count >= 0; count--){
if (count % 2 != 0){
var cardValue = Integer.parseInt(String.valueOf(cardNumber.charAt(count)));
result += cardValue;
}
}
return result;
}

 

public static void main(String[] args){
CreditNumber validator = new CreditNumber();
System.out.print(validator.cardType("5399831690403"));

 
}
}