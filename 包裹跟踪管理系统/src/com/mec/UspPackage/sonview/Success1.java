package com.mec.UspPackage.sonview;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

import com.mec.UspPackage.fatherview.IBKmanageView;

public class Success1 implements IBKmanageView {
	private JFrame jFrame;
	private JLabel jLabel;
	
	public Success1() {
		init();
		dealAction();
	}

	@Override
	public void init() {
		jFrame = new JFrame("成功");
		jFrame.setSize(500,300);
		jFrame.setResizable(false);
		jFrame.setLocationRelativeTo(null);
		jFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		jLabel = new JLabel("包裹录入成功！",JLabel.CENTER);
		jLabel.setLocation(150, 40);
		jLabel.setFont(TextTopicfont);
		jLabel.setForeground(Color.RED);
		jFrame.add(jLabel);
	}

	@Override
	public void dealAction() {
		
	}

	@Override
	public void showView() {
		jFrame.setVisible(true);
	}

	@Override
	public void exitView() {
		
	}

}
