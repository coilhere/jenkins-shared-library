#!/usr/bin/env groovy
def call(){
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'nexus-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        echo "Contents of the directory:"
        sh "ls -la"
        echo "Current directory: ${PWD}"
        sh 'docker build -t eau2c2:1.0 -f ./app/Dockerfile.dev .'
        sh "echo $PASS | docker login -u $USER --password-stdin 44.204.7.163:8083"
        sh "docker tag eau2c2:1.0 44.204.7.163:8083/eau2c2:1.0"  // Fixed tag command

        sh "docker push 44.204.7.163:8083/eau2c2:1.0 "
}
}