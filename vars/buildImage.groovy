#!/usr/bin/env groovy
def call(){
    echo "building the docker image..."
    withCredentials([usernamePassword(credentialsId: 'nexus-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]) {
        sh 'docker build -t eau2c2:1.0 .'
        sh "echo $PASS | docker login -u $USER --password-stdin"
        sh" tag eau2c2:1.0 52.207.215.103:8080/eau2c2:1.0"
        sh "docker push 52.207.215.103:8080/eau2c2:1.0 "
}
}