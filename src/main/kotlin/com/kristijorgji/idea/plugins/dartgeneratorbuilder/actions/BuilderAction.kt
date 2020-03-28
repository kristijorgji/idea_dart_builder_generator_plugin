package com.kristijorgji.idea.plugins.dartgeneratorbuilder.actions

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.CommonDataKeys
import com.intellij.openapi.actionSystem.LangDataKeys
import com.intellij.openapi.command.WriteCommandAction


class BuilderAction : AnAction() {
    override fun actionPerformed(e: AnActionEvent) {
        var currentText = e.getData(LangDataKeys.EDITOR)?.getDocument()?.getText();
        //e.getData(LangDataKeys.EDITOR)?.document?.setText("kristi");

        var editor = e.getRequiredData(CommonDataKeys.EDITOR);
        var project = e.getRequiredData(CommonDataKeys.PROJECT);
        var document = editor.getDocument();

        WriteCommandAction.runWriteCommandAction(
            project
        ) { document.setText("kristi") }
    }
}
