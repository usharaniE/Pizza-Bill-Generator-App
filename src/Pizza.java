public class Pizza {
private int price;

private Boolean veg;

private int extraCheesePrice =100;

private int extraToppingsPrice =150;

private int backPackPrice=20;

private int basePizzaPrice;

private boolean isExtraCheesePrice= false;
private boolean isExtraToppingsPrice=false;
private boolean isOptedForTakeAway =false;

//constuctor
public Pizza(Boolean veg) {
	
	this.veg= veg;
	
	if(this.veg) {
		
		this.price= 300;
	}
	else {
		this.price = 400;
	}
	basePizzaPrice =this.price;
}

public void addExtraCheese() {
	isExtraCheesePrice = true;
	
this.price +=extraCheesePrice;
}
public void addExtraToppings() {
	isExtraToppingsPrice=true;
	
	this.price += extraToppingsPrice;
	
}
public void takeAway() {
	isOptedForTakeAway=true;
	
	this.price += backPackPrice;
}
public void getBill() {
	String bill= "";
	System.out.println("Pizza: "+basePizzaPrice);
	if(isExtraCheesePrice) {
		bill +="Extra Cheese added:"+extraCheesePrice+ "\n";
		
	}
	if(isExtraToppingsPrice) {
		bill +="Extra Toppings added:"+extraToppingsPrice+ "\n";
		
	}
	if(isOptedForTakeAway) {
		bill +="Take away:"+backPackPrice+ "\n";
		
	}
	bill += "Bill: "+this.price+ "\n";
	System.out.println(bill);
	
}

}
/**
 * Base pizza :300
 * Toppings :150
 * cheese:100
 * Take away:20
 * **/
