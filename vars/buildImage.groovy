#!/usr/bin/env groovy
def call(){
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'nexus-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        echo "Contents of the directory:"
        sh "ls -la"
        sh 'docker build -t eau2c2:1.0 Dockerfile.dev'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh" tag eau2c2:1.0 http://3.82.130.20:8083//eau2c2:1.0"
        sh "docker push http://3.82.130.20:8083/eau2c2:1.0 "
}
}