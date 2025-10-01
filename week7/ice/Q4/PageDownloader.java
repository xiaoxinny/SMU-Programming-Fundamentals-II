
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class PageDownloader {

    public static void main(String[] args) {
        try {
            new PageDownloader().start();
        } catch (NullPointerException e) {
            System.out.println("URL passes, but it is actually invalid. Please try again.");
            new PageDownloader().start();
        }
    }

    private void start() {
        Scanner console = new Scanner(System.in);
        URL url = new PageDownloader().getUrl(console);
        new PageDownloader().getUrlStream(url);
    }

    private URL getUrl(Scanner sc) {
        System.out.print("Enter the URL> ");
        String websiteURL = sc.nextLine();
        try {
            return new URL(websiteURL);
        } catch (MalformedURLException e) {
            System.out.println("Invalid URL!");
            getUrl(sc);
            return null;
        }
    }

    private void getUrlStream(URL url) {
        try {
            Scanner sc = new Scanner(url.openStream());
            while (sc.hasNext()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Destination could not be found. Resolution issues.");
        }
    }
}
