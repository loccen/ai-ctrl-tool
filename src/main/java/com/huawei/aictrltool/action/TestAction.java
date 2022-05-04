package com.huawei.aictrltool.action;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.project.Project;
import lombok.extern.slf4j.Slf4j;

/**
 * author: loccen
 * datetime: 2022/5/4 13:32
 * email: loccen@foxmail.com
 * description:
 */
@Slf4j
public class TestAction extends AnAction {

	@Override
	public void actionPerformed(AnActionEvent e) {
		Project project = e.getProject();
		// TODO: insert action logic her
		log.info("project:{}", project.getName());
	}
}
