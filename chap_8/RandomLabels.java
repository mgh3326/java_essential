import java.awt.*;  import javax.swing.*;
public class RandomLabels extends JFrame {
    RandomLabels(){
        setTitle("Random Labels");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane(); // ����Ʈ�� �˾Ƴ���
        contentPane.setLayout(null);
        for(int i=0;i<20;i++){
            JLabel label = new JLabel();//���̺� ������Ʈ ����
            int x = (int)(Math.random()*200) + 50;//50~200�� ���� x
            int y = (int)(Math.random()*200) + 50;//50~200�� ���� y
            label.setLocation(x,y);//label�� (x,y)�� ��ġ
            label.setSize(10,10);//label ũ�⸦ 10x10���� ����
            label.setOpaque(true);//label�� ������ ���̰���
            label.setBackground(Color.BLUE);//�� �Ķ�
            contentPane.add(label);//�����̳ʿ� ���� ����
        };
        setSize(300,300);// ������ ũ�� 500x200 ����
        setVisible(true);//�������� ȭ�鿡 ���
    }
    public static void main(String[] args){
        new RandomLabels();
    }
}