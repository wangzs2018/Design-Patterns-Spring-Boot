package headfirst.designpatterns.templatemethod.barista;

public abstract class CaffeineBeverageWithHook {

	/**
	 * 准备饮料的流程
	 *
	 * 烧开水 -> 泡制 -> 倒入杯中 -> 如果顾客需要调料，则添加调料
	 */
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}
 
	abstract void brew();
 
	abstract void addCondiments();
 
	void boilWater() {
		System.out.println("Boiling water");
	}
 
	void pourInCup() {
		System.out.println("Pouring into cup");
	}
 
	boolean customerWantsCondiments() {
		return true;
	}
}
