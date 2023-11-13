
public class Main {
    public static void main(String[] args) {

        int avarageMark = 0;
        int max = 6;

        for (int i = 0; i < max; i++) {
            avarageMark = i + 1;
            if (i == 0) {
                System.out.print("Студент ");
            }
            System.out.print(Student.getScholarship(avarageMark) + " ");
        }

        System.out.println();

        for (int i = 0; i < max; i++) {
            avarageMark = i + 1;
            if (i == 0) {
                System.out.print("Аспирант ");
            }
            System.out.print(Student.Aspirant.getScholarship(avarageMark) + " " );
        }

        System.out.println();

        Car.metodToString(600, "Dodge", "name", 5, "Reno",
                "Sedan", 100, "E");

        System.out.println();

        Animal animal1 = new Animal.Dog("Комісар Рекс");
        Animal animal2 = new Animal.Cat("Кіт Сметанович");
        Animal animal3 = new Animal.Bear("Ведмідь Топтига");

        Veterinarian veterinarian = new Veterinarian();

        Animal[] answer = {animal1, animal2, animal3};

        for (int i = 0; i < answer.length; i++) {
            veterinarian.treatAnimal(answer[i]);
        }

        System.out.println();

        for (int i = 0; i < answer.length; i++) {
            answer[i].makeNoise();
            answer[i].eat();
        }

        System.out.println();

        //Вивести на консоль каталог продуктів.
        Product.Basket test = new Product.Basket("Yeti", 2,3);
        Product.Basket test1 = new Product.Basket("El Camino", 5,56);
        Product.Basket test2 = new Product.Basket("Heisenberg", 27,37);
        Product.Basket[] productArr = {test, test1, test2};

        for (int i = 0; i < productArr.length; i++) {
            System.out.println(productArr[i].name + " " + productArr[i].price + " " + productArr[i].rate);
        }

        System.out.println();

        //Вивести на консоль покупки відвідувачів магазину
        Product.User testUser = new Product.User("User 1", test.name);
        Product.User testUser1 = new Product.User("User 2", test1.name);
        Product.User testUser2 = new Product.User("User 3", test2.name);
        Product.User[] userArr = {testUser, testUser1, testUser2};

        for (int i = 0; i < userArr .length; i++) {
            System.out.println(userArr[i].userName + " " + userArr[i].inBasket);
        }
        //Вивод класа Категория
        Product.Category category = new Product.Category("Household chemicals", productArr);
        Product.Category category1 = new Product.Category("Grocery", productArr);

        for (int i = 0; i < productArr.length; i++) {
            System.out.println(category.categoryName + " " + productArr[i].price);
            System.out.println(category1.categoryName + " " + productArr[i].price);
        }

    }
}


