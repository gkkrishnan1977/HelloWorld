// Define a class for the pipeline
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

// Create an instance of the class and run the pipeline
new MyPipeline().run()
