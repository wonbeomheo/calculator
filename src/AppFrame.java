import javax.swing.JFrame;

public class AppFrame extends JFrame {
    private BtnPanel btnPanel = new BtnPanel();
    private NumberBox numberBox = new NumberBox();

    //Constructor
    AppFrame() {
        this.setSize(400, 700);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);

        
    }    
}
