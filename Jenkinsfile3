def runPipeline() {
    node {
        stage('Checkout') {
            checkout scm
        }
        stage('Compile') {
            sh 'javac HelloWorld.java'
        }
        stage('Test') {
            sh 'java HelloWorld'
        }
    }
}

runPipeline()
