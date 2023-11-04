import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Demo_main extends Application{
    public static String url = "file:D:\\Learning\\软件体系结构\\Lab\\Lab2\\proj\\Lab2_proj\\data\\eventSys.png";
    @Override
    public void start(Stage primaryStage) {
        // 创建一个Image对象，指定图像文件的路径
        Image image = new Image(url); // 替换成你的图像文件路径

        // 创建一个ImageView对象，并将Image设置为其图像
        ImageView imageView = new ImageView(image);

        // 创建一个StackPane作为根节点，将ImageView添加到其中
        StackPane root = new StackPane(imageView);

        Scene scene = new Scene(root, image.getWidth(), image.getHeight());

        primaryStage.setTitle("显示图像");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("请选择要运行的功能：");
        System.out.println("1. Event System");
        System.out.println("2. OO");
        System.out.println("3. Pipes and Filters");
        System.out.println("4. Demo 1");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                eventSys.Main.main();
                Outputer.printTOConsole("data/eventSys_output.txt");
                url = "file:data/eventSys.png";
                launch(args);
                break;
            case 2:
                OO.Main.main();
                Outputer.printTOConsole("data/OO_output.txt");
                url = "file:data/OO.png";
                launch(args);
                break;
            case 3:
                Pipes_and_Filters.Main.main();
                Outputer.printTOConsole("data/PF_output.txt");
                url = "file:data/pF.png";
                launch(args);
                break;
            case 4:
                sub_main.demo1.main();
                Outputer.printTOConsole("data/sub_main_output.txt");
                url = "file:data/sub_main.png";
                launch(args);
                break;
            default:
                System.out.println("无效的选择");
        }

        scanner.close();
    }
    public static class Outputer{
        public static void printTOConsole(String fileName){
            BufferedReader inputFile = null;
            try {
                inputFile = new BufferedReader(new FileReader(fileName));
            } catch (Exception e) {
                e.printStackTrace();
            }
            String line;
            try {
                while ((line = inputFile.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
