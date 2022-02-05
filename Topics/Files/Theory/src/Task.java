// You can experiment here, it won’t be checked

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        // put your code here

        File file = new File("C:\\Users\\user\\Documents");

        List<File> allFiles = getAllFiles(file);
    }

    public static List<File> getAllFiles(File rootDir) {
        File[] children = rootDir.listFiles();
        if (children == null || children.length == 0) {
            return Collections.emptyList();
        }

        List<File> files = new ArrayList<>();
        for (File child : children) {
            if (child.isDirectory()) {
                files.addAll(getAllFiles(child));
            } else {
                files.add(child);
            }
        }

        return files;
    }

}
