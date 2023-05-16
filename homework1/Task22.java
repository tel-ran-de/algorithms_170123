package homework1;

/**
 * @author Rustam Khakov
 */
public class Task22 {
	//Даны переменные:
	//деньги которые у нас есть - 1000 рублей
	//стоимость пиццы - 230 рублей
	//стоимость жвачки - 26 рублей
	//стоимость конфеты - 2,5 рубля Задача: представим себе что мы зашли в магазин,
	// и наша задача: купить максимум возможных пиц, затем на сдачу купить максимум жвачек,
	// затем на оставшуюся сдачу купить конфет. В результате нам нужно сделать математический просчет
	// и вывести на консоль примерно вот такую информацию: На эти деньги мы можем купить:
	//4 пиццы
	//3 жвачки
	//0 конфет Сдача с магазина: 2 рубля.
	public static void main(String[] args) {
		int money = 1000;
		int pizzaPrice = 230;
		int gymPrice = 26;
		double candyPrice = 2.5;
		int pizzaCount = 0;
		while (money> pizzaPrice) { // 1 *4
			money = money - pizzaPrice;// 2 * 4
			pizzaCount = pizzaCount +1; //2 * 4
		}
		// 20
		pizzaCount = money / pizzaPrice; // 2
		money = money % pizzaPrice; //2
		//4
		int gymCount = money / gymPrice; // 2
		money = money % gymPrice; //2
		int candyCount = (int) (money / candyPrice);// how many candies could we buy
		money = money - (int)(candyPrice * candyCount);


		int pizzaCount1 = calcPizzaCount(money, pizzaPrice);
		System.out.printf("We bought: %s pizza", pizzaCount1);// посчитали сколько можем купить пицц
		System.out.printf("We bought: %s gym", calcGymCount(money - (pizzaPrice * pizzaCount1) , pizzaPrice, gymPrice)); // заново посчитали сколько пицц и посчитали сколько
		// можем купить на остаток


	}

	public static int calcPizzaCount(int money, int pizzaPrice) {
		return money / pizzaPrice;
	}

	public static int calcGymCount(int money, int pizzaPrice, int gymPrice) {
		return money / gymPrice;
	}
}
