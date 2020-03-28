package com.kristijorgji.idea.plugins.dartgeneratorbuilder.actions;

import com.intellij.notification.NotificationDisplayType
import com.intellij.notification.NotificationGroup
import com.intellij.notification.NotificationType
import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent

class TestEventAction: AnAction() {

    override fun actionPerformed(e: AnActionEvent) {
        val noti = NotificationGroup("kristijorgji.com", NotificationDisplayType.BALLOON, true)
        noti.createNotification("Test title",
            "Some test message",
            NotificationType.INFORMATION,
            null
        ).notify(e.project)
    }
}
