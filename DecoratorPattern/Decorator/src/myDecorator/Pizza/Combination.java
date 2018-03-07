package myDecorator.Pizza;

import myDecorator.PizzaDecoratorCreator;

public class Combination extends PizzaDecoratorCreator {
	

	//데코레이터 패턴으로 자신만의 메소드 꾸미기(메소드 오버라이드)
	@Override
	public int getPizzaPriceDeco() {
		return super.getPizzaPriceDeco()+7000;
	}
	

}