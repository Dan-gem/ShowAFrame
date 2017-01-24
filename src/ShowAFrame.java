import javax.swing.JFrame;

public class ShowAFrame { // Создание пустого фрейма
    public static void main(String[] args) {
        JFrame myFrame = new JFrame(); // Объявляем переменную myFrame типа JFame и
        // присваеваем созданый объект класса JFrame с помощью оператора new.

        String myTitle = "Пустой фрейм";
        myFrame.setTitle (myTitle); // Передача переменной myTitle методу setTitle()
        myFrame.setSize(300, 200);
        myFrame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible (true);
    }
}
