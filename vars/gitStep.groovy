#! /usr/bin/env groovy

import com.markee.jenkins_lib.GitTool

def call(String stepName) {
    sh "echo ${stepName}}"

    def gitTool = new GitTool()
    gitTool.pullFromGit()
}
