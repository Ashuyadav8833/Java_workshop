
class downloadfile {
    public void file(String file) {
        for (int i=1; i<=100; i++) {
                System.out.println(file + " Downloading...." + i + "%");
            try {
                Thread.sleep(80);
            } catch (Exception e) {
            }
        }
        System.out.println(file +" Downloaded");
    }
}

public class thread_basics {
    public static void main(String[] args) {
        downloadfile chrome  = new downloadfile();
        chrome.file("Video");
    }
}
