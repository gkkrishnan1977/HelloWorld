class MyPipeline {
    def run() {
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
}

new MyPipeline().run()
