const prompt = require("prompt-sync")();
const balance = 0.00;
const seconBalance = 0;



console.log (">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
console.log ("WELCOME TO ESTHERS ATM MACHINE")
console.log (">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")

printOption()
const userInput = prompt(" Enter option ")


function printOption(){
const option = `
please choose an option
1. create Account
2. close account
3. Deposit money
4. widthdraw money
5. Check Account balance
6. Transfer
7. Change pin
 `;
console.log(option)

}

switch(number) {
case "1": createAccount();
break;

case "2": closeAccount();
break;

case "3": depositAmount();
break;

case "4": withdrawalAmount();
break;

case "5": checkAccountBalance();
break;
			
case "6": transfer();
break;	



