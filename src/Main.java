import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {

/*
 Представим, что мы попали на дикий запад.
 Нам нужно написать приложение для описания салуна.
 Создайте класс Cowboy с полем имя и полем gunsWeight;

 Создать класс салун Saloon, у него должны быть поле название
 и поле типа PriorityQueue<Cowboy> cowboys
 у салон должны быть следующие методы:
 - serveDrink()  ничего не принимает и выводит в
 печать имя ковбоя с самым большим пистолетом
 "Robbie Gonzales please take your whiskey"
 - letCowboyIn(Cowboy cowboy) - впускает ковбоя в салон

 */

        Cowboy john = new Cowboy("John", 500);
        Cowboy joe = new Cowboy("Joe", 680.9);
        Cowboy bobby = new Cowboy("Bobby", 450);
        Cowboy clod = new Cowboy("Clod", 765.5);
        Cowboy michele = new Cowboy("Michele", 505);

        System.out.println(michele);

        Saloon wildWest = new Saloon("Wild West" );

        wildWest.letCowboyIn(john);
        wildWest.letCowboyIn(joe);
        wildWest.letCowboyIn(bobby);
        wildWest.letCowboyIn(clod);
        wildWest.letCowboyIn(michele);

        System.out.println(wildWest);
        wildWest.serveDrink();
        wildWest.serveDrink();

        System.out.println(wildWest);

//






    }
}