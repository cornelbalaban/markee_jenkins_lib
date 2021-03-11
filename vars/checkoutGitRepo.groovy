def call() {
    echo "Checking out git repo"

    sh "export test=blah"
    echo "${$test}"
    try {
        sh "gradle build"
    } catch(Exception e) {
      echo "Exception ${e.localizedMessage}"

    }

}