package org.designpatterns.coffee;

import org.designpatterns.coffee.CoffeeMaker.Drink;

class Americano implements Drink {
	private final CoffeeDriver coffeeDriver;

	public Americano(CoffeeDriver coffeeDriver) {
		this.coffeeDriver = coffeeDriver;
	}

	@Override
	public void prepare() {
		coffeeDriver.dispenseCoffee();
		coffeeDriver.dispenseWater();
		coffeeDriver.dispenseWater();
	}

	@Override
	public String name() {
		return "AMERICANO";
	}
}
