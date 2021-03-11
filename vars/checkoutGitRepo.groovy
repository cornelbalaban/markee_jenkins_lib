def call() {
    echo "Checking out git repo"

    script.withEnv {
        (["test=blah"])
    }

    try {
        sh "gradle build"
    } catch(Exception e) {
      echo "Exception ${e.localizedMessage}"
        echo "$test"
    }

}