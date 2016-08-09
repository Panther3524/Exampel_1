import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainView
{
    private Dimension dimension;

    private JFrame loginFrame;

    private JMenuBar jMenuBar;
    private JMenu jMenu_file;
    private JMenu jMenu_exit;
    private JMenuItem item_save;

    private JPanel jPanel1;
    private JPanel jPanel2;
    private JPanel jPanel3;

    private JLabel lbl_name;
    private JTextField txt_name;

    private JButton btn_save;
    private JButton btn_exit;

    public void initView()
    {
        dimension=Toolkit.getDefaultToolkit().getScreenSize();
        int ws= (int) dimension.getWidth();
        int hs= (int) dimension.getHeight();

        loginFrame=new JFrame("Login Form");
        loginFrame.setBounds(0,0,ws,hs);
        loginFrame.setLayout(null);
        loginFrame.setResizable(true);
        loginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jMenuBar=new JMenuBar();
        jMenuBar.setBounds(0,0,ws,20);
        jMenuBar.setBackground(Color.BLUE);

        jMenu_file=new JMenu("File");
        jMenu_exit=new JMenu("Exit");

        item_save= new JMenuItem("Save");
        item_save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name=txt_name.getText();
                System.out.println("Your Name Is : "+name);
            }
        });

        jPanel1=new JPanel();
        jPanel1.setLayout(null);
        jPanel1.setBounds(0,20,ws/2,hs);
        jPanel1.setBackground(Color.PINK);

        jPanel2=new JPanel();
        jPanel2.setLayout(null);
        jPanel2.setBounds(ws/2,20,ws/2,hs/2);
        jPanel2.setBackground(Color.RED);

        jPanel3=new JPanel(null);
        jPanel3.setBounds(ws/2,hs/2,ws/2,hs/2);
        jPanel3.setBackground(Color.GREEN);

        lbl_name=new JLabel("Name :",JLabel.CENTER);
        lbl_name.setBounds(10,10,50,30);

        txt_name=new JTextField();
        txt_name.setBounds(70,10,200,30);

        btn_save=new JButton("Save");
        btn_save.setBounds(10,10,100,30);
        btn_save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name=txt_name.getText();
                System.out.println("Your Name Is : "+name);
            }
        });

        btn_exit=new JButton("Exit");
        btn_exit.setBounds((ws/2)/2-50,(hs/2)/2-15,100,30);
        btn_exit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        loginFrame.add(jMenuBar);
        loginFrame.add(jPanel1);
        loginFrame.add(jPanel2);
        loginFrame.add(jPanel3);

        jMenuBar.add(jMenu_file);
        jMenuBar.add(jMenu_exit);
        jMenu_file.add(item_save);

        jPanel1.add(lbl_name);
        jPanel1.add(txt_name);
        jPanel2.add(btn_save);
        jPanel3.add(btn_exit);

        loginFrame.setVisible(true);
        jMenuBar.setVisible(true);
        jMenu_exit.setVisible(true);
        jMenu_file.setVisible(true);
        item_save.setVisible(true);
        jPanel1.setVisible(true);
        jPanel2.setVisible(true);
        jPanel3.setVisible(true);
        lbl_name.setVisible(true);
        txt_name.setVisible(true);
        btn_save.setVisible(true);
        btn_exit.setVisible(true);
    }


    public static void main(String[] args)
    {
        MainView m1=new MainView();
        m1.initView();
    }
}
