// import java.awt.*;  
// public class MyFrame {
//     public static void main(String[] args) {
//         Frame f = new Frame("My First AWT Frame");

//         f.setSize(400, 300);  
//         f.setLayout(null);  
//         f.setVisible(true);
//     }
// }


import java.awt.*;

public class MyFrame {
    MyFrame() {
        Frame f = new Frame("Login Form");

        Label l1 = new Label("Username:");
        l1.setBounds(50, 50, 100, 30);

        TextField tf1 = new TextField();
        tf1.setBounds(160, 50, 150, 30);

        Button b = new Button("Login");
        b.setBounds(120, 120, 80, 30);

        f.add(l1);
        f.add(tf1);
        f.add(b);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
