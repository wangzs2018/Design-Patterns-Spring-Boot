package headfirst.designpatterns.builder.pizza;

class VeggieLoversPizzaBuilder extends PizzaBuilder {
	public VeggieLoversPizzaBuilder() {
		this.name = "Veggie Lovers Pizza";
	}
	@Override
	public PizzaBuilder addCheese() {
		// veggie lovers like parm
		this.toppings.add("parmesan");
		return this;
	}
	@Override
	public PizzaBuilder addSauce() {
		this.toppings.add("sauce");
		return this;
	}
	@Override
	public PizzaBuilder addTomatoes() {
		this.toppings.add("chopped tomatoes");
		return this;
	}
	@Override
	public PizzaBuilder addGarlic() {
		this.toppings.add("garlic");
		return this;
	}
	@Override
	public PizzaBuilder addOlives() {
		this.toppings.add("green olives");
		return this;
	}
	@Override
	public PizzaBuilder addSpinach() {
		this.toppings.add("spinach");
		return this;
	}
	@Override
	public PizzaBuilder addPepperoni() {
		// never EVER add Pepperoni to veggie lovers pizza
		return this;
	}
	@Override
	public PizzaBuilder addSausage() {
		// never EVER add Sausage to veggie lovers pizza
		return this;
	}
	
}