
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class HardwareStore {
    public static void main(String[] args) {
        Laptop asusFX517Z = new Laptop("Asus", "TUF", "FX517Z", "Black", "Windows", "DDR5", 16, 1000,
                "NVIDIA GeForce RTX3060 6 GB GDDR6", "i7", 127097);
        Laptop thunderobotJT009TE07RU = new Laptop("Thunderobot", "911 Air X", "JT009TE07RU", "Grey",
                "Windows", "DDR4", 16, 512, "NVIDIA GeForce RTX 3050 4GB GDDR6", "i5",
                74990);
        Laptop maibenbenX577 = new Laptop("Maibenben", "X577", "R7-7735HS", "Grey", "Linux", "DDR5", 16, 512,
                "NVIDIA GeForce RTX 4050 6 GB GDDR6", "Ryzen7", 103999);
        Laptop msiKatanaGF76 = new Laptop("MSI", "Katana GF76", "11UC-895XRU", "Black", "Windows", "DDR4", 16, 512,
                "NVIDIA GeForce RTX 3050 4 GB GDDR6", "i5", 79990);
        
        HashSet<Laptop> laptopSet = new HashSet<>(Arrays.asList(asusFX517Z, thunderobotJT009TE07RU,
                maibenbenX577, maibenbenX577, msiKatanaGF76));

        System.out.println("Ноутбуки в наличии:");
        System.out.println();
        for (Laptop laptop : laptopSet) {
            System.out.println(laptop);
            System.out.println();
        }
        System.out.println();
        printFiltered(laptopSet, getFilter());

    }

    public static Map<Integer, String> getFilter() {
        Map<Integer, String> filterMap = new HashMap<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите цифру, соответствующую необходимому критерию:" +
                "\n1 - Бренд\n2 - Цвет\n3 - Операционная система\n4 - Тип ОЗУ\n5 - Колличество ОЗУ\n6 - Объем ЖД\n7 - Процессор\n8 - Стоимость\n0 - выход");
        System.out.print(": ");
        int input = scan.nextInt();
        while (!(input == 1 || input == 2 || input == 3 || input == 4 ||
                input == 5 || input == 6 || input == 7 || input == 8 || input == 0)) {
            System.out.println("Не верный ввод, введите еще раз.");
            System.out.println("Введите цифру, соответствующую необходимому критерию:" +
                    "\n1 - Бренд\n2 - Цвет\n3 - Операционная система\n4 -Тип ОЗУ\n5 - Колличество ОЗУ\n6 - Объем ЖД\n7 - Процессор\n8 - Стоимость\n0 - выход");
            System.out.print(": ");
            input = scan.nextInt();
        }
        if (input == 1) {
            System.out.print("Введите название Бренда (Asus, Thunderobot, Maibenben, MSI): ");
            filterMap.put(input, scan.next());
        } else if (input == 2) {
            System.out.print("Введите Цвет (Black или Grey): ");
            filterMap.put(input, scan.next());
        } else if (input == 3) {
            System.out.print("Введите ОС (Windows, Linux): ");
            filterMap.put(input, scan.next());
        } else if (input == 4) {
            System.out.print("Введите тип ОЗУ (DDR4, DDR5): ");
            filterMap.put(input, scan.next());
        } else if (input == 5) {
            System.out.print("Введите минимальное значение ОЗУ: ");
            filterMap.put(input, scan.next());
        } else if (input == 6) {
            System.out.print("Введите минимальное значение ЖД: ");
            filterMap.put(input, scan.next());
        } else if (input == 7) {
            System.out.print("Введите процессор (i5,i7,Ryzen7): ");
            filterMap.put(input, scan.next());
        } else if (input == 8) {
            System.out.print("Введите ваш бюджет: ");
            filterMap.put(input, scan.next());
        }
        scan.close();
        return filterMap;
    }

    public static void printFiltered(HashSet<Laptop> laptopSet, Map<Integer, String> filterMap) {
        for (Map.Entry<Integer, String> entry : filterMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            switch (key) {
                case 1:
                    System.out.println();
                    for (Laptop laptop : laptopSet) {
                        if (laptop.getBrand().toString().equalsIgnoreCase(value))
                            System.out.println(laptop);
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println();
                    for (Laptop laptop : laptopSet) {
                        if (laptop.getColour().toString().equalsIgnoreCase(value))
                            System.out.println(laptop);
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println();
                    for (Laptop laptop : laptopSet) {
                        if (laptop.getOperatingSystem().toString().equalsIgnoreCase(value))
                            System.out.println(laptop);
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println();
                    for (Laptop laptop : laptopSet) {
                        if (laptop.getTypeOfRAM().toString().equalsIgnoreCase(value))
                            System.out.println(laptop);
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println();
                    if (Integer.parseInt(value) <= 16) {
                        for (Laptop laptop : laptopSet) {
                            if (laptop.getCapacityRAM() >= Integer.parseInt(value)) {
                                System.out.println(laptop);
                                System.out.println();
                            }
                        }
                    } else
                        System.out.println("Максимальное значение оперативной памяти 16 ГБ");
                    break;
                case 6:
                    System.out.println();
                    if (Integer.parseInt(value) <= 1000) {
                        for (Laptop laptop : laptopSet) {
                            if (laptop.getHardDiskCapacity() >= Integer.parseInt(value))
                                System.out.println(laptop);
                            System.out.println();
                        }
                    } else
                        System.out.println("Максимальный обьем ЖД равен 1 000 гб");
                    System.out.println();

                    break;
                case 7:
                    System.out.println();
                    for (Laptop laptop : laptopSet) {
                        if (laptop.getProcessor().toString().equalsIgnoreCase(value))
                            System.out.println(laptop);
                        System.out.println();
                    }
                    break;
                case 8:
                    System.out.println();
                    if (Integer.parseInt(value) <= 74989) {
                        System.out.println("Надо копить!!!");
                        System.out.println();
                    } else {
                        for (Laptop laptop : laptopSet) {
                            if (laptop.getCompatibility() <= Integer.parseInt(value))
                                System.out.println(laptop);
                            System.out.println();
                        }
                    }
                    break;
                default:
                    System.out.println("Ошибка!");
                    break;
            }
        }
    }
}
