def call() {
    echo "Checking out git repo"

    try {
        sh "gradle build"
    } catch(Exception e) {
      echo "${e.localizedMessage}"
    }

}