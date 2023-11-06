public class MakeAuto {

        public static class Car {
            String brand;
            String color;
            public Car() {}
            public Car(String brand, String color) {
                this.brand = brand;
                this.color = color;
            }


//           Здесь метод, который объединит вывод цвета и марки
            public void carInfo() {
                System.out.println("Марки: " + brand);
                System.out.println("Цвет: " + color);
            }
            public String carDrive() {
                return " едет.";
            }

            public String carBrake() {
                return " тормозит.";
            }

            public static void main(String[] args) {
                Car car1 = new Car("Toyota", "Черный");
                Car car2 = new Car("Mazda", "Красный");

                Car car3 = new Car();
                car3.brand = "Renault";
                car3.color = "Yellow";

//   Первый вывод на экран я делаю с помощью вызова поля бренд и цвет, объекта car1 + метод car1.carDrive()
                System.out.println("Машина 1: " + "Марки: " + car1.brand + " Цвет: " + car1.color + "\n Эта машина : " + car1.carDrive());

//  Второй и последующие выводы делаю с помощью метода carInfo и carDrive, carBrake. Мне кажется, так выглядит
//  интереснее, но возможно более нагруженным выглядит код
                System.out.println("Машина 2:");
                car2.carInfo();
                System.out.println("Эта машина: " + car2.carDrive());

                System.out.println("Машина 3:");
                car3.carInfo();
                System.out.println("Эта машина: " + car3.carBrake());


            }}}