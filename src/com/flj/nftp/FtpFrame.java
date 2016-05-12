package com.flj.nftp;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class FtpFrame extends JFrame{
	
	File file;
	private JTextField textfilename;
	private JTextField textsha;
	
	
	public static void main(String[] args) {
		FtpFrame frame = new FtpFrame();
		frame.setVisible(true);
	}
	
	public FtpFrame() {
		
		//设置显示
		setSize(480, 320);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnselect = new JButton("请选择要上传的文件");
		btnselect.setBounds(27, 26, 179, 23);
		panel.add(btnselect);
		
		JLabel lblon = new JLabel("您要上传的文件");
		lblon.setBounds(64, 67, 93, 32);
		panel.add(lblon);
		
		textfilename = new JTextField();
		textfilename.setBounds(183, 73, 218, 21);
		panel.add(textfilename);
		textfilename.setColumns(10);
		
		JButton btnquiz = new JButton("取消");
		btnquiz.setBounds(266, 236, 93, 23);
		panel.add(btnquiz);
		
		JButton btnon = new JButton("上传");
		btnon.setBounds(107, 236, 93, 23);
		panel.add(btnon);
		
		JLabel lblsha = new JLabel("散  列  码  为");
		lblsha.setBounds(64, 145, 93, 23);
		panel.add(lblsha);
		
		textsha = new JTextField();
		textsha.setBounds(184, 144, 218, 23);
		panel.add(textsha);
		textsha.setColumns(10);
		
			
		btnselect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//选择文件
				JFileChooser fileChooser = new JFileChooser();
				fileChooser.showDialog(FtpFrame.this, "确定");

				//设置标签显示的内容
				file = fileChooser.getSelectedFile();
				textfilename.setText(file.getName());
				
			}
		});
			
			
	}
}
