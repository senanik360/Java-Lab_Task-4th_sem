
import java.io.File;

public class Demo_1 {

    public static void main(String[] args) {
        File dir = new File("Person");
        dir.mkdir();
        String dirLocation = dir.getAbsolutePath();
        System.out.println("Directory Location : " + dirLocation);
        System.out.println("Directory Name : " + dir.getName());
//        if (dir.delete()) {
//            System.out.println(dir.getName() + "is deleted.");
//        }
        File file1 = new File(dirLocation + "/Student.txt");
        File file2 = new File(dirLocation + "/Teacher.txt");
        try {
            file1.createNewFile();
            file2.createNewFile();
            System.out.println("Files are created.");

        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }
        if (file1.exists()){
            System.out.println("File 1 exists");
        }
    }
}
