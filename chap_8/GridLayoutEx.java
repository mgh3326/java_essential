import java.awt.*;  import javax.swing.*;
public class GridLayoutEx extends JFrame {
    GridLayoutEx() {
        setTitle("GridLayout Question_4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane = getContentPane(); // ����Ʈ�� �˾Ƴ���
// 1x10�� GridLayout ��ġ������
        contentPane.setLayout(new GridLayout(1, 10));
        Color[] color={Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,
        Color.CYAN,Color.BLUE,Color.MAGENTA,Color.GRAY,
        Color.PINK,Color.LIGHT_GRAY};//���� �迭
        for (int i = 0; i < 10; i++) { // 10���� ��ư ����;
            JButton button =new JButton(Integer.toString(i)) ; // i�� ���ڿ��� ��ȯ
            button.setOpaque(true);//������ ���̰���
            button.setBackground(color[i]);//�� ��ư�� �� ����
            contentPane.add(button); // ����Ʈ�ҿ� ��ư ����
        }
        setSize(500, 200);// ������ ũ�� 500x200 ����
        setVisible(true);//�������� ȭ�鿡 ���
    }
    public static void main(String[] args)
    {
        new GridLayoutEx();
    }
}