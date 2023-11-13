public class Product {
    String  name;
    int price;
    int rate;
    //Створити клас Товар,  що має  змінні ім’я, ціна, рейтинг
    public Product(String name, int price, int rate) {
        this.name = name;
        this.price = price;
        this.rate = rate;
    }

    //Створити клас Категория, що має змінні  ім’я та масив  товарів. Створити кілька об'єктів класу  Категория.
    static class Category {
        String categoryName;
        Product[] arrayProduct;

        public Category(String categoryName, Product[] arrayProduct) {
            this.categoryName = categoryName;
            this.arrayProduct = arrayProduct;
        }
    }
    //Створити клас Basket, що містить масив куплених товарів.
    static class Basket extends Product{
        public Basket(String name, int price, int rate) {
            super(name, price, rate);
        }
    }
    //Створити клас User, що містить логін, пароль та об'єкт класу  Basket. Створити кілька об'єктів класу User.
    static class User {
        String login;
        String password;
        String userName;
        String inBasket;
        public User(String userName, String inBasket) {
            this.userName = userName;
            this.inBasket = inBasket;
        }
    }
}
