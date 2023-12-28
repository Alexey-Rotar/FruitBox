/*
— Есть классы Fruit -> Apple, Orange; (больше не надо);
— Класс Box в который можно складывать фрукты, коробки условно сортируются по
типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины; Для
хранения фруктов внутри коробки можете использовать ArrayList;
— Сделать метод getWeight() который высчитывает вес коробки, зная количество
фруктов и вес одного фрукта (вес яблока – 1.0f, апельсина – 1.5f, не важно в каких
единицах);
— Внутри класса коробки сделать метод compare(), который позволяет сравнить
текущую коробку с той, которую подадут в compare() в качестве параметра, true –
если их веса равны, false в противном случае (коробки с яблоками возможно
сравнивать с коробками с апельсинами);
— Написать метод, который позволяет пересыпать фрукты из текущей коробки в
другую коробку (при этом, нельзя яблоки высыпать в коробку с апельсинами),
соответственно, в текущей коробке фруктов не остается, а в другую
перекидываются объекты, которые были в этой коробке.
*/

public class Main
{
	public static void main(String[] args) {
		Box<Fruit> fBox = new Box<>();
		Box<Apple> box1 = new Box<>();
		Box<Orange> box2 = new Box<>();
		Box<Orange> box3 = new Box<>();
		
		box1.addFruit(new Apple());
		box1.addFruit(new Apple());
		box1.addFruit(new Apple());
		box1.addFruit(new Apple());
		box1.addFruit(new Apple());
		box1.addFruit(new Apple());
		
		box2.addFruit(new Orange());
		box2.addFruit(new Orange());
		box2.addFruit(new Orange());
		box2.addFruit(new Orange());
		
		box3.addFruit(new Orange());
		box3.addFruit(new Orange());
		
		System.out.println(box1.getWeight()); 		// вес первого ящика (яблоки)
		System.out.println(box2.getWeight());		// вес второго ящика (апельсинки)
		System.out.println(box3.getWeight());		// вес третьего ящика (апельсинки)
		System.out.println(box1.compare(box2)); 	// сравнение веса ящиков (с яблоками и апельсинами)
		box3.move(box2);							// пересыпание из третьего ящика во второй
		System.out.println(box1.getWeight()); 		// вес первого ящика (яблоки)
		System.out.println(box2.getWeight());		// вес второго ящика (апельсинки)
		System.out.println(box3.getWeight());		// вес третьего ящика (апельсинки)
	}
}
