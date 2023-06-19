import java.awt.EventQueue;
import javax.swing.JFrame;
public class App {
    
    public App(){
        initUI();

    }
    
    private void initUI(){
        add(New Board());
        setSize(250,200);
        setTitle("Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args) {
        EventQueue.invokeLater(()->{
            App ex =new App();
            ex.setVisible(true);

        });
    }
}
