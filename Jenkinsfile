pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                checkout scm
            }
        }

        stage('Build & Test') {
            steps {
                sh 'docker build -t food-app:latest .'
            }
        }

        stage('Deploy') {
            steps {
                sh '''
                    docker rm -f food-app || true
                    docker run -d --name food-app -p 8080:8080 --restart unless-stopped food-app:latest
                '''
            }
        }
    }
}
