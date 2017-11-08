import javax.swing.*;  import java.awt.*;

public class BorderLayoutEx extends JFrame {
    BorderLayoutEx() {
    setTitle("BorderLayout Question_2");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container contentPane = getContentPane(); // ����Ʈ�� �˾Ƴ���
// ����Ʈ�ҿ� BorderLayout ��ġ������ ����
   contentPane.setLayout(new BorderLayout(5, 7));//������Ʈ ������ ���� ������ 5�ȼ�, ���� ������ 7�ȼ��� �����Ͽ����ϴ�.
   contentPane.add(new JButton("Center"), BorderLayout.CENTER);//CENTER ��ġ�� text ������ center�� �ǵ����Ͽ����ϴ�.
   contentPane.add(new JButton("North"), BorderLayout.NORTH);//NORTH ��ġ�� text ������ north�� �ǵ��� �Ͽ����ϴ�.
   contentPane.add(new JButton("South"), BorderLayout.SOUTH);//SOUTH ��ġ�� text ������ south�� �ǵ��� �Ͽ����ϴ�.
   contentPane.add(new JButton("East"), BorderLayout.EAST);//EAST ��ġ�� text ������ east�� �ǵ��� �Ͽ����ϴ�.
   contentPane.add(new JButton("West"), BorderLayout.WEST);//WEST ��ġ�� text ������ west�� �ǵ��� �Ͽ����ϴ�.

    setSize(400, 200); // ������ ũ�� 400x200 ����
    setVisible(true); // �������� ȭ�鿡 ���
}

    public static void main(String[] args){
        new BorderLayoutEx();
    }
}
