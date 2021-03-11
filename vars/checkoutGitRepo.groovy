def call() {
    echo "Checking out git repo"

    echo "export test=blah"
    echo "${$test}"
    try {
        sh "gradle build"
    } catch(Exception e) {
      echo "Exception ${e.localizedMessage}"

    }

}