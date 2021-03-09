#! /usr/bin/env groovy
import GitTool

def call(String stepName, Map options) {
    echo "Starting " + stepName

    def gitTool = new GitTool()
    gitTool.pullFromGit()
}
