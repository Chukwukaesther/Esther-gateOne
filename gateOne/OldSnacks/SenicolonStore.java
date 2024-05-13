import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.time.LocalDateTime;
public class SemicolonStore {
	private String storeName = "SEMICOLON STORES";
	private String branch = "MAIN BRANCH";
	private String location = "312, HERBERT MARCAULAY WAY,SABO YABA,LAGOS ";
	private String TEL = "03293828343";
	private LocalDateTime date = LocalDateTime.now();
 	private String cashier;
	private String customer;
	private ArrayList<String> productName = new ArrayList<String>();
	private ArrayList<Integer> quantity = new ArrayList<Integer>();
	private ArrayList<Double> price = new ArrayList<Double>();
	private double discount;
	private double total;
	private double subTotal;
	private double billTotal;
	private double totalMinusDiscount;
	private DecimalFormat ft = new DecimalFormat("####");

    	public static void main(String... args){
SemicolonStore semicolonStore = new SemicolonStore();

semicolonStore.customerName();
}

public void customerName(){
Scanner input = new Scanner(System.in);
System.out.println("What is the customer's name: ");
customer = input.nextLine();
productName();

}

public void productName(){
Scanner input = new Scanner(System.in);
System.out.println("What did the user buy: ");
String product = input.nextLine();
if(product.matches("\\D*")){
productName.add(product);
quantityOfProduct();
}else{
productName();
}
}

public void quantityOfProduct(){
Scanner input = new Scanner(System.in);
System.out.println("How many pieces");
String productQuantity = input.nextLine();
if(productQuantity.matches("^(0|[1-9]\\d*)")){
if(Integer.parseInt(productQuantity) >= 0){
quantity.add(Integer.parseInt(productQuantity));
priceOfProduct();
}
}else{
quantityOfProduct();
}
}

public void priceOfProduct(){
Scanner input = new Scanner(System.in);
System.out.println("How much per unit");
String productPrice = input.nextLine();
if(productPrice.matches("^\\d*")){
if(Double.parseDouble(productPrice) > 0){
price.add(Double.parseDouble(productPrice));
addMoreItems();
}
}else{
priceOfProduct();
}
}

public void addMoreItems(){
Scanner scanner = new Scanner(System.in);
System.out.println("Add more items ");
String response = scanner.nextLine();
if(response.matches("\\D*")){
	boolean isTrue = "Yes".equalsIgnoreCase(response);
	boolean isFalse = "No".equalsIgnoreCase(response);
	if(isTrue){
	productName();
	}
	if(isFalse){
	cashierName();

}

}else{
addMoreItems();
}
}

public void cashierName(){
Scanner input = new Scanner(System.in);
System.out.println("what is the cashier's name");
cashier = input.nextLine();
discount();
}

public void discount(){
Scanner input = new Scanner(System.in);
System.out.println("How much discount will he get");
discount = input.nextDouble();
reciept();
}
public void reciept(){
System.out.println(storeName + "\n" + branch + "\n" + "Location : " + location + "\n" + "TEL : " + TEL + "\n" + "Date : " + date + "\n" + "Cashier : " + cashier + "\n" + "Customer Name : " + customer + "\n");
System.out.print("=".repeat(66));
System.out.println("\n\t" + "ITEM" + "\t\t" + "QTY" + "\t\t" + "PRICE" + "\t\t" + "TOTAL(NGN)");
System.out.println("-".repeat(66));
itemList();
}
public void itemList(){
for(int row = 0; row < productName.size(); row++){
total = (quantity.get(row) * price.get(row));
System.out.print("\t" + productName.get(row) + "\t\t");
System.out.println(quantity.get(row) + "\t\t" + ft.format(price.get(row)) + "\t\t" + ft.format(total));
subTotal += total;
}

}

}
   





   	  