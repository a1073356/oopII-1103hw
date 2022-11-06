import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class Mountain_hw extends JFrame implements ListSelectionListener{
    public static final int Heigh=500;
    public static final int Weight=300;
    private JPanel p1,p2;
    private JTextArea jta;
    private JLabel b1;
    private String city[]={"台北","宜蘭","桃園","台中","南投","彰化"};
    private JList<String> list=new JList(city);

    public static void main(String[] args){
        Mountain_hw gui=new Mountain_hw();
        gui.setVisible(true);
    }

    Mountain_hw(){
        super("各地名山");
        setSize(Heigh,Weight);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,1));

        p1 = new JPanel();
        add(p1);

        b1 = new JLabel("找各地山名：");
        p1.add(b1);

       
        list.addListSelectionListener(this);
        p1.add(new JScrollPane(list));
        list.setVisibleRowCount(4);

        JScrollPane jsp1=new JScrollPane(list,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jsp1.setBounds(7,7,3,3);
        p1.add(jsp1);


        p2 = new JPanel();
        add(p2);

        String st = "可選取地名..."+"\n";

        jta=new JTextArea(5,15);
        jta.setText(st);
        p2.add(new JScrollPane(jta));

        JScrollPane jsp=new JScrollPane(jta,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        p2.add(jsp);
      
    }
    public void valueChanged(ListSelectionEvent e) {
        ArrayList<String> values = new ArrayList<>(list.getSelectedValuesList());
        String cityland[]={"七星山","陶塞峰","雪白山","梨山","本鄉山","八卦山"};
        //int[] indices = lst.getSelectedIndices();
        String show = "";
        for (String s : values) {
            if(s=="台北") {
            show += city[0] + " 名山  " + cityland[0] + "\n";
            }
            if(s=="宜蘭") {
                show += city[1] + " 名山  " + cityland[1] + "\n";
            }
            if(s=="桃園") {
                show += city[2] + " 名山  " + cityland[2] + "\n";
            }
            if(s=="台中") {
                show += city[3] + " 名山  " + cityland[3] + "\n";
            }
            if(s=="南投") {
                show += city[4] + " 名山  " + cityland[4] + "\n";
            }
            if(s=="彰化") {
                show += city[5] + " 名山  " + cityland[5] + "\n";
            }
        }
        jta.setText(show);
      }
}