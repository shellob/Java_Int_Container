import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntContainer container = new IntContainer();

        while (true) {
            System.out.println("Введите команду: add, get, remove, size, exit");
            String command = scanner.next();

            if (command.equalsIgnoreCase("exit")) {
                break;
            }

            switch (command.toLowerCase()) {
                case "add":
                    System.out.println("Введите число для добавления:");
                    int value = scanner.nextInt();
                    container.add(value);
                    System.out.println("Элемент добавлен.");
                    break;
                case "get":
                    System.out.println("Введите индекс элемента:");
                    int getIndex = scanner.nextInt();
                    try {
                        int element = container.get(getIndex);
                        System.out.println("Элемент на позиции " + getIndex + ": " + element);
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Неверный индекс.");
                    }
                    break;
                case "remove":
                    System.out.println("Введите индекс элемента для удаления:");
                    int removeIndex = scanner.nextInt();
                    try {
                        container.remove(removeIndex);
                        System.out.println("Элемент удален.");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Неверный индекс.");
                    }
                    break;
                case "size":
                    System.out.println("Размер контейнера: " + container.size());
                    break;
                default:
                    System.out.println("Неверная команда. Попробуйте еще раз.");
            }
        }
        scanner.close();
    }
}
