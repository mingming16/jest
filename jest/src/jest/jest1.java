package jest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class jest1 extends JFrame{ 
	
	HashMap<String, Integer> map = new HashMap<String, Integer>();
	HashMap<String, String> link = new HashMap<String, String>();
	public JPanel Quiz = new JPanel();
	public String major = "";
	static JButton [] btn = new RoundButton[3];
	static Vector<String> str = new Vector<String>();
	int cur = 0;
	public jest1() {
		setTitle("jest");
		setSize(550,520);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		setLocationRelativeTo(null);
		
		Quiz.setLayout(new FlowLayout());
		Quiz.setBackground(new Color(72, 106, 174));
		
		JLabel textLabel = new JLabel("���ִ��б� �а� �׽�Ʈ");
		ImageIcon logo = new ImageIcon("images/�ΰ�����.png");
		Image image = logo.getImage();
		Image logo2= image.getScaledInstance(80, 71, Image.SCALE_SMOOTH );
		logo = new ImageIcon(logo2);
		

		try{
	         //���� ��ü ����
	         File file = new File("./DB/�а�.txt");
	         //�Է� ��Ʈ�� ����
	         FileReader filereader = new FileReader(file);
	         //�Է� ���� ����
	         BufferedReader bufReader = new BufferedReader(filereader);
	         String line = "";
	         while((line = bufReader.readLine()) != null){
	        	 map.put(line,0);
	         }
	         //.readLine()�� ���� ���๮�ڸ� ���� �ʴ´�.            
	         bufReader.close();
	     }catch (FileNotFoundException e) {
	         // TODO: handle exception
	     }catch(IOException e){
	         System.out.println(e);
	     }
		
		
		//Dimension d = getSize();
		//g.drawImage(logo.getImage(), 50, 50, d.width, d.height, null);
		
		JLabel imageLabel = new JLabel(logo);
		textLabel.setFont(new Font("�������", Font.BOLD, 40));
		textLabel.setForeground(new Color(255,255,255));
		Quiz.add(imageLabel);
		Quiz.add(textLabel);
		
		btn[0] = new RoundButton("");
		btn[1] = new RoundButton("");
		btn[2] = new RoundButton("");

		
		btn[1].addMouseListener(new MyMouseAdapter());
		btn[2].addMouseListener(new MyMouseAdapter());
		
		btn[0].setBorderPainted(false);
		btn[0].setPreferredSize(new Dimension(400, 50));
		btn[0].setFocusable(false);
		btn[0].setBackground(new Color(106,132,183));
		btn[0].setForeground(new Color(255,255,255));
		btn[0].setFont(new Font("�������", Font.ITALIC|Font.BOLD, 30));
		Quiz.add(btn[0]);
		
			
		
		for(int i = 1; i < 3; i++) {
			//btn[i].setBorder(new LineBorder(new Color(196,222,255), 100, true));
			
			btn[i].setFocusPainted(false);
			btn[i].setBorderPainted(false);
			btn[i].setPreferredSize(new Dimension(400, 150));
			btn[i].setBackground(new Color(196,222,255));
			btn[i].setForeground(new Color(255,255,255));
			btn[i].setFont(new Font("�������", Font.BOLD, 30));
			btn[i].requestFocus();
			Quiz.add(btn[i]);
			
		}
		
		setContentPane(Quiz);
		setVisible(true);
	}
	
	private JButton RoundButton(Object str) {
		// TODO Auto-generated method stub
		return null;
	}

	private Object str(int i) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	class MyMouseAdapter extends MouseAdapter{
//
//		int[] departments = new int[75];
//		int[][] weight = new int[41][75]
//		
//		for(int q=0 ; q<41 ; q++) {
//			for(int d=0 ; d<75 ; d++) {
//				if(weight[q][i] = 1) {
//					departments++;
//				}
//			}
//		}
//		
		
		@Override
		public void mousePressed(MouseEvent e) {
			JButton Tempbtn = (JButton)e.getSource();
			Tempbtn.setBackground(new Color(255,255,255));
			
  			
  			
  			switch(cur) {
  			
  			case 0: // 1�� ����
  				if(Tempbtn == btn[1]) {
  					map.put("ü��������",map.get("ü��������")+1);
  					map.put("ü���а�",map.get("ü���а�")+1);
  				}
  				break;
 
  			case 1: // 2�� ����
  				if(Tempbtn == btn[1]) {
  					map.put("������а�",map.get("������а�")+1);
  					map.put("������а�",map.get("������а�")+1);
  					map.put("�Ͼ��Ϲ��а�",map.get("�Ͼ��Ϲ��а�")+1);
  					map.put("�߾��߹��а�",map.get("�߾��߹��а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("���а�",map.get("���а�")+1);
  					map.put("��ȸ�а�",map.get("��ȸ�а�")+1);
  					map.put("ö�а�",map.get("ö�а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("��ġ�ܱ��а�",map.get("��ġ�ܱ��а�")+1);
  					map.put("���ȫ���а�",map.get("���ȫ���а�")+1);
  					map.put("�濵�а�",map.get("�濵�а�")+1);
  					map.put("�����濵�а�",map.get("�����濵�а�")+1);
  					map.put("ȸ���а�",map.get("ȸ���а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("���������а�",map.get("���������а�")+1);
  					map.put("�濵�����а�",map.get("�濵�����а�")+1);
  					map.put("�������",map.get("�������")+1);
  					map.put("�������",map.get("�������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("�Ϲݻ�ȸ������",map.get("�Ϲݻ�ȸ������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("�Ƶ���Ȱ��������",map.get("�Ƶ���Ȱ��������")+1);
  					map.put("�ְŰ�����������",map.get("�ְŰ�����������")+1);
  					map.put("�м��Ƿ��а�",map.get("�м��Ƿ��а�")+1);
  					map.put("ü���а�",map.get("ü���а�")+1);
  					map.put("�ʵ����",map.get("�ʵ����")+1);
  					map.put("�����к�",map.get("�����к�")+1);
  					map.put("�̼��к�",map.get("�̼��к�")+1);
  					map.put("��Ƽ�̵�����������",map.get("��Ƽ�̵�����������")+1);
  					map.put("��ȭ��������������",map.get("��ȭ��������������")+1);
  					map.put("�ǰ���Ƽ�����а�",map.get("�ǰ���Ƽ�����а�")+1);
  					map.put("�ǹ��ɾ���а�",map.get("�ǹ��ɾ���а�")+1);
  					map.put("�����������а�",map.get("�����������а�")+1);
  					map.put("�ε�������а�",map.get("�ε�������а�")+1);
  				}
  				if(Tempbtn == btn[2]) {
  					map.put("���б�����",map.get("���б�����")+1);
  					map.put("��ǻ�ͱ�����",map.get("��ǻ�ͱ�����")+1);
  					map.put("������������",map.get("������������")+1);
  					map.put("������������",map.get("������������")+1);
  					map.put("ü��������",map.get("ü��������")+1);
  					map.put("�Ĺ��ڿ�ȯ������",map.get("�Ĺ��ڿ�ȯ������")+1);
  					map.put("����ȯ������",map.get("����ȯ������")+1);
  					map.put("���̿���������",map.get("���̿���������")+1);
  					map.put("���ڻ����������",map.get("���ڻ����������")+1);
  					map.put("���������������",map.get("���������������")+1);
  					map.put("�����������а�",map.get("�����������а�")+1);
  					map.put("�ؾ������а�",map.get("�ؾ������а�")+1);
  					map.put("����������а�",map.get("����������а�")+1);
  					map.put("�ؾ��������а�",map.get("�ؾ��������а�")+1);
  					map.put("�����ؾ���а�",map.get("�����ؾ���а�")+1);
  					map.put("ȯ����а�",map.get("ȯ����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�ؾ�ý��۰��а�",map.get("�ؾ�ý��۰��а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("ȭ���ڽ���ƽ���а�",map.get("ȭ���ڽ���ƽ���а�")+1);
  					map.put("��ǰ�����а�",map.get("��ǰ�����а�")+1);
  					map.put("���а�",map.get("���а�")+1);
  					map.put("��������а�",map.get("��������а�")+1);
  					map.put("��ǰ������а�",map.get("��ǰ������а�")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("��īƮ�δн���������",map.get("��īƮ�δн���������")+1);
  					map.put("����������Ű�������",map.get("����������Ű�������")+1);
  					map.put("��������������",map.get("��������������")+1);
  					map.put("��ǻ�Ͱ�������",map.get("��ǻ�Ͱ�������")+1);
  					map.put("���ڰ�������",map.get("���ڰ�������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����ȭ������",map.get("����ȭ������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("�ǿ���",map.get("�ǿ���")+1);
  					map.put("���ǿ���",map.get("���ǿ���")+1);
  					map.put("��ȣ�а�",map.get("��ȣ�а�")+1);
  					map.put("���а�",map.get("���а�")+1);
  				}
  			break;
  			case 2:
  				if(Tempbtn == btn[1]) {
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("��������а�",map.get("��������а�")+1);
  					map.put("�����к�",map.get("�����к�")+1);
  					map.put("�̼��к�",map.get("�̼��к�")+1);
  					map.put("��Ƽ�̵�����������",map.get("��Ƽ�̵�����������")+1);
  					map.put("��ȭ��������������",map.get("��ȭ��������������")+1);
  				}
  				if(Tempbtn == btn[2]) {
  					
  					map.put("�������",map.get("�������")+1);
  					map.put("�������",map.get("�������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("�Ϲݻ�ȸ������",map.get("�Ϲݻ�ȸ������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("���б�����",map.get("���б�����")+1);
  					map.put("��ǻ�ͱ�����",map.get("��ǻ�ͱ�����")+1);
  					map.put("�м��Ƿ��а�",map.get("�м��Ƿ��а�")+1);
  					map.put("�ǿ���",map.get("�ǿ���")+1);
  					map.put("�ʵ����",map.get("�ʵ����")+1);
  					map.put("���ǿ���",map.get("���ǿ���")+1);
  					map.put("��ȣ�а�",map.get("��ȣ�а�")+1);
  				}
  				break;

  			case 3:
  				if(Tempbtn == btn[1]) {
  					map.put("������а�",map.get("������а�")+1);
  					map.put("������а�",map.get("������а�")+1);
  					map.put("�Ͼ��Ϲ��а�",map.get("�Ͼ��Ϲ��а�")+1);
  					map.put("�߾��߹��а�",map.get("�߾��߹��а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("���а�",map.get("���а�")+1);
  					map.put("��ȸ�а�",map.get("��ȸ�а�")+1);
  					map.put("ö�а�",map.get("ö�а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("��ġ�ܱ��а�",map.get("��ġ�ܱ��а�")+1);
  					map.put("���ȫ���а�",map.get("���ȫ���а�")+1);
  					map.put("�濵�а�",map.get("�濵�а�")+1);
  					map.put("�����濵�а�",map.get("�����濵�а�")+1);
  					map.put("ȸ���а�",map.get("ȸ���а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("���������а�",map.get("���������а�")+1);
  					map.put("�濵�����а�",map.get("�濵�����а�")+1);
  					map.put("�������",map.get("�������")+1);
  					map.put("�������",map.get("�������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("�Ϲݻ�ȸ������",map.get("�Ϲݻ�ȸ������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("ü��������",map.get("ü��������")+1);
  					map.put("�Ƶ���Ȱ��������",map.get("�Ƶ���Ȱ��������")+1);
  					map.put("�ְŰ�����������",map.get("�ְŰ�����������")+1);
  					map.put("�м��Ƿ��а�",map.get("�м��Ƿ��а�")+1);
  					map.put("ü���а�",map.get("ü���а�")+1);
  					map.put("�ʵ����",map.get("�ʵ����")+1);
  					map.put("�����к�",map.get("�����к�")+1);
  					map.put("�̼��к�",map.get("�̼��к�")+1);
  					map.put("��Ƽ�̵�����������",map.get("��Ƽ�̵�����������")+1);
  					map.put("��ȭ��������������",map.get("��ȭ��������������")+1);
  					map.put("�ǰ���Ƽ�����а�",map.get("�ǰ���Ƽ�����а�")+1);
  					map.put("�ǹ��ɾ���а�",map.get("�ǹ��ɾ���а�")+1);
  					map.put("�����������а�",map.get("�����������а�")+1);
  					map.put("�ε�������а�",map.get("�ε�������а�")+1);
  				}
  				if(Tempbtn == btn[2]) {
  					map.put("���б�����",map.get("���б�����")+1);
  					map.put("��ǻ�ͱ�����",map.get("��ǻ�ͱ�����")+1);
  					map.put("������������",map.get("������������")+1);
  					map.put("������������",map.get("������������")+1);
  					map.put("�Ĺ��ڿ�ȯ������",map.get("�Ĺ��ڿ�ȯ������")+1);
  					map.put("����ȯ������",map.get("����ȯ������")+1);
  					map.put("���̿���������",map.get("���̿���������")+1);
  					map.put("���ڻ����������",map.get("���ڻ����������")+1);
  					map.put("���������������",map.get("���������������")+1);
  					map.put("�����������а�",map.get("�����������а�")+1);
  					map.put("�ؾ������а�",map.get("�ؾ������а�")+1);
  					map.put("����������а�",map.get("����������а�")+1);
  					map.put("�ؾ��������а�",map.get("�ؾ��������а�")+1);
  					map.put("�����ؾ���а�",map.get("�����ؾ���а�")+1);
  					map.put("ȯ����а�",map.get("ȯ����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�ؾ�ý��۰��а�",map.get("�ؾ�ý��۰��а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("ȭ���ڽ���ƽ���а�",map.get("ȭ���ڽ���ƽ���а�")+1);
  					map.put("��ǰ�����а�",map.get("��ǰ�����а�")+1);
  					map.put("���а�",map.get("���а�")+1);
  					map.put("��������а�",map.get("��������а�")+1);
  					map.put("��ǰ������а�",map.get("��ǰ������а�")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("��īƮ�δн���������",map.get("��īƮ�δн���������")+1);
  					map.put("����������Ű�������",map.get("����������Ű�������")+1);
  					map.put("��������������",map.get("��������������")+1);
  					map.put("��ǻ�Ͱ�������",map.get("��ǻ�Ͱ�������")+1);
  					map.put("���ڰ�������",map.get("���ڰ�������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����ȭ������",map.get("����ȭ������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("�ǿ���",map.get("�ǿ���")+1);
  					map.put("���ǿ���",map.get("���ǿ���")+1);
  					map.put("��ȣ�а�",map.get("��ȣ�а�")+1);
  					map.put("���а�",map.get("���а�")+1);
  				}
  				break;
  			case 4:
  				if(Tempbtn == btn[1]) {
  					map.put("������а�",map.get("������а�")+1);
  					map.put("������а�",map.get("������а�")+1);
  					map.put("�Ͼ��Ϲ��а�",map.get("�Ͼ��Ϲ��а�")+1);
  					map.put("�߾��߹��а�",map.get("�߾��߹��а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("���а�",map.get("���а�")+1);
  					map.put("��ȸ�а�",map.get("��ȸ�а�")+1);
  					map.put("ö�а�",map.get("ö�а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("��ġ�ܱ��а�",map.get("��ġ�ܱ��а�")+1);
  					map.put("���ȫ���а�",map.get("���ȫ���а�")+1);
  					map.put("�濵�а�",map.get("�濵�а�")+1);
  					map.put("�����濵�а�",map.get("�����濵�а�")+1);
  					map.put("ȸ���а�",map.get("ȸ���а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("���������а�",map.get("���������а�")+1);
  					map.put("�濵�����а�",map.get("�濵�����а�")+1);
  					map.put("�������",map.get("�������")+1);
  					map.put("�������",map.get("�������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("�Ϲݻ�ȸ������",map.get("�Ϲݻ�ȸ������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("ü��������",map.get("ü��������")+1);
  					map.put("�Ƶ���Ȱ��������",map.get("�Ƶ���Ȱ��������")+1);
  					map.put("�ְŰ�����������",map.get("�ְŰ�����������")+1);
  					map.put("�м��Ƿ��а�",map.get("�м��Ƿ��а�")+1);
  					map.put("ü���а�",map.get("ü���а�")+1);
  					map.put("�ʵ����",map.get("�ʵ����")+1);
  					map.put("�����к�",map.get("�����к�")+1);
  					map.put("�̼��к�",map.get("�̼��к�")+1);
  					map.put("��Ƽ�̵�����������",map.get("��Ƽ�̵�����������")+1);
  					map.put("��ȭ��������������",map.get("��ȭ��������������")+1);
  					map.put("�ǰ���Ƽ�����а�",map.get("�ǰ���Ƽ�����а�")+1);
  					map.put("�ǹ��ɾ���а�",map.get("�ǹ��ɾ���а�")+1);
  					map.put("�����������а�",map.get("�����������а�")+1);
  					map.put("�ε�������а�",map.get("�ε�������а�")+1);
  				}
  				if(Tempbtn == btn[2]) {
  					map.put("���б�����",map.get("���б�����")+1);
  					map.put("��ǻ�ͱ�����",map.get("��ǻ�ͱ�����")+1);
  					map.put("������������",map.get("������������")+1);
  					map.put("������������",map.get("������������")+1);
  					map.put("�Ĺ��ڿ�ȯ������",map.get("�Ĺ��ڿ�ȯ������")+1);
  					map.put("����ȯ������",map.get("����ȯ������")+1);
  					map.put("���̿���������",map.get("���̿���������")+1);
  					map.put("���ڻ����������",map.get("���ڻ����������")+1);
  					map.put("���������������",map.get("���������������")+1);
  					map.put("�����������а�",map.get("�����������а�")+1);
  					map.put("�ؾ������а�",map.get("�ؾ������а�")+1);
  					map.put("����������а�",map.get("����������а�")+1);
  					map.put("�ؾ��������а�",map.get("�ؾ��������а�")+1);
  					map.put("�����ؾ���а�",map.get("�����ؾ���а�")+1);
  					map.put("ȯ����а�",map.get("ȯ����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�ؾ�ý��۰��а�",map.get("�ؾ�ý��۰��а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("ȭ���ڽ���ƽ���а�",map.get("ȭ���ڽ���ƽ���а�")+1);
  					map.put("��ǰ�����а�",map.get("��ǰ�����а�")+1);
  					map.put("���а�",map.get("���а�")+1);
  					map.put("��������а�",map.get("��������а�")+1);
  					map.put("��ǰ������а�",map.get("��ǰ������а�")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("��īƮ�δн���������",map.get("��īƮ�δн���������")+1);
  					map.put("����������Ű�������",map.get("����������Ű�������")+1);
  					map.put("��������������",map.get("��������������")+1);
  					map.put("��ǻ�Ͱ�������",map.get("��ǻ�Ͱ�������")+1);
  					map.put("���ڰ�������",map.get("���ڰ�������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����ȭ������",map.get("����ȭ������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("�ǿ���",map.get("�ǿ���")+1);
  					map.put("���ǿ���",map.get("���ǿ���")+1);
  					map.put("��ȣ�а�",map.get("��ȣ�а�")+1);
  					map.put("���а�",map.get("���а�")+1);
  				}
  				break;
  			case 5:
  				if(Tempbtn == btn[1]) {
  					map.put("����ȯ������",map.get("����ȯ������")+1);
  					map.put("���̿���������",map.get("���̿���������")+1);
  					map.put("���ڻ����������",map.get("���ڻ����������")+1);
  					map.put("���������������",map.get("���������������")+1);
  					map.put("�����������а�",map.get("�����������а�")+1);
  					map.put("�ؾ������а�",map.get("�ؾ������а�")+1);
  					map.put("����������а�",map.get("����������а�")+1);
  					map.put("�ؾ��������а�",map.get("�ؾ��������а�")+1);
  					map.put("�����ؾ���а�",map.get("�����ؾ���а�")+1);
  					map.put("ȯ����а�",map.get("ȯ����а�")+1);
  				}
  				if(Tempbtn == btn[2]) {
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("��īƮ�δн���������",map.get("��īƮ�δн���������")+1);
  					map.put("����������Ű�������",map.get("����������Ű�������")+1);
  					map.put("��������������",map.get("��������������")+1);
  					map.put("��ǻ�Ͱ�������",map.get("��ǻ�Ͱ�������")+1);
  					map.put("���ڰ�������",map.get("���ڰ�������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����ȭ������",map.get("����ȭ������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����������",map.get("����������")+1);
  				}
  				break;
  			case 6:
  				if(Tempbtn == btn[1]) {
  					map.put("������������",map.get("������������")+1);
  					map.put("���������������",map.get("���������������")+1);
  					map.put("���ǿ���",map.get("���ǿ���")+1);
  				}
  				break;
  			case 7:
  				if(Tempbtn == btn[1]) {
  					map.put("�ǿ���",map.get("�ǿ���")+1);
  					map.put("���ǿ���",map.get("���ǿ���")+1);
  				}
  				break;
  			case 8:
  				if(Tempbtn == btn[1]) {
  					map.put("������а�",map.get("������а�")+1);
  					map.put("������а�",map.get("������а�")+1);
  					map.put("�Ͼ��Ϲ��а�",map.get("�Ͼ��Ϲ��а�")+1);
  					map.put("�߾��߹��а�",map.get("�߾��߹��а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("���а�",map.get("���а�")+1);
  					map.put("��ȸ�а�",map.get("��ȸ�а�")+1);
  					map.put("ö�а�",map.get("ö�а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("��ġ�ܱ��а�",map.get("��ġ�ܱ��а�")+1);
  					map.put("���ȫ���а�",map.get("���ȫ���а�")+1);
  					map.put("�濵�а�",map.get("�濵�а�")+1);
  					map.put("�����濵�а�",map.get("�����濵�а�")+1);
  					map.put("ȸ���а�",map.get("ȸ���а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("���������а�",map.get("���������а�")+1);
  					map.put("�濵�����а�",map.get("�濵�����а�")+1);
  					map.put("�������",map.get("�������")+1);
  					map.put("�������",map.get("�������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("�Ϲݻ�ȸ������",map.get("�Ϲݻ�ȸ������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("ü��������",map.get("ü��������")+1);
  					map.put("�Ƶ���Ȱ��������",map.get("�Ƶ���Ȱ��������")+1);
  					map.put("�ְŰ�����������",map.get("�ְŰ�����������")+1);
  					map.put("�м��Ƿ��а�",map.get("�м��Ƿ��а�")+1);
  					map.put("ü���а�",map.get("ü���а�")+1);
  					map.put("�ʵ����",map.get("�ʵ����")+1);
  					map.put("�����к�",map.get("�����к�")+1);
  					map.put("�̼��к�",map.get("�̼��к�")+1);
  					map.put("��Ƽ�̵�����������",map.get("��Ƽ�̵�����������")+1);
  					map.put("��ȭ��������������",map.get("��ȭ��������������")+1);
  					map.put("�ǰ���Ƽ�����а�",map.get("�ǰ���Ƽ�����а�")+1);
  					map.put("�ǹ��ɾ���а�",map.get("�ǹ��ɾ���а�")+1);
  					map.put("�����������а�",map.get("�����������а�")+1);
  					map.put("�ε�������а�",map.get("�ε�������а�")+1);

  				}
  				if(Tempbtn == btn[2]) {
  					map.put("���б�����",map.get("���б�����")+1);
  					map.put("��ǻ�ͱ�����",map.get("��ǻ�ͱ�����")+1);
  					map.put("������������",map.get("������������")+1);
  					map.put("������������",map.get("������������")+1);
  					map.put("�Ĺ��ڿ�ȯ������",map.get("�Ĺ��ڿ�ȯ������")+1);
  					map.put("����ȯ������",map.get("����ȯ������")+1);
  					map.put("���̿���������",map.get("���̿���������")+1);
  					map.put("���ڻ����������",map.get("���ڻ����������")+1);
  					map.put("���������������",map.get("���������������")+1);
  					map.put("�����������а�",map.get("�����������а�")+1);
  					map.put("�ؾ������а�",map.get("�ؾ������а�")+1);
  					map.put("����������а�",map.get("����������а�")+1);
  					map.put("�ؾ��������а�",map.get("�ؾ��������а�")+1);
  					map.put("�����ؾ���а�",map.get("�����ؾ���а�")+1);
  					map.put("ȯ����а�",map.get("ȯ����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�ؾ�ý��۰��а�",map.get("�ؾ�ý��۰��а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("ȭ���ڽ���ƽ���а�",map.get("ȭ���ڽ���ƽ���а�")+1);
  					map.put("��ǰ�����а�",map.get("��ǰ�����а�")+1);
  					map.put("���а�",map.get("���а�")+1);
  					map.put("��������а�",map.get("��������а�")+1);
  					map.put("��ǰ������а�",map.get("��ǰ������а�")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("��īƮ�δн���������",map.get("��īƮ�δн���������")+1);
  					map.put("����������Ű�������",map.get("����������Ű�������")+1);
  					map.put("��������������",map.get("��������������")+1);
  					map.put("��ǻ�Ͱ�������",map.get("��ǻ�Ͱ�������")+1);
  					map.put("���ڰ�������",map.get("���ڰ�������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����ȭ������",map.get("����ȭ������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("�ǿ���",map.get("�ǿ���")+1);
  					map.put("���ǿ���",map.get("���ǿ���")+1);
  					map.put("��ȣ�а�",map.get("��ȣ�а�")+1);
  					map.put("���а�",map.get("���а�")+1);
  				}
  				break;
  			case 9:
  				if(Tempbtn == btn[1]) {
  					map.put("�ؾ������а�",map.get("�ؾ������а�")+1);
  					map.put("����������а�",map.get("����������а�")+1);
  					map.put("�ؾ��������а�",map.get("�ؾ��������а�")+1);
  					map.put("�����ؾ���а�",map.get("�����ؾ���а�")+1);
  					map.put("ȯ����а�",map.get("ȯ����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�ؾ�ý��۰��а�",map.get("�ؾ�ý��۰��а�")+1);
  				}
  				if(Tempbtn == btn[2]) {
  					map.put("�м��Ƿ��а�",map.get("�м��Ƿ��а�")+1);
  					map.put("�����к�",map.get("�����к�")+1);
  					map.put("�̼��к�",map.get("�̼��к�")+1);
  					map.put("��Ƽ�̵�����������",map.get("��Ƽ�̵�����������")+1);
  					map.put("��ȭ��������������",map.get("��ȭ��������������")+1);
  				}
  				break;
  			case 10:
  				if(Tempbtn == btn[1]) {
  					map.put("������а�",map.get("������а�")+1);
  					map.put("������а�",map.get("������а�")+1);
  					map.put("�Ͼ��Ϲ��а�",map.get("�Ͼ��Ϲ��а�")+1);
  					map.put("�߾��߹��а�",map.get("�߾��߹��а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�������",map.get("�������")+1);
  					map.put("�������",map.get("�������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("�Ϲݻ�ȸ������",map.get("�Ϲݻ�ȸ������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("���б�����",map.get("���б�����")+1);
  					map.put("��ǻ�ͱ�����",map.get("��ǻ�ͱ�����")+1);
  					map.put("������������",map.get("������������")+1);
  					map.put("������������",map.get("������������")+1);
  					map.put("ü��������",map.get("ü��������")+1);
  				}
  				break;
  			case 11:
  				if(Tempbtn == btn[2]) {
  					map.put("������а�",map.get("������а�")+1);
  					map.put("�������",map.get("�������")+1);
  					map.put("���б�����",map.get("���б�����")+1);
  					map.put("��ǻ�ͱ�����",map.get("��ǻ�ͱ�����")+1);
  					map.put("������������",map.get("������������")+1);
  					map.put("������������",map.get("������������")+1);
  					map.put("�Ĺ��ڿ�ȯ������",map.get("�Ĺ��ڿ�ȯ������")+1);
  					map.put("����ȯ������",map.get("����ȯ������")+1);
  					map.put("���̿���������",map.get("���̿���������")+1);
  					map.put("���ڻ����������",map.get("���ڻ����������")+1);
  					map.put("���������������",map.get("���������������")+1);
  					map.put("�����������а�",map.get("�����������а�")+1);
  					map.put("�ؾ������а�",map.get("�ؾ������а�")+1);
  					map.put("����������а�",map.get("����������а�")+1);
  					map.put("�ؾ��������а�",map.get("�ؾ��������а�")+1);
  					map.put("�����ؾ���а�",map.get("�����ؾ���а�")+1);
  					map.put("ȯ����а�",map.get("ȯ����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�ؾ�ý��۰��а�",map.get("�ؾ�ý��۰��а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("ȭ���ڽ���ƽ���а�",map.get("ȭ���ڽ���ƽ���а�")+1);
  					map.put("��ǰ�����а�",map.get("��ǰ�����а�")+1);
  					map.put("���а�",map.get("���а�")+1);
  					map.put("��������а�",map.get("��������а�")+1);
  					map.put("��ǰ������а�",map.get("��ǰ������а�")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("��īƮ�δн���������",map.get("��īƮ�δн���������")+1);
  					map.put("����������Ű�������",map.get("����������Ű�������")+1);
  					map.put("��������������",map.get("��������������")+1);
  					map.put("��ǻ�Ͱ�������",map.get("��ǻ�Ͱ�������")+1);
  					map.put("���ڰ�������",map.get("���ڰ�������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����ȭ������",map.get("����ȭ������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("�ǿ���",map.get("�ǿ���")+1);
  					map.put("���ǿ���",map.get("���ǿ���")+1);
  					map.put("��ȣ�а�",map.get("��ȣ�а�")+1);
  					map.put("���а�",map.get("���а�")+1);

  				}
  				break;
  			case 12:
  				if(Tempbtn == btn[1]) {
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����������",map.get("����������")+1);
  				}
 				if(Tempbtn == btn[2]) {
 					map.put("�濵�а�",map.get("�濵�а�")+1);
 					map.put("�����濵�а�",map.get("�����濵�а�")+1);
 					map.put("�����а�",map.get("�����а�")+1);
 					map.put("�ε�������а�",map.get("�ε�������а�")+1);
 				}
 				break;
  			case 13:
  				if(Tempbtn == btn[1]) {
  					map.put("�̼��к�",map.get("�̼��к�")+1);
  					map.put("��Ƽ�̵�����������",map.get("��Ƽ�̵�����������")+1);
  					map.put("��ȭ��������������",map.get("��ȭ��������������")+1);
  				}
  				if(Tempbtn == btn[2]) {
  					map.put("������а�",map.get("������а�")+1);
  					map.put("�������",map.get("�������")+1);

  				}
  				break;
  			case 14:
  				if(Tempbtn == btn[1]) {
  					map.put("��ȸ�а�",map.get("��ȸ�а�")+1);
  					map.put("ö�а�",map.get("ö�а�")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("�Ϲݻ�ȸ������",map.get("�Ϲݻ�ȸ������")+1);
  				}
  				if(Tempbtn == btn[2]) {
  					map.put("���б�����",map.get("���б�����")+1);
  					map.put("���а�",map.get("���а�")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("��īƮ�δн���������",map.get("��īƮ�δн���������")+1);
  					map.put("����������Ű�������",map.get("����������Ű�������")+1);
  					map.put("��������������",map.get("��������������")+1);
  					map.put("��ǻ�Ͱ�������",map.get("��ǻ�Ͱ�������")+1);
  					map.put("���ڰ�������",map.get("���ڰ�������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����ȭ������",map.get("����ȭ������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����������",map.get("����������")+1);
  				}
  				break;
  			case 15:
  				if(Tempbtn == btn[1]) {
  					map.put("�濵�����а�",map.get("�濵�����а�")+1);
  					map.put("���б�����",map.get("���б�����")+1);
  					map.put("��������а�",map.get("��������а�")+1);
  					map.put("��ǻ�Ͱ�������",map.get("��ǻ�Ͱ�������")+1);
  				}
  				break;
  			case 16:
  				if(Tempbtn == btn[1]) {
  					map.put("�̼��к�",map.get("�̼��к�")+1);
  					map.put("��Ƽ�̵�����������",map.get("��Ƽ�̵�����������")+1);
  					map.put("��ȭ��������������",map.get("��ȭ��������������")+1);
  				}
  				if(Tempbtn == btn[2]) {
  					map.put("�����к�",map.get("�����к�")+1);
  				}
  				break;
  			case 17:
  				if(Tempbtn == btn[1]) {
  					map.put("�ǿ���",map.get("�ǿ���")+1);
  					map.put("���ǿ���",map.get("���ǿ���")+1);
  					map.put("��ȣ�а�",map.get("��ȣ�а�")+1);
  					map.put("�ǰ���Ƽ�����а�",map.get("�ǰ���Ƽ�����а�")+1);
  					map.put("�ǹ��ɾ���а�",map.get("�ǹ��ɾ���а�")+1);
  					map.put("���а�",map.get("���а�")+1);
  				}
  				break;
  			case 18:
  				if(Tempbtn == btn[2]) {
  					map.put("����������",map.get("����������")+1);
  					map.put("��īƮ�δн���������",map.get("��īƮ�δн���������")+1);
  					map.put("����������Ű�������",map.get("����������Ű�������")+1);
  					map.put("��������������",map.get("��������������")+1);
  					map.put("��ǻ�Ͱ�������",map.get("��ǻ�Ͱ�������")+1);
  					map.put("���ڰ�������",map.get("���ڰ�������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����ȭ������",map.get("����ȭ������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����������",map.get("����������")+1);
  				}
  				break;
  			case 19:
  				if(Tempbtn == btn[2]) {
  					map.put("ü��������",map.get("ü��������")+1);
  					map.put("���ڻ����������",map.get("���ڻ����������")+1);
  					map.put("���������������",map.get("���������������")+1);
  					map.put("ü���а�",map.get("ü���а�")+1);
  					map.put("�ǿ���",map.get("�ǿ���")+1);
  					map.put("���ǿ���",map.get("���ǿ���")+1);
  					map.put("��ȣ�а�",map.get("��ȣ�а�")+1);
  				}
  				break;
  			case 20:
  				if(Tempbtn == btn[1]) {
  					map.put("���̿���������",map.get("���̿���������")+1);
  					map.put("ȭ���ڽ���ƽ���а�",map.get("ȭ���ڽ���ƽ���а�")+1);
  					map.put("�ǿ���",map.get("�ǿ���")+1);
  					map.put("���ǿ���",map.get("���ǿ���")+1);
  					map.put("���а�",map.get("���а�")+1);
  				}
  				break;
  			case 21:
  				if(Tempbtn == btn[2]) {
  					map.put("�������",map.get("�������")+1);
  					map.put("�������",map.get("�������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("�Ϲݻ�ȸ������",map.get("�Ϲݻ�ȸ������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("���б�����",map.get("���б�����")+1);
  					map.put("��ǻ�ͱ�����",map.get("��ǻ�ͱ�����")+1);
  					map.put("������������",map.get("������������")+1);
  					map.put("������������",map.get("������������")+1);
  					map.put("ü��������",map.get("ü��������")+1);
  				}
  				break;
  			case 22:
  				if(Tempbtn == btn[1]) {
  					map.put("���ڰ�������",map.get("���ڰ�������")+1);
  					map.put("�����������",map.get("�����������")+1);
  				}
  				break;
  			case 23:
  				if(Tempbtn == btn[2]) {
  					map.put("��ȸ�а�",map.get("��ȸ�а�")+1);
  					map.put("ö�а�",map.get("ö�а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("��ġ�ܱ��а�",map.get("��ġ�ܱ��а�")+1);
  					map.put("���ȫ���а�",map.get("���ȫ���а�")+1);
  					map.put("�濵�а�",map.get("�濵�а�")+1);
  					map.put("�����濵�а�",map.get("�����濵�а�")+1);
  					map.put("���������а�",map.get("���������а�")+1);
  					map.put("�������",map.get("�������")+1);
  					map.put("�������",map.get("�������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("�Ϲݻ�ȸ������",map.get("�Ϲݻ�ȸ������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("���б�����",map.get("���б�����")+1);
  					map.put("��ǻ�ͱ�����",map.get("��ǻ�ͱ�����")+1);
  					map.put("������������",map.get("������������")+1);
  					map.put("������������",map.get("������������")+1);
  					map.put("ü��������",map.get("ü��������")+1);
  				
  				}
  				break;
  			case 24:
  				if(Tempbtn == btn[1]) {
  					map.put("�ؾ��������а�",map.get("�ؾ��������а�")+1);
  				}
  				break;
  			case 25:
  				if(Tempbtn == btn[1]) {
  					map.put("��ȸ�а�",map.get("��ȸ�а�")+1);
  					map.put("ö�а�",map.get("ö�а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("��ġ�ܱ��а�",map.get("��ġ�ܱ��а�")+1);
  					map.put("���ȫ���а�",map.get("���ȫ���а�")+1);
  					map.put("�濵�а�",map.get("�濵�а�")+1);
  					map.put("�����濵�а�",map.get("�����濵�а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�Ϲݻ�ȸ������",map.get("�Ϲݻ�ȸ������")+1);
  				}
  				break;
  			case 26:
  				if(Tempbtn == btn[1]) {
  					map.put("���̿���������",map.get("���̿���������")+1);
  					map.put("���ڻ����������",map.get("���ڻ����������")+1);
  					map.put("���������������",map.get("���������������")+1);
  					map.put("ȭ���ڽ���ƽ���а�",map.get("ȭ���ڽ���ƽ���а�")+1);
  					map.put("�ǰ���Ƽ�����а�",map.get("�ǰ���Ƽ�����а�")+1);
  				}
  				break;
  			case 27:
  				if(Tempbtn == btn[1]) {
  					map.put("���б�����",map.get("���б�����")+1);
  					map.put("���а�",map.get("���а�")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("��īƮ�δн���������",map.get("��īƮ�δн���������")+1);
  					map.put("����������Ű�������",map.get("����������Ű�������")+1);
  					map.put("��������������",map.get("��������������")+1);
  					map.put("��ǻ�Ͱ�������",map.get("��ǻ�Ͱ�������")+1);
  					map.put("���ڰ�������",map.get("���ڰ�������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����ȭ������",map.get("����ȭ������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����������",map.get("����������")+1);
  				}
  				break;
  			case 28:
  				if(Tempbtn == btn[1]) {
  					map.put("��ȸ�а�",map.get("��ȸ�а�")+1);
  					map.put("�Ϲݻ�ȸ������",map.get("�Ϲݻ�ȸ������")+1);
  					map.put("�ǹ��ɾ���а�",map.get("�ǹ��ɾ���а�")+1);
  				}
  				break;
  			case 29:
  				if(Tempbtn == btn[1]) {
  					map.put("�濵�а�",map.get("�濵�а�")+1);
  					map.put("�����濵�а�",map.get("�����濵�а�")+1);
  				}
  				break;
  			case 30:
  				if(Tempbtn == btn[1]) {
  					map.put("ü��������",map.get("ü��������")+1);
  					map.put("ü���а�",map.get("ü���а�")+1);
  				}
  				break;
  			case 31:
  				if(Tempbtn == btn[1]) {
  					map.put("�����к�",map.get("�����к�")+1);
  					map.put("�̼��к�",map.get("�̼��к�")+1);
  					map.put("��Ƽ�̵�����������",map.get("��Ƽ�̵�����������")+1);
  					map.put("��ȭ��������������",map.get("��ȭ��������������")+1);
  					map.put("�ǰ���Ƽ�����а�",map.get("�ǰ���Ƽ�����а�")+1);
  				}
  				if(Tempbtn == btn[2]) {
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�濵�����а�",map.get("�濵�����а�")+1);
  					map.put("��īƮ�δн���������",map.get("��īƮ�δн���������")+1);
  					map.put("����������Ű�������",map.get("����������Ű�������")+1);
  					map.put("��������������",map.get("��������������")+1);
  					map.put("���ڰ�������",map.get("���ڰ�������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����ȭ������",map.get("����ȭ������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����������",map.get("����������")+1);
  				}
  				break;
  			case 32:
  				if(Tempbtn == btn[1]) {
  					map.put("������а�",map.get("������а�")+1);
  					map.put("������а�",map.get("������а�")+1);
  					map.put("�Ͼ��Ϲ��а�",map.get("�Ͼ��Ϲ��а�")+1);
  					map.put("�߾��߹��а�",map.get("�߾��߹��а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("���а�",map.get("���а�")+1);
  					map.put("��ȸ�а�",map.get("��ȸ�а�")+1);
  					map.put("ö�а�",map.get("ö�а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("��ġ�ܱ��а�",map.get("��ġ�ܱ��а�")+1);
  					map.put("���ȫ���а�",map.get("���ȫ���а�")+1);
  					map.put("�濵�а�",map.get("�濵�а�")+1);
  					map.put("�����濵�а�",map.get("�����濵�а�")+1);
  					map.put("ȸ���а�",map.get("ȸ���а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("���������а�",map.get("���������а�")+1);
  					map.put("�濵�����а�",map.get("�濵�����а�")+1);
  					map.put("�������",map.get("�������")+1);
  					map.put("�������",map.get("�������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("�Ϲݻ�ȸ������",map.get("�Ϲݻ�ȸ������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("ü��������",map.get("ü��������")+1);
  					map.put("�Ƶ���Ȱ��������",map.get("�Ƶ���Ȱ��������")+1);
  					map.put("�ְŰ�����������",map.get("�ְŰ�����������")+1);
  					map.put("�м��Ƿ��а�",map.get("�м��Ƿ��а�")+1);
  					map.put("ü���а�",map.get("ü���а�")+1);
  					map.put("�ʵ����",map.get("�ʵ����")+1);
  					map.put("�����к�",map.get("�����к�")+1);
  					map.put("�̼��к�",map.get("�̼��к�")+1);
  					map.put("��Ƽ�̵�����������",map.get("��Ƽ�̵�����������")+1);
  					map.put("��ȭ��������������",map.get("��ȭ��������������")+1);
  					map.put("�ǰ���Ƽ�����а�",map.get("�ǰ���Ƽ�����а�")+1);
  					map.put("�ǹ��ɾ���а�",map.get("�ǹ��ɾ���а�")+1);
  					map.put("�����������а�",map.get("�����������а�")+1);
  					map.put("�ε�������а�",map.get("�ε�������а�")+1);
  				}
  				if(Tempbtn == btn[2]) {
  					map.put("���б�����",map.get("���б�����")+1);
  					map.put("��ǻ�ͱ�����",map.get("��ǻ�ͱ�����")+1);
  					map.put("������������",map.get("������������")+1);
  					map.put("������������",map.get("������������")+1);
  					map.put("�Ĺ��ڿ�ȯ������",map.get("�Ĺ��ڿ�ȯ������")+1);
  					map.put("����ȯ������",map.get("����ȯ������")+1);
  					map.put("���̿���������",map.get("���̿���������")+1);
  					map.put("���ڻ����������",map.get("���ڻ����������")+1);
  					map.put("���������������",map.get("���������������")+1);
  					map.put("�����������а�",map.get("�����������а�")+1);
  					map.put("�ؾ������а�",map.get("�ؾ������а�")+1);
  					map.put("����������а�",map.get("����������а�")+1);
  					map.put("�ؾ��������а�",map.get("�ؾ��������а�")+1);
  					map.put("�����ؾ���а�",map.get("�����ؾ���а�")+1);
  					map.put("ȯ����а�",map.get("ȯ����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�ؾ�ý��۰��а�",map.get("�ؾ�ý��۰��а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("ȭ���ڽ���ƽ���а�",map.get("ȭ���ڽ���ƽ���а�")+1);
  					map.put("��ǰ�����а�",map.get("��ǰ�����а�")+1);
  					map.put("���а�",map.get("���а�")+1);
  					map.put("��������а�",map.get("��������а�")+1);
  					map.put("��ǰ������а�",map.get("��ǰ������а�")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("��īƮ�δн���������",map.get("��īƮ�δн���������")+1);
  					map.put("����������Ű�������",map.get("����������Ű�������")+1);
  					map.put("��������������",map.get("��������������")+1);
  					map.put("��ǻ�Ͱ�������",map.get("��ǻ�Ͱ�������")+1);
  					map.put("���ڰ�������",map.get("���ڰ�������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����ȭ������",map.get("����ȭ������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("�ǿ���",map.get("�ǿ���")+1);
  					map.put("���ǿ���",map.get("���ǿ���")+1);
  					map.put("��ȣ�а�",map.get("��ȣ�а�")+1);
  					map.put("���а�",map.get("���а�")+1);
  				}
  			case 33:
  				if(Tempbtn == btn[1]) {
  					map.put("�����а�",map.get("�����а�")+1);
  				}
  				break;
  			case 34:
  				if(Tempbtn == btn[1]) {
  					map.put("��ȸ�а�",map.get("��ȸ�а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("��ġ�ܱ��а�",map.get("��ġ�ܱ��а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("���������а�",map.get("���������а�")+1);
  				}
  				break;
  			case 35:
  				if(Tempbtn == btn[1]) {
  					map.put("�ؾ��������а�",map.get("�ؾ��������а�")+1);
  				}
  				break;
  			case 36:
  				if(Tempbtn == btn[1]) {
  					map.put("������а�",map.get("������а�")+1);
  					map.put("������а�",map.get("������а�")+1);
  					map.put("�Ͼ��Ϲ��а�",map.get("�Ͼ��Ϲ��а�")+1);
  					map.put("�߾��߹��а�",map.get("�߾��߹��а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("���а�",map.get("���а�")+1);
  					map.put("��ȸ�а�",map.get("��ȸ�а�")+1);
  					map.put("ö�а�",map.get("ö�а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("��ġ�ܱ��а�",map.get("��ġ�ܱ��а�")+1);
  					map.put("���ȫ���а�",map.get("���ȫ���а�")+1);
  				}
  				if(Tempbtn == btn[2]) {
  					map.put("�濵�а�",map.get("�濵�а�")+1);
  					map.put("�����濵�а�",map.get("�����濵�а�")+1);
  					map.put("ȸ���а�",map.get("ȸ���а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("���������а�",map.get("���������а�")+1);
  					map.put("�濵�����а�",map.get("�濵�����а�")+1);
  					map.put("�������",map.get("�������")+1);
  					map.put("�������",map.get("�������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("�Ϲݻ�ȸ������",map.get("�Ϲݻ�ȸ������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("���б�����",map.get("���б�����")+1);
  					map.put("��ǻ�ͱ�����",map.get("��ǻ�ͱ�����")+1);
  					map.put("������������",map.get("������������")+1);
  					map.put("������������",map.get("������������")+1);
  					map.put("ü��������",map.get("ü��������")+1);
  					map.put("�Ĺ��ڿ�ȯ������",map.get("�Ĺ��ڿ�ȯ������")+1);
  					map.put("����ȯ������",map.get("����ȯ������")+1);
  					map.put("���̿���������",map.get("���̿���������")+1);
  					map.put("���ڻ����������",map.get("���ڻ����������")+1);
  					map.put("���������������",map.get("���������������")+1);
  					map.put("�����������а�",map.get("�����������а�")+1);
  					map.put("�ؾ������а�",map.get("�ؾ������а�")+1);
  					map.put("����������а�",map.get("����������а�")+1);
  					map.put("�ؾ��������а�",map.get("�ؾ��������а�")+1);
  					map.put("�����ؾ���а�",map.get("�����ؾ���а�")+1);
  					map.put("ȯ����а�",map.get("ȯ����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�ؾ�ý��۰��а�",map.get("�ؾ�ý��۰��а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("ȭ���ڽ���ƽ���а�",map.get("ȭ���ڽ���ƽ���а�")+1);
  					map.put("��ǰ�����а�",map.get("��ǰ�����а�")+1);
  					map.put("���а�",map.get("���а�")+1);
  					map.put("��������а�",map.get("��������а�")+1);
  					map.put("�Ƶ���Ȱ��������",map.get("�Ƶ���Ȱ��������")+1);
  					map.put("�ְŰ�����������",map.get("�ְŰ�����������")+1);
  					map.put("�м��Ƿ��а�",map.get("�м��Ƿ��а�")+1);
  					map.put("ü���а�",map.get("ü���а�")+1);
  					map.put("��ǰ������а�",map.get("��ǰ������а�")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("��īƮ�δн���������",map.get("��īƮ�δн���������")+1);
  					map.put("����������Ű�������",map.get("����������Ű�������")+1);
  					map.put("��������������",map.get("��������������")+1);
  					map.put("��ǻ�Ͱ�������",map.get("��ǻ�Ͱ�������")+1);
  					map.put("���ڰ�������",map.get("���ڰ�������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����ȭ������",map.get("����ȭ������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("�ǿ���",map.get("�ǿ���")+1);
  					map.put("�ʵ����",map.get("�ʵ����")+1);
  					map.put("���ǿ���",map.get("���ǿ���")+1);
  					map.put("��ȣ�а�",map.get("��ȣ�а�")+1);
  					map.put("�����к�",map.get("�����к�")+1);
  					map.put("�̼��к�",map.get("�̼��к�")+1);
  					map.put("��Ƽ�̵�����������",map.get("��Ƽ�̵�����������")+1);
  					map.put("��ȭ��������������",map.get("��ȭ��������������")+1);
  					map.put("�ǰ���Ƽ�����а�",map.get("�ǰ���Ƽ�����а�")+1);
  					map.put("�ǹ��ɾ���а�",map.get("�ǹ��ɾ���а�")+1);
  					map.put("�����������а�",map.get("�����������а�")+1);
  					map.put("�ε�������а�",map.get("�ε�������а�")+1);
  					map.put("���а�",map.get("���а�")+1);
  				}
  				break;
  			case 37:
  				if(Tempbtn == btn[1]) {
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("��ġ�ܱ��а�",map.get("��ġ�ܱ��а�")+1);
  					map.put("���ȫ���а�",map.get("���ȫ���а�")+1);
  					map.put("�濵�а�",map.get("�濵�а�")+1);
  					map.put("�����濵�а�",map.get("�����濵�а�")+1);
  					map.put("ȸ���а�",map.get("ȸ���а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("���������а�",map.get("���������а�")+1);
  					map.put("�濵�����а�",map.get("�濵�����а�")+1);
  					map.put("�������",map.get("�������")+1);
  					map.put("�������",map.get("�������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("�Ϲݻ�ȸ������",map.get("�Ϲݻ�ȸ������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("���б�����",map.get("���б�����")+1);
  					map.put("��ǻ�ͱ�����",map.get("��ǻ�ͱ�����")+1);
  					map.put("������������",map.get("������������")+1);
  					map.put("������������",map.get("������������")+1);
  					map.put("ü��������",map.get("ü��������")+1);
  					map.put("�Ĺ��ڿ�ȯ������",map.get("�Ĺ��ڿ�ȯ������")+1);
  					map.put("����ȯ������",map.get("����ȯ������")+1);
  					map.put("���̿���������",map.get("���̿���������")+1);
  					map.put("���ڻ����������",map.get("���ڻ����������")+1);
  					map.put("���������������",map.get("���������������")+1);
  					map.put("�����������а�",map.get("�����������а�")+1);
  					map.put("�ؾ������а�",map.get("�ؾ������а�")+1);
  					map.put("����������а�",map.get("����������а�")+1);
  					map.put("�ؾ��������а�",map.get("�ؾ��������а�")+1);
  					map.put("�����ؾ���а�",map.get("�����ؾ���а�")+1);
  					map.put("ȯ����а�",map.get("ȯ����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�ؾ�ý��۰��а�",map.get("�ؾ�ý��۰��а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("ȭ���ڽ���ƽ���а�",map.get("ȭ���ڽ���ƽ���а�")+1);
  					map.put("��ǰ�����а�",map.get("��ǰ�����а�")+1);
  					map.put("���а�",map.get("���а�")+1);
  					map.put("��������а�",map.get("��������а�")+1);
  					map.put("�Ƶ���Ȱ��������",map.get("�Ƶ���Ȱ��������")+1);
  					map.put("�ְŰ�����������",map.get("�ְŰ�����������")+1);
  					map.put("�м��Ƿ��а�",map.get("�м��Ƿ��а�")+1);
  					map.put("ü���а�",map.get("ü���а�")+1);
  					map.put("��ǰ������а�",map.get("��ǰ������а�")+1);
  					map.put("�����к�",map.get("�����к�")+1);
  					map.put("�̼��к�",map.get("�̼��к�")+1);
  					map.put("��Ƽ�̵�����������",map.get("��Ƽ�̵�����������")+1);
  					map.put("��ȭ��������������",map.get("��ȭ��������������")+1);
  					map.put("�ǰ���Ƽ�����а�",map.get("�ǰ���Ƽ�����а�")+1);
  					map.put("�ǹ��ɾ���а�",map.get("�ǹ��ɾ���а�")+1);
  					map.put("�����������а�",map.get("�����������а�")+1);
  					map.put("�ε�������а�",map.get("�ε�������а�")+1);
  					map.put("���а�",map.get("���а�")+1);
  				}
  				if(Tempbtn == btn[2]) {
  					map.put("������а�",map.get("������а�")+1);
  					map.put("������а�",map.get("������а�")+1);
  					map.put("�Ͼ��Ϲ��а�",map.get("�Ͼ��Ϲ��а�")+1);
  					map.put("�߾��߹��а�",map.get("�߾��߹��а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("���а�",map.get("���а�")+1);
  					map.put("��ȸ�а�",map.get("��ȸ�а�")+1);
  					map.put("ö�а�",map.get("ö�а�")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("��īƮ�δн���������",map.get("��īƮ�δн���������")+1);
  					map.put("����������Ű�������",map.get("����������Ű�������")+1);
  					map.put("��������������",map.get("��������������")+1);
  					map.put("��ǻ�Ͱ�������",map.get("��ǻ�Ͱ�������")+1);
  					map.put("���ڰ�������",map.get("���ڰ�������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����ȭ������",map.get("����ȭ������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("�ǿ���",map.get("�ǿ���")+1);
  					map.put("�ʵ����",map.get("�ʵ����")+1);
  					map.put("���ǿ���",map.get("���ǿ���")+1);
  					map.put("��ȣ�а�",map.get("��ȣ�а�")+1);
  				}
  				break;
  			case 38:
  				if(Tempbtn == btn[1]) {
  					map.put("������а�",map.get("������а�")+1);
  					map.put("������а�",map.get("������а�")+1);
  					map.put("�Ͼ��Ϲ��а�",map.get("�Ͼ��Ϲ��а�")+1);
  					map.put("�߾��߹��а�",map.get("�߾��߹��а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�Ĺ��ڿ�ȯ������",map.get("�Ĺ��ڿ�ȯ������")+1);
  					map.put("����ȯ������",map.get("����ȯ������")+1);
  					map.put("���̿���������",map.get("���̿���������")+1);
  					map.put("���ڻ����������",map.get("���ڻ����������")+1);
  					map.put("���������������",map.get("���������������")+1);
  					map.put("�����������а�",map.get("�����������а�")+1);
  					map.put("�ؾ������а�",map.get("�ؾ������а�")+1);
  					map.put("����������а�",map.get("����������а�")+1);
  					map.put("�ؾ��������а�",map.get("�ؾ��������а�")+1);
  					map.put("�����ؾ���а�",map.get("�����ؾ���а�")+1);
  					map.put("ȯ����а�",map.get("ȯ����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�ؾ�ý��۰��а�",map.get("�ؾ�ý��۰��а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("ȭ���ڽ���ƽ���а�",map.get("ȭ���ڽ���ƽ���а�")+1);
  					map.put("��ǰ�����а�",map.get("��ǰ�����а�")+1);
  					map.put("���а�",map.get("���а�")+1);
  					map.put("��������а�",map.get("��������а�")+1);
  					map.put("�Ƶ���Ȱ��������",map.get("�Ƶ���Ȱ��������")+1);
  					map.put("�ְŰ�����������",map.get("�ְŰ�����������")+1);
  					map.put("�м��Ƿ��а�",map.get("�м��Ƿ��а�")+1);
  					map.put("ü���а�",map.get("ü���а�")+1);
  					map.put("��ǰ������а�",map.get("��ǰ������а�")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("��īƮ�δн���������",map.get("��īƮ�δн���������")+1);
  					map.put("����������Ű�������",map.get("����������Ű�������")+1);
  					map.put("��������������",map.get("��������������")+1);
  					map.put("��ǻ�Ͱ�������",map.get("��ǻ�Ͱ�������")+1);
  					map.put("���ڰ�������",map.get("���ڰ�������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����ȭ������",map.get("����ȭ������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("�ǿ���",map.get("�ǿ���")+1);
  					map.put("�ʵ����",map.get("�ʵ����")+1);
  					map.put("���ǿ���",map.get("���ǿ���")+1);
  					map.put("��ȣ�а�",map.get("��ȣ�а�")+1);
  					map.put("�ǰ���Ƽ�����а�",map.get("�ǰ���Ƽ�����а�")+1);
  					map.put("�ǹ��ɾ���а�",map.get("�ǹ��ɾ���а�")+1);
  					map.put("�����������а�",map.get("�����������а�")+1);
  					map.put("�ε�������а�",map.get("�ε�������а�")+1);
  					map.put("���а�",map.get("���а�")+1);
  				}
  				if(Tempbtn == btn[2]) {
  					map.put("���а�",map.get("���а�")+1);
  					map.put("��ȸ�а�",map.get("��ȸ�а�")+1);
  					map.put("ö�а�",map.get("ö�а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("��ġ�ܱ��а�",map.get("��ġ�ܱ��а�")+1);
  					map.put("���ȫ���а�",map.get("���ȫ���а�")+1);
  					map.put("�濵�а�",map.get("�濵�а�")+1);
  					map.put("�����濵�а�",map.get("�����濵�а�")+1);
  					map.put("ȸ���а�",map.get("ȸ���а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("���������а�",map.get("���������а�")+1);
  					map.put("�濵�����а�",map.get("�濵�����а�")+1);
  					map.put("�������",map.get("�������")+1);
  					map.put("�������",map.get("�������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("�Ϲݻ�ȸ������",map.get("�Ϲݻ�ȸ������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("���б�����",map.get("���б�����")+1);
  					map.put("��ǻ�ͱ�����",map.get("��ǻ�ͱ�����")+1);
  					map.put("������������",map.get("������������")+1);
  					map.put("������������",map.get("������������")+1);
  					map.put("ü��������",map.get("ü��������")+1);
  					map.put("�����к�",map.get("�����к�")+1);
  					map.put("�̼��к�",map.get("�̼��к�")+1);
  					map.put("��Ƽ�̵�����������",map.get("��Ƽ�̵�����������")+1);
  					map.put("��ȭ��������������",map.get("��ȭ��������������")+1);
  				}
  				break;
  			case 39:
  				if(Tempbtn == btn[1]) {
  					map.put("������а�",map.get("������а�")+1);
  					map.put("������а�",map.get("������а�")+1);
  					map.put("�Ͼ��Ϲ��а�",map.get("�Ͼ��Ϲ��а�")+1);
  					map.put("�߾��߹��а�",map.get("�߾��߹��а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("���а�",map.get("���а�")+1);
  					map.put("��ȸ�а�",map.get("��ȸ�а�")+1);
  					map.put("ö�а�",map.get("ö�а�")+1);
  					map.put("�Ĺ��ڿ�ȯ������",map.get("�Ĺ��ڿ�ȯ������")+1);
  					map.put("����ȯ������",map.get("����ȯ������")+1);
  					map.put("���̿���������",map.get("���̿���������")+1);
  					map.put("���ڻ����������",map.get("���ڻ����������")+1);
  					map.put("���������������",map.get("���������������")+1);
  					map.put("�����������а�",map.get("�����������а�")+1);
  					map.put("�ؾ������а�",map.get("�ؾ������а�")+1);
  					map.put("����������а�",map.get("����������а�")+1);
  					map.put("�ؾ��������а�",map.get("�ؾ��������а�")+1);
  					map.put("�����ؾ���а�",map.get("�����ؾ���а�")+1);
  					map.put("ȯ����а�",map.get("ȯ����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�ؾ�ý��۰��а�",map.get("�ؾ�ý��۰��а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("ȭ���ڽ���ƽ���а�",map.get("ȭ���ڽ���ƽ���а�")+1);
  					map.put("��ǰ�����а�",map.get("��ǰ�����а�")+1);
  					map.put("���а�",map.get("���а�")+1);
  					map.put("��������а�",map.get("��������а�")+1);
  					map.put("�Ƶ���Ȱ��������",map.get("�Ƶ���Ȱ��������")+1);
  					map.put("�ְŰ�����������",map.get("�ְŰ�����������")+1);
  					map.put("�м��Ƿ��а�",map.get("�м��Ƿ��а�")+1);
  					map.put("ü���а�",map.get("ü���а�")+1);
  					map.put("��ǰ������а�",map.get("��ǰ������а�")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("��īƮ�δн���������",map.get("��īƮ�δн���������")+1);
  					map.put("����������Ű�������",map.get("����������Ű�������")+1);
  					map.put("��������������",map.get("��������������")+1);
  					map.put("��ǻ�Ͱ�������",map.get("��ǻ�Ͱ�������")+1);
  					map.put("���ڰ�������",map.get("���ڰ�������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����ȭ������",map.get("����ȭ������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("�ǿ���",map.get("�ǿ���")+1);
  					map.put("���ǿ���",map.get("���ǿ���")+1);
  					map.put("�����к�",map.get("�����к�")+1);
  					map.put("�̼��к�",map.get("�̼��к�")+1);
  					map.put("��Ƽ�̵�����������",map.get("��Ƽ�̵�����������")+1);
  					map.put("��ȭ��������������",map.get("��ȭ��������������")+1);
  					map.put("���а�",map.get("���а�")+1);
  				}
  				if(Tempbtn == btn[2]) {
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("��ġ�ܱ��а�",map.get("��ġ�ܱ��а�")+1);
  					map.put("���ȫ���а�",map.get("���ȫ���а�")+1);
  					map.put("�濵�а�",map.get("�濵�а�")+1);
  					map.put("�����濵�а�",map.get("�����濵�а�")+1);
  					map.put("ȸ���а�",map.get("ȸ���а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("���������а�",map.get("���������а�")+1);
  					map.put("�濵�����а�",map.get("�濵�����а�")+1);
  					map.put("�������",map.get("�������")+1);
  					map.put("�������",map.get("�������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("�Ϲݻ�ȸ������",map.get("�Ϲݻ�ȸ������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("���б�����",map.get("���б�����")+1);
  					map.put("��ǻ�ͱ�����",map.get("��ǻ�ͱ�����")+1);
  					map.put("������������",map.get("������������")+1);
  					map.put("������������",map.get("������������")+1);
  					map.put("ü��������",map.get("ü��������")+1);
  					map.put("�ʵ����",map.get("�ʵ����")+1);
  					map.put("��ȣ�а�",map.get("��ȣ�а�")+1);
  					map.put("�ǰ���Ƽ�����а�",map.get("�ǰ���Ƽ�����а�")+1);
  					map.put("�ǹ��ɾ���а�",map.get("�ǹ��ɾ���а�")+1);
  					map.put("�����������а�",map.get("�����������а�")+1);
  					map.put("�ε�������а�",map.get("�ε�������а�")+1);
  				}
  				break;
  			case 40:
  				if(Tempbtn == btn[1]) {
  					map.put("������а�",map.get("������а�")+1);
  					map.put("������а�",map.get("������а�")+1);
  					map.put("�Ͼ��Ϲ��а�",map.get("�Ͼ��Ϲ��а�")+1);
  					map.put("�߾��߹��а�",map.get("�߾��߹��а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("���а�",map.get("���а�")+1);
  					map.put("��ȸ�а�",map.get("��ȸ�а�")+1);
  					map.put("ö�а�",map.get("ö�а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("��ġ�ܱ��а�",map.get("��ġ�ܱ��а�")+1);
  					map.put("���ȫ���а�",map.get("���ȫ���а�")+1);
  					map.put("�������",map.get("�������")+1);
  					map.put("�������",map.get("�������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("�Ϲݻ�ȸ������",map.get("�Ϲݻ�ȸ������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("���б�����",map.get("���б�����")+1);
  					map.put("��ǻ�ͱ�����",map.get("��ǻ�ͱ�����")+1);
  					map.put("������������",map.get("������������")+1);
  					map.put("������������",map.get("������������")+1);
  					map.put("ü��������",map.get("ü��������")+1);
  					map.put("�Ĺ��ڿ�ȯ������",map.get("�Ĺ��ڿ�ȯ������")+1);
  					map.put("����ȯ������",map.get("����ȯ������")+1);
  					map.put("���̿���������",map.get("���̿���������")+1);
  					map.put("���ڻ����������",map.get("���ڻ����������")+1);
  					map.put("���������������",map.get("���������������")+1);
  					map.put("�ؾ������а�",map.get("�ؾ������а�")+1);
  					map.put("����������а�",map.get("����������а�")+1);
  					map.put("�ؾ��������а�",map.get("�ؾ��������а�")+1);
  					map.put("�����ؾ���а�",map.get("�����ؾ���а�")+1);
  					map.put("ȯ����а�",map.get("ȯ����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�ؾ�ý��۰��а�",map.get("�ؾ�ý��۰��а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("ȭ���ڽ���ƽ���а�",map.get("ȭ���ڽ���ƽ���а�")+1);
  					map.put("��ǰ�����а�",map.get("��ǰ�����а�")+1);
  					map.put("�Ƶ���Ȱ��������",map.get("�Ƶ���Ȱ��������")+1);
  					map.put("�ְŰ�����������",map.get("�ְŰ�����������")+1);
  					map.put("ü���а�",map.get("ü���а�")+1);
  					map.put("��ǰ������а�",map.get("��ǰ������а�")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("��īƮ�δн���������",map.get("��īƮ�δн���������")+1);
  					map.put("����������Ű�������",map.get("����������Ű�������")+1);
  					map.put("��������������",map.get("��������������")+1);
  					map.put("��ǻ�Ͱ�������",map.get("��ǻ�Ͱ�������")+1);
  					map.put("���ڰ�������",map.get("���ڰ�������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����ȭ������",map.get("����ȭ������")+1);
  					map.put("�����������",map.get("�����������")+1);
  					map.put("����������",map.get("����������")+1);
  					map.put("�ǿ���",map.get("�ǿ���")+1);
  					map.put("�ʵ����",map.get("�ʵ����")+1);
  					map.put("���ǿ���",map.get("���ǿ���")+1);
  					map.put("��ȣ�а�",map.get("��ȣ�а�")+1);
  					map.put("�����к�",map.get("�����к�")+1);
  					map.put("�̼��к�",map.get("�̼��к�")+1);
  					map.put("��Ƽ�̵�����������",map.get("��Ƽ�̵�����������")+1);
  					map.put("��ȭ��������������",map.get("��ȭ��������������")+1);
  					map.put("�ǰ���Ƽ�����а�",map.get("�ǰ���Ƽ�����а�")+1);
  					map.put("�ǹ��ɾ���а�",map.get("�ǹ��ɾ���а�")+1);
  					map.put("�����������а�",map.get("�����������а�")+1);
  					map.put("�ε�������а�",map.get("�ε�������а�")+1);
  					map.put("���а�",map.get("���а�")+1);
  					
  					
  				}
  				if(Tempbtn == btn[2]) {
  				//b2
  					map.put("�濵�а�",map.get("�濵�а�")+1);
  					map.put("�����濵�а�",map.get("�����濵�а�")+1);
  					map.put("ȸ���а�",map.get("ȸ���а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("�����а�",map.get("�����а�")+1);
  					map.put("���������а�",map.get("���������а�")+1);
  					map.put("�濵�����а�",map.get("�濵�����а�")+1);
  					map.put("�����������а�",map.get("�����������а�")+1);
  					map.put("���а�",map.get("���а�")+1);
  					map.put("��������а�",map.get("��������а�")+1);
  					map.put("�м��Ƿ��а�",map.get("�м��Ƿ��а�")+1);
  				}
  				
  				JPanel result = new JPanel();
  				result.setLayout(new BorderLayout());
  				String tmpStr = "";
  				int maxValue = 0;
  				Iterator<String> iter = map.keySet().iterator();
  				
  				while(iter.hasNext()) {
  					tmpStr = iter.next();
  					if(map.get(tmpStr) > maxValue) {
  						major = tmpStr;
  						maxValue = map.get(tmpStr);
  					}
  				}
  				
  				JLabel resultText = new JLabel("����Ʈ�� ��õ�ϴ� �а��� "+ major);
  				HashMap<String, String> linkMap = LinkMapGenerator.getLinkMap();
  				String url = linkMap.get(major);
  				String career = Crawler.execute(url);
  				String res = "";
  				String temp[] = career.split("");
  				
  				for(int i = 0; i < temp.length; i++) {
  					if(i % 50 == 0) 
  						res += "\n";
  					res += temp[i];
  				}
  				
  				
  				JLabel careerText = new JLabel(res);
  				//System.out.println(career);
  				resultText.setFont(new Font("�������", Font.BOLD, 28));
  				resultText.setForeground(new Color(255,255,255));
  				//resultText.setHorizontalAlignment(JLabel.NORTH);
  				
  				result.setBackground(new Color(72, 106, 174));
  				

  		        
  				JButton jb = new RoundButton("���ִ��б� " + major + " �ٷΰ���"); 	
  				//jb.setHorizontalAlignment(JButton.SOUTH);

  				JTextArea txtLog = new JTextArea(45,45);
  				txtLog.append(careerText+ ""); 
  				JScrollPane scrollPane = new JScrollPane(txtLog);
  				
  				int index = 0;
  				String temps[] = txtLog.getText().split("");
  				for(index = 0; true; index++) {
  					if(temps[index].equals("\n"))
  						break;
  				}
  				txtLog.replaceRange("", 0, index + 1); //���ۺκа� ���� ���̸� �������� ��ü

  				result.add(scrollPane);
  			
  				//result.add(careerText);
  				
  				jb.setFocusPainted(false);
  				jb.setBorderPainted(false);
  				jb.setPreferredSize(new Dimension(520, 50));
  				jb.setBackground(new Color(196,222,255));
  				jb.setForeground(new Color(255,255,255));
  				jb.setFont(new Font("�������", Font.BOLD, 25));
  				jb.requestFocus();
  				result.add(jb,BorderLayout.SOUTH);

 
  				
  				
  				
  				link.put("������а�",	"http://www.jejunu.ac.kr/colleges/humanities/korean"	);
  				link.put("������а�",	"http://www.jejunu.ac.kr/colleges/humanities/english"	);
  				link.put("�Ͼ��Ϲ��а�",	"http://www.jejunu.ac.kr/colleges/humanities/japanese"	);
  				link.put("�߾��߹��а�",	"http://www.jejunu.ac.kr/colleges/humanities/chinese"	);
  				link.put("�����а�",	"http://www.jejunu.ac.kr/colleges/humanities/ifdk"	);
  				link.put("���а�",	"http://www.jejunu.ac.kr/colleges/humanities/history"	);
  				link.put("��ȸ�а�",	"http://www.jejunu.ac.kr/colleges/humanities/sociology"	);
  				link.put("ö�а�",	"http://www.jejunu.ac.kr/colleges/humanities/sophia"	);
  				link.put("�����а�",	"http://www.jejunu.ac.kr/colleges/justice/admini"	);
  				link.put("��ġ�ܱ��а�",	"http://www.jejunu.ac.kr/colleges/justice/politics"	);
  				link.put("���ȫ���а�",	"http://www.jejunu.ac.kr/colleges/justice/journalism"	);
  				link.put("�濵�а�",	"http://www.jejunu.ac.kr/colleges/biz/dba"	);
  				link.put("�����濵�а�",	"http://www.jejunu.ac.kr/colleges/biz/tourism"	);
  				link.put("ȸ���а�",	"http://www.jejunu.ac.kr/colleges/biz/accounting"	);
  				link.put("�����а�",	"http://www.jejunu.ac.kr/colleges/biz/trade"	);
  				link.put("�����а�",	"http://www.jejunu.ac.kr/colleges/biz/econ"	);
  				link.put("���������а�",	"http://www.jejunu.ac.kr/colleges/biz/td"	);
  				link.put("�濵�����а�",	"http://www.jejunu.ac.kr/colleges/biz/mis"	);
  				link.put("�������",	"http://www.jejunu.ac.kr/colleges/education/koredu"	);
  				link.put("�������",	"http://www.jejunu.ac.kr/colleges/education/engedu"   	);
  				link.put("����������",	"http://www.jejunu.ac.kr/colleges/education/ethics"	);
  				link.put("�Ϲݻ�ȸ������",	"http://www.jejunu.ac.kr/colleges/education/sse"	);
  				link.put("����������",	"http://www.jejunu.ac.kr/colleges/education/jejugeo"	);
  				link.put("���б�����",	"http://www.jejunu.ac.kr/colleges/education/mathedu"	);
  				link.put("��ǻ�ͱ�����",	"http://www.jejunu.ac.kr/colleges/education/educom"	);
  				link.put("������������",	"http://www.jejunu.ac.kr/colleges/education/bioedu"	);
  				link.put("������������",	"http://www.jejunu.ac.kr/colleges/education/phys"	);
  				link.put("ü��������",	"http://www.jejunu.ac.kr/colleges/education/phyeducation"	);
  				link.put("�Ĺ��ڿ�ȯ������",	"http://www.jejunu.ac.kr/colleges/todaud/plant"	);
  				link.put("����ȯ������",	"http://www.jejunu.ac.kr/colleges/todaud/hort"	);
  				link.put("���̿���������",	"http://www.jejunu.ac.kr/colleges/todaud/appbio"	);
  				link.put("���ڻ����������",	"http://www.jejunu.ac.kr/colleges/todaud/mobio"	);
  				link.put("���������������",	"http://www.jejunu.ac.kr/colleges/todaud/animal"	);
  				link.put("�����������а�",	"http://www.jejunu.ac.kr/colleges/todaud/iae"	);
  				link.put("�ؾ������а�",	"http://www.jejunu.ac.kr/colleges/ocean/mls"	);
  				link.put("����������а�",	"http://www.jejunu.ac.kr/colleges/ocean/alm"	);
  				link.put("�ؾ��������а�",	"http://www.jejunu.ac.kr/colleges/ocean/dmie"	);
  				link.put("�����ؾ���а�",	"http://www.jejunu.ac.kr/colleges/ocean/ems"	);
  				link.put("ȯ����а�",	"http://www.jejunu.ac.kr/colleges/ocean/dee"	);
  				link.put("�����а�",	"http://www.jejunu.ac.kr/colleges/ocean/dce"	);
  				link.put("�ؾ�ý��۰��а�",	"http://www.jejunu.ac.kr/colleges/ocean/ose"	);
  				link.put("�����а�",	"http://www.jejunu.ac.kr/colleges/ns/physics"	);
  				link.put("�����а�",	"http://www.jejunu.ac.kr/colleges/ns/lifescience"	);
  				link.put("ȭ���ڽ���ƽ���а�",	"http://www.jejunu.ac.kr/colleges/ns/chem"	);
  				link.put("��ǰ�����а�",	"http://www.jejunu.ac.kr/colleges/ns/foodnutrition"	);
  				link.put("���а�",	"http://www.jejunu.ac.kr/colleges/ns/math"	);
  				link.put("��������а�",	"http://www.jejunu.ac.kr/colleges/ns/jupiter"	);
  				link.put("�Ƶ���Ȱ��������",	"http://www.jejunu.ac.kr/colleges/ns/humanwelfare"	);
  				link.put("�ְŰ�����������",	"http://www.jejunu.ac.kr/colleges/ns/familywelfare"	);
  				link.put("�м��Ƿ��а�",	"http://www.jejunu.ac.kr/colleges/ns/cnt"	);
  				link.put("ü���а�",	"http://www.jejunu.ac.kr/colleges/ns/jejusports"	);
  				link.put("��ǰ������а�",	"http://www.jejunu.ac.kr/colleges/engr/foodse"	);
  				link.put("����������",	"http://www.jejunu.ac.kr/colleges/engr/mecha"	);
  				link.put("��īƮ�δн���������",	"http://www.jejunu.ac.kr/colleges/engr/mechatronics"	);
  				link.put("����������Ű�������",	"http://www.jejunu.ac.kr/colleges/engr/telecom"	);
  				link.put("��������������",	"http://www.jejunu.ac.kr/colleges/engr/energy"	);
  				link.put("��ǻ�Ͱ�������",	"http://www.jejunu.ac.kr/colleges/engr/ce"	);
  				link.put("���ڰ�������",	"http://www.jejunu.ac.kr/colleges/engr/comdol"	);
  				link.put("�����������",	"http://www.jejunu.ac.kr/colleges/engr/ee"	);
  				link.put("����ȭ������",	"http://www.jejunu.ac.kr/colleges/engr/chemeng"	);
  				link.put("�����������",	"http://www.jejunu.ac.kr/colleges/engr/archieng"	);
  				link.put("����������",	"http://www.jejunu.ac.kr/colleges/engr/archidesign"	);
  				link.put("�ǿ���",	"http://www.jejunu.ac.kr/colleges/cm/premedicalscience"	);
  				link.put("�ʵ����",	"http://www.jejunu.ac.kr/colleges/sara"	);
  				link.put("���ǿ���",	"http://www.jejunu.ac.kr/colleges/veterinary/preveter"	);
  				link.put("��ȣ�а�",	"http://www.jejunu.ac.kr/colleges/cnursing/nursing"	);
  				link.put("�����к�",	"http://www.jejunu.ac.kr/colleges/artsndesign/music"	);
  				link.put("�̼��к�",	"http://www.jejunu.ac.kr/colleges/artsndesign/fineart"	);
  				link.put("��Ƽ�̵�����������",	"http://www.jejunu.ac.kr/colleges/artsndesign/multi"	);
  				link.put("��ȭ��������������",	"http://www.jejunu.ac.kr/colleges/artsndesign/culture"	);
  				link.put("�ǰ���Ƽ�����а�",	"http://www.jejunu.ac.kr/colleges/fc/beauty"	);
  				link.put("�ǹ��ɾ���а�",	"http://www.jejunu.ac.kr/colleges/fc/silverwelfare"	);
  				link.put("�����������а�",	"http://www.jejunu.ac.kr/colleges/fc/tc"	);
  				link.put("�ε�������а�",	"http://www.jejunu.ac.kr/colleges/fc/realestate"	);
  				link.put("���а�",	"http://www.jejunu.ac.kr/colleges/pharmacology/pharmacy"	);

 				jb.addActionListener(new ActionListener() {
				       public void actionPerformed(ActionEvent e) {
				    	   String url = "";
			  				url = link.get(major);

							 Runtime runtime = Runtime.getRuntime();
						        try {
						            runtime.exec("explorer.exe " + url);
						        } catch (IOException ex) {
						        }  
			  				
				       }
				});
  				
  				//JScrollPane jScrollPane = new JScrollPane();//��ũ���� ����
  				//jScrollPane.setViewportView(result);//��ũ�� �� ���� �г��� �ø���.  			
  				
				//result.add(new JScrollPane(???));
  				
  				result.add(resultText,BorderLayout.NORTH);
  				setContentPane(result);
  				setVisible(true);
  				cur++;

  				return;

  			}
  			cur++;
  			
			btn[0].setText(str.get(cur*3));
			btn[1].setText(str.get(cur*3+1));
  			btn[2].setText(str.get(cur*3+2));
		}
		@Override
		public void mouseEntered(MouseEvent e) { // ��ư �� ���콺
			JButton Tempbtn = (JButton)e.getSource();
			Tempbtn.setBackground(new Color(230,230,255));
			
		}
		@Override
		public void mouseExited(MouseEvent e) { // ��ư �� ���콺
			JButton Tempbtn = (JButton)e.getSource();
			Tempbtn.setBackground(new Color(196,222,255));
		}
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		new jest1();
		
		int j = 0;
		
		 try{
	            //���� ��ü ����
	            File file = new File("./DB/test.txt");
	            //�Է� ��Ʈ�� ����
	            FileReader filereader = new FileReader(file);
	            //�Է� ���� ����
	            BufferedReader bufReader = new BufferedReader(filereader);
	            String line = "";
	            while((line = bufReader.readLine()) != null){
	                
	                str.add(j,line);
	                j++;
	            }
	            //.readLine()�� ���� ���๮�ڸ� ���� �ʴ´�.            
	            bufReader.close();
	        }catch (FileNotFoundException e) {
	            // TODO: handle exception
	        }catch(IOException e){
	            System.out.println(e);
	        }
			btn[0].setText(str.get(0));
	  		btn[1].setText(str.get(1));
	  		btn[2].setText(str.get(2));


	  		
	}
}