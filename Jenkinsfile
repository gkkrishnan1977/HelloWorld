pipeline {
    agent any
    
    stages {
        stage('Compile') {
            steps {
                script {
                    sh 'javac HelloWorld.java'
                }
            }
        }
        stage('Run') {
            steps {
                script {
                    sh 'java HelloWorld'
                }
            }
        }
    }
}
