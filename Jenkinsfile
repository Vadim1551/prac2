pipeline {
    agent any
    
    stages {
        stage('Build') {
            steps {
                script {
                    sh 'javac CreateFile.java'
                }
            }
        }
        
        stage('Run') {
            steps {
                script {
                    sh 'java CreateFile'
                }
            }
            post {
                success {
                    archiveArtifacts artifacts: 'output.txt'
                }
            }
        }
    }
}
