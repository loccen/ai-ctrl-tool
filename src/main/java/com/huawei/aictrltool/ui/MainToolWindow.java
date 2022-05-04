package com.huawei.aictrltool.ui;

import com.intellij.openapi.wm.ToolWindow;

import javax.swing.*;

/**
 * author: loccen
 * datetime: 2022/5/4 21:51
 * email: loccen@foxmail.com
 * description:
 */
public class MainToolWindow {
	private JPanel mainPanel;
	private JPanel ButtonPanel;
	private JButton newEnvButton;
	private JButton preBuildButton;
	private JButton downloadReplaceLibButton;

	public MainToolWindow(ToolWindow toolWindow) {
		return;
	}


	public JPanel getContent() {
		return mainPanel;
	}
}
