#! /usr/bin/env groovy

import com.markee.jenkins_lib.*

def call(String stepName, Map options) {
    echo "Starting " + stepName

    def gitTool = new GitTool()
    gitTool.pullFromGit()
}
