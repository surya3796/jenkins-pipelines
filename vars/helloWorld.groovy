def call() {
    if (isUnix()) {
        sh "echo Hello World"
    } else {
        bat "echo Hello World"
    }
}

boolean isUnix() {
    return sh(script: 'exit 0', returnStatus: true) == 0
}
