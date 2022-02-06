package aaaa;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class FTest extends JFrame{
    private JScrollPane scrollPane;
    private static final long serialVersionUID = 1L;
    private JPanel jContentPane=null;//创建面板对象
    private JTextArea jTextArea=null;//创建文本域对象
    private JPanel controlPanel=null;//创建面板对象
    private JButton openButton=null;//创建按钮对象
    private JButton closeButton=null;//创建按钮对象

    
    /**
     * @return
     */
    private JTextArea getjTextArea() {
        if (jTextArea==null) {
            jTextArea=new JTextArea();
        }
        
        
        return jTextArea;
    }
    

    //获得控制面板对象
    private JPanel getControJPanel() {
        if (controlPanel==null) {
            FlowLayout flowLayout=new FlowLayout();
            flowLayout.setVgap(1);
            controlPanel=new JPanel();
            controlPanel.setLayout(flowLayout);
            controlPanel.add(getCloseButton(),null);
            controlPanel.add(getOpenButton(),null);
            
        }
        
        return controlPanel;
    }
    //设置控制面板对象

    private JButton getOpenButton() {
        if (openButton==null) {
            openButton=new JButton();
            openButton.setText("写入文件");
            openButton.addActionListener(new ActionListener() {
                
                
                public void actionPerformed(ActionEvent e) {
                    File file = new File("word.txt");
                    try{
                        FileWriter writer=new FileWriter(file);
                        //获取文本区域
                        String s=jTextArea.getText();
                        writer.write(s);
                        writer.close();
                        
                        
                        
                    }catch(IOException ee)
                    {
                        
                        ee.printStackTrace();
                    }
                    
                }
            });
            
            
        }
        return openButton;
    }

    private JButton getCloseButton() {
        if (closeButton==null) {
            closeButton=new JButton();
            closeButton.setText("读取文件");
            closeButton.addActionListener(new ActionListener() {
                
                
                public void actionPerformed(ActionEvent e) {
                    File file=new File("word.txt");
                    try {
                        FileReader in=new FileReader(file);
                        char bye[]=new char[1024];
                        int length=in.read(bye);
                        jTextArea.setText(new String(bye, 0, length));
                        in.close();
                        
                    } catch (Exception e2) {
                        e2.printStackTrace();
                    }
                    
                    
                    
                }
            });
            
            
        }
        
        
        return closeButton;
    }
    
    
    public FTest()
    {
        super();
        initialize();
    }
    
    private void initialize() {
        this.setSize(300, 200);
        this.setContentPane(getjContentPanel());
        this.setTitle("JFrame");
        
        
    }

    //内容面本
    private JPanel getjContentPanel() {
        if (jContentPane==null) {
            jContentPane=new JPanel();
            jContentPane.setLayout(new BorderLayout());
            jContentPane.add(getScrollPane(),BorderLayout.CENTER);
            jContentPane.add(getControJPanel(),BorderLayout.SOUTH);
            
            
        }
        return jContentPane;
    }
    
    public static void main(String[] args) {
        FTest f=new FTest();
        f.setLocationRelativeTo(null);//将窗口显示到屏幕最中央
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        
        
        
    }
    protected JScrollPane getScrollPane() {
        if (scrollPane==null) {
            scrollPane=new JScrollPane();
            scrollPane.setViewportView(getjTextArea());
        }
        
        
        
        return scrollPane;
    }
    

}