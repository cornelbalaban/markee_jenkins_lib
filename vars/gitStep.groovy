#! /usr/bin/env groovy

def call(String stepName, Map options) {
    echo "Starting " + stepName

    def gitTool = new GitTool()
    gitTool.pullFromGit()
}
