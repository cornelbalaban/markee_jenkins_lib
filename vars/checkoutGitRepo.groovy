def call() {
    echo "Checking out git repo"

    script.withEnv {
        (["test=blah"])
    }
    echo "${test}"
    try {
        sh "gradle build"
    } catch(Exception e) {
      echo "Exception ${e.localizedMessage}"

    }

}