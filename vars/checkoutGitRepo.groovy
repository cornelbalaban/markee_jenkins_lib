def call() {
    echo "Checking out git repo"

    try {
        sh "./gradlew build"
    } catch(Exception e) {
      System.out.println("${e.localizedMessage}")
    }

}