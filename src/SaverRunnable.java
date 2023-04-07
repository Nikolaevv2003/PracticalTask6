import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SaverRunnable implements Runnable {

    private Doctor doctor;
    private String path;

    public SaverRunnable(Doctor doctor, String path) {
        this.doctor = doctor;
        this.path = path;
    }

    @Override
    public void run() {
        if (doctor != null && path != null) {
            FileOutputStream fos;
            try {
                fos = new FileOutputStream(path);
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                oos.writeObject(doctor);
                oos.close();
                System.out.println("Врач успешно сериализован");
                System.out.println("Путь к файлу: " + path);
            } catch (IOException e) {
                System.out.println("Ошибка! Не удалось сохранить врача в файл по пути: " + path);
            }
        }
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
