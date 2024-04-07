pipeline {
   agent any
   stages {
       stage('Build') {
           steps {
               script {
                   sh 'javac CreateFile.java'
                   sh 'jar cfe CreateFile.jar CreateFile CreateFile.class'
               }
           }
       }
       stage('Archive') {
           steps {
               script {
                   archiveArtifacts artifacts: 'CreateFile.jar', fingerprint: true
               }
           }
       }
   }
}
