def call(Map config) {
    node {
      echo "This is config message: ${config.message}"
      sh '''
        git version
        java -version
        mvn -version
      '''
    }
}