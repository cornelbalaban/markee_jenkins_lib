def call() {
    echo "Checking out git repo"

    script.node {

        try {
            sh "gradle build"
        } catch(Exception e) {
            echo "${e.localizedMessage}"
        }

    }
}