package headfirst.designpatterns.builder.pizza;

class MeatLoversPizzaBuilder extends PizzaBuilder {
	public MeatLoversPizzaBuilder() {
		this.name = "Meat Lovers Pizza";
	}
	@Override
	public PizzaBuilder addCheese() {
		// meat lovers like moz
		this.toppings.add("mozzerella");
		return this;
	}
	@Override
	public PizzaBuilder addSauce() {
		this.toppings.add("NY style sauce");
		return this;
	}
	@Override
	public PizzaBuilder addTomatoes() {
		this.toppings.add("sliced tomatoes");
		return this;
	}
	@Override
	public PizzaBuilder addGarlic() {
		this.toppings.add("garlic");
		return this;
	}
	@Override
	public PizzaBuilder addOlives() {
		// never add olives to meat lovers pizza
		return this;
	}
	@Override
	public PizzaBuilder addSpinach() {
		// never add spinach to meat lovers pizza
		return this;
	}
	@Override
	public PizzaBuilder addPepperoni() {
		this.toppings.add("pepperoni");
		return this;
	}
	@Override
	public PizzaBuilder addSausage() {
		this.toppings.add("sausage");
		return this;
	}	
}