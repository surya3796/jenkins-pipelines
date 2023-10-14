def call() {
    if (isUnix()) {
        sh "echo Hello World"
    } else {
        bat "echo Hello World"
    }
}

boolean isUnix() {
    return System.getProperty("os.name").toLowerCase().contains("linux") || System.getProperty("os.name").toLowerCase().contains("mac")
}
