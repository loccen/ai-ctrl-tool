package com.huawei.aictrltool.toolwindow;

import com.huawei.aictrltool.ui.MainToolWindow;
import com.intellij.openapi.project.DumbAware;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.wm.ToolWindow;
import com.intellij.openapi.wm.ToolWindowFactory;
import com.intellij.ui.content.Content;
import com.intellij.ui.content.ContentFactory;
import com.intellij.ui.content.ContentManager;
import org.jetbrains.annotations.NotNull;

/**
 * author: loccen
 * datetime: 2022/5/4 22:42
 * email: loccen@foxmail.com
 * description: 远端工具窗口，不涉及本地索引，因此实现DumbAware接口，可在索引过程中使用
 */
public class RemoteToolWindow implements ToolWindowFactory, DumbAware {

	@Override
	public void createToolWindowContent(@NotNull Project project, @NotNull ToolWindow toolWindow) {
		MainToolWindow window = new MainToolWindow(toolWindow);
		// 获取contentFactory
		ContentFactory contentFactory = ContentFactory.SERVICE.getInstance();
		Content content = contentFactory.createContent(window.getContent(), "", false);
		toolWindow.getContentManager().addContent(content);
	}
}
