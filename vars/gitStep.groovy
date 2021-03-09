#! /usr/bin/env groovy

import com.markee.jenkins_lib.GitTool

def call(String stepName) {
    echo "Starting " + stepName

    def gitTool = new GitTool()
    gitTool.pullFromGit()
}
