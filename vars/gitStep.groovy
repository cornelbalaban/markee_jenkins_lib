#! /usr/bin/env groovy

def call(String stepName) {
    echo "Starting " + stepName
    sh "./gradlew build"
}
