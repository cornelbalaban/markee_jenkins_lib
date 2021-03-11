def call() {
    echo "Checking out git repo"

    try {
        sh "./gradlew build"
    } catch(Exception e) {
      echo "${e.printStackTrace()}"
    }

}