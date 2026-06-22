pipeline {
    agent any
    tools {
        maven 'Maven3'
    }

    stages {
        stage('Test') {
            steps {
                bat 'mvn clean test'
            }
        }
    }
}