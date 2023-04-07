import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Николаев Александр Сергеевич");
        System.out.println("РИБО-01-21");

        String fullName, jobTitle, placeOfWork;
        int age, numberOfShifts;

        while (true) {
            System.out.println();
            System.out.println("Введите ФИО врача:");
            fullName = scan();
            if (fullName.isEmpty() || fullName.isBlank()) {
                System.out.println("Поле \"ФИО\" должно быть заполнено");
                continue;
            }
            break;
        }

        while (true) {
            System.out.println();
            System.out.println("Введите специальность врача:");
            jobTitle = scan();
            if (jobTitle.isEmpty() || jobTitle.isBlank()) {
                System.out.println("Поле \"Специальность\" должно быть заполнено");
                continue;
            }
            break;
        }

        while (true) {
            System.out.println();
            System.out.println("Введите возраст врача:");
            try {
                age = Integer.parseInt(scan());
                if (age <= 0) {
                    System.out.println("Возраст должен быть больше нуля");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Необходимо ввести целое число больше 0");
            }
        }

        while (true) {
            System.out.println();
            System.out.println("Введите количество смен врача за месяц:");
            try {
                numberOfShifts = Integer.parseInt(scan());
                if (numberOfShifts <= 0) {
                    System.out.println("Количество смен не может быть отрицательным");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Необходимо ввести целое положительное число");
            }
        }

        while (true) {
            System.out.println();
            System.out.println("Введите место работы врача:");
            placeOfWork = scan();
            if (placeOfWork.isEmpty() || placeOfWork.isBlank()) {
                System.out.println("Поле \"Место работы\" должно быть заполнено");
                continue;
            }
            break;
        }

        Doctor doctor = new Doctor(fullName, age, jobTitle, numberOfShifts, placeOfWork);

        System.out.println("Врач создан!");
        System.out.println(doctor);

        String fileName;
        while (true) {
            System.out.println();
            System.out.println("Придумайте имя файлу, куда сохранить машину (без расширения):");
            fileName = scan();
            if (fileName.isEmpty() || fileName.isBlank()) {
                System.out.println("Нужно ввести имя файла");
                continue;
            }
            break;
        }

        String fileExtension;
        while (true) {
            System.out.println();
            System.out.println("Введите расширение файла (без точки):");
            System.out.println("Пример: txt  docx  ser и т.д. (любое расширение)");
            fileExtension = scan();
            if (fileExtension.isEmpty() || fileExtension.isBlank()) {
                System.out.println("Нужно ввести расширение файла");
                continue;
            }
            break;
        }

        SaverRunnable saver = new SaverRunnable(doctor, "C:\\" + fileName + "." + fileExtension);

        Thread thread = new Thread(saver);
        thread.start();
    }

    public static String scan() {
        return new Scanner(System.in).nextLine();
    }
}