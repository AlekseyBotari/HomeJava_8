public abstract class Animal {
    public abstract void makeNoise();
    public abstract void eat();
    public abstract void getDescription();
    public static class Bear extends Animal {
        public Bear(String name){
            this.name = name;
        }
        @Override
        public void makeNoise() {
            System.out.print("Р-р-р! ");
        }

        @Override
        public void eat() {
            System.out.print("Ведмеді люблять мед. ");
        }

        @Override
        public void getDescription() {
            System.out.print("Ведмідь грізлі. ");
            System.out.println();
        }
    }
    public static class Cat extends Animal {
        public Cat(String name){
            this.name = name;
        }
        @Override
        public void makeNoise() {
            System.out.print("Мяу. Мяу. ");
        }
        @Override
        public void eat() {
            System.out.print("Коти їдять спеціальний корм для котів. ");
            System.out.println();
        }

        @Override
        public void getDescription() {
            System.out.print("Мейн-кун. ");
        }
    }
    String name;
    public static class Dog extends Animal {
        public Dog(String name){
            this.name = name;
        }
        @Override
        public void makeNoise() {
            System.out.print("Гав. Гав. ");
        }
        @Override
        public void eat() {
            System.out.print("Собаки їдять спеціальний корм для собак. ");
            System.out.println();
        }
        @Override
        public void getDescription() {
            System.out.print("Золотистий ретривер. ");
        }
    }
}

class Veterinarian {
    public void treatAnimal(Animal animal) {
        System.out.println(animal.name + ". Болить лапка");
    }
}
