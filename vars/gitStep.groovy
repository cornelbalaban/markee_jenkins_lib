#! /usr/bin/env groovy

def call(String stepName, Map options) {
    echo "Starting " + stepName

    pullFromGit(options, options.repoUrl)
}


def pullFromGit(Map credentials,String repoUrl) {
    echo "Pulling from GIT"

    if (credentials.userName == null) {
        echo "No user or pwd for private repo"
        error("Aborting build")
    }

}